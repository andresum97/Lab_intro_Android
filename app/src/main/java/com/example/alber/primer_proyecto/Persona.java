package com.example.alber.primer_proyecto;

/**
 * Created by alber on 2/20/2018.
 */

public class Persona {
    private String nombre;
    private String telefono;
    private String correo;
    private String direccion;
    private String hobby;

    public Persona(String nombre, String telefono, String correo, String direccion, String hobby){
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.hobby = hobby;
    }

    public String getNombre(){
        return nombre;
    }
    public String getTelefono(){
        return telefono;
    }
    public String getCorreo(){
        return correo;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getHobby(){
        return hobby;
    }
}
