public class Portero extends Jugador {
    
    private int paradas;
    private int goles_recibidos;

    Portero Gk = new Portero();


    @Override
    public double efectividad(){
        double efectividad = (((paradas-goles_recibidos)*100)/paradas+goles_recibidos) + ((goles*100)/tiros);
        return efectividad;
    }

    

    public void setParadas(int paradas) {
        this.paradas = paradas;
    }
    public int getParadas() {
        return paradas;
    }
    public void setGoles_recibidos(int goles_recibidos) {
        this.goles_recibidos = goles_recibidos;
    }
    public int getGoles_recibidos() {
        return goles_recibidos;
    }

    
}
