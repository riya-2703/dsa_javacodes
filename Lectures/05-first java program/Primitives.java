public class Primitives {
    public static void main(String args[]){
        int rollno = 64;
        char letter = 'r';
        float marks = 98.67f;
        double largeDecimalNumbers = 4567654.4567;
        long largeInteger = 34567834567876543L;
        boolean check = false;

        System.out.println(rollno);
        System.out.println(letter);
        System.out.println(marks);
        System.out.println(largeDecimalNumbers);
        System.out.println(largeInteger);
        System.out.println(check);

        float c = 30.6f;
        c++;
        System.out.println(c);

        c = (int)(c) + 1;
        System.out.println(c);
    }
}
