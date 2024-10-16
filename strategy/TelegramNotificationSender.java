package strategy;

public class TelegramNotificationSender implements NotificationSenderStrategy{
  @Override
  public void send(String message) {
    System.out.println("Mensagem: " + message + ". Enviada pelo telegram");
  }
}
