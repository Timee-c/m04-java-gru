import java.util.List;
import java.util.ArrayList;

public class PeopleRegister {
  private List<Person> peopleRegister = new ArrayList<>();

  public void registerPerson(Person person) {
    peopleRegister.add(person);
  }

  public void deletePerson(String personName) {
    for (int i = 0; i < peopleRegister.size(); i++) {
      if (personName == peopleRegister.get(i).getName()) {
        peopleRegister.remove(i);
      }
    }
  }

  public String showAll() {
    String listItems = "";
    for (int i = 0; i < peopleRegister.size(); i++) {
      listItems = listItems.concat(peopleRegister.get(i).toString());
    }
    return listItems;
  }
}
