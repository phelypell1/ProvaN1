/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaon1.atividade1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author phelype
 */
public class RevisaoN1Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        ArrayList<Aluno> alunos = new ArrayList<>();

        do {
            aluno.setNomeAluno(JOptionPane.showInputDialog("Informe o nome: "));
            aluno.setMatriculaAluno(Integer.parseInt(JOptionPane.showInputDialog("Informe sua matricula")));
            aluno.setNota1(Double.parseDouble(JOptionPane.showInputDialog("informe a nota1")));
            aluno.setNota2(Double.parseDouble(JOptionPane.showInputDialog("informe a nota1")));
            alunos.add(aluno);
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?") != JOptionPane.NO_OPTION);

        for (Aluno aluno1 : alunos) {
            double media = (aluno1.getNota1() + aluno1.getNota2()) / 2;
            if (media < 6) {
                JOptionPane.showMessageDialog(null, "Aluno: " + aluno1.getNomeAluno() + " reprovado por media");
            } else {
                JOptionPane.showMessageDialog(null, "Aluno: " + aluno1.getNomeAluno() + " aprovado por media");
            }
        }
    }
}
