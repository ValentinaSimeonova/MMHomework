public class American extends Person {
    public American(String name, String sex, String religion, String language, String job, String nationality, String pin, String countryOfResidence) {
        super(name, sex, religion, "English", job, "American", pin, countryOfResidence);
    }

    public void eatBurger() {
        if (isAdult()) {
            System.out.format("%s Eats burgers.\n", getName());
        } else {
            System.out.format("%s Eats broccoli.\n", getName());
        }
    }

    public void sayHallo() {
        System.out.format("Hello, my name is %s!\n", getName());
    }

    public boolean isAdult() {

        if (getAge() >= 21) {
            System.out.format("%s is Adult.\n", getName());
            return true;


        } else {
            System.out.format("%s is Not adult.\n", getName());
            return false;
        }
    }

    public boolean canTakeLoan() {
        if (isAdult() && getJob() != null) {
            System.out.format("%s can take a loan.\n", getName());
            return true;
        } else {
            System.out.format("%s can't take a loan.\n", getName());
            return false;
        }
    }

    public void canDrive() {
        if (isAdult()) {
            System.out.format("%s is allowed to drive.\n", getName());
        } else {
        }
        System.out.format("%s isn't allowed to drive.\n", getName());

    }
}
