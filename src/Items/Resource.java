package Items;

public abstract class Resource extends Item {

    public Resource(String name, float power, float cooldown){
        super(name,power,cooldown);
    }
    @Override
    public float getPrice(){
        return this.name.length();
    }
}
