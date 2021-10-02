import java.util.Scanner; 
class SimpleOddEven{
    static void validateOddEven(int a[],int n){
        int value=0;
        int evenCount=0; 
        int oddCount=0;  
        for(int j=0; j<n; j++){
            a[j]=value++;
        }
        for(int i=0; i<n;i++){
            if(a[i]%2==0){
                System.out.println("even number is :" +a[i]);
                evenCount++; 
            }else{
                System.out.println("odd number is :" +a[i]);
                oddCount++; 
            }
        }
        System.out.println("total odd in " +n+ " is " +oddCount+" and even  " +n+ " is " +evenCount);
    }
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.println("Enter the limit to the array");
        int limit=read.nextInt();
        int array[]=new int[limit];
        int size=array.length;  
        validateOddEven(array,size);
    }
}