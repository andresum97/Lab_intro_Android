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

    TextView nombreHeroeM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nombreHeroeM=(TextView) findViewById(R.id.nombreHeroe);
        //Obtenemos los datos con Intent
        Intent intent=getIntent();
        //Mostramos texto en el ListView
        String elNombre=intent.getStringExtra("heroes");
        nombreHeroeM.setText(elNombre);

    }
}
