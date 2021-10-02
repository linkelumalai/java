class countdigit{
    public static void main(String[] args)
    {
        int num=38453;
          int digit=0;
        do{
            digit++;
            num=num/10;
        }while(num>0);
        System.out.println("no of digit is: "+digit);
    }
}