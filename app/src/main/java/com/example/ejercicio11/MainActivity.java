package com.example.ejercicio11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    EditText et1, et2 ;
    TextView tv1 ;
    Button btnSumar;
    Button btnRestar;
    Button btnDividir;
    Button btnMultiplicar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txtNumero1);
        et2 = (EditText)findViewById(R.id.TxtNumero2);
        tv1 = (TextView)findViewById(R.id.lbl_Resultado);
        btnSumar = (Button)findViewById(R.id.btn_Sumar);
        btnRestar = (Button)findViewById(R.id.btn_restar);
        btnDividir = (Button)findViewById(R.id.btn_Dividir);
        btnMultiplicar = (Button)findViewById(R.id.btn_Multiplicar);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suma();

            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resta();
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               divi();
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              multi();
            }
        });


    }

    private void suma(){
        double x,y,r;
        x=Integer.parseInt(et1.getText().toString());
        y=Integer.parseInt(et2.getText().toString());
        r=x+y;
        tv1.setText(String.valueOf(r));
    }
    private void resta(){
        double x,y,r;
        x=Integer.parseInt(et1.getText().toString());
        y=Integer.parseInt(et2.getText().toString());
        r=x-y;
        tv1.setText(String.valueOf(r));
    }
    private void multi(){
        double x,y,r;
        x=Integer.parseInt(et1.getText().toString());
        y=Integer.parseInt(et2.getText().toString());
        r=x*y;
        tv1.setText(String.valueOf(r));
    }
    private void divi(){
        double x,y,r;
        x=Integer.parseInt(et1.getText().toString());
        y=Integer.parseInt(et2.getText().toString());
        r=x/y;
        tv1.setText(String.valueOf(r));
    }


}