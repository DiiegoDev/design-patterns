package factory;

public class CreditCardPayment implements IPayment {
  @Override
  public void pay(double cash) {
    System.out.println("O pagamento do valor R$" + cash + " foi realizado utilizando cartão de crédito.");
  }
}
