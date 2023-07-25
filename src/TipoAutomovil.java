public enum TipoAutomovil {
    SEDAN("Sedan", "Auto normla", 4),
    STATION_WAGON("Station Wagon", "Auto grande", 5),
    HATBACK("Hatchback", "Auto compacto", 5),
    PICKUP("Pisckup", "Camioneta", 4),
    COUPE("Coupe", "Auto pequeño", 2),
    CONVERTIBLE("Convertible", "Auto deportivo", 2),
    FURGON("Furgón", "Auto utilitario", 3);

    private final String nombre;
    private final int numeroPuertas;
    private final String description;

    TipoAutomovil(String nombre, String description, int numeroPuertas) {
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.description = description;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getDescription() {
        return description;
    }
}
