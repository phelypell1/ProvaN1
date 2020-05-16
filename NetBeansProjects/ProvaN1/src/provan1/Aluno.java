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
public class Aluno{
    private int codigo, idade;
    private String nome, cpf, endereco;
    private boolean sexo;
    private Notas notas;

    public Aluno() {
    }

    public Aluno(int codigo, int idade, String nome, String cpf, String endereco, boolean sexo, Notas notas) {
        this.codigo = codigo;
        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.sexo = sexo;
        this.notas = notas;
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
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
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
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the sexo
     */
    public boolean isSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the notas
     */
    public Notas getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(Notas notas) {
        this.notas = notas;
    }
    
    public String getSituacao(double valor){
        String msg = "Aguardando";
        if(valor < 6){
            msg = "Reprovado";
        }else{
            msg = "Aprovado";
        }
        return msg;
    }
}
