package br.ufes.questao2.business.decorator;

public class SanduicheConcreto extends Sanduiche{

    public SanduicheConcreto(String acrescimo) {
        this.acrescimo = acrescimo;
    }

    public SanduicheConcreto() {

    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public String getAcrescimo() {
        return this.acrescimo;
    }
}
