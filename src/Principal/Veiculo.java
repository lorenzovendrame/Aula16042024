/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author Lorenzo
 */
public interface Veiculo {
    
    boolean motorLigado();
    String ligarMotor();
    String desligarMotor();
    String placa();
    boolean IPVAPago();
    boolean trancarPortas();
    boolean destrancarPortas();
}
