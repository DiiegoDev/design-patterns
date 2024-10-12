package factory;

public class Main {
  public static void main(String[] args) {
    IPaymentFactory factory = new PaymentFactory();

    IPayment pixPayment = factory.setPayment("pix");
    pixPayment.pay(300);

    IPayment creditPayment = factory.setPayment("credit");
    creditPayment.pay(1000);
  }
}
