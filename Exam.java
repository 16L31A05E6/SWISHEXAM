import java.util.Scanner;
public class Exam
{
public static void main(String args[])
{
int x,p,s=0;
Scanner sc=new Scanner(System.in);
x=sc.nextInt();
p=sc.nextInt();
p=100-p;
while(x>0)
{
s=s+x;
x=(p*x)/100;
}
System.out.println();
System.out.println(s);
}
}
