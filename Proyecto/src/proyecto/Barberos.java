/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;

public class Barberos {
    private String Nombre_Barbero="";
    private int Horario_Almuerzo=0;
    
      public String getBarbero() {
        return this.Nombre_Barbero;
    }
      
      public Barberos(String nombre, int horario) {
        this.Nombre_Barbero=nombre;
        this.Horario_Almuerzo=horario;
   
}
      
      public int getHorario_Almuerzo(){
          return this.Horario_Almuerzo;
      }
       
      public void guardarBarbero(String gBarbero, int gAlmuerzo) {
        this.Nombre_Barbero = gBarbero;
        this.Horario_Almuerzo = gAlmuerzo;
        JOptionPane.showMessageDialog(null, "Se guardo el barbero");
    }
}
