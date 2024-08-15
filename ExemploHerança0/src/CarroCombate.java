
import java.io.PrintStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Energy
 */
public class CarroCombate extends Carro{
    private final int MAX_ARMAMENTO=100;
    private final int MIN_ARMAMENTO=0;
    private int qtdeArmamento;
    
    public CarroCombate(String nome, int blindagem) {
        super(nome);
        super.setArmamento(Boolean.TRUE);
        super.setBlindagem(blindagem);
        this.qtdeArmamento=100;
    }
    
    public void setQtdeArmamento(int armamento){
        this.qtdeArmamento+=qtdeArmamento;
        if(this.qtdeArmamento> MAX_ARMAMENTO){
            this.qtdeArmamento=MAX_ARMAMENTO;
        }
        if(this.qtdeArmamento<MIN_ARMAMENTO){
            this.qtdeArmamento=MIN_ARMAMENTO;
        
    }
    
}
    
    public int getQtdeArmamento(){
    return this.qtdeArmamento;
    
}
    public void atirar(){
        if(this.qtdeArmamento>MIN_ARMAMENTO){
            setQtdeArmamento(MAX_ARMAMENTO-1);
        }else{
            System.out.println("Sem Armamento / munição");
        }
    }
    public void infor(){
        super.info();
              PrintStream printf3 = System.out.printf("Armamento:...%d%n",this.qtdeArmamento);
    }
}