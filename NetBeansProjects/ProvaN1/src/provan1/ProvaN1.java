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
        AlunoMasculino alunos = new AlunoMasculino();
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
                JOptionPane.showMessageDialog(null, "Olá, pronto para cadastrar?");
                alunos.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe o código: ")));
                alunos.setCpf(JOptionPane.showInputDialog(null, "Informe o CPF"));
                if (alunos.getCpf().length() > 11) {
                    alunos.setCpf(JOptionPane.showInputDialog(null, "Cpf inválido tente novamente"));
                }
                alunos.setNome(JOptionPane.showInputDialog("Informe o nome completo."));
                int sexo = JOptionPane.showConfirmDialog(null, "Alunos e do Sexo Masculino?");
                if (sexo == 0) {
                    alunos.setSexo(true);
                    alunos.setIdentidadeMilitar(JOptionPane.showInputDialog("Informe a identidade Militar: "));
                    if (alunos.getIdentidadeMilitar().length() > 5 || alunos.getIdentidadeMilitar().length() < 5) {
                        while (alunos.getIdentidadeMilitar().length() > 5 || alunos.getIdentidadeMilitar().length() < 5) {
                            alunos.setIdentidadeMilitar(JOptionPane.showInputDialog("Identidade inválida tente novamente: "));
                        }
                    }
                } else {
                    alunos.setSexo(false);
                }
                alunos.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade:")));
                alunos.setEndereco(JOptionPane.showInputDialog(null, "Informe o enderenço"));
                Notas nota = new Notas();
                nota.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota1")));
                if(nota.getNota1() < 0 || nota.getNota1() > 10){
                    while(nota.getNota1() < 0 || nota.getNota1() > 10){
                        nota.setNota1(Double.parseDouble(JOptionPane.showInputDialog("nota inválida tente novamente")));
                    }
                }
                nota.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota2")));
                if(nota.getNota2() < 0 || nota.getNota2() > 10){
                    while(nota.getNota2() < 0 || nota.getNota2() > 10){
                        nota.setNota1(Double.parseDouble(JOptionPane.showInputDialog("nota inválida tente novamente")));
                    }
                }
                nota.setNota3(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota3")));
                if(nota.getNota3() < 0 || nota.getNota3() > 10){
                    while(nota.getNota3() < 0 || nota.getNota3() > 10){
                        nota.setNota1(Double.parseDouble(JOptionPane.showInputDialog("nota inválida tente novamente")));
                    }
                }
                double media = nota.calculaMedia(nota.getNota1(),nota.getNota2(),nota.getNota1());
                JOptionPane.showMessageDialog(null,alunos.getSituacao(media));
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
