import java.util.Scanner;
public class Principal {
    Scanner teclado = new Scanner(System.in);
    int opc=0;
    while (opc>0){
    System.out.println("Bienvenido al registro del torneo de Balonmano, ¿Qué desea hacer?\n1. Ingresar jugador\n2. Mostrar jugadores\n3. Top 3 porteros\n4. Extremos más efectivos");
    teclado.nextLine();
    if(opc==1){
        String posicion="";
        System.out.println("El jugador es extremo o portero?");
        posicion=teclado.next().toLowerCase();
        if (posicion.equals("extremo")){
        System.out.println("Ingrese el nombre del jugador");
        String nombre=teclado.nextLine();
        System.out.println("Ingrese el país del jugador");
        String pais=teclado.nextLine();
        System.out.println("Ingrese el numero de faltas del jugador");
        String faltas=teclado.nextLine();
        System.out.println("Ingrese los goles del jugador");
        String goles=teclado.nextLine(); 
        System.out.println("Ingrese los tiros del jugador");
        String tiros=teclado.nextLine();
        System.out.println("Ingrese los pases del jugador");
        String pases=teclado.nextLine();
        System.out.println("Ingrese las asistencias del jugador");
        String asistencias=teclado.nextLine();
            }
        else if(posicion.equals("portero")){
        System.out.println("Ingrese el nombre del jugador");
        String nombre=teclado.nextLine();
        System.out.println("Ingrese el país del jugador");
        String pais=teclado.nextLine();
        System.out.println("Ingrese el numero de faltas del jugador");
        String faltas=teclado.nextLine();
        System.out.println("Ingrese los goles del jugador");
        String goles=teclado.nextLine(); 
        System.out.println("Ingrese los tiros del jugador");
        String tiros=teclado.nextLine();
        System.out.println("Ingrese las paradas del jugador");
        String paradas=teclado.nextLine();
        System.out.println("Ingrese los goles recibidos del jugador");
        String goles_recibidos=teclado.nextLine();
            }
        }
        else if(opc==2){
            System.out.println(Portero);
            System.out.println(Extremo);
        }
        else if(opc==3){
            System.out.println(mejoresPorteros);
        }
        else if(opc==4){
            System.out.println(mejoresExtremos);
        }
        else if(opc>=5){
            System.out.println("Elige una opcion correcta porfavor");
        }
    }
}
