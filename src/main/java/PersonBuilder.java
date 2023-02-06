public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age = 0;
    protected String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age <1 || age > 100) {
            throw new IllegalArgumentException(
                    "Возраст должен быть от 1 до 100 а у вас " + age
            );
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public Person build() {
        if (name == null) {
            throw new IllegalStateException(
                    "Имя должно быть не null"
            );
        }
        if (surname == null) {
            throw new IllegalStateException(
                    "Фамилия должно быть не null"
            );
        }
        Person person;
        if (age >=1){
            person= new Person(name,surname,age);
        }else {
            person= new Person(name,surname);
        }
        if (address!=null){
            person.setAddress(address);
        }
        return person;
    }
}
