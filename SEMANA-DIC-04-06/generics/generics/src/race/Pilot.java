package race;

/**
 * Pilot
 * <p> Clase que implmenta Comparable. Representa un piloto de un juego de carreras.</p>
 */
public class Pilot implements Comparable<Pilot>{

    private String nombre;
    private int recordVelocidad;
    private int numeroCarreras;

    /**
     * @param nombre
     * @param recordVelocidad
     * @param numeroCarreras
     */
    public Pilot(String nombre, int recordVelocidad, int numeroCarreras) {
        this.nombre = nombre;
        this.recordVelocidad = recordVelocidad;
        this.numeroCarreras = numeroCarreras;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the recordVelocidad
     */
    public int getRecordVelocidad() {
        return recordVelocidad;
    }

    /**
     * @param recordVelocidad the recordVelocidad to set
     */
    public void setRecordVelocidad(int recordVelocidad) {
        this.recordVelocidad = recordVelocidad;
    }

    /**
     * @return the numeroCarreras
     */
    public int getNumeroCarreras() {
        return numeroCarreras;
    }

    /**
     * @param numeroCarreras the numeroCarreras to set
     */
    public void setNumeroCarreras(int numeroCarreras) {
        this.numeroCarreras = numeroCarreras;
    }

    @Override
    public int compareTo(Pilot pilot) {
        // TODO Auto-generated method stub
        return this.recordVelocidad - pilot.recordVelocidad;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return getClass().getName()+"["+nombre+", "+recordVelocidad+", "+numeroCarreras+"]";
    }

}