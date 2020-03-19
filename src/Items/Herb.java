package Items;

public class Herb extends Resource {

    public Herb(String name, float power, float cooldown) {
        super(name, power, cooldown);
    }

    public String toString() {
        return "Items.Herb: " + super.toString();
    }
}
