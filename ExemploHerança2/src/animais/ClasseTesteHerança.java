/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animais;
import animais.Cachorro;
import animais.Gato;
/**
 *
 * @author Energy
 */
public class ClasseTesteHerança {
    
    public static void main(String[] args) {
        Cachorro billy = new Cachorro(1234, "Billy", 
                "Pastor Alemão", "Preta");
        
        Gato bochecha = new Gato(4321, "Bochecha", 
                "Siamês", "Cinza");
        
        billy.mostrar();
        bochecha.mostrar();
    }
    
    
}
