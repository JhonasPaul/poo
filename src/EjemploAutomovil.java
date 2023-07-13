public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil subaru = new Automovil("subaru", "impreza");

        subaru.setCilindrada(2.0);
        subaru.setColor("blanco");

        Automovil mazda = new Automovil("Mazda", "bt-50", "Rojo", 3.0);
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);
        Automovil nissan2 = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);

        System.out.println("son iguales " + (nissan == nissan2));
        System.out.println("son iguales " + (nissan.equals(nissan2)));
        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());

        System.out.println(subaru.acelerarFrenar(4000));

        System.out.println("kilometros por litros " + subaru.calcularConsumo(300, 0.6f));

        System.out.println("kilometros por litros " + subaru.calcularConsumo(300, 60));
        System.out.println("kilometros por litros " + nissan.calcularConsumo(300, 60));
    }
}
