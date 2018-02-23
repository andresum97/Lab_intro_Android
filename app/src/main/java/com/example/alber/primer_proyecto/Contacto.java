package com.example.alber.primer_proyecto;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by alber on 2/22/2018.
 */

public class Contacto implements Parcelable {

    private Persona[] personas = new Persona[3];
    int cont = 0;
    String nombre="";
    String telefono="";
    String correo="";
    String direccion="";
    public Contacto(){
        personas[0]= new Persona("Carlos","18468186","carlos@hotmail.com","zona 1");
        personas[1] = new Persona("Mario","64186885","mario@gmail.com","zona 4");
        personas[2] = new Persona("Andrea","18168486","andrea@yahoo.com","zona 12");
    }

    protected Contacto(Parcel in) {

        nombre = in.readString();
        telefono = in.readString();
        correo = in.readString();
        direccion = in.readString();
    }

    public void mostrar(int pos){
        nombre = personas[pos].getNombre();
        telefono = personas[pos].getTelefono();
        correo = personas[pos].getCorreo();
        direccion = personas[pos].getDireccion();
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
    public static final Creator<Contacto> CREATOR = new Creator<Contacto>() {
        @Override
        public Contacto createFromParcel(Parcel in) {
            return new Contacto(in);
        }

        @Override
        public Contacto[] newArray(int size) {
            return new Contacto[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nombre);
        parcel.writeString(telefono);
        parcel.writeString(correo);
        parcel.writeString(direccion);
    }

}
