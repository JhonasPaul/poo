/*es una coleecicion O CONJUNTO de atributos constantes*/
public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris OScuro"),
    NARAMJO("Naranja");

    /*personalozar los enums*/
    /*creamos aributo de la misma clase actual*/
    private final String color;

    /*para guardar el nombre del atributo final color lo pasamos por aargumentos con un
    * constructo y lo asigna al atributo color*/
    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
