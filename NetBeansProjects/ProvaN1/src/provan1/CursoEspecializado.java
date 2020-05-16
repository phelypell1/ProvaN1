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
public class CursoEspecializado extends Curso{
    private boolean latoSensu;
    private double adicionalDiploma;

    public CursoEspecializado(boolean latoSensu, double adicionalDiploma, int codigo, int cargaHoraria, int sala, String nome, String nomeProfessor, double valorCurso, ArrayList<Aluno> alunos) {
        super(codigo, cargaHoraria, sala, nome, nomeProfessor, valorCurso, alunos);
        this.latoSensu = latoSensu;
        this.adicionalDiploma = adicionalDiploma;
    }

    public CursoEspecializado(boolean latoSensu, double adicionalDiploma) {
        this.latoSensu = latoSensu;
        this.adicionalDiploma = adicionalDiploma;
    }

    public CursoEspecializado() {
    }

    /**
     * @return the latoSensu
     */
    public boolean isLatoSensu() {
        return latoSensu;
    }

    /**
     * @param latoSensu the latoSensu to set
     */
    public void setLatoSensu(boolean latoSensu) {
        this.latoSensu = latoSensu;
    }

    /**
     * @return the adicionalDiploma
     */
    public double getAdicionalDiploma() {
        return adicionalDiploma;
    }

    /**
     * @param adicionalDiploma the adicionalDiploma to set
     */
    public void setAdicionalDiploma(double adicionalDiploma) {
        this.adicionalDiploma = adicionalDiploma;
    }
    
    public void setAdicionalDiploma(){
        
    }
     
    
}
