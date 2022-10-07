package week1day2;

public class PalindromeorNot {

	public static void main(String[] args) {
		
			int n=34343;
			int temp=n;
			String s= Integer.toString(n);
			int sum=0;
			for( int i=s.length();i>0;i--) {
				sum=(sum*10)+(n%10);
				n=n/10;
				
				}
			if(temp==sum) {
				System.out.println(temp+" is a palindrome number");
			}else {
				System.out.println(temp+" is not a palindrome numer");
			}
		}

	}


