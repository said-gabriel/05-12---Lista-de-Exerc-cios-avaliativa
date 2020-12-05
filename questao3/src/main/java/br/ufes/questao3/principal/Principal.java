/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.questao3.principal;

import br.ufes.questao3.business.BuilderComputador;
import br.ufes.questao3.business.BuilderDirector;
import br.ufes.questao3.model.Computador;
import br.ufes.questao3.model.Peça;
import javax.swing.JOptionPane;

/**
 *
 * @author 55289
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BuilderDirector construirPC = new BuilderDirector(new BuilderComputador(new Computador()));
        Computador computador = construirPC.getComputador();

        computador.addPeca(new Peça("Ssd", 259.90));
        computador.addPeca(new Peça("Memória RAM 4gb", 200.00));
        computador.addPeca(new Peça("Monitor 144hz", 1399.90));

        String result = String.format("%.2f", computador.getPreco());
        
        JOptionPane.showMessageDialog(null, computador.toString()
                + "\nPreço Total: " + result);
    }

}
