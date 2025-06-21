/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gochoapc.frontventafinal.Servicio;
import com.google.gson.Gson;
import gochoapc.frontventafinal.Modelo.Venta;
import gochoapc.frontventafinal.Modelo.DetalleVenta;
import gochoapc.frontventafinal.Modelo.Producto;
import okhttp3.*;

import javax.net.ssl.*;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author GOchoa
 */
public class VentaServicio {
    private final OkHttpClient client;
    private final Gson gson = new Gson();

    public VentaServicio() {
        client = getUnsafeOkHttpClient();
    }

    public Venta crearVenta(Venta venta) throws Exception {
        RequestBody body = RequestBody.create(
            gson.toJson(venta),
            MediaType.get("application/json; charset=utf-8")
        );
        Request request = new Request.Builder()
            .url("https://localhost:7197/api/Ventas")
            .post(body)
            .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new RuntimeException("Error al crear venta: " + response);
            String json = response.body().string();
            return gson.fromJson(json, Venta.class);
        }
    }

    public void crearDetalleVenta(DetalleVenta detalle) throws Exception {
        RequestBody body = RequestBody.create(
            gson.toJson(detalle),
            MediaType.get("application/json; charset=utf-8")
        );
        Request request = new Request.Builder()
            .url("https://localhost:7197/api/DetalleVentas")
            .post(body)
            .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new RuntimeException("Error al crear detalle: " + response);
        }
    }

    public void actualizarProducto(Producto producto) throws Exception {
        RequestBody body = RequestBody.create(
            gson.toJson(producto),
            MediaType.get("application/json; charset=utf-8")
        );
        Request request = new Request.Builder()
            .url("https://localhost:7197/api/Productos/" + producto.getId())
            .put(body)
            .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new RuntimeException("Error al actualizar producto: " + response);
        }
    }

    private OkHttpClient getUnsafeOkHttpClient() {
        try {
            TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager() {
                    public void checkClientTrusted(X509Certificate[] chain, String authType) {}
                    public void checkServerTrusted(X509Certificate[] chain, String authType) {}
                    public X509Certificate[] getAcceptedIssuers() { return new X509Certificate[]{}; }
                }
            };
            SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
            SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

            return new OkHttpClient.Builder()
                .sslSocketFactory(sslSocketFactory, (X509TrustManager) trustAllCerts[0])
                .hostnameVerifier((hostname, session) -> true)
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .build();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
