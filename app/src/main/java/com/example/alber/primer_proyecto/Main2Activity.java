package com.example.alber.primer_proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * @author Andres Urizar
 */
public class Main2Activity extends AppCompatActivity {

    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        Persona personas = intent.getParcelableExtra("persona");
        textView1 =(TextView) findViewById(R.id.textView1);
        textView2 =(TextView) findViewById(R.id.textView2);
        textView3 =(TextView) findViewById(R.id.textView3);
        textView4 =(TextView) findViewById(R.id.textView4);
        String element1 = personas.getNombre();
        String element2 = personas.getTelefono();
        String element3 = personas.getDireccion();
        String element4 = personas.getCorreo();
        textView1.setText(element1);
        textView2.setText(element2);
        textView3.setText(element3);
        textView4.setText(element4);
        //Obtenemos los datos con Intent

        //Mostramos texto en el ListView
      //  String elNombre=intent.getStringExtra("heroes");
     //    nombreHeroeM.setText(elNombre);


    }
}
