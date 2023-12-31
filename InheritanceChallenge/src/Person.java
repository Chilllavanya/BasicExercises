public class Person {
    String firstName;
    String lastName;
    int age;

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName(" ");
        person.setLastName(" ");
        person.setAge(10);
        System.out.println("Full Name : " + person.getFullName());
        System.out.println("Teen : " + person.isTeen());

        person.setFirstName("John");
        person.setAge(18);
        System.out.println("Full Name : " + person.getFullName());
        System.out.println("Teen : " + person.isTeen());

        person.setLastName("Smith");
        System.out.println("Full Name : " + person.getFullName());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) age = 0;
        this.age = age;
    }
    public boolean isTeen() {
        if (age >12 && age <20) return true;
        return false;
    }
    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) return " ";
        else if (firstName.isEmpty()) return lastName;
        else if (lastName.isEmpty()) return firstName;
        else return firstName + " " + lastName;
    }
}
