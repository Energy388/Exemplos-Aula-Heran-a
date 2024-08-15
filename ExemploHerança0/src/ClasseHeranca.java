/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Energy
 */
public class ClasseHeranca {
    public static void main(String[] args) {
        Carro c1 = new Carro("Fusca");
        Carro c2 = new Carro("Ferrari");
        c1.info();
        c1.setLigado(Boolean.TRUE);
        c1.info();
        
        CarroCombate c3 = new CarroCombate("Lepardo", 100);
        CarroCombate c4 = new CarroCombate("Pantera", 50);
        
        c3.atirar();
        c3.atirar();
        c3.atirar();
        c1.info();
        c2.info();
        c3.infor();
        c4.info();
        
        
        
        
    }
}
