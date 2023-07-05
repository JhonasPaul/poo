public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil subaru = new Automovil("subaru", "impreza");
//        subaru.setFabricante();
//        subaru.setModelo("impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor("blanco");

        Automovil mazda = new Automovil("Mazda", "bt-50");
//        mazda.setFabricante("Mazda");
//        mazda.setModelo("bt-50");
        mazda.setCilindrada(3.0);
        mazda.setColor("rojo");
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        Automovil nissa = new Automovil();

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());

        System.out.println(subaru.acelerarFrenar(4000));

        System.out.println("kilometros por litros " + subaru.calcularConsumo(300, 0.6f));

        System.out.println("kilometros por litros " + subaru.calcularConsumo(300, 60));
    }
}
