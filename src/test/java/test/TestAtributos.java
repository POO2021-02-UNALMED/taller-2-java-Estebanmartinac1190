package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class TestAtributos {
	
	@Test
   	public void testAtributosMotor(){
		
		Motor m = new Motor();
		m.numeroCilindros = 4;
		m.registro = 142;
		m.tipo = "electrico";
		
		assertTrue(true, "Hay un problema con los atributos de la Clase Motor");
    }
	
	@Test
   	public void testAtributosAsiento(){
		
		Asiento a = new Asiento();
		a.color = "blanco";
		a.precio = 5000;
		a.registro = 435;
		
		assertTrue(true, "Hay un problema con los atributos de la Clase Asiento");
    }
	
	@Test
   	public void testAtributosAuto(){
		
package test;

public class Asiento {
    // ATRIBUTOS
    public String color;
    public int precio;
    public int registro;

    public void setcambiarColor(String cambio) {
        if (cambio == "rojo" || cambio == "verde" || cambio == "amarillo" || cambio == "negro" || cambio == "blanco") {
            this.color = cambio;
        }

    }

}

		package test;

public class Auto {
    // Atributos
    public String modelo;
    public int precio;
    public Array Asientos[];
    public String marca;
    public Motor motor;
    public int registro;
    public static int cantidadCreados;

    // MÉTODOS

    public int getcantidadAsiento() {
        int loca;
        for (int i = 0; Asientos.length; i++) {
            if (Asientos[i] != null) {
                loca++;
            }
        }
        return loca;
    }

    public String getverificarIntegridad( ){
        boolean k1,k2;
        for(inti=0;Asientos.length;i++){
            if (Asiento[i]!=null){
                if(motor.registro==Asiento[i].registro) && (motor.registro==auto.registro){
                    k1=true;
                    k2=false;
                }
                else{
                    k2=true;
                    k1=false;
                }
            }
        }
        if (k1==true){
            System.out.println("Auto original");
        }
        else{
            System.out.println("Las piezas no son originales");
        }

    }

}
		package test;

public class Motor {
    // ATRIBUTOS
    public int numeroCilindros;
    public String tipo;
    public int registro;

    // MÉTODOS

    public void setcambiarRegistro(int regist) {
        this.registro = regist;
    }

    public void setasignarTipo(String tpm) {
        if (tpm == "electrico" || tpm == "gasolina") {
            this.tipo = tpm;
        }

    }

}
		
		Auto v = new Auto();
		v.asientos = new Asiento[5];
		v.marca = "tesla";
		v.modelo = "model 3";
		v.motor = new Motor();
		v.precio = 33000;
		v.registro = 341;
		
		assertTrue(true, "Hay un problema con los atributos de la Clase Auto");
    }

}
