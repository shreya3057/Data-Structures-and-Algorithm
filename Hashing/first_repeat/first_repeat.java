import java.util.*;
import java.lang.*;
import java.util.Scanner;

class GFG
 {
	public static void main (final String[] args) {
		// code
	    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t >= 0) 
		{
		String s = sc.nextLine();
		int len = s.length();
		int ch[] = new int[256];
	     for(int i=0;i<256;i++)
	     {
	         ch[i]=0;
		 }
		 int con=0;
	     for (int j=0; j<len; j++)
	     {
	         if(ch[s.charAt(j)]==1)
	         {
	             System.out.println(s.charAt(j));
	             break;
	         }
	         else
	         {
				 ch[s.charAt(j)]++;
				 con++;
			 }
		
	     if(con==len)
	     {
	         System.out.println("-1");
		 }
		}
		t--;
	 }
	 }
}