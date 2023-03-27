package Asan;

import java.util.Scanner;

public class Class_A {

	public static void main(String[] args) {
	
		
//		String a ="as#as@!$b";
//		String original = a;
//		String b = "";
//		String c= "";
//		
//				for(int k=0;k<a.length();k++) {
//					if(a.charAt(k)<'a'||a.charAt(k)>'z') 
//						a=a.replace(a.charAt(k)+"","0");
//				}
//				
//				System.out.println(a);
//					 b=a;
//				
//		for(int i=b.length()-1;i>=0;i--) {
//			c+=b.charAt(i)+"";
//		}
//		
//		System.out.println(c);
//
//		for( int l=0;l<c.length();l++) {
//			if(original.charAt(l)>'a'&&original.charAt(l)<'z') 
//				c=c.replace(c.indexOf(l)+"",original.charAt(l)+"");
//		}
//		
//		System.out.println(c);

	// get 5 number from user
	//and summarize  them 
	//and if summarization bigger than 10 then print it.
		
		
		
		
		/* user can only try 3 times wrong password 
		 * if while 
		 * 
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter Password");
		String password = "Desk123";
		int count = 0;
		String input = scan.next();
		
		while(count<=3) {
			 input = scan.next();
			count++;
			if(count==3&&password.equals(input)) {
				System.out.println("Your account blocked, please wait 15 minutes");
				break;
			}
			else {
				System.out.println("Welcome our homepage");
			}
			
		}
		
System.out.println("ahmad");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
