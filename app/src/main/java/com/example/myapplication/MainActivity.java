package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //Declarando variables
    EditText t_Search1, t_Search2, t_Android, t_Cs, t_Deitel, t_Google, t_IOS;
    Button b_Guardar;
    String search = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Llamando su funciones
        setContentView(R.layout.activity_main);
        t_Search1 = findViewById(R.id.txtSearch);
        t_Search2 = findViewById(R.id.txtSearch2);
        t_Android = findViewById(R.id.txtAndroid);
        t_Cs = findViewById(R.id.txtsharp);
        t_Deitel = findViewById(R.id.txtDeitel2);
        t_Google = findViewById(R.id.txtGoogle);
        t_IOS = findViewById(R.id.txtiOs);
        b_Guardar = findViewById(R.id.btnGuardar);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "");
        t_Search2.setTypeface(typeface);
        b_Guardar.setTypeface(typeface);
        //Método para el button

        b_Guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                search = t_Search2.getText().toString();
                if (search.isEmpty()) {
                    t_Search2.setError("Ingrese por favor los parametros");
                }else{
                    System.err.println("Imprimiendo el error");
                }
            }


        }
    }



}
