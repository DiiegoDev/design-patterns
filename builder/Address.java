package builder;

public class Address {
  private final String country;
  private final String state;
  private final String city;
  private final String postalCode;
  private final String street;

  private Address(Builder builder) {
    this.country = builder.country;
    this.state = builder.state;
    this.city = builder.city;
    this.postalCode = builder.postalCode;
    this.street = builder.street;
  }

  @Override
  public String toString() {
    return "Address{" +
        "country='" + country + '\'' +
        ", state='" + state + '\'' +
        ", city='" + city + '\'' +
        ", postalCode='" + postalCode + '\'' +
        ", street='" + street + '\'' +
        '}';
  }

  public static class Builder {
    private String country;
    private String state;
    private String city;
    private String postalCode;
    private String street;

    public Builder setCountry(String country) {
      this.country = country;
      return this;
    }

    public Builder setState(String state) {
      this.state = state;
      return this;
    }

    public Builder setCity(String city) {
      this.city = city;
      return this;
    }

    public Builder setPostalCode(String postalCode) {
      this.postalCode = postalCode;
      return this;
    }

    public Builder setStreet(String street) {
      this.street = street;
      return this;
    }

    public Address build() {
      return new Address(this);
    }
  }

}
