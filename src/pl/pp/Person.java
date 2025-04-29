package pl.pp;

public class Person {
    public String forename;
    public String surname;
    public int age;
    public String address;
    public int birthYear;

    public Person() {
    }

    public Person(String initForename, String initSurname, int initAge) {
        forename = initForename;
        surname = initSurname;
        age = initAge;
    }

    public void hiToAll() {
        System.out.println("Nazywam się " + forename + " " + surname + ". Mam " + age + " lat.");
        System.out.println("Adres: " + address + ", Rok urodzenia: " + birthYear);
    }

    public int growOld(int years) {
        age += years;
        return age;
    }

    public int beYounger() {
        if (age > 0) {
            age -= 1;
        }
        return age;
    }

    public String getName() {
        return forename;
    }

    public void setName(String nameToSet) {
        forename = nameToSet;
    }
}


