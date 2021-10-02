import java.util.Scanner;
//static void getValue() 
class SimpleDemo{
    public static void main(String[] args ){
    Scanner read=new Scanner(System.in);
    System.out.println("Enter the name of the person ");
    String name=read.nextLine(); 
    System.out.println("Enter the age of the person");
    int num =read.nextInt(); 
    System.out.println("Enter the Cgpa of the person ");
    double cpga=read.nextDouble();
    System.out.println("Enter male or female");
    String gender=read.next(); 
    System.out.println("enter your exprience");
    boolean ex=read.nextBoolean(); 
    System.out.println("Name : "+name+"\nage : "+num+"\ncgpa: "+cpga+"\nGender: "+gender+"\nexprience: "+ex);
}
}