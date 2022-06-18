import java.sql.SQLOutput;

public class Italian extends Person {
    public Italian(String name, String sex, String religion, String language, String job, String nationality, String pin, String countryOfResidence) {
        super(name, sex, religion, "Italian", job, "Italian", pin, countryOfResidence);
    }

    public void sayHallo() {
        System.out.format("Chao, my name is %s!\n", getName());
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

    public boolean canTakeLoan() {
        if (isAdult() && getJob() != null) {
            System.out.format("%s can take a loan.\n", getName());
            return true;
        } else {
            System.out.format("%s can't take a loan.\n", getName());
            return false;
        }
    }

    public void lovePizza() {
        System.out.format("%s Love pizza.\n", getName());
    }
    public void canDrive(){
        if (isAdult()){
            System.out.format("%s is allowed to drive.\n", getName());
        }
        else {
            System.out.format("%s isn't allowed to drive.\n", getName());
        }
    }
}
