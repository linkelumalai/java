class PerfectNumber{
    public static void main(String[] args)
    {
        int num=436; 
        int sum=0; 
        int a=1;
        while(a<=num/2)
        {
            if(num%a==0){
                System.out.println(a);
            sum=sum+a;
            
            }
            a++;
        }
        if (sum==num)
        {
            System.out.println("yes " +num+ "is perfect Number");
        }else{
            System.out.println("no" +num+ "is not perfect number");
        }
        
    }
}

