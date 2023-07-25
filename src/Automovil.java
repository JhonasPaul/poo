public class Automovil {
    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private double cilindrada;
    private int capacidadEstanque = 40;

    private TipoAutomovil tipo;

    private static Color colorPatente = Color.AMARILLO;
    private static int capacidadEstanqueStatic = 30;
    private static int ultimoId;

    public static final Integer VELICIADAD_MAXIMA_CARRETERA = 120;
    public static final int VELICIADAD_MAXIMA_CIUDAD = 60;

   /* public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL= "AZUL";
    public static final String COLOR_BLANCO= "Blanco";
    public static final String COLOR_GRIS= "Gris";*/

    public Automovil() {
        this.id = ++ultimoId;
    }

    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;

    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada) {
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada, int capacidadEstanque) {
        this(fabricante, modelo, color, cilindrada);
        this.capacidadEstanque = capacidadEstanque;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadEstanque() {
        return capacidadEstanque;
    }

    public void setCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;

    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public String verDetalle() {    /*en este caso this hace referencia a atributos de la clase*/
        String sb = "auto.id = " + this.id + "\n" +
                "auto.modelo = " + this.modelo + "\n" +
                "auto.tipo = " + this.getTipo().getDescription() + "\n" +
                "la cilindrada es: " + this.color+ "\n" +
                "auto.fabricante = " + this.fabricante + "\n" +
                "auto.colorPatente = " + Automovil.colorPatente + "\n" +
                "auto.cilindrada = " + this.cilindrada + "\n";

        return sb;
    }

    public String acelerar(int rpm) {
        return "El auto " + this.fabricante + " acelerando a " + rpm + "rpm";
    }

    public String frenar() {
        return this.fabricante + " " + this.modelo + " frenando";
    }

    public String acelerarFrenar(int rpm) {
        /*en este caso this hace referencia a metodos de la clase*/
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }


    /*ejemplo de sobrecarga de metodos, mismo nombre de metodo con distinto tipo o cantidad de parametros*/
    public float calcularConsumo(int km, float porcentajeBencina) {
        return km / (capacidadEstanque * porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina) {
        return km / (capacidadEstanque * (porcentajeBencina/100f));
    }
    public static float calcularConsumoEstatico(int km, int porcentajeBencina) {
        return km / (Automovil.capacidadEstanqueStatic * (porcentajeBencina/100f));
    }

    public static int getCapacidadEstanqueStatic() {
        return capacidadEstanqueStatic;
    }

    public static void setCapacidadEstanqueStatic(int capacidadEstanqueStatic) {
        Automovil.capacidadEstanqueStatic = capacidadEstanqueStatic;
    }

    /*compara por valor que contiene el atributo*/
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof  Automovil)) {
            return false;
        }
        Automovil a = (Automovil) obj;

        return (this.fabricante != null && this.modelo != null
                && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return this.id + " " + fabricante + " " + modelo;
    }
}
