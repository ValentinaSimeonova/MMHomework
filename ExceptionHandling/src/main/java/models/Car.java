package models;

public class Car {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public boolean isSecondHand() {
        return secondHand;
    }

    public void setSecondHand(boolean secondHand) {
        this.secondHand = secondHand;
    }

    String name;
    String color;
    int releaseYear;
    int horsePower;
    boolean secondHand;

    @Override
    public String toString() {
        return "models.Car{" +
                "name='" + this.name + '\'' +
                ", color='" + this.color + '\'' +
                ", releaseYear=" + this.releaseYear +
                ", horsePower=" + this.horsePower +
                ", secondHand=" + this.secondHand +
                '}';
    }

    public Car() {
        this.name = "";
        this.color = "";
        this.releaseYear = -1;
        this.horsePower = -1;
        this.secondHand = false;
    }

    public Car(String name, int releaseYear, int horsePower, boolean secondHand) {
        this(name, "N/A", releaseYear, horsePower);
        this.secondHand = secondHand;
    }

    public Car(String name, String color, int releaseYear, int horsePower) {
        this(name, color, releaseYear, horsePower, false);
    }

    public Car(String name, String color, boolean secondHand) {
        this(name, color, -1, -1, secondHand);
    }

    public Car(String name, String color, int releaseYear, int horsePower, boolean secondHand) {
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHand = secondHand;
    }
}
