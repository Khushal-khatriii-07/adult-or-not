import java.util.Scanner;

public class Age{
    public static void main(String[] args) {
        System.out.print("Enter your age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>18){
            System.out.println("you are adult");
        }
        else{
            System.out.println("you are not adult");
        }
    }
}