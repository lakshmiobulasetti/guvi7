import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	 public static String repeat(String str, int times) 
	 {
        return new String(new char[times]).replace("\0", str);
    }
    public static void main(String[] args) 
    {
        System.out.println(repeat("\nhello", 5));
    }

}
