package com.example.exercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btCalcular;
    private EditText edRendaBruta;
    private EditText edDependentes;
    private EditText edTotalDeducoes;
    private TextView tvRendaBrutaAnual;
    private TextView tvBaseCalculo;
    private TextView tvImposto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCalcular = findViewById(R.id.btCalcular);
        edRendaBruta = findViewById(R.id.edRendaBruta);
        edDependentes = findViewById(R.id.edDependentes);
        edTotalDeducoes = findViewById(R.id.edTotalDeducoes);
        tvRendaBrutaAnual = findViewById(R.id.tvRendaBruta);
        tvBaseCalculo = findViewById(R.id.tvBaseCalculo);
        tvImposto = findViewById(R.id.tvImposto);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcularIR();
            }
        });
    }
    public void calcularIR(){
        Impostos conta = new Impostos();
        conta.rendaBrutaAnual = Double.parseDouble(edRendaBruta.getText().toString()) * 12;
        double totalDeducao = Double.parseDouble(edTotalDeducoes.getText().toString());
        int dependente = Integer.parseInt(edDependentes.getText().toString());
        double dependenteAPagar = dependente * 300 * 12;
        double imposto = 0;

        conta.baseCalculo = conta.rendaBrutaAnual - dependenteAPagar - totalDeducao;
        if(conta.rendaBrutaAnual < 18000){
            conta.imposto = 0;
        }else if(conta.rendaBrutaAnual < 27000){
            conta.imposto = (calculaImposto(0.15, conta.rendaBrutaAnual));
        }else{
            conta.imposto = (calculaImposto(0.27, conta.rendaBrutaAnual));
        }
        exibirCalculos(conta);
    }

    public double calculaImposto(double imposto, double renda){
        double cotacaoImposto = 1350;
        if(imposto <= 0.27){
            return (renda * imposto);
        }else{
            return (renda * imposto) + (cotacaoImposto);
        }
    }

    public void exibirCalculos(Impostos obj){
        tvRendaBrutaAnual.setText("A renda bruta anual é de: " + obj.rendaBrutaAnual);
        tvBaseCalculo.setText("A base de calculo é de: " + obj.baseCalculo);
        tvImposto.setText("O imposto é de: " + obj.imposto);
    }
}
