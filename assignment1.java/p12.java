import java.util.Scanner;
class p12
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number :");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int n3=sc.nextInt();
	System.out.println("Average of the numbers : "+((n1+n2+n3)/3));
  }
}