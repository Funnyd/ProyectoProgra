/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablo Vega
 */
public class Calendario {

    public int año = 0;
    public String dia = "";
    public int fecha = 0;
    String[] meses = {
        "enero", "febrero", "marzo", "abril",
        "mayo", "junio", "julio", "agosto",
        "septiembre", "octubre", "noviembre", "diciembre"
    };
    public String fechaCita = " ";

    public Calendario() {
    }

    public void FechaCita() {
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año que quiere su cita: "));
        int op = 0;
        String menu = "Meses"
                + "\n1- enero"
                + "\n2- febrero"
                + "\n3- marzo"
                + "\n4- abril"
                + "\n5- mayo"
                + "\n6- junio"
                + "\n7- julio"
                + "\n8- agosto"
                + "\n9- septiembre"
                + "\n10- octubre"
                + "\n11- noviembre"
                + "\n12- diciembre";
        op = Integer.parseInt(JOptionPane.showInputDialog(menu + "\n Seleccione el mes que desea su cita:"));
        switch (op) {
            case 1:
                dia = JOptionPane.showInputDialog("Digite el dia que quiere su cita: "
                        + "\nlunes"
                        + "\nmartes"
                        + "\nmiercoles"
                        + "\njueves"
                        + "\nviernes"
                        + "\nsabado"
                        + "\ndomingo");
                fecha = Integer.parseInt(JOptionPane.showInputDialog("Digite la fecha de su cita(1-31): "));
                if (fecha > 31) {
                    JOptionPane.showMessageDialog(null, "Fecha inválida");
                    fechaCita = null;
                } else {
                    fechaCita = dia + " " + fecha + " " + meses[0] + " " + año;
                }
                break;
            case 2:
                dia = JOptionPane.showInputDialog("Digite el dia que quiere su cita: "
                        + "\nlunes"
                        + "\nmartes"
                        + "\nmiercoles"
                        + "\njueves"
                        + "\nviernes"
                        + "\nsabado"
                        + "\ndomingo");
                fecha = Integer.parseInt(JOptionPane.showInputDialog("Digite la fecha de su cita(1-28): "));
                if (fecha > 28) {
                    JOptionPane.showMessageDialog(null, "Fecha inválida");
                    fechaCita = null;
                } else {
                    fechaCita = dia + " " + fecha + " " + meses[1] + " " + año;
                }
                break;
            case 3:
                dia = JOptionPane.showInputDialog("Digite el dia que quiere su cita: "
                        + "\nlunes"
                        + "\nmartes"
                        + "\nmiercoles"
                        + "\njueves"
                        + "\nviernes"
                        + "\nsabado"
                        + "\ndomingo");
                fecha = Integer.parseInt(JOptionPane.showInputDialog("Digite la fecha de su cita(1-31): "));
                if (fecha > 31) {
                    JOptionPane.showMessageDialog(null, "Fecha inválida");
                    fechaCita = null;
                } else {
                    fechaCita = dia + " " + fecha + " " + meses[2] + " " + año;

                }
                break;
            case 4:
                dia = JOptionPane.showInputDialog("Digite el dia que quiere su cita: "
                        + "\nlunes"
                        + "\nmartes"
                        + "\nmiercoles"
                        + "\njueves"
                        + "\nviernes"
                        + "\nsabado"
                        + "\ndomingo");
                fecha = Integer.parseInt(JOptionPane.showInputDialog("Digite la fecha de su cita(1-30): "));
                if (fecha > 30) {
                    JOptionPane.showMessageDialog(null, "Fecha inválida");
                    fechaCita = null;
                } else {
                    fechaCita = dia + " " + fecha + " " + meses[3] + " " + año;

                }
                break;
            case 5:
                dia = JOptionPane.showInputDialog("Digite el dia que quiere su cita: "
                        + "\nlunes"
                        + "\nmartes"
                        + "\nmiercoles"
                        + "\njueves"
                        + "\nviernes"
                        + "\nsabado"
                        + "\ndomingo");
                fecha = Integer.parseInt(JOptionPane.showInputDialog("Digite la fecha de su cita(1-30): "));
                if (fecha > 30) {
                    JOptionPane.showMessageDialog(null, "Fecha inválida");
                } else {
                    fechaCita = dia + " " + fecha + " " + meses[4] + " " + año;

                }
                break;
            case 6:
                dia = JOptionPane.showInputDialog("Digite el dia que quiere su cita: "
                        + "\nlunes"
                        + "\nmartes"
                        + "\nmiercoles"
                        + "\njueves"
                        + "\nviernes"
                        + "\nsabado"
                        + "\ndomingo");
                fecha = Integer.parseInt(JOptionPane.showInputDialog("Digite la fecha de su cita(1-30): "));
                if (fecha > 30) {
                    JOptionPane.showMessageDialog(null, "Fecha inválida");
                    fechaCita = null;
                } else {
                    fechaCita = dia + " " + fecha + " " + meses[5] + " " + año;

                }
                break;
            case 7:
                dia = JOptionPane.showInputDialog("Digite el dia que quiere su cita: "
                        + "\nlunes"
                        + "\nmartes"
                        + "\nmiercoles"
                        + "\njueves"
                        + "\nviernes"
                        + "\nsabado"
                        + "\ndomingo");
                fecha = Integer.parseInt(JOptionPane.showInputDialog("Digite la fecha de su cita(1-31): "));
                if (fecha > 31) {
                    JOptionPane.showMessageDialog(null, "Fecha inválida");
                    fechaCita = null;
                } else {
                    fechaCita = dia + " " + fecha + " " + meses[6] + " " + año;
                }
                break;
            case 8:
                dia = JOptionPane.showInputDialog("Digite el dia que quiere su cita: "
                        + "\nlunes"
                        + "\nmartes"
                        + "\nmiercoles"
                        + "\njueves"
                        + "\nviernes"
                        + "\nsabado"
                        + "\ndomingo");
                fecha = Integer.parseInt(JOptionPane.showInputDialog("Digite la fecha de su cita(1-31): "));
                if (fecha > 31) {
                    JOptionPane.showMessageDialog(null, "Fecha inválida");
                    fechaCita = null;
                } else {
                    fechaCita = dia + " " + fecha + " " + meses[7] + " " + año;
                }
                break;
            case 9:
                dia = JOptionPane.showInputDialog("Digite el dia que quiere su cita: "
                        + "\nlunes"
                        + "\nmartes"
                        + "\nmiercoles"
                        + "\njueves"
                        + "\nviernes"
                        + "\nsabado"
                        + "\ndomingo");
                fecha = Integer.parseInt(JOptionPane.showInputDialog("Digite la fecha de su cita(1-30): "));
                if (fecha > 30) {
                    JOptionPane.showMessageDialog(null, "Fecha inválida");
                    fechaCita = null;
                } else {
                    fechaCita = dia + " " + fecha + " " + meses[8] + " " + año;
                }
                break;
            case 10:
                dia = JOptionPane.showInputDialog("Digite el dia que quiere su cita: "
                        + "\nlunes"
                        + "\nmartes"
                        + "\nmiercoles"
                        + "\njueves"
                        + "\nviernes"
                        + "\nsabado"
                        + "\ndomingo");
                fecha = Integer.parseInt(JOptionPane.showInputDialog("Digite la fecha de su cita(1-31): "));
                if (fecha > 31) {
                    JOptionPane.showMessageDialog(null, "Fecha inválida");
                    fechaCita = null;
                } else {
                    fechaCita = dia + " " + fecha + " " + meses[9] + " " + año;
                }
                break;
            case 11:
                dia = JOptionPane.showInputDialog("Digite el dia que quiere su cita: "
                        + "\nlunes"
                        + "\nmartes"
                        + "\nmiercoles"
                        + "\njueves"
                        + "\nviernes"
                        + "\nsabado"
                        + "\ndomingo");
                fecha = Integer.parseInt(JOptionPane.showInputDialog("Digite la fecha de su cita(1-30): "));
                if (fecha > 30) {
                    JOptionPane.showMessageDialog(null, "Fecha inválida");
                    fechaCita = null;
                } else {
                    fechaCita = dia + " " + fecha + " " + meses[10] + " " + año;

                }
                break;
            case 12:
                dia = JOptionPane.showInputDialog("Digite el dia que quiere su cita: "
                        + "\nlunes"
                        + "\nmartes"
                        + "\nmiercoles"
                        + "\njueves"
                        + "\nviernes"
                        + "\nsabado"
                        + "\ndomingo");
                fecha = Integer.parseInt(JOptionPane.showInputDialog("Digite la fecha de su cita(1-31): "));
                if (fecha > 31) {
                    JOptionPane.showMessageDialog(null, "Fecha inválida");
                    fechaCita = null;
                } else {
                    fechaCita = dia + " " + fecha + " " + meses[11] + " " + año;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion incorrecta",
                        "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
