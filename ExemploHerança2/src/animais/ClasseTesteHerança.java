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
public class ClasseTesteHeran�a {
    
    public static void main(String[] args) {
        Cachorro billy = new Cachorro(1234, "Billy", 
                "Pastor Alem�o", "Preta");
        
        Gato bochecha = new Gato(4321, "Bochecha", 
                "Siam�s", "Cinza");
        
        billy.mostrar();
        bochecha.mostrar();
    }
    
    
}
