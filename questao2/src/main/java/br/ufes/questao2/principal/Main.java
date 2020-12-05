package br.ufes.questao2.principal;

import br.ufes.questao2.business.decorator.Ingrediente;
import br.ufes.questao2.business.decorator.Sanduiche;
import br.ufes.questao2.business.builder.CheeseburguerBuilder;
import br.ufes.questao2.business.builder.SanduicheDirector;
import br.ufes.questao2.business.builder.AmericanoBuilder;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        SanduicheDirector fabricaSanduiche = new SanduicheDirector(new AmericanoBuilder());
        fabricaSanduiche.buildSanduiche();

        Sanduiche americano = fabricaSanduiche.getSanduiche();
        americano = new Ingrediente(americano, "", "passas");
        americano = new Ingrediente(americano, "", "batata palha");

        fabricaSanduiche.setBuilder(new CheeseburguerBuilder());
        fabricaSanduiche.buildSanduiche();

        Sanduiche cheeseburguer = fabricaSanduiche.getSanduiche();
        cheeseburguer = new Ingrediente(cheeseburguer, "", "palmito");
        cheeseburguer = new Ingrediente(cheeseburguer, "", "queijo prato");

        JOptionPane.showMessageDialog(null, americano.getDescricao()
                + "\n" + americano.getAcrescimo()
                + "\n\n" + cheeseburguer.getDescricao()
                + "\n" + cheeseburguer.getAcrescimo());

    }
}
