package com.example.trabalhocarro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.trabalhocarro.controller.CarroDAO;
import com.example.trabalhocarro.model.Carro;

public class CadastroActivity extends AppCompatActivity {

    EditText etMarca;
    EditText etModelo;
    EditText etFabriacacao;
    EditText etCor;
    EditText etMotor;
    EditText etCombustivel;
    EditText etFipe;
    Button bCadastrar;

    CarroDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        etMarca = findViewById(R.id.etMarca);
        etModelo = findViewById(R.id.etModelo);
        etFabriacacao = findViewById(R.id.etFabricacao);
        etCor = findViewById(R.id.etCor);
        etMotor = findViewById(R.id.etMotor);
        etCombustivel = findViewById(R.id.etCombustivel);
        etFipe = findViewById(R.id.etFipe);
        bCadastrar = findViewById(R.id.bCadastrar);

        dao = new CarroDAO();

        bCadastrar.setOnClickListener(v -> {
            if (etMarca.getText().toString().isEmpty() ||
            etModelo.getText().toString().isEmpty() ||
            etFabriacacao.getText().toString().isEmpty() ||
            etCor.getText().toString().isEmpty() ||
            etMotor.getText().toString().isEmpty() ||
            etCombustivel.getText().toString().isEmpty() ||
            etFipe.getText().toString().isEmpty())
            {
                Toast.makeText(this, "Preencha todos os campos!!!", Toast.LENGTH_SHORT).show();
            } else {
                Carro carro = new Carro(
                        etMarca.getText().toString(),
                        etModelo.getText().toString(),
                        etFabriacacao.getText().toString(),
                        etCor.getText().toString(),
                        Float.parseFloat(etMotor.getText().toString()),
                        etCombustivel.getText().toString(),
                        Float.parseFloat(etFipe.getText().toString())
                );

                dao.addCarro(carro);

                Toast.makeText(this, "Carro cadastrado!", Toast.LENGTH_SHORT).show();

                finish();
            }

        });



    }
}