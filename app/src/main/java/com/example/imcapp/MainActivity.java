package com.example.imcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CalcularIMC (View view) {
        TextView textIMC = findViewById(R.id.txtImcId);
        EditText edtPeso = findViewById(R.id.edtPesoId);
        EditText edtAltura = findViewById(R.id.edtAlturaId);
        TextView textClassificacao = findViewById(R.id.txtClassificacaoId);

        double peso = Double.parseDouble(edtPeso.getText().toString());
        double altura = Double.parseDouble(edtAltura.getText().toString())/100;
        double imc = Math.round(peso/(altura*altura));

        textIMC.setText(String.valueOf(imc));

        if (imc <= 18.5) {
            textClassificacao.setText("Abaixo do peso");
        } else if (imc > 18.5 && imc <= 24.9){
            textClassificacao.setText("Peso normal");
        } else if (imc > 24.9 && imc <= 29.9){
            textClassificacao.setText("Sobrepeso");
        } else if (imc > 29.9 && imc <= 34.9){
            textClassificacao.setText("Obesidade grau 1");
        } else if (imc > 34.9 && imc <= 39.9){
            textClassificacao.setText("Obesidade grau 2");
        } else if (imc >= 40){
            textClassificacao.setText("Obesidade grau 3");
        }
    }
}
