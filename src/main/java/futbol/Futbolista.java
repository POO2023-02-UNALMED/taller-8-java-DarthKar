package futbol;

abstract public class Futbolista implements Comparable<Object> {

    private String nombre;
    private int edad;
    private final String posicion;

    public Futbolista() {
        this.edad = 30;
        this.nombre = "Maradona";
        this.posicion = "delantero";
    }

    public Futbolista(String nombre, int edad, String posicion) {
        this.edad = edad;
        this.nombre = nombre;
        this.posicion = posicion;

    }

    public boolean equals(Futbolista f) {
        return this.nombre.equals(f.nombre) && this.edad == f.edad && this.posicion.equals(f.posicion);
    }

    public String elFutbolista() {
        return "El futbolista " + nombre + " tiene " + edad + ", y juega de " + posicion;
    }

    abstract public boolean jugarConLasManos();

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

