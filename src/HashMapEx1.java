import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx1 {
    public static void main(String[] args){
        String[] data = {"A","K","A","K","D","K","A","K","K","K","Z","D"};
        HashMap map = new HashMap();

        for(int i = 0; i< data.length;i++){
            if(map.containsKey(data[i])){
                Integer value = (Integer)map.get(data[i]);
                map.put(data[i], new Integer(value.intValue())+1);
            }else{
                map.put(data[i],new Integer(1));
            }
        }

        Iterator it = map.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            int value = ((Integer)entry.getValue()).intValue();
            System.out.println(entry.getKey()+" : "+printBar('#',value)+" : "+value);
        }

//        Map map = new HashMap();
//        map.put("myId","1234");
//        map.put("asdf","1111");
//        map.put("asdf","1234");
//
//        Scanner sc = new Scanner(System.in);
//
//        while(true){
//            System.out.println("write id&password");
//            System.out.println("id:");
//            String id = sc.nextLine().trim();
//
//            System.out.println("password");
//            String pw = sc.nextLine().trim();
//            System.out.println();
//
//            if(!map.containsKey(id)){
//                System.out.println("no id");
//                continue;
//            }else{
//                if(!(map.get(id).equals(pw))){
//                    System.out.println("no match password");
//                }else{
//                    System.out.println("hello "+map.get(id));
//                    break;
//                }
//            }
//
//        }

    }
    public static String printBar(char ch, int value){
        char[] bar = new char[value];

        for(int i = 0; i < bar.length; i++){
            bar[i] = ch;
        }
        return new String(bar);
    }
}
