public class Address {
  private String state;
  private String city;
  private String neighborhood;
  private String street;
  private int CEP;
  private int telephone;
 
  Address(String state, String city, String neighborhood, String street, int CEP, int telephone) {
    setState(state);
    setCity(city);
    setNeighbrohood(neighborhood);
    setStreet(street);
    setCEP(CEP);
    setTelephone(telephone);
  }
 
  public void setState(String newState) {
    this.state = newState;
  }
 
  public void setCity(String newCity) {
    this.city = newCity;
  }
 
  public void setNeighbrohood(String newNeighborhood) {
    this.neighborhood = newNeighborhood;
  }
 
  public void setStreet(String newStreet) {
    this.street = newStreet;
  }
 
  public void setCEP(int newCEP) {
    this.CEP = newCEP;
  }
 
  public void setTelephone(int newTelephone) {
    this.telephone = newTelephone;
  }
 
  public String getState() {
    return this.state;
  }
 
  public String getCity() {
    return this.city;
  }
 
  public String getNeighborhood() {
    return this.neighborhood;
  }
 
  public String getStreet() {
    return this.street;
  }
 
  public int getCEP() {
    return this.CEP;
  }
 
  public int getTelephone() {
    return this.telephone;
  }
 
  @Override
  public String toString() {
    return " Estado: " + getState() + " Cidade: " + getCity() + " Bairro: " + getNeighborhood() +  " Rua: " + getState()  + " CEP: " + getCEP() + " Telefone: " + getTelephone() + " \n";
  }
}
