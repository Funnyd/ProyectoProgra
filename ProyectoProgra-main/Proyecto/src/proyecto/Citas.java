/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Citas {

    public Barberos[] cBarberos = new Barberos[5];
    public int cantidadCitas = 0;
    public String[][] citas = new String[10][6];

    public void guardarBarbero() {
        for (int x = 0; x < cBarberos.length; x++) {
            Barberos barbero = new Barberos();
            barbero.Nombre_Barbero = JOptionPane.showInputDialog("Digite el nombre del barbero: ");
            barbero.Horario_Almuerzo = Integer.parseInt(JOptionPane.showInputDialog("Digite la hora que sale el barbero a almorzar (horario de las 8 a las 16h): "));
            cBarberos[x] = barbero;
        }
    }

    public void agendarCita() {
        Barberos barbero = new Barberos();
        Clientes cliente = new Clientes();

        String nombreBarbero = JOptionPane.showInputDialog("Digite el nombre del barbero con el que desea su cita: ");
        for (int i = 0; i < cBarberos.length; i++) {
            if (cBarberos[i] == null) {
                JOptionPane.showMessageDialog(null, "No ha ingresado ningún barbero");
                return;
            } else if (cBarberos[i].Nombre_Barbero.equals(nombreBarbero)) {
                barbero = cBarberos[i];
                cliente.Nombre = JOptionPane.showInputDialog("Digite el nombre del cliente: ");
                int telefono = Integer.parseInt(JOptionPane.showInputDialog("Digite el teléfono del Cliente: "));

                // Utilizar LocalDate para representar la fecha actual
                LocalDate fechaActual = LocalDate.now();

                // Formatear la fecha
                DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String fechaFormateada = fechaActual.format(formatoFecha);

                // Asignar fecha de la cita
                cliente.Dia = fechaFormateada;

                // Solicitar la hora deseada por el cliente
                int horaCita = Integer.parseInt(JOptionPane.showInputDialog("Digite la hora que desea su cita en un horario de las 8 a las 17 horas: "));

                // Verificar si la hora de la cita está en el rango del horario del barbero y no es durante la hora de almuerzo
                if (horaCita >= 8 && horaCita <= 17 && horaCita != barbero.Horario_Almuerzo) {
                    // Otras entradas de datos y validaciones según sea necesario...

                    // Agregar la cita
                    agregarCita(fechaFormateada, barbero, cliente, horaCita);

                    // Resto del código...
                } else {
                    JOptionPane.showMessageDialog(null, "Hora no disponible o durante la hora de almuerzo");
                }
            }
        }
    }

    private void agregarCita(String fecha, Barberos barbero, Clientes cliente, int horaCita) {
        if (cantidadCitas < citas.length) {
            citas[cantidadCitas][0] = fecha;
            citas[cantidadCitas][1] = Integer.toString(horaCita);
            citas[cantidadCitas][2] = barbero.Nombre_Barbero;
            citas[cantidadCitas][3] = cliente.Nombre;
            // Otras asignaciones de datos de la cita...

            cantidadCitas++;
        } else {
            JOptionPane.showMessageDialog(null, "Límite de citas alcanzado");
        }
    }

    public void mostrarCitas(String nombreBarbero) {
        // Utilizar LocalDate para representar la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Formatear la fecha
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String fechaFormateada = fechaActual.format(formatoFecha);

        // Mensaje de encabezado
        String mensaje = "Citas para el barbero " + nombreBarbero + " en la fecha " + fechaFormateada + ":\n";

        for (int j = 0; j < cantidadCitas; j++) {
            // Verificar si la cita es del barbero y en la fecha actual
            if (citas[j][2].equals(nombreBarbero) && citas[j][0].equals(fechaFormateada)) {
                String horaCita = citas[j][1];
                String nombreCliente = citas[j][3];
                // Puedes agregar más detalles según sea necesario

                // Agregar información al mensaje
                mensaje += "Hora: " + horaCita + ", Cliente: " + nombreCliente + "\n";
            }
        }

        // Mostrar el mensaje
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
