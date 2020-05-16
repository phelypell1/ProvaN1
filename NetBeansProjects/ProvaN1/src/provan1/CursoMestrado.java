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
public class CursoMestrado extends Curso{
    private boolean strictoSensu;
    private double adicionalDiploma;

    public CursoMestrado(boolean strictoSensu, double adicionalDiploma, int codigo, int cargaHoraria, int sala, String nome, String nomeProfessor, double valorCurso, ArrayList<Aluno> alunos) {
        super(codigo, cargaHoraria, sala, nome, nomeProfessor, valorCurso, alunos);
        this.strictoSensu = strictoSensu;
        this.adicionalDiploma = adicionalDiploma;
    }

    public CursoMestrado() {
    }

    public CursoMestrado(boolean strictoSensu, double adicionalDiploma) {
        this.strictoSensu = strictoSensu;
        this.adicionalDiploma = adicionalDiploma;
    }

    /**
     * @return the strictoSensu
     */
    public boolean isStrictoSensu() {
        return strictoSensu;
    }

    /**
     * @param strictoSensu the strictoSensu to set
     */
    public void setStrictoSensu(boolean strictoSensu) {
        this.strictoSensu = strictoSensu;
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
