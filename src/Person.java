public class Person {
  String name;
  int age;

  Person(){
    name = "Jon";
    age = 20;
    hasbirthday();

  }

  @Override
  public String toString() {
    return
        " name = " + name +
        " age = " + age;
  }

  public int hasbirthday(){
    age = age + 1;

    return age;
  }
}
