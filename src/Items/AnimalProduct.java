package Items;

public class AnimalProduct extends Resource{



    public AnimalProduct(String name) {
        super(name, name.length()*2, 10);

    }


    public String toString(){
        return "Items.AnimalProduct: " + super.toString();
    }



}
