/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablo Vega
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;
        String NombreBarbero = JOptionPane.showInputDialog("Digite el nombre del barbero: ");
        int horarioAlmuerzo = Integer.parseInt(JOptionPane.showInputDialog("Digite la hora que sale el barbero a almorzar: "));
        String diaLibre = JOptionPane.showInputDialog("Digite el dia libre del barbero: ");
        Barberos barbero = new Barberos();
        barbero.guardarBarbero(NombreBarbero, horarioAlmuerzo, diaLibre);
        //Citas  
        while (opcion != 2) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción: \n1-Agendar Cita \n2-Salir"));
            if (opcion == 1) {
                String NombreCliente = JOptionPane.showInputDialog("Digite el nombre del cliente: ");
                int telefonoCliente = Integer.parseInt(JOptionPane.showInputDialog("Digite el teléfono del Cliente: "));
                Clientes cliente = new Clientes();
                cliente.guardarCliente(NombreCliente, telefonoCliente);       
                }else if (opcion == 2){
                   break;    
                }
                
            }
        }

    

}
