/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author SEBAS TU NEW PAPU
 */
public class Estadio extends VentaBoletas{
    
    static int  CantidadB;
       
    double TotalPagar;    
    
    int sumaBoletas;

    public int getSumaBoletas() {
        return sumaBoletas;
    }

    public void setSumaBoletas(int sumaBoletas) {
        this.sumaBoletas = sumaBoletas;
    }

    public double getTotalPagar() {
        return TotalPagar;
    }

    public static void setTotalPagar(double TotalPagar) {
        TotalPagar = TotalPagar;
    }
       
    public void TribunaSur(){
        
        
        //int CantidadBoletas;
            
               try{
                   
                   //problema 
                   int opcion;
        int n=0;
        int TribunaVacia[][] = new int [5][10];
        int contador=0;
        double persona;
        double sumapersona =0;        
        
        Cliente C = new Cliente();
        //VentaBoletas V = new VentaBoletas();
        
        System.out.println("\nTRIBUNA SUR (Inicialmente VACIA)!\n");
        //Aqui comenté la tribuna inicialmente vacia
  /*      for(int filas=0;filas<5; filas++){
            
            for(int columnas=0; columnas<10;columnas++){
                
                System.out.print(" [ "+TribunaVacia[filas][columnas]+" ] ");
                
            }System.out.println("");
            
        }*/
        
        do{
    

         int CantidadBoletas = Integer.parseInt(JOptionPane.showInputDialog(null,"¿ Cual es la Cantidad de Boletas que desea Comprar ?",
               "CANTIDAD BOLETAS",JOptionPane.QUESTION_MESSAGE));
         
                
        while(CantidadBoletas > 10){
            
            JOptionPane.showMessageDialog(null,"¡La cantidad de Boletas ingresada es Mayor a 10!");
            CantidadBoletas = Integer.parseInt(JOptionPane.showInputDialog(null,"¡Ingrese una cantidad de Boletas Menor a 10!",
               "¡CANTIDAD BOLETAS MENOR A 10!",JOptionPane.INFORMATION_MESSAGE));            
        }
               
        CantidadB = CantidadBoletas;        
        
//      int filaAleatoria = (int) (Math.random()*((0-4))) ;
        int filaAlea = (int) (Math.random() * 5)+1;
                
        for(int i=0; i<5;i++){

            for(int j=0; j<CantidadBoletas; j++){
                
                TribunaVacia[filaAlea][j] = 1;
                
            }            
        }
        
        JOptionPane.showMessageDialog(null,"Usted quedara en Cualquier fila de Tribuna de acuerdo con \n"
                + "Nuestro sistema de seleccion");
        
        System.out.println("\nTribuna Despues de Compradas las Boletas!\n");
        for(int filas=0;filas<5; filas++){
            
            for(int columnas=0; columnas<10;columnas++){
                
                System.out.print(" [ "+TribunaVacia[filas][columnas]+" ] ");
                
            }System.out.println("");
            
        }
        
        sumaBoletas = sumaBoletas + CantidadB;        
        
        persona = CantidadB * 10000;
        
        sumapersona = sumapersona + persona;
        
        contador++;
        
            //System.out.println("Le gustaria seguir comprando Boletas en la Tribuna Sur");
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Le gustaria seguir comprando Boletas en la Tribuna Sur\n"
                    + "\n1. SI "
                    + "\n2. NO"));
        
            switch(opcion){
                
                case 1: break;
                case 2: n = 2;
                break;
            }
            while(opcion > 2){
                
                JOptionPane.showMessageDialog(null,"Por favor Ingrese una opcion Valida \n '(1 o 2)'");
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Le gustaria seguir comprando Boletas en la Tribuna Sur\n"
                    + "\n1. SI "
                    + "\n2. NO"));                
                
                switch(opcion){
                case 1: 
                break;
                case 2: n = 2;
                break;
                }
            }            
            
        }while(opcion < 2 && n != 2);
        
        setSumaBoletas(sumaBoletas);
        TotalPagar = sumapersona * contador;
        TotalPagar = TotalPagar /2;
        setTotalPagar(TotalPagar);
        
//        for(int i=0;i<contador;i++){
//        System.out.println("El total a Pagar para la Persona"+C.getNombre());
//        }
//        for(int i=0;i<CantidadB;i++){

        System.out.println("\nEl total a pagar es: "+TotalPagar);
        JOptionPane.showMessageDialog(null,"\nEl total a pagar para la Persona" +Arrays.toString(C.getNombre())+" es: $"+TotalPagar+ " Pesos. ","TOTAL A PAGAR",
                JOptionPane.INFORMATION_MESSAGE);
//        }
         
         
        }catch(NumberFormatException e){
    
            JOptionPane.showMessageDialog(null, "¡El tipo de valor ingresado es incorrecto!");
            JOptionPane.showMessageDialog(null, "¡Intenta nuevamente!");
        }
        
        
        
            
            
                      
        
    }
    
    public void TribunaNorte(){
        
        int opcion;
        int n=0;
        int TribunaVacia[][] = new int [5][10];
        int contador=0;
        double persona;
        double sumapersona =0;        
        
        Cliente C = new Cliente();
        //VentaBoletas V = new VentaBoletas();
        
        System.out.println("\nTRIBUNA NORTE (Inicialmente VACIA)!\n");
        
        for(int filas=0;filas<5; filas++){
            
            for(int columnas=0; columnas<10;columnas++){
                
                System.out.print(" [ "+TribunaVacia[filas][columnas]+" ] ");
                
            }System.out.println("");
            
        }
        
        do{
        
        int CantidadBoletas = Integer.parseInt(JOptionPane.showInputDialog(null,"¿ Cual es la Cantidad de Boletas que desea Comprar ?",
               "CANTIDAD BOLETAS",JOptionPane.QUESTION_MESSAGE));
        
        while(CantidadBoletas > 10){
            
            JOptionPane.showMessageDialog(null,"¡La cantidad de Boletas ingresada es Mayor a 10!");
            CantidadBoletas = Integer.parseInt(JOptionPane.showInputDialog(null,"¡Ingrese una cantidad de Boletas Menor a 10!",
               "¡CANTIDAD BOLETAS MENOR A 10!",JOptionPane.INFORMATION_MESSAGE));            
        }        
        CantidadB = CantidadBoletas;        
        
//      int filaAleatoria = (int) (Math.random()*((0-4))) ;
        int filaAlea = (int) (Math.random() * 5)+1;
                
        for(int i=0; i<5;i++){

            for(int j=0; j<CantidadBoletas; j++){
                
                TribunaVacia[filaAlea][j] = 1;
                
            }            
        }
        
        JOptionPane.showMessageDialog(null,"Usted quedara en Cualquier fila de Tribuna de acuerdo con \n"
                + "Nuestro sistema de seleccion");
        
        System.out.println("\nTribuna Despues de Compradas las Boletas!\n");
        for(int filas=0;filas<5; filas++){
            
            for(int columnas=0; columnas<10;columnas++){
                
                System.out.print(" [ "+TribunaVacia[filas][columnas]+" ] ");
                
            }System.out.println("");
            
        }
        
        sumaBoletas = sumaBoletas + CantidadB;        
        
        persona = CantidadB * 10000;
        
        sumapersona = sumapersona + persona;
        
        contador++;
        
            //System.out.println("Le gustaria seguir comprando Boletas en la Tribuna Sur");
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Le gustaria seguir comprando Boletas en la Tribuna Sur\n"
                    + "\n1. SI "
                    + "\n2. NO"));
        
            switch(opcion){
                
                case 1: break;
                case 2: n = 2;
                break;
            }
            while(opcion > 2){
                
                JOptionPane.showMessageDialog(null,"Por favor Ingrese una opcion Valida \n '(1 o 2)'");
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Le gustaria seguir comprando Boletas en la Tribuna Sur\n"
                    + "\n1. SI "
                    + "\n2. NO"));                
                
                switch(opcion){
                case 1: 
                break;
                case 2: n = 2;
                break;
                }
            }            
            
        }while(opcion < 2 && n != 2);
        
        setSumaBoletas(sumaBoletas);
        TotalPagar = sumapersona * contador;
        TotalPagar = TotalPagar /2;
        setTotalPagar(TotalPagar);
        
//        for(int i=0;i<contador;i++){
//        System.out.println("El total a Pagar para la Persona"+C.getNombre());
//        }
//        for(int i=0;i<CantidadB;i++){

        System.out.println("\nEl total a pagar es: "+TotalPagar);
        JOptionPane.showMessageDialog(null,"\nEl total a pagar para la Persona" +Arrays.toString(C.getNombre())+" es: $"+TotalPagar+ " Pesos. ","TOTAL A PAGAR",
                JOptionPane.INFORMATION_MESSAGE);
//        }
        

         
    }
    
    public void TribunaOriente(){
        
        int opcion;
        int n=0;
        int TribunaVacia[][] = new int [5][10];
        int contador=0;
        double persona;
        double sumapersona =0;        
        
        Cliente C = new Cliente();
        //VentaBoletas V = new VentaBoletas();
        
        System.out.println("\nTRIBUNA ORIENTE (Inicialmente VACIA)!\n");
        
        for(int filas=0;filas<5; filas++){
            
            for(int columnas=0; columnas<10;columnas++){
                
                System.out.print(" [ "+TribunaVacia[filas][columnas]+" ] ");
                
            }System.out.println("");
            
        }
        
        do{
        
        int CantidadBoletas = Integer.parseInt(JOptionPane.showInputDialog(null,"¿ Cual es la Cantidad de Boletas que desea Comprar ?",
               "CANTIDAD BOLETAS",JOptionPane.QUESTION_MESSAGE));
        
        while(CantidadBoletas > 10){
            
            JOptionPane.showMessageDialog(null,"¡La cantidad de Boletas ingresada es Mayor a 10!");
            CantidadBoletas = Integer.parseInt(JOptionPane.showInputDialog(null,"¡Ingrese una cantidad de Boletas Menor a 10!",
               "¡CANTIDAD BOLETAS MENOR A 10!",JOptionPane.INFORMATION_MESSAGE));            
        }        
        CantidadB = CantidadBoletas;        
        
//      int filaAleatoria = (int) (Math.random()*((0-4))) ;
        int filaAlea = (int) (Math.random() * 5)+1;
                
        for(int i=0; i<5;i++){

            for(int j=0; j<CantidadBoletas; j++){
                
                TribunaVacia[filaAlea][j] = 1;
                
            }            
        }
        
        JOptionPane.showMessageDialog(null,"Usted quedara en Cualquier fila de Tribuna de acuerdo con \n"
                + "Nuestro sistema de seleccion");
        
        System.out.println("\nTribuna Despues de Compradas las Boletas!\n");
        for(int filas=0;filas<5; filas++){
            
            for(int columnas=0; columnas<10;columnas++){
                
                System.out.print(" [ "+TribunaVacia[filas][columnas]+" ] ");
                
            }System.out.println("");
            
        }
        
        sumaBoletas = sumaBoletas + CantidadB;        
        
        persona = CantidadB * 10000;
        
        sumapersona = sumapersona + persona;
        
        contador++;
        
            //System.out.println("Le gustaria seguir comprando Boletas en la Tribuna Sur");
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Le gustaria seguir comprando Boletas en la Tribuna Sur\n"
                    + "\n1. SI "
                    + "\n2. NO"));
        
            switch(opcion){
                
                case 1: break;
                case 2: n = 2;
                break;
            }
            while(opcion > 2){
                
                JOptionPane.showMessageDialog(null,"Por favor Ingrese una opcion Valida \n '(1 o 2)'");
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Le gustaria seguir comprando Boletas en la Tribuna Sur\n"
                    + "\n1. SI "
                    + "\n2. NO"));                
                
                switch(opcion){
                case 1: 
                break;
                case 2: n = 2;
                break;
                }
            }            
            
        }while(opcion < 2 && n != 2);
        
        setSumaBoletas(sumaBoletas);
        TotalPagar = sumapersona * contador;
        TotalPagar = TotalPagar /2;
        setTotalPagar(TotalPagar);
        
//        for(int i=0;i<contador;i++){
//        System.out.println("El total a Pagar para la Persona"+C.getNombre());
//        }
//        for(int i=0;i<CantidadB;i++){

        System.out.println("\nEl total a pagar es: "+TotalPagar);
        JOptionPane.showMessageDialog(null,"\nEl total a pagar para la Persona" +Arrays.toString(C.getNombre())+" es: $"+TotalPagar+ " Pesos. ","TOTAL A PAGAR",
                JOptionPane.INFORMATION_MESSAGE);
//        }
        
    }
    
    public void TribunaOccidente(){
        
        int opcion;
        int n=0;
        int TribunaVacia[][] = new int [5][10];
        int contador=0;
        double persona;
        double sumapersona =0;        
        
        Cliente C = new Cliente();
        //VentaBoletas V = new VentaBoletas();
        
        System.out.println("\nTRIBUNA OCCIDENTE (Inicialmente VACIA)!\n");
        
        for(int filas=0;filas<5; filas++){
            
            for(int columnas=0; columnas<10;columnas++){
                
                System.out.print(" [ "+TribunaVacia[filas][columnas]+" ] ");
                
            }System.out.println("");
            
        }
        
        do{
        
        int CantidadBoletas = Integer.parseInt(JOptionPane.showInputDialog(null,"¿ Cual es la Cantidad de Boletas que desea Comprar ?",
               "CANTIDAD BOLETAS",JOptionPane.QUESTION_MESSAGE));
        
        while(CantidadBoletas > 10){
            
            JOptionPane.showMessageDialog(null,"¡La cantidad de Boletas ingresada es Mayor a 10!");
            CantidadBoletas = Integer.parseInt(JOptionPane.showInputDialog(null,"¡Ingrese una cantidad de Boletas Menor a 10!",
               "¡CANTIDAD BOLETAS MENOR A 10!",JOptionPane.INFORMATION_MESSAGE));            
        }        
        CantidadB = CantidadBoletas;        
        
//      int filaAleatoria = (int) (Math.random()*((0-4))) ;
        int filaAlea = (int) (Math.random() * 5)+1;
                
        for(int i=0; i<5;i++){

            for(int j=0; j<CantidadBoletas; j++){
                
                TribunaVacia[filaAlea][j] = 1;
                
            }            
        }
        
        JOptionPane.showMessageDialog(null,"Usted quedara en Cualquier fila de Tribuna de acuerdo con \n"
                + "Nuestro sistema de seleccion");
        
        System.out.println("\nTribuna Despues de Compradas las Boletas!\n");
        for(int filas=0;filas<5; filas++){
            
            for(int columnas=0; columnas<10;columnas++){
                
                System.out.print(" [ "+TribunaVacia[filas][columnas]+" ] ");
                
            }System.out.println("");
            
        }
        
        sumaBoletas = sumaBoletas + CantidadB;        
        
        persona = CantidadB * 10000;
        
        sumapersona = sumapersona + persona;
        
        contador++;
        
            //System.out.println("Le gustaria seguir comprando Boletas en la Tribuna Sur");
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Le gustaria seguir comprando Boletas en la Tribuna Sur\n"
                    + "\n1. SI "
                    + "\n2. NO"));
        
            switch(opcion){
                
                case 1: break;
                case 2: n = 2;
                break;
            }
            while(opcion > 2){
                
                JOptionPane.showMessageDialog(null,"Por favor Ingrese una opcion Valida \n '(1 o 2)'");
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Le gustaria seguir comprando Boletas en la Tribuna Sur\n"
                    + "\n1. SI "
                    + "\n2. NO"));                
                
                switch(opcion){
                case 1: 
                break;
                case 2: n = 2;
                break;
                }
            }            
            
        }while(opcion < 2 && n != 2);
        
        setSumaBoletas(sumaBoletas);
        TotalPagar = sumapersona * contador;
        TotalPagar = TotalPagar /2;
        setTotalPagar(TotalPagar);
        
//        for(int i=0;i<contador;i++){
//        System.out.println("El total a Pagar para la Persona"+C.getNombre());
//        }
//        for(int i=0;i<CantidadB;i++){

        System.out.println("\nEl total a pagar es: "+TotalPagar);
        JOptionPane.showMessageDialog(null,"\nEl total a pagar para la Persona" +Arrays.toString(C.getNombre())+" es: $"+TotalPagar+ " Pesos. ","TOTAL A PAGAR",
                JOptionPane.INFORMATION_MESSAGE);
//        }
        
    }
    
    
    
}