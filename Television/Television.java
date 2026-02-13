

/**
 * Class Television
 */
public class Television {

  //
  // Fields
  //

  public String forma;
  public String calidadDeVideo;
  protected String marca;
  private String tamaño;
  
  
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of forma
   * @param newVar the new value of forma
   */
  public void setForma (String forma) {
    this.forma = forma;
  }

  /**
   * Get the value of forma
   * @return the value of forma
   */
  public String getForma () {
    return forma;
  }

  /**
   * Set the value of calidad_video
   * @param newVar the new value of calidad_video
   */
  public void setCalidadDeVideo (String newVar) {
    calidadDeVideo = newVar;
  }

  /**
   * Get the value of calidad_video
   * @return the value of calidad_video
   */
  public String getCalidadDeVideo () {
    return calidadDeVideo;
  }

  /**
   * Set the value of marca
   * @param newVar the new value of marca
   */
  public void setMarca (String newVar) {
    marca = newVar;
  }

  /**
   * Get the value of marca
   * @return the value of marca
   */
  public String getMarca () {
    return marca;
  }

  /**
   * Set the value of tamaño
   * @param newVar the new value of tamaño
   */
  public void setTamaño (String newVar) {
    tamaño = newVar;
  }

  /**
   * Get the value of tamaño
   * @return the value of tamaño
   */
  public String getTamaño () {
    return tamaño;
  }

  //
  // Other methods
  //

  /**
   * @param        forma1
   * @param        tamaño1
   * @param        calidaddevideo1
   * @param        marca
   */
  public Television(String forma, String tamaño, String calidadDeVideo, String marca)
  {
        this.forma = forma;
        this.tamaño = tamaño;
        this.calidadDeVideo = calidadDeVideo;
        this.marca = marca;

        System.out.println("Se construyo una television");
  }


  /**
   */
  public void apagada()
  {
  System.out.println("Television apagada");
  }


  /**
   */
  public void prendida()
  {
  System.out.println("Television prendida");
  }


 


}
