package Array;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr={6,3,2,9,8,4};
        int temp=0;
        int minIndex;
        int size=arr.length;
        System.out.println("Before Sorting : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        for(int i=0;i<size-1;i++){
            minIndex=i;
            for(int j=i+1;j<size;j++){
                if(arr[minIndex]>arr[j])
                   minIndex=j;
            }
            System.out.println();
            temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
            for (int n : arr) {
                System.out.print(n+" ");
            }
    
        }
        System.out.println();
        System.out.println("After Sorting : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }

}
