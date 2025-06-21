/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gochoapc.frontventafinal.Modelo;

/**
 *
 * @author GOchoa
 */
    public class Usuario {
    private int id;
    private String nombre;
    private String correo;
    private String clave;

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getClave() { return clave; }
    public void setClave(String clave) { this.clave = clave; }
    @Override
    public String toString() {
    return nombre; // o puedes usar: return nombre + " (" + correo + ")";
}
}

