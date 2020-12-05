package br.ufes.questao2.business.decorator;

public abstract class Sanduiche {

    protected String descricao;
    protected String acrescimo;

    public  abstract String getDescricao();
    public abstract String getAcrescimo();

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setAcrescimo(String acrescimo) {
        this.acrescimo = acrescimo;
    }
    
}
