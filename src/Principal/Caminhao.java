/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author Lorenzo
 */
public class Caminhao implements Veiculo{
    
    boolean statusPortas = false;
    boolean statusMotor = false;
    boolean bateriaCarregada = true;
    String placa = "";

    public Caminhao(String placa) {
        this.placa = placa;
    }
    
    @Override
    public boolean motorLigado() {
        return statusMotor;
    }

    @Override
    public String ligarMotor() {
        if (statusMotor == false && this.bateriaCarregada == true){
            statusMotor = !statusMotor;
            System.out.println("Vruuuuuum");
        }
        return "Tentou ligar motor.";
    }

    @Override
    public String desligarMotor() {
        if (statusMotor == true){
            statusMotor = !statusMotor;
            System.out.println("Bah");
        }
        return "Bah";
    }

    @Override
    public String placa() {
        return placa;
    }

    @Override
    public boolean IPVAPago() {
        return false;
    }    

    @Override
    public boolean trancarPortas() {
        if (statusPortas == false){
            statusPortas = !statusPortas;
        }
        return true;
    }

    @Override
    public boolean destrancarPortas() {
        if (statusPortas == true){
            statusPortas = !statusPortas;
        }
        return true;
    }
}
