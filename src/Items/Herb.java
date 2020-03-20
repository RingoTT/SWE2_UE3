package Items;

public class Herb extends Resource {

    public Herb(String name, int power, int cooldown) {
        super(name, power, cooldown);
    }

    public String toString() {
        return "Herb: " + super.toString();
    }
}
