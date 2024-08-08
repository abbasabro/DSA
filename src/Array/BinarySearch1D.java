package Array;

public class BinarySearch1D {
    public static void sort(int[] arr){
        int lenght=arr.length;
        int temp;
        for(int i=0;i<lenght;i++){
            for(int j=0;j<lenght-i-1;j++){
              if(arr[j]>arr[j+1]){
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
              }
            }
        }
    }
    public static int Binary1DSearch(int[] arr,int x){
        int first=0;
        int last=arr.length-1;
        int mid;
        while(first<last){
            mid=first+(last-first)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[mid]<x){
                first=mid+1;
            }
            if(arr[mid]>x){
                last=mid-1;
            }
        }
        return -1;
    }
    public static int duplicate(int[] arr,int key,int mid){
        int count=1;
        int i=mid;
        while(arr[i+1]==key){
            count++;
            i++;
        }
        i=mid;
        while(arr[i-1]==key){
            count++;
            i--;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,2,6,7,1,9,2,2,8};
        sort(arr);
        long t1=System.nanoTime();
        int foundIndex=Binary1DSearch(arr, 2);
        long t2=System.nanoTime();
        System.out.println("Before Calling "+t1);
        System.out.println("Found at "+foundIndex);
        System.out.println("After Calling "+(t2-t1));

       System.out.println(duplicate(arr, 2, foundIndex));
        
        
       

}
}
