import java.util.ArrayList;

public class Torneo {
    ArrayList<Portero> Porteros=new ArrayList<>(null);
    ArrayList<Extremo> Extremos=new ArrayList<>(null);

    public void mostrarJugadores(){
        System.out.println(Porteros);
        System.out.println(Extremos);
    }

    public void mejoresPorteros(){
        Portero[] mejoresPorteros = new Portero[3];

        for(Portero portero : Porteros){
            for(int i=0;i<3;i++){
                if(mejoresPorteros[i]==null||portero.efectividad()>mejoresPorteros[i].efectividad()){
                    mejoresPorteros[i]=portero;
                    break;
                }
            }
        }
    }

    public void mejoresExtremos(){
        for(Extremo extremo : Extremos){
            if(Extremo.efectividad>85){
               ArrayList<Extremo> Extremos=new ArrrayList<>;
            }
        }
    }
}



