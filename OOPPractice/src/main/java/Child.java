public class Child extends Person {
    public Child(String name, String sex, String religion, String language, String job, String nationality, String pin, String countryOfResidence) {
        super(name, sex, religion, language, null, nationality, pin, countryOfResidence);
    }

    @Override
    public boolean isAdult() {
        System.out.format("%s is a child.\n", getName());
        return false;

    }

    @Override
    public boolean canTakeLoan() {
        System.out.format("%s can't take a loan.\n", getName());
        return false;
    }
    public void play(){
        System.out.format("%s is playing games and have fun.\n", getName());
    }
}

