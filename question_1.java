import java.util.Scanner;
public class question_1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("the length of shape");
        int l=sc.nextInt();
        System.out.print("the breadth of shape");
        int b=sc.nextInt();
        if( l==b){
            System.out.println("the shape is square");
        } else{
            System.out.println("the shape is rectangle");
        }


    }
}