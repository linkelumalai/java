class binary{
    public static void main(String[] args)
    {
     
        String bin="";
        /*while(num>0)
        {
            long t=num%2; 
            bin=t+bin; 
            num=num/2;
        }*/
        for(long num=345678909876lz; num>0;num=num/2 ){
            long t=num%2; 
            bin=t+bin; 
            
        }
        System.out.println(bin);
    }
}

