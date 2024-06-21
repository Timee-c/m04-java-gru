public class Person {
  private String name;
  private int age;
  private int cpf;
  private Address address;

  Person(String name, int age, int cpf) {
    setName(name);
    setAge(age);
    setCpf(cpf);
  }

  public void setName(String newName) {
    this.name = newName;
  }

  public void setAge(int newAge) {
    this.age = newAge;
  }

  public void setCpf(int newCpf) {
    this.cpf = newCpf;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public int getCpf() {
    return this.cpf;
  }

  public Address getAddress() {
    return this.address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return " Nome: " + getName() + " Idade: " + getAge() + " Cpf: " + getCpf() + " \n";
  }
}
