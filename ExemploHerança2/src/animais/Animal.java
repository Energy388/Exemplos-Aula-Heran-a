package animais;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Energy
 */

public class Animal {
 
    private int RGAnimal;
    private String nome;
    private String raca;

    public Animal(int RGAnimal, String nome, String raca) {
        this.RGAnimal = RGAnimal;
        this.nome = nome;
        this.raca = raca;
    }

    public void darRemedio() {
        System.out.println("Deu remédio A1, A2 e A3");
    }

    public void mostrar() {
        System.out.println("Nome: " + this.nome);
        System.out.println("RGA: " + this.RGAnimal);
        System.out.println("Raça: " + this.raca);
    }
    
}


