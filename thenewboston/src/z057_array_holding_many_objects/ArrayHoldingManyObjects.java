package z057_array_holding_many_objects;

public class ArrayHoldingManyObjects {
    public static void main(String[] args) {
        AnimalList ALO = new AnimalList();
        Dog d = new Dog();
        Fish f = new Fish();
        ALO.add(d);
        ALO.add(f);
    }
}
