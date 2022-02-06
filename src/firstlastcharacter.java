import java.util.Scanner;

public class firstlastcharacter {
public static void main(String[] args) {
	char ch1,ch2;
	String str;
	String reply="" ;
	Scanner sc=new Scanner(System.in);
	try {
		System.out.println("Enter the first and last character in java");
		str=sc.nextLine();
		
		ch1=str.charAt(0);
		ch2=str.charAt(str.length()-1);
		
		System.out.print("\n");
		System.out.print("\tthe First Character of String " +ch1);
		System.out.print("\tthe last Character of String " +ch2);
		
		
return ;
		
	}
	catch(Exception e){
		System.out.print("Exception occured Try Again !");

	}
}
}
