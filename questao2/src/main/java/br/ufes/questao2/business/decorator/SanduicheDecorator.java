package br.ufes.questao2.business.decorator;

public abstract class SanduicheDecorator extends Sanduiche {

    Sanduiche sanduicheComum;

    public SanduicheDecorator(Sanduiche sanduicheComum, String descricao, String acrescimo) {
        this.sanduicheComum = sanduicheComum;
        this.acrescimo = acrescimo;
        this.descricao = descricao;

    }

    @Override
    public String getAcrescimo() {
        return sanduicheComum.getAcrescimo() + " " + acrescimo;
    }

    @Override
    public String getDescricao() {
        return sanduicheComum.getDescricao() + " " + descricao;
    }
}
