/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;

// Agregar Fechas(Dia,Mes,Año)
// Agregar Modulo Eliminar Citas
/**
 *
 * @author Pablo Vega
 * @author Funnyd
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op = 0;
        Citas cita = new Citas();

        
        while (op != 5) {
            String menu = "Menú Principal"
                    + "\n1- Agregar Barberos"
                    + "\n2- Agendar Cita"
                    + "\n3- Consultar Citas"
                    + "\n4- Eliminar Citas"
                    + "\n5- Salir";

            op = Integer.parseInt(JOptionPane.showInputDialog(menu + "\n Digite la opcion que necesita:"));
            switch (op) {

                
                case 1:
                    cita.guardarBarbero();
                    break;

                case 2:
                    cita.AgendarCita();
                    break;

                case 3:
                    String buscarBarbero = JOptionPane.showInputDialog("Digite el nombre del barbero que desea consultar: ");
                    cita.MostrarCitas(buscarBarbero);
                    break;

                case 4:
                    buscarBarbero = JOptionPane.showInputDialog("Digite el barbero al que se le va a eliminar la cita: ");
                    cita.eliminarCitas(buscarBarbero);
                    break;
                    
                    
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta",
                            "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
        
}
