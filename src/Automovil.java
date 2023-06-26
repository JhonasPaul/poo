public class Automovil {
    String fabricante;
    String modelo;
    String color = "gris";
    double cilindrada;
    int capacidadEstanque = 40;

    public String verDetalle() {    /*en este caso this hace referencia a atributos de la clase*/
        String sb = "auto.modelo = " + this.modelo + "\n" +
                "la cilindrada es: " + this.color + "\n" +
                "auto.fabricante = " + this.fabricante + "\n" +
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

}
