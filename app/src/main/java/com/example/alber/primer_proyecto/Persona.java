package com.example.alber.primer_proyecto;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by alber on 2/20/2018.
 */

public class Persona{
    private String nombre;
    private String telefono;
    private String correo;
    private String direccion;

    public Persona(String nombre, String telefono, String correo, String direccion){
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
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




}
