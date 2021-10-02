class LargestArray{
    static void large(int a[],int n){
        int large=a[0];
        for(int i=1; i<n ;i++){
            if(a[i]>large)
            large=a[i];
        }
        System.out.println("largest value is:"+large);
        small(a,n);
    }
    static void small(int b[],int size){
        int small=b[0];
        for(int i=0; i<size;i++){
            if(b[i]<small)
            small=b[i];
        }

        System.out.println("smallest value is:"+small);
    }
    public static void main(String[]args){
        int[] arr={23,43,23342,34342,4323,234323,88955808};
        int len=arr.length; 
        large(arr,len);
    }
}