/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

/**
 *
 * @author Lorenzo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro carro = new Carro("EZD-2528");
        carro.ligarMotor();
        System.out.println(carro.motorLigado());
        carro.desligarMotor();
        System.out.println(carro.motorLigado());
        
        Caminhao mermedes = new Caminhao("MIJ-0123");
        mermedes.ligarMotor();
        System.out.println("Caminhao: " + mermedes.motorLigado());
        
        Alarme alarmeCarro = new Alarme(carro);
        alarmeCarro.alarmar();
        
        Alarme alarmeCaminhao = new Alarme(mermedes);
        alarmeCaminhao.alarmar();
    }
}
