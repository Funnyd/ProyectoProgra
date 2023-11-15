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

    private String Nombre = "";
    private String Dia = "";
    private int Telefono = 0;
    private int rangohoras = 0;
    
    public String getNombre() {
        return this.Nombre;
    }
    
    public String getDia() {
        return this.Dia;
    }

    public int getTelefono() {
        return this.Telefono;
    }
    
    public int getHora() {
        return this.rangohoras;
    }

 

    public Clientes(String NombreC, int TelefonoC,String DiaC,int HoraC ) {
        this.Nombre=NombreC;
        this.Dia=DiaC;
        this.rangohoras=HoraC;
        this.Telefono=TelefonoC; 
        JOptionPane.showMessageDialog(null, "Se guardo el cliente");
   
}
}
