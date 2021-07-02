/*
 * 
 */
package parcial1;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author SEBAS TU NEW PAPU
 */
public class VentaBoletas {

    static int CantidadP;
    static int opcionesTribuna;
    
        static String N[] ;
        static String A[];
        static String D[] ;
        static int E[] ;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner valores = new Scanner(System.in);
        Cliente Datos = new Cliente();
        Estadio Tribunas = new Estadio();
        
        //primer punto numero de personas que hay en la fila
        CantidadP = Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantas personas Hay en la Fila? "
                + "\n'Las cuales desean comprar Boletas'"));        
        System.out.println("En la Fila Hay "+CantidadP +" Personas\n");
        
        //System.out.println("Cuantas personas Hay en la Fila? \n'las cuales desean comprar Boletas'");
        //CantidadP = valores.nextInt();
        
        N = new String[CantidadP];
        A = new String[CantidadP];
        D = new String[CantidadP];
        E = new int [CantidadP];
        
        //solicitar datos basicos al cliente
        for(int i =0; i<CantidadP; i++){
            
            //System.out.println("Ingrese el Nombre de la Persona N°"+(i+1)+" : ");
            N[i] = JOptionPane.showInputDialog(null,"Ingrese el Nombre de la Persona N°"+(i+1)+" : ");            
            //n[i] = valores.next();
            Datos.setNombre(N);
            System.out.println("El nombre de la Persona N°"+(i+1)+" es: "+N[i]);
                        
            
            //System.out.println("Ingrese el Apellido de la Persona N°"+(i+1)+" : ");
            A[i] = JOptionPane.showInputDialog("Ingrese el Apellido de la Persona N°"+(i+1)+" : ");
            //A[i] = valores.next();
            Datos.setApellido(A);
            System.out.println("El Apellido de la Persona N°"+(i+1)+" es: "+A[i]);
            
            
            //System.out.println("Ingrese el Documento de Identidad  de la Persona N°"+(i+1)+" : ");
            D[i] = JOptionPane.showInputDialog("Ingrese el Documento de Identidad  de la Persona N°"+(i+1)+" : ");
            //D[i] = valores.next();
            Datos.setDocumentoIde(D);
            System.out.println("El Documento de Identidad  de la Persona N°"+(i+1)+" : "+D[i]);
            
            
            //System.out.println("Ingrese la Edad de la Persona N°"+(i+1)+" : ");
            E[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad de la Persona N°"+(i+1)+" : "));
            //E[i] = valores.nextInt();
            
            while(E[i] < 18){
                
                //System.out.println("Ingrese una Edad Mayor!");
                JOptionPane.showMessageDialog(null,"¡Ingrese Una edad mayor!","VALIDACION DE EDAD",JOptionPane.INFORMATION_MESSAGE);
                //System.out.println("Ingrese la Edad de la Persona N°"+(i+1)+" Nuevamente: ");
                E[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad de la Persona N°"+(i+1)+" Nuevamente: "));
                //E[i] = valores.nextInt();                
            }
            
            Datos.setEdad(E);
            System.out.println("La edad de la Persona N°"+(i+1)+"  es: "+E[i]);            
            
            System.out.println("\n");
        }
        
        for(int i=0; i<CantidadP; i++){
            
            //System.out.println("Para el cliente N°"+n[i]+" en que Tribuna le gustaria comprar las boletas: ");
            
            
            do{
                opcionesTribuna = Integer.parseInt(JOptionPane.showInputDialog(null,"Para el cliente: "+N[i]+" ! "
                    + "\n En que Tribuna le gustaria comprar las boletas:  \n"
                        + "\n1. TRIBUNA NORTE. \n(PRECIO SILLA: 5MIL)\n"
                        + "\n2. TRIBUNA SUR. \n(PRECIO SILLA: 10MIL)\n"
                        + "\n3. TRIBUNA ORIENTE. \n(PRECIO SILLA: 30MIL)\n"
                        + "\n4. TRIBUNA OCCIDENTE. \n(PRECIO SILLA: 50MIL)\n"
                        + "\n5. SALIR",
                    "SELECCIONE LA TRIBUNA",JOptionPane.INFORMATION_MESSAGE));
                                
                switch(opcionesTribuna){
                    
                    case 1: Tribunas.TribunaNorte();
                        break;
                    case 2: Tribunas.TribunaSur();
                        break;
                    case 3: Tribunas.TribunaOriente();
                        break;
                    case 4: Tribunas.TribunaOccidente();
                        break;
                    case 5: System.out.println("\nSaliendo\n");
                        break;
                    
                }
                
                JOptionPane.showMessageDialog(null,"\nEl nombre de la "+(i+1)+"'a. Persona es: "+N[i]
                            +"\nEl Apellido es: "+A[i]
                            +"\nEl numero de documento es: "+D[i]
                            +"\nLa Edad es: "+E[i]
                            +"\nLa cantidad de boletas Compradas es de: "+Tribunas.getSumaBoletas()
                            +"\nEl total a pagar de "+N[i]+" es: "+Tribunas.getTotalPagar()
                            +"\n"
                            );  
                opcionesTribuna = 5;
                break;
                
            }while(opcionesTribuna != 5);
            
        }
    }
}