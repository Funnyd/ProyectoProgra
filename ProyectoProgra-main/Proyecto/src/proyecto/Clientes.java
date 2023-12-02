/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;

public class Clientes {

    public String Nombre = "";
    private int Telefono = 0;
    public String Dia = "";

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int nuevoTelefono) {
        String numero = Integer.toString(nuevoTelefono);
        if (numero.length() != 8) {
            JOptionPane.showMessageDialog(null, "Número de teléfono inválido");
        } else {
            this.Telefono = nuevoTelefono;
        }
    }

    public Clientes() {

    }
}
