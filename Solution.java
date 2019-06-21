import java.io.*;
import java.util.*;

public class Solution {
   
  public static void main(String[] args) {
    String es="", os="", s;
    char c;
    Scanner obj = new Scanner(System.in);
    s=obj.nextLine();

    for(int i=0; i<s.length();i++)  {
      c=s.charAt(i);
      if(i%2==0)  {
        es=es+c;
      }
      else
      {
        os=os+c;
      }
    }

    System.out.println(es+" "+os);
  }
}