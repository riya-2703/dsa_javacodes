public class SearchInStrings {
    public static void main(String[] args){

        String name = "RiyaNadagire";
        char t = 'u';
        char c = 'i';
        System.out.println(search(name,t));
        System.out.println(search2(name,c));
    }

    // method 2
    static boolean search2(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }

        return false;
    }

    //method 1
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for(int i=0; i<str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false; // not found 
    }
}
