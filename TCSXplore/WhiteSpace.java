import java.util.Scanner ;

public class WhiteSpace {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in) ;

        String s = sc.nextLine() ;
        int i , space = 0 , len = s.length() ;

        for( i = 0 ; i < len ; i++ )    
            if (s.charAt(i) == ' ')
                space++ ;
        
        System.out.println("Characters : "+(len-space)+" Spaces : "+space) ;
    }

}