class ArraSorting{
    static void dispaly(int[] array){
        for(int i=0;i<array.length; i++)
        System.out.println(array[i]);
    }
    static void sortAssesnding(int[] array){
        int temp; 
        for (int i=0; i<array.length; i++){
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp; 
                }
            }
        }
        dispaly(array);
    }
    static void sortdes(int[] array){
        int temp; 
        for (int i=0; i<array.length; i++){
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]<array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp; 
                }
            }
        }
        dispaly(array);
    }
    public static void  main(String[] args){
        int[] arr={32,33,432,43,234,43,4};
        dispaly(arr);
        sortAssesnding(arr);
        sortdes(arr);
    }
}