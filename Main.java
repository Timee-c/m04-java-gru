class Main {
  public static void main(String[] args) {
    PeopleRegister register = new PeopleRegister();
    Address address = new Address("sim", "blu", "SC", "2 fevereiro", 88888, 33333333);
    Person jose = new Person("José", 40, 000000);
    Person gui = new Person("gui", 34, 000000);
    Person gab = new Person("gab", 45, 000000);
    jose.setAddress(address);
    register.registerPerson(jose);
    register.registerPerson(gui);
    register.registerPerson(gab);
    System.out.println(jose.getName());
    System.out.println(gui.getName());
    System.out.println(gab.getName());
    System.out.println(register.showAll());
    register.deletePerson("gui");
    System.out.println(register.showAll());
    System.out.println(jose.getAddress());
  }
}