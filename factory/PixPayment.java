package factory;

public class PixPayment implements IPayment {
  @Override
  public void pay(double cash) {
    System.out.println("O pagamento no valor de: R$" + cash + " foi realizado utilizando pix.");
  }
}
