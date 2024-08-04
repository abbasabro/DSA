package Array;
public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={9,5,2,4,8,7,6};
        int size=arr.length;
        int temp;
        System.out.println("Before Sorting : ");
        for(int n : arr){
            System.out.print(n + " ");
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.println();
            for(int n: arr){
                System.out.print(n + " ");
            }
        }


        System.out.println();
        System.out.println("After Sorting : ");
        for(int n: arr){
            System.out.print(n + " ");
        }
    
        
    }

}
