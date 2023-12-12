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
public class Calendario {
    int op = 0;
    public int año = 0;
    public String dia = "";
    public int fecha = 0;
    String[] meses = {
        "Enero", "Febrero", "Marzo", "Abril",
        "mayo", "Junio", "Julio", "Agosto",
        "Deptiembre", "Octubre", "Noviembre", "Diciembre"
    };
    public String fechaCita = " ";

    public Calendario() {
    }

    
    //Funcion para guardar fecha
    public void FechaCita() {
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
        op = Integer.parseInt(JOptionPane.showInputDialog(menu + "\n Seleccione el mes que desea su cita:"));
        preguntaFecha();
    }
    




    //Metodo para calcular fecha y guardar
    public void preguntaFecha(){
        fecha = Integer.parseInt(JOptionPane.showInputDialog("Digite la fecha de su cita(1-30): "));
        if (fecha > 30) {
                    JOptionPane.showMessageDialog(null, "Fecha inválida");
                    fechaCita = null;
                } else {
            switch (op) {
                case 1:
                case 8:
                    
                    if(fecha==1||fecha==8||fecha==15||fecha==22||fecha==29){
                        dia="Lunes";
      
                    }else if(fecha==2||fecha==9||fecha==16||fecha==23||fecha==30){
                        dia="Martes";
                        
                    }else if(fecha==3||fecha==10||fecha==17||fecha==24){
                        dia="Miercoles";
                        
                    }else if(fecha==4||fecha==11||fecha==18||fecha==25){
                        dia="Jueves";
                        
                    }else if(fecha==5||fecha==12||fecha==19||fecha==26){
                        dia="Viernes";
                        
                    }else if(fecha==6||fecha==13||fecha==20||fecha==27){
                        dia="Sabado";
                        
                    }else if(fecha==7||fecha==14||fecha==21||fecha==28){
                        dia="Domingo";
                        
                    }
                    break;
                case 2:
                case 9:
                    if(fecha==1||fecha==8||fecha==15||fecha==22||fecha==29){
                        dia="Miercoles";
      
                    }else if(fecha==2||fecha==9||fecha==16||fecha==23||fecha==30){
                        dia="Jueves";
                        
                    }else if(fecha==3||fecha==10||fecha==17||fecha==24){
                        dia="Viernes";
                        
                    }else if(fecha==4||fecha==11||fecha==18||fecha==25){
                        dia="Sabado";
                        
                    }else if(fecha==5||fecha==12||fecha==19||fecha==26){
                        dia="Domingo";
                        
                    }else if(fecha==6||fecha==13||fecha==20||fecha==27){
                        dia="Lunes";
                        
                    }else if(fecha==7||fecha==14||fecha==21||fecha==28){
                        dia="Martes";
                        
                    }
                    break;
                case 3:
                case 10:
                    if(fecha==1||fecha==8||fecha==15||fecha==22||fecha==29){
                        dia="Viernes";
      
                    }else if(fecha==2||fecha==9||fecha==16||fecha==23||fecha==30){
                        dia="Sabado";
                        
                    }else if(fecha==3||fecha==10||fecha==17||fecha==24){
                        dia="Domingo";
                        
                    }else if(fecha==4||fecha==11||fecha==18||fecha==25){
                        dia="Lunes";
                        
                    }else if(fecha==5||fecha==12||fecha==19||fecha==26){
                        dia="Martes";
                        
                    }else if(fecha==6||fecha==13||fecha==20||fecha==27){
                        dia="Miercoles";
                        
                    }else if(fecha==7||fecha==14||fecha==21||fecha==28){
                        dia="Jueves";
                        
                    }
                    break;
                case 4:
                case 11:
                    if(fecha==1||fecha==8||fecha==15||fecha==22||fecha==29){
                        dia="Domingo";
      
                    }else if(fecha==2||fecha==9||fecha==16||fecha==23||fecha==30){
                        dia="Lunes";
                        
                    }else if(fecha==3||fecha==10||fecha==17||fecha==24){
                        dia="Martes";
                        
                    }else if(fecha==4||fecha==11||fecha==18||fecha==25){
                        dia="Miercoles";
                        
                    }else if(fecha==5||fecha==12||fecha==19||fecha==26){
                        dia="Jueves";
                        
                    }else if(fecha==6||fecha==13||fecha==20||fecha==27){
                        dia="Viernes";
                        
                    }else if(fecha==7||fecha==14||fecha==21||fecha==28){
                        dia="Sabado";
                        
                    }
                    break;
                case 5:
                case 12:
                    if(fecha==1||fecha==8||fecha==15||fecha==22||fecha==29){
                        dia="Martes";
      
                    }else if(fecha==2||fecha==9||fecha==16||fecha==23||fecha==30){
                        dia="Miercoles";
                        
                    }else if(fecha==3||fecha==10||fecha==17||fecha==24){
                        dia="Jueves";
                        
                    }else if(fecha==4||fecha==11||fecha==18||fecha==25){
                        dia="Viernes";
                        
                    }else if(fecha==5||fecha==12||fecha==19||fecha==26){
                        dia="Sabado";
                        
                    }else if(fecha==6||fecha==13||fecha==20||fecha==27){
                        dia="Domingo";
                        
                    }else if(fecha==7||fecha==14||fecha==21||fecha==28){
                        dia="Lunes";
                        
                    }
                    break;
                case 6:
                    if(fecha==1||fecha==8||fecha==15||fecha==22||fecha==29){
                        dia="Jueves";
      
                    }else if(fecha==2||fecha==9||fecha==16||fecha==23||fecha==30){
                        dia="Viernes";
                        
                    }else if(fecha==3||fecha==10||fecha==17||fecha==24){
                        dia="Sabado";
                        
                    }else if(fecha==4||fecha==11||fecha==18||fecha==25){
                        dia="Domingo";
                        
                    }else if(fecha==5||fecha==12||fecha==19||fecha==26){
                        dia="Lunes";
                        
                    }else if(fecha==6||fecha==13||fecha==20||fecha==27){
                        dia="Martes";
                        
                    }else if(fecha==7||fecha==14||fecha==21||fecha==28){
                        dia="Miercoles";
                        
                    }
                    break;
                case 7:
                    if(fecha==1||fecha==8||fecha==15||fecha==22||fecha==29){
                        dia="Sabado";
      
                    }else if(fecha==2||fecha==9||fecha==16||fecha==23||fecha==30){
                        dia="Domingo";
                        
                    }else if(fecha==3||fecha==10||fecha==17||fecha==24){
                        dia="Lunes";
                        
                    }else if(fecha==4||fecha==11||fecha==18||fecha==25){
                        dia="Martes";
                        
                    }else if(fecha==5||fecha==12||fecha==19||fecha==26){
                        dia="Miercoles";
                        
                    }else if(fecha==6||fecha==13||fecha==20||fecha==27){
                        dia="Jueves";
                        
                    }else if(fecha==7||fecha==14||fecha==21||fecha==28){
                        dia="Viernes";
                        
                    }
                    break;
                default:
                    break;
            }
                    fechaCita = dia + "/" + fecha + "/" + meses[op-1] + "/" + año;
                }
                
    }
}
