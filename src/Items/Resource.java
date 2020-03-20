package Items;

public abstract class Resource extends Item {
    float power;
    float cooldown;


    public Resource(String name, float power, float cooldown) {
        super(name);
        this.power = power;
        this.cooldown = cooldown;
    }

    @Override
    public float getPower(){
        return this.power;
    }


    @Override
    public float getCooldown(){
        return this.cooldown;
    }


    @Override
    public float getPrice(){
        return this.name.length();
    }
}
