package guvi;
import java.util.Scanner;
public class Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		String s1;
		String d;
		Scanner a=new Scanner(System.in);
		System.out.println("enter the 2 string");
		s=a.next();
		s1=a.next();
		int l=s.length();
		int l2=s1.length();
if(l==l2){
	d=s+s1;
	System.out.println(d);
}
 if(l>l2){
	System.out.println(s.substring(s.length()-2,s.length())+s1);
}
	}

}
