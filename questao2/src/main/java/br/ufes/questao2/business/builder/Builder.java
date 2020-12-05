/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.questao2.business.builder;

import br.ufes.questao2.business.decorator.Ingrediente;
import br.ufes.questao2.business.decorator.Sanduiche;
import br.ufes.questao2.business.decorator.SanduicheConcreto;

/**
 *
 * @author 55289
 */
public abstract class Builder {

    protected Sanduiche sanduiche;

    public Builder() {
        sanduiche = new SanduicheConcreto();
    }

    public abstract void addIngrediente();
    public abstract void buildDescricao();
    public abstract void buildAcrescimo();

    public Sanduiche getSanduiche() {
        return sanduiche;
    }

}
