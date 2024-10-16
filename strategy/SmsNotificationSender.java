package strategy;

public class SmsNotificationSender implements NotificationSenderStrategy {
  @Override
  public void send(String message) {
    System.out.println("Mensagem: " + message + ". Enviada por sms");
  }
}
