package pl.pp;

public class mojaSiodmaAplikacja {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.forename = "Mateusz";
        person1.surname = "Karmazyn";
        person1.age = 24;
        person1.address = "ul. Kwiatowa 5, Warszawa";
        person1.birthYear = 2000;

        person1.hiToAll();

        Person person2 = new Person("Dariusz", "Walendziak", 42);
        person2.address = "ul. Lipowa 3, Kraków";
        person2.birthYear = 1983;

        person2.hiToAll();

        person1.growOld(5);
        person2.growOld(3);

        person1.beYounger();
        person1.beYounger();

        person1.hiToAll();
        person2.hiToAll();
    }
}
