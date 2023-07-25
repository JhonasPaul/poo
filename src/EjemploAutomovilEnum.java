public class EjemploAutomovilEnum {
    public static void main(String[] args) {


        Automovil.setCapacidadEstanqueStatic(45);
        Automovil subaru = new Automovil("subaru", "impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATBACK);

        Automovil mazda = new Automovil("Mazda", "bt-50", Color.ROJO, 3.0);
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("tipo " + tipo.getNombre());
        System.out.println("tipo desc. subaru" + tipo.getDescription());

        tipo = mazda.getTipo();
        switch (tipo) {
            case COUPE -> System.out.println("El auto es deportivo y descapotable de dos puertas");
            case CONVERTIBLE -> System.out.println("Es un automovil pequeño de dos puertas");
            case FURGON -> System.out.println("Es un auto utilitario de ranporte, de empresas");
            case HATBACK -> System.out.println("Es un automovil mediano compacto, aspecto deportivo");
            case PICKUP -> System.out.println("Es un automovil de doble cabina o camioneta");
            case SEDAN -> System.out.println("Es un automvil mediano");
            case STATION_WAGON -> System.out.println("Es un automovil grande, maleta grande");
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for (TipoAutomovil ta : tipos) {
            System.out.print(ta + " => " + ta.name() + ", " +
                    ta.getNombre() + " ," +
                    ta.getDescription() + ", " +
                    ta.getNumeroPuertas());
            System.out.println();
        }
    }
}
