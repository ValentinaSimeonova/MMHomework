import java.time.LocalDate;
import java.util.Locale;

public class Person {

    private String name;
    private String sex;
    private String religion;
    private String language;
    private String job;
    private String nationality;
    private String pin;
    private LocalDate dateOfBirth;
    private short age;
    private String countryOfResidence;

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getReligion() {
        return religion;
    }

    public String getLanguage() {
        return language;
    }

    public String getJob() {
        return job;
    }

    public String getNationality() {
        return nationality;
    }

    public String getPin() {
        return pin;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public short getAge() {
        return age;
    }

    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    public Person(String name, String sex, String religion, String language,
                  String job, String nationality, String pin, String countryOfResidence) {
        this.name = name;

        this.religion = religion;
        this.language = language;
        this.job = job;
        this.nationality = nationality;

        this.countryOfResidence = countryOfResidence;

        try {
            if ("male".equalsIgnoreCase(sex) || "female".equalsIgnoreCase(sex)) {

                this.sex = sex;
            } else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid sex option is added!");
        }
        try {
            if (pin.length() == 10 && pin.matches("[0-9]+")) {
                this.pin = pin;
            } else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid PIN length!");
        }
        int yearOfBirth = 0;
        int monthOfBirth = 0;
        int dayOfBirth = 0;
        try {
            yearOfBirth = Integer.parseInt(pin.substring(0, 2));
            monthOfBirth = Integer.parseInt(pin.substring(2, 4));
            dayOfBirth = Integer.parseInt(pin.substring(4, 6));
        } catch (NumberFormatException ne) {
            System.out.println("You have typed incorrect PIN number:" + ne.getMessage());
        }


        int centuryCheck = Integer.parseInt(pin.substring(2, 3));

        if (centuryCheck == 4 || centuryCheck == 5) {
            yearOfBirth += 2000;
            monthOfBirth -= 40;
        } else {
            yearOfBirth += 1900;
        }
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.age = (short) (LocalDate.now().getYear() - yearOfBirth);


    }

    public void sayHello() {
        String hello;
        switch (getLanguage()) {
            case "Bulgarian":
                hello = "Здравей";
                break;
            case "Italian":
                hello = "Chao";
                break;
            default:
                hello = "Hello";
        }
        System.out.format("%s, my name is %s!\n", hello, getName());


    }

    public boolean celebrateEaster() {
        if ("orthodox".contentEquals(getReligion().toLowerCase()) ||
                "catholic".contentEquals(getReligion().toLowerCase())) {
            System.out.format("%s celebrates Easter.\n", getName());
            return true;
        } else {
            System.out.format("%s does not celebrate Easter.\n", getName());
            return false;
        }
    }

    public boolean isAdult() {
        if ("USA".equalsIgnoreCase(getCountryOfResidence())) {
            if (getAge() >= 21) {
                System.out.format("%s is Adult.\n", getName());
                return true;


            } else {
                System.out.format("%s is Not adult.\n", getName());
                return false;
            }
        } else {
            if (getAge() >= 18) {
                System.out.format("%s is Adult.\n", getName());
                return true;


            } else {
                System.out.format("%s is Not adult.\n", getName());
                return false;
            }

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", religion='" + religion + '\'' +
                ", language='" + language + '\'' +
                ", job='" + job + '\'' +
                ", nationality='" + nationality + '\'' +
                ", pin='" + pin + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", countryOfResidence='" + countryOfResidence + '\'' +
                '}';
    }
}

