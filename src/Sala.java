/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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
