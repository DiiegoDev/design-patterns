package strategy;

import java.util.Map;

public class Main {
  public static void main(String[] args) {
    Map<String, NotificationSenderStrategy> strategy = Map.of(
        "telegram", new TelegramNotificationSender(),
        "whatsapp", new WhatsappNotificationSender(),
        "sms", new SmsNotificationSender()
    );

    strategy.get("telegram").send("Olá, tudo bem??");
    strategy.get("whatsapp").send("Olá, tudo bem??");
    strategy.get("sms").send("Olá, tudo bem??");
  }
}
