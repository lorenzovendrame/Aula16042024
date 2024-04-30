/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author Lorenzo
 */
public class Alarme {
    private Veiculo veiculo;

    public Alarme(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    public String alarmar(){
        veiculo.trancarPortas();
        return "Alarme armado";
    }
    
    public String desalarmar(){
        veiculo.destrancarPortas();
        return "Alarme desarmado";
    }
}
