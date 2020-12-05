package br.ufes.questao2.business.decorator;

public class Ingrediente extends SanduicheDecorator {

    public Ingrediente(Sanduiche sanduiche, String descricao, String acrescimo) {
        super(sanduiche, descricao, acrescimo);

    }

}
