import java.util.*;

public class HashSetLotto {
    public static void main(String[] args){
        Set set = new HashSet();

        for(int i = 0; set.size() < 6; i++){
            int num = (int)(Math.random()*45)+1;
            set.add(new Integer(num));
        }

        List list = new LinkedList(set);
        Collections.sort(list);
        System.out.println(list);

        Set set1 = new HashSet();

        int[][] board = new int[5][5];

        for(int i = 0; set1.size() < 25;i++){
            set1.add((int)(Math.random()*50)+1+"");
        }

        Iterator it = set1.iterator();
        for(int i = 0; i< board.length;i++){
            for(int j = 0; j< board[i].length;j++){

                board[i][j] = Integer.parseInt((String)it.next());
                System.out.print((board[i][j]< 10? "  ":" ")+board[i][j]);
            }
            System.out.println();
        }
    }
}
