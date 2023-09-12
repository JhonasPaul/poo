package operaciones;

public class Operacion {
   int num1;
   int num2;
   int total;

    void sumar() {
        System.out.println(total = num1 + num2);
    }

    int sumarReturn() {
        return num1 + num2;
    }

    boolean validar(int num1, int num2) {
        boolean r;
        if (num1 < num2) {
           return  r = true;
        }else {
          return  r = false;
        }

    }

    void sumarParametro(int num1, int num2) {
        if (validar(num1, num2)) {
            System.out.println(total = num1 + num2);
        }else {
            System.out.println("no se puede sumar");
        }
    }
}
