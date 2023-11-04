/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;

public class Barberos {
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
        JOptionPane.showMessageDialog(null, "Se guardo el barbero");
    }
}
