//import java.util.*;
class recursion {
    static void printfun(int test ){
        if (test <1)
            return;
        else{
            System.out.println(test + " ");
            printfun(test- 1 );
            System.out.println(test + " ");
            return ;
        }
    }
    public static void main (String []args ){
        int test = 2;
        printfun(test);
    }
    
}
