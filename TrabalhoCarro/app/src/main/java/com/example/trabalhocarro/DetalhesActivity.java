package com.example.trabalhocarro;

import static java.lang.String.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.trabalhocarro.controller.CarroDAO;
import com.example.trabalhocarro.model.Carro;

public class DetalhesActivity extends AppCompatActivity {

    TextView tvMarca;
    TextView tvModelo;
    TextView tvFabricacao;
    TextView tvCor;
    TextView tvMotor;
    TextView tvCombustivel;
    TextView tvFipe;

    CarroDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        tvMarca = findViewById(R.id.tvMarca);
        tvModelo = findViewById(R.id.tvModelo);
        tvFabricacao = findViewById(R.id.tvFabricacao);
        tvCor = findViewById(R.id.tvCor);
        tvMotor = findViewById(R.id.tvMotor);
        tvCombustivel = findViewById(R.id.tvCombustivel);
        tvFipe = findViewById(R.id.tvFipe);

        dao = new CarroDAO();

        Intent intent = getIntent();

        int i = intent.getIntExtra("i", -1);

        if(i == -1) { finish();}

        Carro c = dao.getCarro(i);

        //texto das tv com os do objeto

        tvMarca.setText(c.getMarca());
        tvModelo.setText(c.getModelo());
        tvFabricacao.setText(c.getFabricacao());
        tvCor.setText(c.getCor());
        tvMotor.setText(String.valueOf(c.getMotor()));
        tvCombustivel.setText(c.getCombustivel());
        tvFipe.setText(String.valueOf(c.getFipe()));


        }

}
