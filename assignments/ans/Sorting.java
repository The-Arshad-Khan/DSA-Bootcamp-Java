import java.util.Arrays;

class Sorting{
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5};
        System.out.println("Before Sorting Array: "+Arrays.toString(a));
        System.out.println("After Sorting Array: "+Arrays.toString(bubbleSort(a)));

    }
    public static int[] bubbleSort(int[] a){
        int temp,swap=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0){
                return a;
            }
        }
        return a;
    }
    public static int[] insertionSort(int[] a){
        
    }
}