public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(35)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .setAge(9)
                .build();
        System.out.println(mom + "У "+mom.getName()+" "+mom.getSurname()+" есть ребенок "+"\n" + son);
    }
}
