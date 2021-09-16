package com.example.trabalhocarro.controller;

import com.example.trabalhocarro.model.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroDAO {

    private static List<Carro> listaCarros = new ArrayList<>();

    public void addCarro(Carro c){
        listaCarros.add(c);
    }

    public List<Carro> getListaCarros(){
        return listaCarros;
    }
}
