class ArrayAvg{
    static void arrAvg(double  a[], double n)
    {
        double sum =0;
        for (int i=0; i<n; i++){
            sum+=a[i];
        }
        System.out.println("sum of the numbers is "+sum/n);
    }
    public static void main(String[] args){
        double[] arr={6.5,7.2,8.2,7.9,6.5};
        double len=arr.length; 
        arrAvg(arr,len);
    } 
}