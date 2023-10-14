package futbol;

public class Portero extends Futbolista {

    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.dorsal = dorsal;
        this.golesRecibidos = golesRecibidos;
    }

    @Override
    public boolean jugarConLasManos() {
        return true;
    }

    public String elJugador() {
        return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de Portero con el dorsal " + this.dorsal + ". Le han marcado " + this.golesRecibidos;
    }

    public int compareTo(Portero p2) {
        return Math.abs(this.golesRecibidos - p2.golesRecibidos);
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Futbolista && o instanceof Portero) {
            o = (Portero) o;
            return this.compareTo(o);
        }
        else{
            return 0;
        }

    }
}
