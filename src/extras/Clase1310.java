package extras;

import java.util.*;
import java.util.Scanner;

public class Clase1310 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int numero;
        String opcion;
        //System.out.println("Ingresar un numero entero: ");
        //numero= entrada.nextInt();
        System.out.println("Ingresa una opción(1-5: ");
        opcion= entrada.next();
        int valor=Integer.parseInt(opcion);

        valor=valor+1;
        System.out.println("La siguiente opcion es: "+valor);

        ArrayList<Integer> arreglo = new ArrayList<>();
        Integer numeroEntero=10;
        arreglo.add(numeroEntero);


    }


}
