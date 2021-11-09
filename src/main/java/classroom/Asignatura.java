package classroom;

public class Asignatura {

    String nombre;
    String n = nombre;
    int codigoInterno;
    int codigoExterno;

    Asignatura() {
    	this(0);
    }

    Asignatura(int codigoInterno) {
        this("Sin nombre", codigoInterno, codigoInterno);
    }

    Asignatura(String nombre) {
        this(nombre, 0, 0);
    }

    Asignatura(String nombre, int codigoInterno, int codigoExterno) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
    }

    void cambiarDatos(int codigoInterno, int codigoExterno, String nombre) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
    }

    void cambiarDatos(int codigo) {
        this.codigoInterno = codigo;
        this.codigoExterno = codigo;
    }

 
    void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
    
}
