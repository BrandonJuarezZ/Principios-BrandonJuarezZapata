

/**
 * Class Main
 */
public class Main {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  public Main () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  //
  // Other methods
  //

  /**
   */
  public static void main(String[] args)
  {
    CuentaBancaria c1 = new CuentaBancaria(1000);
    
    System.out.println("Saldo actual: " + c1.getSaldo());
    
    c1.depositar(500);
    System.out.println("Deposito: 500");
    System.out.println("Saldo actual: " + c1.getSaldo());
    
    c1.retirar(1500);
    System.out.println("Retiro: 1500");
    System.out.println("Saldo actual: " + c1.getSaldo());

}
}
