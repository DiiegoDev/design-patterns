package singleton;

public class Main {
  public static void main(String[] args) {
    Database database = Database.getInstance();
    Database database2 = Database.getInstance();
    Database database3 = Database.getInstance();

    System.out.println(database);
    System.out.println(database2);
    System.out.println(database3);
  }
}
