/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;

public class Barberos {
<<<<<<< HEAD
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
=======
    public String Nombre_Barbero="";
    public int Horario_Almuerzo=0;
    public String DiaLibre = "";
      public String getBarbero() {
        return this.Nombre_Barbero;
    }
      public int getHorario_Almuerzo(){
          return this.Horario_Almuerzo;
      }
       public String getDiaLibre() {
        return this.DiaLibre;
    }
      public void guardarBarbero(String gBarbero, int gAlmuerzo, String DiaLibre) {
        this.Nombre_Barbero = gBarbero;
        this.Horario_Almuerzo = gAlmuerzo;
        this.DiaLibre = DiaLibre;
>>>>>>> 66fa84e65ac13959d2ff828ca1772812ec40fae6
        JOptionPane.showMessageDialog(null, "Se guardo el barbero");
    }
}
