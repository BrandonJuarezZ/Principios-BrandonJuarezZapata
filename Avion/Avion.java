

/**
 * Class Avion
 */
public class Avion {

  //
  // Fields
  //

  public String aerolinea;
  public String capacidad;
  protected String velocidad;
  private String cantidad_de_motores;
  private String modelo;
  
  //
  // Constructors
  //
  //public Avion () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of aerolinea
   * @param newVar the new value of aerolinea
   */
  public void setAerolinea (String newVar) {
    aerolinea = newVar;
  }

  /**
   * Get the value of aerolinea
   * @return the value of aerolinea
   */
  public String getAerolinea () {
    return aerolinea;
  }

  /**
   * Set the value of capacidad
   * @param newVar the new value of capacidad
   */
  public void setCapacidad (String newVar) {
    capacidad = newVar;
  }

  /**
   * Get the value of capacidad
   * @return the value of capacidad
   */
  public String getCapacidad () {
    return capacidad;
  }

  /**
   * Set the value of velocidad
   * @param newVar the new value of velocidad
   */
  public void setVelocidad (String newVar) {
    velocidad = newVar;
  }

  /**
   * Get the value of velocidad
   * @return the value of velocidad
   */
  public String getVelocidad () {
    return velocidad;
  }

  /**
   * Set the value of cantidad_de_motores
   * @param newVar the new value of cantidad_de_motores
   */
  public void setCantidad_de_motores (String newVar) {
    cantidad_de_motores = newVar;
  }

  /**
   * Get the value of cantidad_de_motores
   * @return the value of cantidad_de_motores
   */
  public String getCantidad_de_motores () {
    return cantidad_de_motores;
  }

  //
  // Other methods
  //

  /**
   * @param        aerolinea
   * @param        cantidad_de_motores
   * @param        velocidad
   * @param        capacidad
   */
  public Avion(String aerolinea, String cantidad_de_motores, String velocidad, String modelo)
  {
  	this.aerolinea = aerolinea;
	  this.cantidad_de_motores= cantidad_de_motores;
	  this.velocidad = velocidad;
	  this.modelo = modelo;

	  System.out.println("Se creo un nuevo avion");
  }


  /**
   */
  public void acelerar()
  {
  System.out.println("el avion acelero");
  }


  /**
   */
  public void elevarse()
  {
  System.out.println("el avion se elevo");
  }
  
    public void aterrizar()
  {
    System.out.println("el avion aterrizo");
  }


  /**
   * @param        modelo
   */
  public void setModelo(String modelo)
  {
    this.modelo= modelo;
  }


  /**
   * @return       String
   */
  public String getModelo()
  {
    return modelo;
  }


}
