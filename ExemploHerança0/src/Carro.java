
import java.io.PrintStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Energy
 */
public class Carro {
    private String nome;
    private Boolean ligado;
    private Boolean destruido;
    private int blindagem;
    private Boolean armamento;
    
    public Carro(String nome){
        this.nome=nome;
        this.ligado=false;
        this.destruido=false;
        this.blindagem=0;
        this.armamento=false;
    }

    public String getNome() {
        return nome;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    public Boolean getDestruido() {
        return destruido;
    }

    public void setDestruido(Boolean destruido) {
        this.destruido = destruido;
    }

    public int getBlindagem() {
        return blindagem;
    }

    public void setBlindagem(int blindagem) {
        this.blindagem = blindagem;
    }

    public void setArmamento(Boolean armamento) {
        this.armamento = armamento;
    }

    public Boolean getArmamento() {
        return armamento;
    }

    public void sofrerDano(int dano){
        this.blindagem-=dano;
        if(this.blindagem<=0){
            this.blindagem=0;
            this.ligado=false;
            this.destruido=true;
        }
    }
    
    public void info(){
        System.out.println("---------------------------------");
        System.out.printf("Nome:.........%s%n",this.nome);
        PrintStream printf = System.out.printf("Ligado:.......%s%n",this.ligado ? "Sim":"Não");
        PrintStream printf1 = System.out.printf("Destrido:....%s%n",this.destruido ? "Sim":"Não");
        PrintStream printf2 = System.out.printf("Blindagem:...%s%n",this.blindagem);
        PrintStream printf3 = System.out.printf("Armamento:...%s%n",this.armamento ? "Sim":"Não" );
    }
    
}
