/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.questao2.business.builder;

import br.ufes.questao2.business.decorator.Sanduiche;

/**
 *
 * @author 55289
 */
public class SanduicheDirector {

    protected Builder fabricaSanduiche;

    public SanduicheDirector(Builder fabricaSanduiche) {
        this.fabricaSanduiche = fabricaSanduiche;
    }

    public void buildSanduiche() {
        fabricaSanduiche.buildAcrescimo();
        fabricaSanduiche.buildDescricao();
        fabricaSanduiche.addIngrediente();
    }

    public Sanduiche getSanduiche() {
        return fabricaSanduiche.getSanduiche();
    }

    public void setBuilder(Builder fabricaSanduiche) {
        this.fabricaSanduiche = fabricaSanduiche;
    }
    public Builder getBuilder(){
        return this.fabricaSanduiche;
    }
}
