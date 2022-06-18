public class Bulgarian extends Person {
    public Bulgarian(String name, String sex, String religion, String language, String job, String nationality, String pin, String countryOfResidence) {
        super(name, sex, religion, "Bulgarian", job, "Bulgarian", pin, countryOfResidence);
    }

    public void drinks() {
        if (isAdult()){
            System.out.format("%s Drinks rakia.\n", getName());
        }
        else {
            System.out.format("%s Drinks milk.\n", getName());
        }

    }

    public void sayHallo() {
        System.out.format("Здравей, аз се казвам %s!\n", getName());
    }

    public boolean isAdult() {

        if (getAge() >= 18) {
            System.out.format("%s is Adult.\n", getName());
            return true;


        } else {
            System.out.format("%s is Not adult.\n", getName());
            return false;
        }
    }
}
