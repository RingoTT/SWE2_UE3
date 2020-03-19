package Items;

public class Potion extends Item {
    private final Item[] items;

    public Potion(String name, Item ...items){
        super(name);
        this.items= items;
    }

    @Override
    public float getPrice(){
        float sum = 0;
        for (Item item : this.items) {
            sum += item.getPrice();
        }
        return (float) (sum*1.2);
    }

    @Override
    public float getPower(){
        float sum = 0;
        for(Item item : this.items){
            sum+= item.getPower();
        }
        return sum*2;
    }
    @Override
    public float getCooldown(){
        float sum = 0;
        for(Item item: this.items){
            sum += item.getCooldown();
        }
        return sum*2;
    }
    public String toString(){
        StringBuilder str = new StringBuilder();
        for (Item item : this.items){
            str.append(item.getName()).append(",");
        }
        //deletes last comma
        str.deleteCharAt(str.length()-1);
        return "Potion: " + super.toString() + "["+ str + "]";
    }
}
