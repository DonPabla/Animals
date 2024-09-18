public class Animal {

    // Properties
    public String gender;
    public String species;
    public String name;
    public int age;

    // Constructor
    public Animal(String species, String name, int age, String gender) {
        this.species = species;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Methods
    public void displayInfo() {
        System.out.println("animal species: " + species);
        System.out.println("animal name: " + name);
        System.out.println("animal age: " + age);
        System.out.println("animal gender: " + gender);
    }
}
