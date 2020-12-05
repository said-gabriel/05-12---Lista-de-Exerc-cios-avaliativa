/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.questao3.model;

import java.util.ArrayList;

/**
 *
 * @author 55289
 */
public class Computador extends Componente {

    private ArrayList<Componente> componentes;

    public Computador(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
        componentes = new ArrayList();
    }

    public Computador() {
        componentes = new ArrayList();
    }

    public void addPeca(Peça peca) {
        this.descricao = "\n" + peca.getDescricao();
        this.componentes.add(peca);
    }

    public void removePeca(Peça peca) {
        this.componentes.remove(peca);
    }

    public ArrayList<Componente> getComponentes() {
        return this.componentes;
    }

    @Override
    public String toString() {
        String descricaoTodos = "";
        for (int i = 0; i < componentes.size(); i++) {
            descricaoTodos += "\nDescricao: " + componentes.get(i).getDescricao()
                    + "\nPreço: " + componentes.get(i).getPreco();
        }
        return descricaoTodos;
    }

    @Override
    public String getDescricao() {
        String descricaoGeral = "";
        for (int i = 0; i < componentes.size(); i++) {
            descricaoGeral += "\nDescricao: " + componentes.get(i).getDescricao();
        }
        this.descricao = descricaoGeral;

        return descricaoGeral;
    }

    @Override
    public double getPreco() {
        double precoTotal = 0;
        for (int i = 0; i < componentes.size(); i++) {
            precoTotal += componentes.get(i).getPreco();
        }
        this.preco = precoTotal;
        return precoTotal;
    }

}
