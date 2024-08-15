/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animais;

/**
 *
 * @author Energy
 */
public class Gato extends Mamiferos{
     public Gato(int RGAnimal, String nome, String raca, String corPelo) {
        super(RGAnimal, nome, raca, corPelo);
    }

    @Override
    public void darRemedio() {
        System.out.println("Deu remédios G1, G2 e G3");
    }
    
}
