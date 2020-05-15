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
public class Endereco {
    private String logradouro;
    private String cidade;
    private String estado;

    public Endereco(String logradouro, String cidade, String estado) {
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.estado = estado;
    }

    /**
     * @return the logradouro
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * @param logradouro the logradouro to set
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String consultaEndereco(Endereco logradouro)
    {
        return this.logradouro;
    }

    @Override
    public String toString() {
        return getLogradouro()+"\n Cidade: "+getCidade()+"\n UF: "+getCidade();
    }
    
}
