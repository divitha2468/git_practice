import java.util.*;
//import java.lang.Math;
public class day3 {
    public static void main(String args[]){
        String s=new String();
        s="ba.ab,ca$";
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) < 'a' || s.charAt(i) > 'z')
            {
                 
                s = s.substring(0, i) + s.substring(i + 1);
                i--;
            }
        }
        System.out.println(s);

    }
}
