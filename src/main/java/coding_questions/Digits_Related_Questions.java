package coding_questions;

import java.util.Scanner;

public class Digits_Related_Questions {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();int temp=n;int reverse=n;int n1=n;
		int k=sc.nextInt();	int count=0;
	
		//no. of digits
		while(n!=0) {
		n=n/10;
		count++;
	}
	System.out.println("no of digits are->    "+count);
	
	
	//printing digits in sequence
	int quot=(int)Math.pow(10, count-1);
	while(quot!=0) {
		int dig=temp/quot;
		System.out.println(dig);
		temp=temp%quot;
		quot=quot/10;
	}
	
	//print reverse order of number
	while(reverse>0) {
		 int div=reverse%10; reverse=reverse/10;
		 System.out.println(div);
	}
	
	//rotating the number
	if(k<0)k=k+count;
	int divider=(int)Math.pow(10, k);
	int multiplier=(int)Math.pow(10, count-k);
	int q=n1/divider;
	int rem=n1%divider;
	int result=rem*multiplier+q;
	System.out.println(result);
	
	
	
	
	
	
	
	
	
	}

}
