/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provan1;

import javax.swing.JOptionPane;

/**
 *
 * @author phelype
 */
public class ProvaN1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Bem Bem vindo ! \n ------------------------\n"
                + "Escolha uma das opções:\n"
                + "1 - Cadastrar Curso\n"
                + "2 - Cadastrar Mestrado\n"
                + "3 - Cadastrar Especialização\n"
                + "4 - Cadastrar Alunos\n"
                + "------------------------------\n"
                + "Outras opções\n"
                + "5 - Listar cursos\n"
                + "6 - Listar Mestrado\n"
                + "7 - Listar Especialização\n"
                + "8 - Listar Alunos aprovados\n"
                + "9 - Listrar Alunos reprovados"));

        switch (opcao) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                System.exit(0);
            

        }

    }
}
