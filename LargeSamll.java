class LargeSmall{
    static void large(double a[],int n){
        double large=a[0];
        for(int i=1; i<n ;i++){
            if(a[i]>large)
            large=a[i];
        }
        System.out.println("Tallest :"+large);
        small(a,n);
    }
    static void small(double b[],int size){
        double small=b[0];
        for(int i=0; i<size;i++){
            if(b[i]<small)
            small=b[i];
        }

        System.out.println("Smallest :"+small);
    }
    public static void main(String[]args){
        double[] arr={5.7,5.5,5.2,6.1};
        int len=arr.length; 
        large(arr,len);
    }
}