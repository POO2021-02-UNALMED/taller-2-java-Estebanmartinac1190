package test;

public class Asiento {
    // ATRIBUTOS
    String color;
    int precio;
    int registro;

    public void setcambiarColor(String color) {
        if (color == "rojo" || color == "verde" || color == "amarillo" || color == "negro" || color == "blanco") {
            this.color = color;
        }

    }

}
