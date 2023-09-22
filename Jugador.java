public class Jugador {
    protected String nombre;
    protected String pais;
    protected int faltas;
    protected int goles;
    protected int tiros;

    Jugador player= new Jugador();


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getPais() {
        return pais;
    }
    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
    public int getFaltas() {
        return faltas;
    }
    public void setGoles(int goles) {
        this.goles = goles;
    }
    public int getGoles() {
        return goles;
    }
    public void setTiros(int tiros) {
        this.tiros = tiros;
    }
    public int getTiros() {
        return tiros;
    }
    public double efectividad(){
        return 0.0;
    }
}
