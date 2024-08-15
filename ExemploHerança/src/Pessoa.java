/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Energy
 */
public class Pessoa {
    //atributos
    private String nome;
    private String cpf;
    
    //construtor
    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    // método
    
    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Cpf: "+this.cpf);
        
    }
    
}
