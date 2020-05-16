/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provan1;

import java.util.ArrayList;

/**
 *
 * @author phelype
 */
public class Curso {
    private int codigo, cargaHoraria, sala;
    private String nome, nomeProfessor;
    private double valorCurso;
    private ArrayList<Aluno> alunos;

    public Curso() {
    }
    
    public Curso(int codigo, int cargaHoraria, int sala, String nome, String nomeProfessor, double valorCurso, ArrayList<Aluno> alunos) {
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
        this.sala = sala;
        this.nome = nome;
        this.nomeProfessor = nomeProfessor;
        this.valorCurso = valorCurso;
        this.alunos = alunos;
    }
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the cargaHoraria
     */
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * @param cargaHoraria the cargaHoraria to set
     */
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    /**
     * @return the sala
     */
    public int getSala() {
        return sala;
    }

    /**
     * @param sala the sala to set
     */
    public void setSala(int sala) {
        this.sala = sala;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nomeProfessor
     */
    public String getNomeProfessor() {
        return nomeProfessor;
    }

    /**
     * @param nomeProfessor the nomeProfessor to set
     */
    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    /**
     * @return the valorCurso
     */
    public double getValorCurso() {
        return valorCurso;
    }

    /**
     * @param valorCurso the valorCurso to set
     */
    public void setValorCurso(double valorCurso) {
        this.valorCurso = valorCurso;
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

    void setAlunos(AlunoMasculino alunos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
