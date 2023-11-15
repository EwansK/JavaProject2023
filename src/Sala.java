
/**
 *
 * @author ewans
 */
public class Sala {
    private int nroSala;

    public Sala() {
    }

    public Sala(int nroSala) {
        this.nroSala = nroSala;
    }

    public int getNroSala() {
        return nroSala;
    }

    public void setNroSala(int nroSala) {
        this.nroSala = nroSala;
    }

    @Override
    public String toString() {
        return "Sala{" + "nroSala=" + nroSala + '}';
    }
    
    
}
