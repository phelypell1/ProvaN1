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
public class compra {
    private Pessoa pessoa;
    private Produto produto;

    public compra(Pessoa pessoa, Produto produto) {
        this.pessoa = pessoa;
        this.produto = produto;
    }

    /**
     * @return the pessoa
     */
    public Pessoa getPessoa() {
        return pessoa;
    }

    /**
     * @param pessoa the pessoa to set
     */
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    /**
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Dados do Cliente: \n"+
                pessoa.getNome()+"\n"+pessoa.getLogradouro()+"\n"+
                "\n---------------------------------------------\n"
                + "Descrição produto: "
                + produto.getCodigo()+"\n"
                + produto.getNome();
    }
}
