/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provan1;

/**
 *
 * @author phelype
 */
public class AlunoMasculino extends Aluno{
    private String identidadeMilitar;

    public AlunoMasculino() {
    }

    public AlunoMasculino(String identidadeMilitar) {
        this.identidadeMilitar = identidadeMilitar;
    }

    public AlunoMasculino(String identidadeMilitar, int codigo, int idade, String nome, String cpf, String endereco, boolean sexo, Notas notas) {
        super(codigo, idade, nome, cpf, endereco, sexo, notas);
        this.identidadeMilitar = identidadeMilitar;
    }

    /**
     * @return the identidadeMilitar
     */
    public String getIdentidadeMilitar() {
        return identidadeMilitar;
    }

    /**
     * @param identidadeMilitar the identidadeMilitar to set
     */
    public void setIdentidadeMilitar(String identidadeMilitar) {
        this.identidadeMilitar = identidadeMilitar;
    }
    
    
    
}
