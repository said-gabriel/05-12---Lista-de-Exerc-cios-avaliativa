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
public class AmericanoBuilder extends Builder {

    @Override
    public void buildDescricao() {
        sanduiche.setDescricao("Americano: ");
    }

    @Override
    public void buildAcrescimo() {
        sanduiche.setAcrescimo("Acrescimo: ");
    }

    @Override
    public void addIngrediente() {

        sanduiche = new Ingrediente(sanduiche, "presunto", "");
        sanduiche = new Ingrediente(sanduiche, "queijo", "");
        sanduiche = new Ingrediente(sanduiche, "ovo", "");
        sanduiche = new Ingrediente(sanduiche, "alface", "");
        sanduiche = new Ingrediente(sanduiche, "tomate", "");
        sanduiche = new Ingrediente(sanduiche, "maionese", "");
    }

}
