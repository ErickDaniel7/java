package com.example.exercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edValorInvestimentoInicial;
    private EditText edTaxaJuros;
    private EditText edPeriodoInvestimento;
    private TextView tvResultado;
    private Button btExibir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edValorInvestimentoInicial = findViewById(R.id.edValorInvestimentoInicial);
        edTaxaJuros = findViewById(R.id.edTaxaJuros);
        edPeriodoInvestimento = findViewById(R.id.edPeriodoInvestimento);
        btExibir = findViewById(R.id.btExibir);
        tvResultado = findViewById(R.id.tvResultado);
        Investimento investimento = new Investimento();

        btExibir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                investimento.investimentoInicial = Double.parseDouble(edValorInvestimentoInicial.getText().toString());
                investimento.taxaJuros = Double.parseDouble(edTaxaJuros.getText().toString());
                investimento.periodoInvestimento = Integer.parseInt(edPeriodoInvestimento.getText().toString());
                tvResultado.setText("em: " + investimento.periodoInvestimento + " meses, você terá: " + calcularInvestimento(investimento) + "R$ reais.");
            }
        });
    }

    public double calcularInvestimento(Investimento obj){
        double lucroMes = 0;
        for(int i=0;i<obj.periodoInvestimento;i++){
            lucroMes = obj.investimentoInicial * obj.taxaJuros;
            obj.investimentoInicial = obj.investimentoInicial + lucroMes;
            lucroMes = 0;
        }
        return obj.investimentoInicial;
    }
}