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
        int op = 0;
        Citas cita = new Citas();
        cita.guardarBarbero();
        while (op != 3) {
            String menu = "Menú Principal"
                    + "\n1- Agendar Cita"
                    + "\n2- Consultar Citas"
                    + "\n3- Salir";
            op = Integer.parseInt(JOptionPane.showInputDialog(menu + "\n Digite la opcion que necesita:"));
            switch (op) {
                case 1:

                    cita.AgendarCita();
                    break;
                case 2:
                    String buscarBarbero = JOptionPane.showInputDialog("Digite el nombre del barbero que desea consultar: ");
                    cita.MostrarCitas(buscarBarbero);

                    break;
                case 3:
                    break;
            }
        }
    }
}
