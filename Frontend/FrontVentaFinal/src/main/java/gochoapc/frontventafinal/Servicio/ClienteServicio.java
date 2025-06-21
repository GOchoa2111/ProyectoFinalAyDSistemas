/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gochoapc.frontventafinal.Servicio;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import gochoapc.frontventafinal.Modelo.Cliente;
import okhttp3.*;

import javax.net.ssl.*;
import java.lang.reflect.Type;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ClienteServicio {
    private final OkHttpClient client;
    private final Gson gson = new Gson();

    public ClienteServicio() {
        client = getUnsafeOkHttpClient();
    }

    public List<Cliente> obtenerClientes() throws Exception {
        Request request = new Request.Builder()
                .url("https://localhost:7197/api/Clientes")
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new RuntimeException("Error: " + response);

            String json = response.body().string();
            Type listType = new TypeToken<List<Cliente>>() {}.getType();
            return gson.fromJson(json, listType);
        }
    }

    public void crearCliente(Cliente cliente) throws Exception {
        RequestBody body = RequestBody.create(
                gson.toJson(cliente),
                MediaType.get("application/json; charset=utf-8")
        );

        Request request = new Request.Builder()
                .url("https://localhost:7197/api/Clientes")
                .post(body)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new RuntimeException("Error al crear: " + response);
        }
    }

    public void actualizarCliente(Cliente cliente) throws Exception {
        RequestBody body = RequestBody.create(
                gson.toJson(cliente),
                MediaType.get("application/json; charset=utf-8")
        );

        Request request = new Request.Builder()
                .url("https://localhost:7197/api/Clientes/" + cliente.getId())
                .put(body)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new RuntimeException("Error al actualizar: " + response);
        }
    }

    public void eliminarCliente(int id) throws Exception {
        Request request = new Request.Builder()
                .url("https://localhost:7197/api/Clientes/" + id)
                .delete()
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new RuntimeException("Error al eliminar: " + response);
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

