package test;

public class Auto {
  
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    

    int cantidadAsientos() {
        int loca = 0;
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] != null) {
                loca++;
            }
        }
        return loca;
    }

    String verificarIntegridad() {
        if (registro == motor.registro) {
            for (int i = 0; i < asientos.length; i++) {
                if (asientos[i] != null) {
                    if (asientos[i].resgistro != registro) {
                        return "Las piezas no son originales";
                    }
                }
            }
            return "Auto original";

        } else {
            return "Las piezas no son originales";
        }

    }

}
