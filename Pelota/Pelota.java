

/**
 * Class Pelota
 */
public class Pelota {

  //
  // Fields
  //

  public String forma;
  public String tipo;
  protected String material;
  private String color;
  
  //
  // Constructors
  //
  public Pelota () { };
  
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

  /**
   * Set the value of tipo
   * @param newVar the new value of tipo
   */
  public void setTipo (String newVar) {
    tipo = newVar;
  }

  /**
   * Get the value of tipo
   * @return the value of tipo
   */
  public String getTipo () {
    return tipo;
  }

  /**
   * Set the value of material
   * @param newVar the new value of material
   */
  public void setMaterial (String newVar) {
    material = newVar;
  }

  /**
   * Get the value of material
   * @return the value of material
   */
  public String getMaterial () {
    return material;
  }

  /**
   * Set the value of color
   * @param newVar the new value of color
   */
  public void setColor (String newVar) {
    color = newVar;
  }

  /**
   * Get the value of color
   * @return the value of color
   */
  public String getColor () {
    return color;
  }

  //
  // Other methods
  //

  /**
   * @param        forma
   * @param        color
   * @param        material
   * @param        tipo
   */
  public Pelota(String forma, String color, String material, String tipo)
  {
    this.forma = forma;
    this.color = color;
    this.material = material;
    this.tipo = tipo;
    
    System.out.println("Se creo una nueva pelota de forma:" + forma + " y de color " + color);
  }


  /**
   */
  public void botar()
  {
    System.out.println("La pelota esta botando");
  }


  /**
   */
  public void desinflar()
  {
  System.out.println("La pelota se desinflo");
  }


  /**
   * @param        forma
   */
  public void setForma(String forma)
  {
  this.forma = forma;
  }


  /**
   * @return       String
   */
  public String getForma()
  {
  return forma;
  }


}
