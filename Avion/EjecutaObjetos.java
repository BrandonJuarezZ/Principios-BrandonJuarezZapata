

/**
 * Class EjecutaObjetos
 */
public class EjecutaObjetos {
  public static void main(String[] args)
  {
  	  Avion nuevoAvion = new Avion("aeromexico","8", "280 km/h","boing787");

	        nuevoAvion.acelerar();
          nuevoAvion.elevarse();
          nuevoAvion.aterrizar();
  }


}
