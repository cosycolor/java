import java.util.ArrayList;

public class GenericsEx {
//    public static void main(String[] args){
//    Box<Fruit> fruitBox = new Box<Fruit>();
//    Box<Apple> appleBox = new Box<Apple>();
//    Box<Grape> grapeBox = new Box<>();
//    Box<Toy> toyBox = new Box<Toy>();
//
//    fruitBox.add(new Fruit());
//    fruitBox.add(new Apple());
//    fruitBox.add(new Grape());
//    //fruitBox.add(new Toy()); error
//
//    appleBox.add(new Apple());
//    //appleBox.add(new Fruit()); error
//    //appleBox.add(new Grape()); error
//    toyBox.add(new Toy());
//    System.out.println(fruitBox.toString());
//    System.out.println(appleBox.toString());
//    System.out.println(toyBox);
//    }
    public static void main(String[] args){
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();
        //FruitBox<Toy> toyBox = new FruitBox<Toy>(); error
        // FruitBox<Orange> orangeBox = new FruitBox<Orange>(); T extends fruit & Eatable 이기 때문에 Eatable만 구현한 orange는 error

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        appleBox.add(new Apple());
        //appleBox.add(new Grape()); error
        System.out.println("FruitBox "+fruitBox);
        System.out.println("AppleBox "+appleBox);
    }
}
//class Box<T>{
//    ArrayList<T> list = new ArrayList<T>();
//    void add(T item){ this.list.add(item);}
//    T get(int i){return list.get(i);}
//    int size(){return list.size();}
//    public String toString(){return list.toString();}
//}
//class Fruit{public String toString(){return "Fruit";}}
//class Apple extends Fruit{public String toString(){return "Apple";}}
//class Grape extends Fruit{public String toString(){return "Grape";}}
//class Toy{public String toString(){return "Toy";}}

interface Eatable{

}
class Orange implements Eatable{
    public String toString(){
        return "Orange";
    }
}
class Fruit implements Eatable{
    public String toString(){
        return "Fruit";
    }
}
class Apple extends Fruit{
    public String toString(){
        return "Apple";
    }
}
class Grape extends Fruit{
    public String toString(){
        return "Grape";
    }
}
class Toy {
    public String toString(){
        return "Toy";
    }
}
class FruitBox<T extends Fruit & Eatable> { //fruit이면서 eatable
    ArrayList<T> list = new ArrayList<T>();
    void add(T item){
        list.add(item);
    }
    T get(int i){
        return list.get(i);
    }
    int size(){
        return list.size();
    }
    public String toString(){
        return list.toString();
    }
}
//class Box<T>{
//    ArrayList<T> list = new ArrayList<T>();
//    void add(T item){
//        list.add(item);
//    }
//    T get(int i){
//        return list.get(i);
//    }
//    int size(){
//        return list.size();
//    }
//    public String toString(){
//        return list.toString();
//    }
//}
