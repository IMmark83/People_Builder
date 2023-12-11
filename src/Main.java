public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .setAge(5)
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

        try {
            new PersonBuilder().
                    setName("Коля").
                    setSurname("Володин").
                    setAddress("Москва").
                    build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            new PersonBuilder().setAge(120).
                    build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }
}