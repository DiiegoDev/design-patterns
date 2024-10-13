package builder;

public class Main {
  public static void main(String[] args) {
    var address = new Address.Builder()
        .setCountry("Brasil")
        .setState("Rio de Janeiro")
        .setCity("Rio de Janeiro")
        .setPostalCode("25566-121")
        .setStreet("Rua Copacabana")
        .build();

    System.out.println(address);
  }
}
