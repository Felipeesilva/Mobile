package com.example.trabalhocarro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.trabalhocarro.controller.CarroDAO;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    ListView lvCarros;
    FloatingActionButton fabAdd;

    CarroDAO dao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvCarros = findViewById(R.id.lvCarros);
        fabAdd = findViewById(R.id.fabAdd);

        dao = new CarroDAO();

        fabAdd.setOnClickListener(v -> {
            startActivity(new Intent(this, CadastroActivity.class));
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        lvCarros.setAdapter(new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                dao.getListaCarros()
        ));
    }
}