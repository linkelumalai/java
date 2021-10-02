class octalconversion{
    public static void main(String[] args)
    {
        long java num=678873937947389979l; 
        String bin="";
        while(num>0)
        {
            long  t=num%8; 
            bin=t+bin; 
            num=num/8;
        }
        System.out.println(bin);
    }
}

