import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner in = new Scanner(System.in);
//        list.add(12);
//        list.add(12);
//        list.add(90);
//        list.add(88);
//        list.add(92);
//        list.add(1);
//        list.add(12);
//        list.add(121);
//        list.add(12);
//        list.add(12);
//        list.add(12);
//
//        System.out.println(list.contains(121));
//        System.out.println(list.set(0,99));
//        System.out.println(list.remove(4));
//        System.out.println(list);

// input
        for(int i =0; i<6;i++){
            list.add(in.nextInt());
        }

        //get item at any index
        for (int i=0; i<6;i++){
            System.out.println(" "+list.get(i));
        }
        System.out.println(list);
    }
}
