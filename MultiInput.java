import java.util.Scanner; 
class MulitInput{
    public static void main (String[] args){
        Scanner read=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a =read.nextInt(); 
        System.out.println("Enter the value of B");
        int b=read.nextInt();
        int sum=a+b; 
        System.out.println("the result is :" +sum);
        
    }
}