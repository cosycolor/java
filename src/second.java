interface Repairable{}
class Unit{
    int hitPoint;
    final int MAX_HP;
    Unit(int hp){
        this.MAX_HP = hp;
    }
}
class GroundUnit extends Unit{
    GroundUnit(int hp){
        super(hp);
    }
}
class AirUnit extends Unit{
    AirUnit(int hp){
        super(hp);
    }
}
class Tank extends GroundUnit implements Repairable{
    Tank(){
        super(150);
        this.hitPoint = MAX_HP;
        System.out.println("Tank_HP"+ MAX_HP);
    }
    public String toString(){
        return "Tank";
    }
}
class Dropship extends AirUnit implements Repairable{
    Dropship(){
        super(125);
        this.hitPoint = super.MAX_HP;
        System.out.println("this.DROPSHIP_HP"+ this.MAX_HP);
        //this는 Dropship을 가리킴. super로 초기화 후 바로 dropship 객체의 변수들 사용가능
    }
    public String toString(){
        return "Dropship";
    }
}
class Marine extends GroundUnit{
    Marine(){
        super(40);
        this.hitPoint = super.MAX_HP;
        System.out.println("MARINE_HP"+ MAX_HP);
    }
}
class SCV extends GroundUnit implements Repairable{
    SCV(){
        super(60);
        this.hitPoint = super.MAX_HP;
        System.out.println("SCV_HP"+ MAX_HP);
    }
    void repair(Repairable r){
        if( r instanceof Unit){
            Unit u = (Unit)r;
            while(u.hitPoint != u.MAX_HP){
                u.hitPoint++;
            }
            System.out.println((u.toString()+"의 수리가 끝났습니다."));
        }
    }
}



//class Unit{
//    int currentHP;
//    int x;
//    int y;
//}
//interface Fighterable extends Movable, Attackable{
//}
//interface Movable {
//    void move(int x, int y);
//}
//interface Attackable{
//    void attack(Unit u);
//}
//class Fighter extends Unit implements Fighterable{
//    public void move(int x, int y){
//        System.out.println(x+","+y+"move");
//    }
//    public void attack(Unit u){
//        System.out.println(u+"attack");
//    }
//
//}
public class second {
    public static void main(String[] args){
        Tank tank = new Tank();
        Dropship dropship = new Dropship();
        Marine marine = new Marine();
        SCV scv = new SCV();
        scv.repair(tank);
        scv.repair(dropship);
//        scv.repair(marine); error
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
//        parsable p = ParseManager.getParser("XML");
//        p.parse("1");
//        parsable ps = ParseManager.getParser("HTML");
//        ps.parse("2");
    }
}
//interface parsable{
//    public abstract void parse(String fileName);
//}
//class XMLParser implements parsable{
//    public void parse(String fileName){
//        System.out.println(fileName+"XMLParser");
//    }
//}
//class HTMLParser implements parsable{
//    public void parse(String fileName){
//        System.out.println(fileName+"HTMLParser");
//    }
//}
//class ParseManager{
//    public static parsable getParser(String type){
//        if(type.equals("XML")){
//            return  new XMLParser();
//        }else{
//            parsable f = new HTMLParser();
//            return f;
//        }
//
//    }
//}
