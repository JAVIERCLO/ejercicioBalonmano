public class Extremo extends Jugador {
    
    private int pases;
    private int asistencias;

    Extremo extremo= new Extremo();

    public void setPases(int pases) {
        this.pases = pases;
    }
    public int getPases() {
        return pases;
    }
    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }
    public int getAsistencias() {
        return asistencias;
    }

    /**
     * @return
     */
    @Override
    public double efectividad(){
        double efectividad = (((pases + asistencias - faltas) * 100) / (pases + asistencias + faltas)) +((goles*100)/tiros);
        return efectividad;
    }
}
