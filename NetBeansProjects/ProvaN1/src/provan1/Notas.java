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
public class Notas {
    private double nota1, nota2, nota3, media;

    public Notas() {
    }

    public Notas(double nota1, double nota2, double nota3, double media) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.media = media;
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

    /**
     * @return the media
     */
    public double getMedia() {
        return media;
    }

    /**
     * @param media the media to set
     */
    public void setMedia(double media) {
        this.media = media;
    }
    
    public double calculaMedia(double n1, double n2, double n3){
        return media = (nota1 + nota2 + nota3) / 3;
    }

    /**
     * @return the nota3
     */
    public double getNota3() {
        return nota3;
    }

    /**
     * @param nota3 the nota3 to set
     */
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    
}
