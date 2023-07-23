
public class EjemploAutomovilStatic {
    public static void main(String[] args) {
        Automovil.setCapacidadEstanqueStatic(45);
        Automovil subaru = new Automovil("subaru", "impreza");

        subaru.setCilindrada(2.0);
        subaru.setColor(Automovil.COLOR_BLANCO);


        Automovil mazda = new Automovil("Mazda", "bt-50", "Rojo", 3.0);
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", Automovil.COLOR_GRIS, 3.5, 50);

        Automovil nissan2 = new Automovil("Nissan", "Navara", Automovil.COLOR_GRIS, 3.5, 50);

        Automovil.setColorPatente(Automovil.COLOR_AZUL);
        Automovil auto = new Automovil();


        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());
        System.out.println(Automovil.getColorPatente());

        System.out.println("kiloemtros por litros " + Automovil.calcularConsumoEstatico(300, 60));

        System.out.println("Velocidad maxima carretera " + Automovil.VELICIADAD_MAXIMA_CARRETERA);
        System.out.println("Velocidad maxima ciudad "  + Automovil.VELICIADAD_MAXIMA_CIUDAD);
    }
}
