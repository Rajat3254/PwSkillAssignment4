import java.util.Scanner;
public class question_5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("enter the operator you want to use ");
         char op=sc.next().charAt(0);
        switch(op){
            case '+':
            System.out.println("the sum of numbers is "+(a+b));
            break;
            case'-':
            System.out.println("the subtraction of numbers is "+(a-b));
            break;
            case'*':
            System.out.println("the product of numbers is "+(a*b));
            break;
            case'/':
            System.out.println("the division of numbers is "+(a/b));
            break;
            default:
            System.out.println("opretor not match" );
        }
    }
    
}
