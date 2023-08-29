package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edTexto;
    private EditText edPeso;
    private EditText edAltura;
    private Button btHomem;
    private Button btMulher;
    private Button btLimpar;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edPeso = findViewById(R.id.edPeso);
        edAltura = findViewById(R.id.edAltura);
        btHomem = findViewById(R.id.btHomem);
        btMulher = findViewById(R.id.btMulher);
        btLimpar = findViewById(R.id.btLimpar);
        tvResultado = findViewById(R.id.tvResultado);

        btHomem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double peso = Double.parseDouble(edPeso.getText().toString());
                Double altura = Double.parseDouble(edAltura.getText().toString());
                CalcularIMC(btHomem, peso, altura);
            }
        });

        btMulher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double peso = Double.parseDouble(edPeso.getText().toString());
                Double altura = Double.parseDouble(edAltura.getText().toString());
                CalcularIMC(btMulher, peso, altura);
            }
        });

        btLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edPeso.setText("");
                edAltura.setText("");
                tvResultado.setText("");
            }
        });
    }

    public void CalcularIMC(Button tipo, double peso, double altura){
        double imc = peso / (altura*altura);
        if(tipo == btHomem){
            if (imc < 20.7){
                tvResultado.setText("Você está abaixo do peso! Com um IMC de: " + imc);
            }else if(imc < 26.4){
                tvResultado.setText("Você está no peso normal! Com um IMC de: " + imc);
            }else if(imc < 27.8){
                tvResultado.setText("Você está marginalmente acima do peso! Com um IMC de: " + imc);
            }else if(imc < 31.1){
                tvResultado.setText("Você está acima do peso ideal! Com um IMC de: " + imc);
            }else if(imc > 31.1){
                tvResultado.setText("Você está obeso! Com um IMC de: " + imc);
            }
        }else{
            if (imc < 19.1){
                tvResultado.setText("Você está abaixo do peso! Com um IMC de: " + imc);
            }else if(imc < 25.8){
                tvResultado.setText("Você está no peso normal! Com um IMC de: " + imc);
            }else if(imc < 27.3){
                tvResultado.setText("Você está marginalmente acima do peso! Com um IMC de: " + imc);
            }else if(imc < 32.3){
                tvResultado.setText("Você está acima do peso ideal! Com um IMC de: " + imc);
            }else if(imc > 32.3){
                tvResultado.setText("Você está obeso! Com um IMC de: " + imc);
            }
        }
    }
}

//
//    double peso = Double.parseDouble(edPeso.getText().toString());
//    double altura = Double.parseDouble(edAltura.getText().toString());
//    double res = peso / altura;
//    String resultado = String.valueOf(res);
//                tvResultado.setText(resultado);
