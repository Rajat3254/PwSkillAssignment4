import java.util.Scanner;
public class question_6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Marks obtained by student ");
        int marks=sc.nextInt();
        if((marks<=100)&&(marks>90)){
            System.out.println("Grades obtained is A+");
        }else if((marks<=90)&&(marks>80)){
            System.out.println("Grades obtained is A");
        }else if((marks<=80)&&(marks>70)){
            System.out.println("Grades obtained is B+");
        }else if((marks<=70)&&(marks>60)){
            System.out.println("Grades obtained is B");
        }else if((marks<=60)&&(marks>50)){
            System.out.println("Grades obtained is C");
        }else if((marks<=50)&&(marks>40)){
            System.out.println("Grades obtained is D");
        }else if((marks<=40)&&(marks>30)){
            System.out.println("Grades obtained is E");
        }else{
            System.out.println("Grades obtained is F");
        }


    }
    
}
