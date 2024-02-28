// Class "Person"
class Person {
    private String name;
    private int age;
  
    // Setter Methods
    public void setName(String name) {
      this.name = name;
    }
    public void setAge(int age) {
      this.age = age;
    }
  
    // Getter methods
    public String getName() {
      return this.name;
    }
  
    public int getAge() {
      return this.age;
    }
  }
  
  // The Main class to test encapsulated class "Person"
  public class EncMain {
    public static void main(String args[]) {
Person p1 = new Person();
Person p2 = new Person();
p1.setName("Robert");
    p1.setAge(21);

    p2.setName("Riyan");
    p2.setAge(22);
      // Printing the values
      System.out.println("Person 1: Name : " + p1.getName() + " Age : " + p1.getAge());
    System.out.println("Person 2: Name : " + p2.getName() + " Age : " + p2.getAge());
    //  System.out.println("Person 1: Name : " + per1.getName() + " Age : " + per1.getAge());
      System.out.println("Person 2: Name : ");
  
    }
  }