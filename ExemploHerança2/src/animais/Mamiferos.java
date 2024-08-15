/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animais;
import animais.Animal;

/**
 *
 * @author Energy
 */
public class Mamiferos extends Animal{
    private String corPelo;

   

    public Mamiferos(int RGAnimal, String nome, String raca, String corPelo) {
        super(RGAnimal, nome, raca);
        this.corPelo=corPelo;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Cor do pêlo: " + this.corPelo);
    }

}
