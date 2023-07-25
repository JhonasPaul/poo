public class EjemploAutomovilStatic {
    public static void main(String[] args) {
        Automovil.setCapacidadEstanqueStatic(45);
        Automovil subaru = new Automovil("subaru", "impreza");

        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATBACK);


        Automovil mazda = new Automovil("Mazda", "bt-50", Color.ROJO, 3.0);
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);
        nissan.setTipo(TipoAutomovil.PICKUP);

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);
        nissan2.setTipo(TipoAutomovil.PICKUP);

        Automovil.setColorPatente(Color.AZUL);
        Automovil auto = new Automovil();


        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());

        System.out.println(Automovil.getColorPatente());
        System.out.println("kiloemtros por litros " + Automovil.calcularConsumoEstatico(300, 60));
        System.out.println("Velocidad maxima carretera " + Automovil.VELICIADAD_MAXIMA_CARRETERA);
        System.out.println("Velocidad maxima ciudad "  + Automovil.VELICIADAD_MAXIMA_CIUDAD);

        TipoAutomovil tiposubaru = subaru.getTipo();
        System.out.println("tipo " + tiposubaru.getNombre());
        System.out.println("tipo desc. subaru" + tiposubaru.getDescription());
    }
}
