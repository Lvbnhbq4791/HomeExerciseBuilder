import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age = 0;
    protected String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        if (hasAge()) {
            return OptionalInt.of(age);
        } else {
            return OptionalInt.empty();
        }
    }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
        }
    }

    public boolean hasAge() {
        return age >= 1;
    }

    public String getAddress() {
        return address;
    }

    public boolean hasAddress() {
        return address == null;
    }

    public void setAddress(String address) {
        if (hasAddress()) {
            this.address = address;
        }
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surname)
                .setAddress(address);
    }

    @Override
    public String toString() {
        return " name = " + name + '\n' +
                " surname = " + surname + '\n' +
                " age =" + age + '\n' +
                " address = " + address + '\n';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }
}

