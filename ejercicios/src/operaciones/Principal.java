package operaciones;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Operacion o = new Operacion();
        o.num1 = 10;
        o.num2 = 20;
        o.sumar();

        int resultado = o.sumarReturn();
        System.out.println(resultado);

       o.sumarParametro(12, 3);
    }
}
