/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animais;
import animais.Mamiferos;
/**
 *
 * @author Energy
 */
public class Cachorro extends Mamiferos{
    
    public Cachorro(int RGAnimal, String nome, String raca, String corPelo) {
        super(RGAnimal, nome, raca, corPelo);
    }
     @Override
    public void darRemedio() {
        System.out.println("Deu remédios C1, C1, C3.");
    }

    @Override
    public void mostrar() {
        super.mostrar();
    }
 
    
}
