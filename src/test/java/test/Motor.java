package test;

public class Motor {
    // ATRIBUTOS
    int numeroCilindros;
    String tipo;
    int registro;

    // MÉTODOS

    void setcambiarRegistro(int registro) {
        this.registro = registro;
    }

    void setasignarTipo(String tipo) {
        if (tipo == "electrico" || tipo == "gasolina") {
            this.tipo = tipo;
        }

    }

}
