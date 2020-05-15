/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author phelype
 */
public class Atividade2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Produto produto = new Produto(1, "Blusa Lisa");
       Produto produto1 = new Produto(2, "Calça jeans");
       Endereco end = new Endereco("Rua T-53", "Goiânia", "Go");
       Pessoa pessoa = new Pessoa("Phelype",end , 262);
       compra compra = new compra(pessoa, produto);
       
        JOptionPane.showMessageDialog(null, compra);
       
    }
    
}
