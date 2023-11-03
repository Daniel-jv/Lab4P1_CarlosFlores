package lab4_p1_carlosflores;

import java.util.Scanner;

public class Lab4_P1_CarlosFlores {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("""
                           Ingrese una opcion.
                           1-Inversion especial
                           2-Balanza de cadenas
                           3-Cifrado de mensajes
                           4-Salir
                           """);
        int opcion = leer.nextInt();
        
        while(opcion > 0 && opcion < 4){
            
            switch(opcion){
                
                case 1 ->{
                    System.out.println("---Inversion especial---");
                    System.out.println("Ingrese la cadena:");
                    leer.nextLine();
                    String cadena = leer.next();
                    System.out.print("Cadena invertida: ");
                    int amount = 0;
                    for(amount = 0;amount<cadena.length()-1;amount++){
                    }//fin for
                    for(int orden = amount;orden>=0;orden--){
                        char caract = cadena.charAt(orden);
                        System.out.print(caract);
                    }//fin for
                    System.out.println();
                }//fin case
//fin case
                
                case 2 ->{
                    int cadmayor;
                    int acum1 = 0;
                    int acum2 = 0;
                    int acum3 = 0;
                    System.out.println("---Balanza de cadenas---");
                    System.out.println("Ingrese la cadena 1:");
                    leer.nextLine();
                    String cad1 = leer.nextLine();
                    System.out.println("Ingrese la cadena 2:");
                    //   leer.nextLine();
                    String cad2 = leer.nextLine();
                   
                    System.out.println("Ingrese la cadena 3:");
                    //  leer.nextLine();
                    String cad3 = leer.nextLine();
                    
                    for(int orden = 0;orden < cad1.length();orden++){
                        char caracter = cad1.charAt(orden);
                        int numero = caracter;
                        acum1 = acum1 +  numero;
                    }//fin for
                    for(int orden = 0;orden < cad2.length();orden++){
                        char caracter = cad2.charAt(orden);
                        int numero = caracter;
                        acum2 = acum2 + numero;
                    }//fin for
                    for(int orden = 0;orden < cad3.length();orden++){
                        char caracter = cad3.charAt(orden);
                        int numero = caracter;
                        acum3 = acum3 + numero;
                    }//fin for
                    System.out.print("Peso cadena 1: " + acum1);
                    System.out.println();
                    System.out.print("Peso cadena 2: " + acum2);
                    System.out.println();
                    System.out.print("Peso cadena 3: "+ acum3);
                    System.out.println();
                    if(acum1>acum2&&acum1>acum3){
                        cadmayor = 1;
                    }//fin if
                    else{
                            if(acum2>acum1&&acum2>acum3){
                                cadmayor = 2;
                            }//fin if
                            else{
                                cadmayor = 3;
                            }//fin else
                    }//fin else
                    System.out.println("La cadena " + cadmayor + " es la mas pesada");
                }//fin case
                
                case 3 ->{
                    System.out.println("---Cifrado de mensajes---");
                    System.out.println("Ingrese el mensaje que desea cifrar: ");
                    leer.nextLine();
                    String cadena = leer.nextLine();
                    System.out.print("Mensaje cifrado: ");
                    for(int orden = 0;orden<cadena.length();orden++){
                        char caract = cadena.charAt(orden);
                        int num = caract;
                        num = num + 2;
                        char caract2 = (char) num;
                        System.out.print(caract2);
                    }//fin for
                }//fin case
                
            }//fin switch
            System.out.println();
            System.out.println("""
                           Ingrese una opcion.
                           1-Inversion especial
                           2-Balanza de cadenas
                           3-Cifrado de mensajes
                           4-Salir
                           """);
            opcion = leer.nextInt();
        }//fin while
        System.out.println("Salio del Programa :D");
    }//fin main
    
}//fin class
