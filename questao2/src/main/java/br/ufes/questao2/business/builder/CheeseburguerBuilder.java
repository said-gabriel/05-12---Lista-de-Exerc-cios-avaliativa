/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.questao2.business.builder;

import br.ufes.questao2.business.decorator.Ingrediente;

/**
 *
 * @author 55289
 */
public class CheeseburguerBuilder extends Builder {


    @Override
    public void addIngrediente() {
        sanduiche = new Ingrediente(sanduiche, "pão", "");
        sanduiche = new Ingrediente(sanduiche, "queijo", "");

    }

    @Override
    public void buildDescricao() {
        sanduiche.setDescricao("Cheeseburguer: ");
    }

    @Override
    public void buildAcrescimo() {
        sanduiche.setAcrescimo("Acresimo: ");
    }
}
