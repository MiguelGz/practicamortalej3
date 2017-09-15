/*
 Desarrolle una aplicación que permita ingresar 
día, mes, año y como resultado muestre el número 
de día del año que corresponde a la fecha ingresada
...Bueno profe aca en mi computadora no agarra el comando ñ 
.. nose si aparecera
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author MiguelGz
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Creando un Scanner

        Scanner fecha=new Scanner(System.in);
       
        //Pedir al usuario que ingrese los datos
        System.out.println("Ingrese dia:    ");
        int dia=fecha.nextInt();
       
        System.out.println("Ingrese mes:    ");        
        
        //Debido a que no podia usar el swich con una variable int ingreso una variable string e int           
        String mes=fecha.next();
        
        //Convertimos nuestra variable de tipo String a tipo int
        int MES=Integer.parseInt(mes);
        
        System.out.println("Ingrese anio:    ");

        int anio=fecha.nextInt();
        
        //No se me ocurrio nada mejor que sumar para averiguar que dia del anio seria :3
          int uno=dia+0;      
          int tres=dia+31+28;                               
          int cuatro=dia+(31*2)+28;
          int cinco=dia+(31*2)+28+30;
          int seis=dia+(31*3)+28+30;
          int siete=dia+(31*3)+28+(30*2);
          int ocho=dia+(31*4)+28+(30*2);
          int nueve=dia+(31*5)+28+(30*2);
          int diez=dia+(31*5)+28+(30*3);
          int once=dia+(31*6)+28+(30*3);
          int doce=dia+(31*6)+28+(30*4);
          
        /*
          Usamos swich que es una instruccion de opcion multiple 
          para ejercer una variable que escojamos en este caso los meses
        */
        
        switch (mes)
                {
                
                case "01":

                    System.out.println
                                        (
                                          "La fecha ingresada " + dia +
                                          "/" + mes +"/" + anio + 
                                          " corresponde al "+ dia +
                                          "° dia del anio"
                                        );
                    
                                                break;

                case "02":
            
                 //Condicion en caso de que el anio mensionado sea bisiesto
                    if(anio%4==0 && anio%100!=0 || anio%400==0)

                   
                         //En el caso que sea bisiesto procedemos con esto   
                        {
                        
                            int dos=dia+31; 
                            System.out.println
                                                (
                                                  "La fecha ingresada " + dia + 
                                                  "/" + mes + "/" + anio +
                                                  " corresponde al " + dos +
                                                  "° dia del anio"
                                                );

                        }
              
                    else

                        {
                         //Y si no es bisiesto pues.. con este
                            int dos=dia+30;   
                            System.out.println
                                                (
                                                  "La fecha ingresada " + dia + 
                                                  "/" + mes + "/" + anio +
                                                  " corresponde al "+ dos +
                                                  "° dia del anio"
                                                );

                        }

                                                        break;

                case "03":

                    System.out.println
                                        (
                                          "La fecha ingresada" + dia +
                                          "/" + mes +"/" + anio + 
                                          " corresponde al "+ tres +
                                          "° dia del anio"
                                        ); 
                    
                                                        break;

                case "04":

                    System.out.println
                                        (
                                          "La fecha ingresada " + dia +
                                          "/" + mes + "/" + anio + 
                                          " corresponde al "+ cuatro +
                                          "° dia del anio"
                                        ); 
                                                        break;

                case "05":

                     System.out.println
                                        (
                                          "La fecha ingresada " + dia +
                                          "/" + mes + "/" + anio + 
                                          " corresponde al " + cinco +
                                          "° dia del anio"
                                        );
                     
                                                         break;

                case "06":

                    System.out.println
                                        (
                                          "La fecha ingresada " + dia +
                                          "/" + mes + "/" + anio + 
                                          " corresponde al "+ seis +
                                          "° dia del anio"
                                        );
                    
                                                         break;

                case "07":

                     System.out.println
                                        (
                                          "La fecha ingresada " + dia +
                                          "/" + mes + "/" + anio +
                                          " corresponde al " +siete +
                                          "° dia del anio"
                                        ); 
                     
                                                         break;
                     
                case "08":

                     System.out.println
                                        (
                                          "La fecha ingresada " + dia +
                                          "/" + mes + "/" + anio + 
                                          " corresponde al " + ocho +
                                          "° dia del anio"
                                        );
                     
                                                         break;

                case "09":

                    System.out.println
                                        (
                                          "La fecha ingresada " + dia +
                                          "/" + mes + "/" + anio + 
                                          " corresponde al " + nueve +
                                          "° dia del anio"
                                        );
                    
                                                         break;
                    
                   
                case "10":

                    System.out.println
                                        (
                                          "La fecha ingresada " + dia +
                                          "/" + mes + "/" + anio + 
                                          " corresponde al " + diez +
                                          "° dia del año"
                                        );
                    
                                                         break;

                case "11":

                 System.out.println
                                        (
                                          "La fecha ingresada " + dia +
                                          "/" + mes + "/"+ anio + 
                                          " corresponde al " + once +
                                          "° dia del anio"
                                        );
                 
                                                         break;
                              
                case "12":

                    System.out.println
                                        (
                                          "La fecha ingresada " + dia +
                                          "/" + mes +"/"+ anio +
                                          "corresponde al " + doce +
                                          "° dia del año"
                                        );
                    
                                                         break;

        }

    }

}


