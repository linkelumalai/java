class AddSum{
    static void sumArray(int  a[], int n)
    {
        int sum =0;
        for (int i=0; i<n; i++){
            sum+=a[i];
        }
        System.out.println("sum of the numbers is "+sum);
    }
    public static void main(String[] args){
        int[] arr={22,24,27,29,30,25};
        int len=arr.length; 
        sumArray(arr,len);
    } 
}