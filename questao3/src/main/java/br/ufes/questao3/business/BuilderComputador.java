/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.questao3.business;

import br.ufes.questao3.model.Computador;
import br.ufes.questao3.model.Peça;

/**
 *
 * @author 55289
 */
public class BuilderComputador extends Builder {

    public BuilderComputador(Computador fabricaComputador){
        super(fabricaComputador);
    }

    @Override
    public void buildPecas() {
        this.fabricaComputador.getComponentes().add(new Peça("Gabinete", 100));
    }

}
