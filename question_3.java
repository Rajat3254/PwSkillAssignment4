import java.util.Scanner;
public class question_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the cost price ");
        int CP=sc.nextInt();
        System.out.print("enter the selling price ");
        int SP=sc.nextInt();
        if(CP-SP<0){
            System.out.println("Profit "+(SP-CP));

        }else{
            System.out.println("loss "+(CP-SP));
        }
        
            
        }
    }
    

