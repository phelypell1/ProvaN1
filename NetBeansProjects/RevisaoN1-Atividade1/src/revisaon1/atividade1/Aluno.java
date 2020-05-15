/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaon1.atividade1;

import java.util.ArrayList;

/**
 *
 * @author phelype
 */
public class Aluno {
    private int matriculaAluno;
    private String nomeAluno;
    private double nota1, nota2;

    private ArrayList<Aluno> alunos = new ArrayList<>();
    
    public Aluno(int matriculaAluno, String nomeAluno, double nota1, double nota2) {
        this.matriculaAluno = matriculaAluno;
        this.nomeAluno = nomeAluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Aluno() {
    }
    
    
    /**
     * @return the matriculaAluno
     */
    public int getMatriculaAluno() {
        return matriculaAluno;
    }

    /**
     * @param matriculaAluno the matriculaAluno to set
     */
    public void setMatriculaAluno(int matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    /**
     * @return the nomeAluno
     */
    public String getNomeAluno() {
        return nomeAluno;
    }

    /**
     * @param nomeAluno the nomeAluno to set
     */
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    /**
     * @return the nota1
     */
    public double getNota1() {
        return nota1;
    }

    /**
     * @param nota1 the nota1 to set
     */
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    /**
     * @return the nota2
     */
    public double getNota2() {
        return nota2;
    }

    /**
     * @param nota2 the nota2 to set
     */
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    @Override
    public String toString() {
        return "Aluno: "+getNomeAluno()+"\n Matricula: "+getMatriculaAluno()+"\n N1: "+getNota1()+"\n N2: "+getNota2();
    }

    /**
     * @return the alunos
     */
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    /**
     * @param alunos the alunos to set
     */
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

}