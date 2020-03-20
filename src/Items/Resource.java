package Items;

public abstract class Resource extends Item {
    private final int power;
    private final int cooldown;


    public Resource(String name, int power, int cooldown) {
        super(name);
        this.power = power;
        this.cooldown = cooldown;
    }

    @Override
    public int getPower(){
        return this.power;
    }


    @Override
    public int getCooldown(){
        return this.cooldown;
    }


    @Override
    public float getPrice(){
        return this.name.length();
    }
}
