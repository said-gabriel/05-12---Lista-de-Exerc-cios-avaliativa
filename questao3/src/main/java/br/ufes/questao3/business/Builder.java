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
public abstract class Builder {

    protected Computador fabricaComputador;

    public Builder(Computador fabricaComputador) {
        this.fabricaComputador = fabricaComputador;
    }

    public abstract void buildPecas();

    public Computador getComponente() {
        return fabricaComputador;
    }
}
