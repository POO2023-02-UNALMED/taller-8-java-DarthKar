package futbol;

public class Jugador extends Futbolista{
    public short golesMarcados;
    public byte dorsal;
    
    
    public Jugador(){
        super();
        golesMarcados=289;
        dorsal=7;
    }
    
    public Jugador( String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal; 
    }

    @Override
    public boolean jugarConLasManos() {
       return false;
    }
    public int compareTo(Futbolista f2) {
        return Math.abs(this.getEdad() - f2.getEdad());
    }
    
    public String elJugador(){
        return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+", y juega de "+this.getPosicion()+" con el dorsal "+dorsal+". Ha marcado"+golesMarcados;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Futbolista && o instanceof Jugador) {
            o = (Jugador) o;
            return this.compareTo(o);
        }
        else{
            return 0;
        }

    }
    
}