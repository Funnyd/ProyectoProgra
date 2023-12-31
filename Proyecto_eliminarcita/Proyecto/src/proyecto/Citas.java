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
public class Citas {

    public Barberos cBarberos[] = new Barberos[5];
    public String Dia = " ";
    public int horaCita = 0;
    public double ganancia = 0;
    public int cantidadhoras = 0;
    int cantidadCitas = 0;
    public String[][] citas = new String[10][6];

    public void guardarBarbero() {
        for (int x = 0; x < cBarberos.length; x++) {
            Barberos barbero = new Barberos();
            barbero.Nombre_Barbero = JOptionPane.showInputDialog("Digite el nombre del barbero: ");
            barbero.Horario_Almuerzo = Integer.parseInt(JOptionPane.showInputDialog("Digite la hora que sale el barbero a almorzar(horario de las 8 a las 16h): "));
            cBarberos[x] = barbero;
        }
    }

    public Barberos AgendarCita() {
        Barberos barbero = new Barberos();
        Clientes cliente = new Clientes();
        String Nombre_Barbero = JOptionPane.showInputDialog("Digite el nombre del barbero con el que desea su cita: ");
        for (int i = 0; i < cBarberos.length; i++) {
            if (cBarberos[i].Nombre_Barbero.equals(Nombre_Barbero)) {
                barbero = cBarberos[i];
                cliente.Nombre = JOptionPane.showInputDialog("Digite el nombre del cliente: ");
                int Telefono = Integer.parseInt(JOptionPane.showInputDialog("Digite el teléfono del Cliente: "));
                Dia = JOptionPane.showInputDialog("Digite el dia que quiere su cita: "
                        + "\nlunes"
                        + "\nmartes"
                        + "\nmiercoles"
                        + "\njueves"
                        + "\nviernes"
                        + "\nsabado"
                        + "\ndomingo");
                cantidadhoras = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de horas que requiere el servicio: "));
                horaCita = Integer.parseInt(JOptionPane.showInputDialog("Digite la hora que quiere su Cita en un horario de las"
                        + "\n8 a las 17 horas"));
                int horafinal = cantidadhoras + horaCita - 1;
                for (int j = 0; j < cantidadCitas; j++) {
                    if (citas[j][0].equals(Dia) && Integer.parseInt(citas[j][1]) == horaCita) {
                        JOptionPane.showMessageDialog(null, "Ya existe una cita para el mismo día y hora. Por favor, elija otro horario.");
                        return barbero; 
                    }
                }
                if (horafinal == barbero.Horario_Almuerzo || (horafinal <= 7) || horafinal > 17) {
                    JOptionPane.showMessageDialog(null, "Hora no disponible.");
                } else {
                    citas[cantidadCitas][0] = String.valueOf(Dia);
                    citas[cantidadCitas][1] = String.valueOf(horaCita);
                    citas[cantidadCitas][2] = String.valueOf(cantidadhoras);
                    citas[cantidadCitas][3] = String.valueOf(cliente.Nombre);
                    citas[cantidadCitas][4] = String.valueOf(cliente.getTelefono(Telefono));

                    if (Dia.contains("sabado") || Dia.contains("domingo")) {
                        this.ganancia = 3000 * cantidadhoras * 1.13;
                        JOptionPane.showMessageDialog(null, "La cita tiene un valor de 3000 colones por hora más 13% de IVA");
                        JOptionPane.showMessageDialog(null, "La cita ha sido agendada" + "\nEl costo de la cita es de: " + ganancia);
                    } else {
                        this.ganancia = 2500 * cantidadhoras * 1.13;
                        JOptionPane.showMessageDialog(null, "La cita tiene un valor de 2500 colones más 13% de IVA");
                        JOptionPane.showMessageDialog(null, "La cita ha sido agendada" + "\nEl costo de la cita es de: " + ganancia);
                    }
                    citas[cantidadCitas][5] = String.valueOf(ganancia);
                    cantidadCitas++;
                }
            }

        }

        return barbero;
    }

    public void MostrarCitas(String Nombre_Barbero) {
        for (int i = 0; i < cBarberos.length; i++) {
            if (cBarberos[i].Nombre_Barbero.equals(Nombre_Barbero)) {
                String ConsultarDia = JOptionPane.showInputDialog("Digite el día que desea consultar: ");
                String mensaje = "Citas del día " + ConsultarDia + " para el barbero " + Nombre_Barbero + ":\n";

               
                boolean[] horasOcupadas = new boolean[18];
                double gananciaTotal = 0;
                for (int j = 0; j < cantidadCitas; j++) {
                    if (citas[j][0].equals(ConsultarDia)) {
                        int horaCita = Integer.parseInt(citas[j][1]);
                        int duracionCita = Integer.parseInt(citas[j][2]);
                        String NombreCliente = (citas[j][3]);
                        int telefonoCliente = Integer.parseInt(citas[j][4]);
                        double gananciaCita = Double.parseDouble(citas[j][5]);
                        gananciaTotal += gananciaCita;
                        for (int k = horaCita; k < horaCita + duracionCita; k++) {
                            horasOcupadas[k] = true;
                        }
                        mensaje += "Hora: " + horaCita + " - " + (horaCita + duracionCita)
                                + ", Cliente: " + NombreCliente + ", Teléfono: " + telefonoCliente + "\n";
                    }
                }

                for (int k = 8; k <= 17; k++) {
                    if (!horasOcupadas[k]) {
                        if (k != cBarberos[i].Horario_Almuerzo) {
                            mensaje += "Hora: " + k + ", VACIO\n";
                        } else {
                            mensaje += "Hora: " + k + ", ALMUERZO\n";
                        }
                    }
                }

                mensaje += "\nGanancia total del día: " + gananciaTotal;
                JOptionPane.showMessageDialog(null, mensaje);
            }
        }
    }
    public void EliminarCita(String Nombre_Barbero){
    
    for (int i = 0; i < cBarberos.length; i++){
    
        if(cBarberos[i] != null && cBarberos[i].equals(Nombre_Barbero)){
        cBarberos[i] = null;
        String EliminarCita = JOptionPane.showInputDialog("Digitela cita a eliminar ");
        String mensaje = "Reservaciones del dia" + EliminarCita + "para el barbero" + Nombre_Barbero + ":/n";
        return;
        }    
    }
        JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");
        JOptionPane.showInputDialog("Ingrese el nombre del barbero");
        JOptionPane.showInputDialog("Ingrese el dia que iba ser antendido");
    }
}
