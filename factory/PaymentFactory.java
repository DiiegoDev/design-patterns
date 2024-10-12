package factory;

import java.util.Objects;

public class PaymentFactory implements IPaymentFactory {
  @Override
  public IPayment setPayment(String type) {
    if(Objects.equals(type, "pix")) {
      return new PixPayment();

    } else if(Objects.equals(type, "credit")) {
      return new CreditCardPayment();
    }
    return null;
  }
}
