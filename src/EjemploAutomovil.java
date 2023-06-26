public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil subaru = new Automovil();
        subaru.fabricante = "subaru";
        subaru.modelo = "impreza";
        subaru.cilindrada = 2.0;
        subaru.color = "blanco";

        Automovil mazda = new Automovil();
        mazda.fabricante = "Mazda";
        mazda.modelo = "bt-50";
        mazda.cilindrada = 3.0;
        mazda.color = "rojo";

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println(subaru.acelerarFrenar(4000));

        System.out.println("kilometros por litros " + subaru.calcularConsumo(300, 0.6f));
        System.out.println("kilometros por litros " + subaru.calcularConsumo(300, 60));
    }
}
