import java.util.scanner;
class p6
{
public static void main(String args[])
{
int  ans=0;
Scanner sc=new Scanner(System.in);
System.out.println(" enter first number ;");
int n1=sc.nextInt();
		System.out.println(" enter Second number : ");
		int n2=sc.nextInt();
		ans=n1+n2;
		System.out.println(" 125+24: "+ans);
		ans=n1-n2;
		System.out.println(" 125-24: "+ans);
		ans=n1*n2;
		System.out.println(" 125*24 : "+ans);
		ans=n1/n2;
		System.out.println(" 125/24 : "+ans);
		ans=n1%n2;
		System.out.println(" 125 mod 24 : "+ans);
	}
}