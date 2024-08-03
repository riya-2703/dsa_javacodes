import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        
        list.add(6);
        list.add(19);
        list.add(90);
        list.add(45);
        list.add(87);
        list.add(23);

        System.out.println(list);

       System.out.println(list.contains(34));

       list.set(0,99);
       System.out.println(list);

       list.remove(2);
       System.out.println(list);

       // input
    //    for(int i=0; i<5; i++){
    //     list.add(sc.nextInt());
    //    }

       // get item at any index
       for(int i=0; i<5; i++){
        System.out.println(list.get(i));
       }
    }
}
