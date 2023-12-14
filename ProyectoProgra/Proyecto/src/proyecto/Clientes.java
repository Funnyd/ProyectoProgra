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
public class Clientes {

    Proyecto main = new Proyecto();
    public String Nombre = "";
    private int Telefono = 0;

    public int getTelefono(int nuevoTelefono) {
        return nuevoTelefono;
    }

    public void setTelefono(int nuevoTelefono) {
        String numero = Integer.toString(nuevoTelefono);
        if (numero.length() < 8 || numero.length() > 8) {
            JOptionPane.showMessageDialog(null, "Número de teléfono inválido");
            
        } else {
            this.Telefono = nuevoTelefono;
        }
    }

    public Clientes() {

    }
}
