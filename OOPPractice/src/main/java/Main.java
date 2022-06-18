public class Main {
    public static void main(String[] args) {

        Person person = new Person("Albena", "female",
                "Orthodox", "Bulgarian", "QA", "Bulgaria",
                "0351283437", "Bulgaria");

        Person secondPerson = new Person("Marius", "Male", "Catholic", "Italian", null,
                "Italy", "8305128347", "Italy");

        Person thirdPerson = new Person("John", "male", "Islam", "English",
                "Support", "USA", "0745178347", "USA");

       //American am = new American("Orion","male","orthodox","","qa","","0745178354","France");
        System.out.println(person);
        System.out.println(secondPerson);
        System.out.println(thirdPerson);
        //System.out.println(am);

        person.sayHello();
        secondPerson.sayHello();
        thirdPerson.sayHello();

        System.out.println();

        person.celebrateEaster();
        secondPerson.celebrateEaster();
        thirdPerson.celebrateEaster();

        System.out.println();

        person.isAdult();
        secondPerson.isAdult();
        thirdPerson.isAdult();

        System.out.println();

        person.canTakeLoan();
        secondPerson.canTakeLoan();
        thirdPerson.canTakeLoan();


    }


}
