class Unit{
    int currentHP;
    int x;
    int y;
}
interface Fighterable extends Movable, Attackable{
}
interface Movable {
    void move(int x, int y);
}
interface Attackable{
    void attack(Unit u);
}
class Fighter extends Unit implements Fighterable{
    public void move(int x, int y){
        System.out.println(x+","+y+"move");
    }
    public void attack(Unit u){
        System.out.println(u+"attack");
    }

}
public class second {
    public static void main(String[] args){
//        Fighter f = new Fighter();
//         if(f instanceof Unit){
//             System.out.println("unit");
//         }
//         if(f instanceof Fighter){
//             System.out.println("fighter");
//         }
//         if(f instanceof Attackable){
//             System.out.println("attackable");
//         }
        parsable p = ParseManager.getParser("XML");
        p.parse("1");
        parsable ps = ParseManager.getParser("HTML");
        ps.parse("2");
    }
}
interface parsable{
    public abstract void parse(String fileName);
}
class XMLParser implements parsable{
    public void parse(String fileName){
        System.out.println(fileName+"XMLParser");
    }
}
class HTMLParser implements parsable{
    public void parse(String fileName){
        System.out.println(fileName+"HTMLParser");
    }
}
class ParseManager{
    public static parsable getParser(String type){
        if(type.equals("XML")){
            return  new XMLParser();
        }else{
            parsable f = new HTMLParser();
            return f;
        }

    }
}
