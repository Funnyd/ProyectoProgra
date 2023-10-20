/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto;
import javax.swing.JOptionPane;

/**
 *
 * @author dques
 */
public class Proyecto {

    public static void main(String[] args) {
        String nombreBarbero= "";
        int almuerzoBarbero = 0;
        Barberos barbero = new Barberos();
        
        nombreBarbero = JOptionPane.showInputDialog("Digite el nombre del barbero");
        String var = JOptionPane.showInputDialog("Digite la hora del almuerzo del barbero(Formato 24 horas)");
        almuerzoBarbero = Integer.parseInt(var);
        
        barbero.setBarbero(nombreBarbero, almuerzoBarbero);
        
        String nombreObtenido= barbero.getNombreBarbero();
        JOptionPane.showMessageDialog(null, "Se guardó el barbero "+nombreObtenido);
        
        
        
    }
}
