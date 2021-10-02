import java.util.Scanner; 
class MultiDiffInput{
public static void main(String[] args)
{
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the string value");
        String str=read.nextLine(); 
        System.out.println("Enter the only one word can read in the console screen ");
        String strOne=read.next();
        System.out.println("Enter the int value");
        int num=read.nextInt(); 
        System.out.println("Enter the float  value");
        double point =read.nextDouble(); 
        System.out.println("String is  " +str+ " \n integer value is " +num+ "\n double value is " +point);
       

}

}