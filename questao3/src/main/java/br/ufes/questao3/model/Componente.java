/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.questao3.model;

/**
 *
 * @author 55289
 */
public abstract class Componente {

    protected String descricao;
    protected double preco;

    public abstract String getDescricao();

    public abstract double getPreco();

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
