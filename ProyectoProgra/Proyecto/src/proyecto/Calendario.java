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
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Calendario {

    int op = 0;
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
                fecha = Integer.parseInt(JOptionPane.showInputDialog("Digite la fecha de su cita(1-31): "));
                if (fecha < 1 || fecha > 31) {
                    JOptionPane.showMessageDialog(null, "Fecha inválida");
                    fechaCita = null;
                } else {
                    LocalDate localDate = LocalDate.of(año, op, fecha);
                    DayOfWeek dayOfWeek = localDate.getDayOfWeek();
                    dia = dayOfWeek.getDisplayName(java.time.format.TextStyle.FULL, new Locale("es"));

                    fechaCita = dia + " " + fecha + " " + meses[op - 1] + " " + año;
                }
                break;

            case 2:
                fecha = Integer.parseInt(JOptionPane.showInputDialog("Digite la fecha de su cita(1-28): "));
                if (fecha < 1 || fecha > 28) {
                    JOptionPane.showMessageDialog(null, "Fecha inválida");
                    fechaCita = null;
                } else {
                    LocalDate localDate = LocalDate.of(año, op, fecha);
                    DayOfWeek dayOfWeek = localDate.getDayOfWeek();
                    dia = dayOfWeek.getDisplayName(java.time.format.TextStyle.FULL, new Locale("es"));

                    fechaCita = dia + " " + fecha + " " + meses[op - 1] + " " + año;
                }
                break;
            case 3:
                fecha = Integer.parseInt(JOptionPane.showInputDialog("Digite la fecha de su cita(1-31): "));
                if (fecha < 1 || fecha > 31) {
                    JOptionPane.showMessageDialog(null, "Fecha inválida");
                    fechaCita = null;
                } else {
                    LocalDate localDate = LocalDate.of(año, op, fecha);
                    DayOfWeek dayOfWeek = localDate.getDayOfWeek();
                    dia = dayOfWeek.getDisplayName(java.time.format.TextStyle.FULL, new Locale("es"));

                    fechaCita = dia + " " + fecha + " " + meses[op - 1] + " " + año;
                }
                break;
            case 4:
                fecha = Integer.parseInt(JOptionPane.showInputDialog("Digite la fecha de su cita(1-30): "));
                if (fecha < 1 || fecha > 30) {
                    JOptionPane.showMessageDialog(null, "Fecha inválida");
                    fechaCita = null;
                } else {
                    LocalDate localDate = LocalDate.of(año, op, fecha);
                    DayOfWeek dayOfWeek = localDate.getDayOfWeek();
                    dia = dayOfWeek.getDisplayName(java.time.format.TextStyle.FULL, new Locale("es"));

                    fechaCita = dia + " " + fecha + " " + meses[op - 1] + " " + año;
                }
                break;
            case 5:
                fecha = Integer.parseInt(JOptionPane.showInputDialog("Digite la fecha de su cita(1-30): "));
                if (fecha < 1 || fecha > 30) {
                    JOptionPane.showMessageDialog(null, "Fecha inválida");
                    fechaCita = null;
                } else {
                    LocalDate localDate = LocalDate.of(año, op, fecha);
                    DayOfWeek dayOfWeek = localDate.getDayOfWeek();
                    dia = dayOfWeek.getDisplayName(java.time.format.TextStyle.FULL, new Locale("es"));

                    fechaCita = dia + " " + fecha + " " + meses[op - 1] + " " + año;
                }
                break;
            case 6:
                fecha = Integer.parseInt(JOptionPane.showInputDialog("Digite la fecha de su cita(1-30): "));
                if (fecha < 1 || fecha > 30) {
                    JOptionPane.showMessageDialog(null, "Fecha inválida");
                    fechaCita = null;
                } else {
                    LocalDate localDate = LocalDate.of(año, op, fecha);
                    DayOfWeek dayOfWeek = localDate.getDayOfWeek();
                    dia = dayOfWeek.getDisplayName(java.time.format.TextStyle.FULL, new Locale("es"));

                    fechaCita = dia + " " + fecha + " " + meses[op - 1] + " " + año;
                }
                break;
            case 7:
                fecha = Integer.parseInt(JOptionPane.showInputDialog("Digite la fecha de su cita(1-31): "));
                if (fecha < 1 || fecha > 31) {
                    JOptionPane.showMessageDialog(null, "Fecha inválida");
                    fechaCita = null;
                } else {
                    LocalDate localDate = LocalDate.of(año, op, fecha);
                    DayOfWeek dayOfWeek = localDate.getDayOfWeek();
                    dia = dayOfWeek.getDisplayName(java.time.format.TextStyle.FULL, new Locale("es"));

                    fechaCita = dia + " " + fecha + " " + meses[op - 1] + " " + año;
                }
                break;
            case 8:
                fecha = Integer.parseInt(JOptionPane.showInputDialog("Digite la fecha de su cita(1-31): "));
                if (fecha < 1 || fecha > 31) {
                    JOptionPane.showMessageDialog(null, "Fecha inválida");
                    fechaCita = null;
                } else {
                    LocalDate localDate = LocalDate.of(año, op, fecha);
                    DayOfWeek dayOfWeek = localDate.getDayOfWeek();
                    dia = dayOfWeek.getDisplayName(java.time.format.TextStyle.FULL, new Locale("es"));

                    fechaCita = dia + " " + fecha + " " + meses[op - 1] + " " + año;
                }
                break;
            case 9:
                fecha = Integer.parseInt(JOptionPane.showInputDialog("Digite la fecha de su cita(1-30): "));
                if (fecha < 1 || fecha > 30) {
                    JOptionPane.showMessageDialog(null, "Fecha inválida");
                    fechaCita = null;
                } else {
                    LocalDate localDate = LocalDate.of(año, op, fecha);
                    DayOfWeek dayOfWeek = localDate.getDayOfWeek();
                    dia = dayOfWeek.getDisplayName(java.time.format.TextStyle.FULL, new Locale("es"));

                    fechaCita = dia + " " + fecha + " " + meses[op - 1] + " " + año;
                }
                break;
            case 10:
                fecha = Integer.parseInt(JOptionPane.showInputDialog("Digite la fecha de su cita(1-31): "));
                if (fecha < 1 || fecha > 31) {
                    JOptionPane.showMessageDialog(null, "Fecha inválida");
                    fechaCita = null;
                } else {
                    LocalDate localDate = LocalDate.of(año, op, fecha);
                    DayOfWeek dayOfWeek = localDate.getDayOfWeek();
                    dia = dayOfWeek.getDisplayName(java.time.format.TextStyle.FULL, new Locale("es"));

                    fechaCita = dia + " " + fecha + " " + meses[op - 1] + " " + año;
                }
                break;
            case 11:
                fecha = Integer.parseInt(JOptionPane.showInputDialog("Digite la fecha de su cita(1-30): "));
                if (fecha < 1 || fecha > 30) {
                    JOptionPane.showMessageDialog(null, "Fecha inválida");
                    fechaCita = null;
                } else {
                    LocalDate localDate = LocalDate.of(año, op, fecha);
                    DayOfWeek dayOfWeek = localDate.getDayOfWeek();
                    dia = dayOfWeek.getDisplayName(java.time.format.TextStyle.FULL, new Locale("es"));

                    fechaCita = dia + " " + fecha + " " + meses[op - 1] + " " + año;
                }
                break;
            case 12:
                fecha = Integer.parseInt(JOptionPane.showInputDialog("Digite la fecha de su cita(1-31): "));
                  if (fecha < 1 || fecha > 31) {
                    JOptionPane.showMessageDialog(null, "Fecha inválida");
                    fechaCita = null;
                } else {
                    LocalDate localDate = LocalDate.of(año, op, fecha);
                    DayOfWeek dayOfWeek = localDate.getDayOfWeek();
                    dia = dayOfWeek.getDisplayName(java.time.format.TextStyle.FULL, new Locale("es"));

                    fechaCita = dia + " " + fecha + " " + meses[op - 1] + " " + año;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion incorrecta",
                        "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

// Funcion para guardar fecha
/*public void FechadeCita() {
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año que quiere su cita: "));
        op = 0;
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
        op = Integer.parseInt(JOptionPane.showInputDialog(menu + "\nSeleccione el mes que desea su cita:"));
        preguntaFecha();
    }

    // Metodo para calcular fecha y mostrar en cuadro de diálogo
    public void preguntaFecha() {
        fecha = Integer.parseInt(JOptionPane.showInputDialog("Digite la fecha de su cita (1-30): "));
        if (fecha < 1 || fecha > 30) {
            JOptionPane.showMessageDialog(null, "Fecha inválida");
            fechaCita = null;
        } else {
            LocalDate localDate = LocalDate.of(año, op, fecha);
            DayOfWeek dayOfWeek = localDate.getDayOfWeek();
            dia = dayOfWeek.getDisplayName(java.time.format.TextStyle.FULL, new Locale("es"));

           fechaCita = dia + "/" + fecha + "/" + meses[op - 1] + "/" + año;
        }
    }*/
