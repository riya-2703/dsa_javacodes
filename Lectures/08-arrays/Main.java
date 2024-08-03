public class Main{
    public static void main(String[] args) {
        // Q: store a roll no
        int r= 34;
        System.out.println(r);

        // Q: store a name
        String name = "Riya Nadagire";
        System.out.println(name);

        // Q: store 3 roll numbers
        int rno1 = 23;
        System.out.println(rno1);
        int rno2 = 46;
        System.out.println(rno2);
        int rno3 = 67;
        System.out.println(rno3);

        // syntax of arrays
        // datatype[] variable_name = new datatype[size]
        // Q: store 5 roll numbers
        int[] rnos = new int[5];
        System.out.println(rnos[0]);
        

        // or directly
        int[] rnos2 = {23,45,67,89,12};
        System.out.println(rnos2[3]);
        

        // all type of data in the array should be same
        // eg: all ints or all strings or all bool
         

        int[] ros; // declaration of array. here ros is getting defined in the stack
        // happens at compile time

        ros = new int[5]; // initialisation : actually here object is being created in the heap memory.
        // happens at runtime
        // hence dynamic memory allocation

        System.out.println(ros[0]); // initially all values are zero until allocation

        String[] arr = new String[4];
        System.out.println(arr[0]); // gives null
        // special literal of null type --> you can assign or reference it
        // String str = null;
        // but int num = null; will give error...no any primitives, just String
        // typecast also to any refernce variable

        





    }
}