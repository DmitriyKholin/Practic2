public class PrintService {

    public void print(Person[] people) {
        System.out.println("размер списка " + people.length);
        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            System.out.println(" имя " + person.getName()
                    + " возраст " + person.getAge()
                    + " телефон " + person.getPhoneNumber());
        }
        System.out.println();
    }

    public void print(Customer[] customers) {
    System.out.println("размер списка покупателей " + customers.length);
            for (int i = 0; i < customers.length; i++) {
                Customer customer = customers[i];
                System.out.println(" имя " + customer.getName()
                        + " возраст " + customer.getAge()
                        + " телефон " + customer.getPhoneNumber());
            }
        System.out.println();
    }

    public void print(Gamer[] gamers) {
        System.out.println("размер списка игшроков " + gamers.length);
        for (int i = 0; i < gamers.length; i++) {
            Gamer gamer = gamers[i];
            System.out.println(" имя " + gamer.getName()
                    + " возраст " + gamer.getAge()
                    + " телефон " + gamer.getPhoneNumber());
        }
        System.out.println();
    }
}




