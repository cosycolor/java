import java.util.ArrayList;

public class GenericsEx {
    public static void main(String[] args){
    Box<Fruit> fruitBox = new Box<Fruit>();
    Box<Apple> appleBox = new Box<Apple>();
    Box<Grape> grapeBox = new Box<>();
    Box<Toy> toyBox = new Box<Toy>();

    fruitBox.add(new Fruit());
    fruitBox.add(new Apple());
    fruitBox.add(new Grape());
    //fruitBox.add(new Toy()); error

    appleBox.add(new Apple());
    //appleBox.add(new Fruit()); error
    //appleBox.add(new Grape()); error
    toyBox.add(new Toy());
    System.out.println(fruitBox.toString());
    System.out.println(appleBox.toString());
    System.out.println(toyBox);
    }
}
class Box<T>{
    ArrayList<T> list = new ArrayList<T>();
    void add(T item){ this.list.add(item);}
    T get(int i){return list.get(i);}
    int size(){return list.size();}
    public String toString(){return list.toString();}
}
class Fruit{public String toString(){return "Fruit";}}
class Apple extends Fruit{public String toString(){return "Apple";}}
class Grape extends Fruit{public String toString(){return "Grape";}}
class Toy{public String toString(){return "Toy";}}
