/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablo Vega
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
<<<<<<< HEAD
        boolean i=false;
        int n=0;
        int opcion = 0;
        int horarioAlmuerzo=0;
        String NombreBarbero="";
        Barberos arrayBarberos[]= new Barberos[5];           
        
        
        //Guardar barberos
        for(int x=0; x<arrayBarberos.length;x++){
        NombreBarbero = JOptionPane.showInputDialog("Digite el nombre del barbero: ");     
        while ( i=true ) {
        horarioAlmuerzo = Integer.parseInt(JOptionPane.showInputDialog("Digite la hora que sale el barbero a almorzar: "));
        if (horarioAlmuerzo<8 || horarioAlmuerzo>17){
            JOptionPane.showMessageDialog(null, "Esa hora se encuentra fuera del horario laboral.");
        }
        else {
        break;
        }
        }
        arrayBarberos[x]= new Barberos(NombreBarbero,horarioAlmuerzo);
        }
        
        
        
        
        
        
       
        //Citas  
        Clientes arrayClientes[]= new Clientes[20]; 
=======
        int opcion = 0;
        String NombreBarbero = JOptionPane.showInputDialog("Digite el nombre del barbero: ");
        int horarioAlmuerzo = Integer.parseInt(JOptionPane.showInputDialog("Digite la hora que sale el barbero a almorzar: "));
        String diaLibre = JOptionPane.showInputDialog("Digite el dia libre del barbero: ");
        Barberos barbero = new Barberos();
        barbero.guardarBarbero(NombreBarbero, horarioAlmuerzo, diaLibre);
        //Citas  
>>>>>>> 66fa84e65ac13959d2ff828ca1772812ec40fae6
        while (opcion != 2) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción: \n1-Agendar Cita \n2-Salir"));
            if (opcion == 1) {
                String NombreCliente = JOptionPane.showInputDialog("Digite el nombre del cliente: ");
                int telefonoCliente = Integer.parseInt(JOptionPane.showInputDialog("Digite el teléfono del Cliente: "));
<<<<<<< HEAD
                String Dia = JOptionPane.showInputDialog("Digite el dia de la cita: ");                
                int Hora = Integer.parseInt(JOptionPane.showInputDialog("Digite la hora de la cita: "));//Ninguna cita deberia durar mas de 3 horas
                arrayClientes[n]= new Clientes(NombreCliente,telefonoCliente,Dia,Hora );   
                JOptionPane.showMessageDialog(null, arrayClientes[n].getNombre()+" "+arrayClientes[n].getTelefono()+" "+arrayClientes[n].getDia()+" "+arrayClientes[n].getHora());
                n=n+1;
                
                }else {
=======
                Clientes cliente = new Clientes();
                cliente.guardarCliente(NombreCliente, telefonoCliente);       
                }else if (opcion == 2){
>>>>>>> 66fa84e65ac13959d2ff828ca1772812ec40fae6
                   break;    
                }
                
            }
        }

    

}
<<<<<<< HEAD
        
=======
>>>>>>> 66fa84e65ac13959d2ff828ca1772812ec40fae6