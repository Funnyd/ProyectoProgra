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
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class Proyecto {

    public static void main(String[] args) {
        int op = 0;
        Citas cita = new Citas();

        while (op != 4) {
            String menu = "Menú Principal"
                    + "\n1- Agregar Barberos"
                    + "\n2- Agregar Citas"
                    + "\n3- Consultar Citas"
                    + "\n4- Salir";

            op = Integer.parseInt(JOptionPane.showInputDialog(menu + "\nDigite la opción que necesita:"));
            switch (op) {
                case 1:
                    cita.guardarBarbero();
                    break;

                case 2:
                    cita.agendarCita();
                    break;

                case 3:
                    String buscarBarbero = JOptionPane.showInputDialog("Digite el nombre del barbero que desea consultar: ");
                    cita.mostrarCitas(buscarBarbero);
                    break;

                case 4:
                    break;
            }
        }
    }
}
