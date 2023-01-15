import java.util.Arrays;
import java.util.List;

public class ArrayEx {
    public static void main(String[] args){
        List list = Arrays.asList("1",2);
        System.out.println(list.toString());
        int[] arr = new int[6];

        Arrays.setAll(arr, i ->(int)(Math.random()*45) + 1);
        System.out.println(Arrays.toString(arr));

        for(int i : arr){
            char[] graph = new char[i];
            Arrays.fill(graph,'*');
            System.out.println(new String(graph)+i);
        }

    }
}
