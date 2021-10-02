class returnoddeven{
    static String check(int a){
        if(a%2==0)
        return "Even";
        else
        return "odd";
    }
    public static void main(String[] args){
       // String dis=check(2345430);
        System.out.println(check(45));
    }
}