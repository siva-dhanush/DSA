public class Recursion{
    public static void tower(int n, String s, String h, String d){
        if(n==1){
            System.out.println("tranfer"+n+"from"+s+"to"+d);
        }
        tower(n-1, s, d, h);
        System.out.println("tranfer"+n+"from"+s+"to"+d);
        tower(n-1,h,s,d);


    }


    public static void Main(String[] args){
        tower(2,"s","h","d");

    }


}