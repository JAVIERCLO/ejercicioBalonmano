public class Portero extends Jugador {
    
    private int paradas;
    private int goles_recibidos;

    Portero Gk = new Portero();


    @Override
    public double efectividad(){
        double efectividad = (((paradas-goles_recibidos)*100)/paradas+goles_recibidos) + ((goles*100)/tiros);
        return efectividad;
    }

    
}
