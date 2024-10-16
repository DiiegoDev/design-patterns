package strategy;

public class WhatsappNotificationSender implements NotificationSenderStrategy {
  @Override
  public void send(String message) {
    System.out.println("Mensagem: " + message + ". Enviada pelo whatsapp");
  }
}
