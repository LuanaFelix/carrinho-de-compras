/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.exemplos.ex01;

/**
 *
 * @author 41081218
 */
public class Eletronico extends Produto {
    
    public String Fabricante;
    public String Modelo;    
    
    public Eletronico (String nome, double valor, String fabricante, String modelo){
        super(nome, valor);
        this.Fabricante = fabricante;
        this.Modelo = modelo;
    }
    
}
