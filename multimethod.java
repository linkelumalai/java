class multimethod{
    static void square(int num)
    {
        int a=num*num;
        System.out.println( num+ "square svalue is : " +a);
        cube(8);
    }
    static void cube(int num)
    {
        int a=num*num*num; 
        System.out.println(num+" cube of the value is : " +a);
    }
    public static void main(String[] args){

        square(34);

    }
}