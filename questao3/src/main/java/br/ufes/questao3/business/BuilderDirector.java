/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.questao3.business;

import br.ufes.questao3.model.Computador;

/**
 *
 * @author 55289
 */
public class BuilderDirector {
    public Builder construirComputador;
    
    public BuilderDirector(Builder construirComputador){
        this.construirComputador = construirComputador;
    }
    public void build(){
        construirComputador.buildPecas();
    }
    public Computador getComputador(){
        return construirComputador.getComponente();
    }
}
