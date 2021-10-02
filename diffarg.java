class diffarg{
    static void test(String name, int age, double percentage)
    {
        System.out.println("Name:"+name+"Age"+age+"Percentage"+percentage);
    }
    static void test(int num , int num1)
    {
        int sum=num+num1; 
        System.out.println(sum);
    }
    public static void main(String[] args){

        test("lucky",22,64.8);
        test(43,43);

    }
}