/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.pkg2;

/**
 *
 * @author phelype
 */
public class Pessoa {
    private String nome;
    private Endereco endereco;
    private int numero;

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
     * @return the logradouro
     */
    public Endereco getLogradouro() {
        return endereco;
    }

    /**
     * @param logradouro the logradouro to set
     */
    public void setLogradouro(Endereco logradouro) {
        this.endereco = logradouro;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public Endereco consultaEndereco(Pessoa endereco){
        return this.endereco;
    }
    public String consultaNome(Pessoa nomePessoa){
        return nome;
    }
    public Pessoa(String nome, Endereco endereco, int numero) {
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
    }
}
