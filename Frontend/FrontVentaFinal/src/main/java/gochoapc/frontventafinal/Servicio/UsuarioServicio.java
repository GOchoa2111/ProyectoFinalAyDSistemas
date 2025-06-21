/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gochoapc.frontventafinal.Servicio;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import gochoapc.frontventafinal.Modelo.Usuario;

import javax.net.ssl.*;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.MediaType;
import okhttp3.RequestBody;
/**
 *
 * @author GOchoa
 */
public class UsuarioServicio {
    private final OkHttpClient client;
    private final Gson gson = new Gson();

    public UsuarioServicio() {
        client = getUnsafeOkHttpClient();
    }

    public List<Usuario> obtenerUsuarios() throws Exception {
        Request request = new Request.Builder()
                .url("https://localhost:7197/api/Usuarios")
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new RuntimeException("Error: " + response);

            String json = response.body().string();
            Type listType = new TypeToken<List<Usuario>>() {}.getType();
            return gson.fromJson(json, listType);
        }
    }
    
    public Usuario buscarPorCorreo(String correo) throws Exception {
    Request request = new Request.Builder()
            .url("https://localhost:7197/api/Usuarios")
            .build();

    try (Response response = client.newCall(request).execute()) {
        if (!response.isSuccessful()) throw new RuntimeException("Error: " + response);

        String json = response.body().string();
        Type listType = new TypeToken<List<Usuario>>() {}.getType();
        List<Usuario> usuarios = gson.fromJson(json, listType);

        for (Usuario u : usuarios) {
            if (u.getCorreo().equalsIgnoreCase(correo)) {
                return u;
            }
        }
        return null;
    }
}
    public void crearUsuario(Usuario usuario) throws Exception {
        RequestBody body = RequestBody.create(
                gson.toJson(usuario),
                MediaType.get("application/json; charset=utf-8")
        );

        Request request = new Request.Builder()
                .url("https://localhost:7197/api/Usuarios")
                .post(body)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new RuntimeException("Error al crear: " + response);
        }
    }

    public void actualizarUsuario(Usuario usuario) throws Exception {
        RequestBody body = RequestBody.create(
                gson.toJson(usuario),
                MediaType.get("application/json; charset=utf-8")
        );

        Request request = new Request.Builder()
                .url("https://localhost:7197/api/Usuarios/" + usuario.getId())
                .put(body)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new RuntimeException("Error al actualizar: " + response);
        }
    }

    public void eliminarUsuario(int id) throws Exception {
        Request request = new Request.Builder()
                .url("https://localhost:7197/api/Usuarios/" + id)
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

