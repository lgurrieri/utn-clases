package roleplayer;

/**
 * Player
 */
public class Player implements Scorable, Comparable<Player>{

    private String name;
    private int juegos;
    private int triunfos;

    /**
     * @param name
     * @param juegos
     * @param triunfos
     */
    public Player(String name, int juegos, int triunfos) {
        this.name = name;
        this.juegos = juegos;
        this.triunfos = triunfos;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the juegos
     */
    public int getJuegos() {
        return juegos;
    }

    /**
     * @param juegos the juegos to set
     */
    public void setJuegos(int juegos) {
        this.juegos = juegos;
    }

    /**
     * @return the triunfos
     */
    public int getTriunfos() {
        return triunfos;
    }

    /**
     * @param triunfos the triunfos to set
     */
    public void setTriunfos(int triunfos) {
        this.triunfos = triunfos;
    }

    @Override
    public int getScore() {
        // TODO Auto-generated method stub
        float score = (float) triunfos / juegos;
        return(int) score * 100;
    }

    @Override
    public int compareTo(Player player) {
        // TODO Auto-generated method stub
        return this.triunfos - player.triunfos;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return getClass().getName()+"["+name+", "+juegos+", "+triunfos+"]";
    }
}