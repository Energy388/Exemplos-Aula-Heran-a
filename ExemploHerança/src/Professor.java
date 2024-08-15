/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Energy
 */
public class Professor extends Pessoa{
    private float salario; //atributo
    //construtor
    public Professor(String nome, String cpf, float salario){
        //super da classe pai
        super(nome, cpf);
        this.salario = salario;
    }
    @Override //sobescrita da classe
    public void imprime(){
        super.imprime();
        System.out.println("Salario: "+this.salario);
    }
    
    
}
