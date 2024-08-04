package Array;

public class LinearSearch1 {
    public static void LinearSearch(int arr[],int key){
        int duplicate=0;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
              found=true;
              duplicate++;
            }
        }
        if(found==true){
            System.out.println("Element found and duplicate are = "+duplicate);
        }else{
            System.out.println("Element Not Found");
        }
    }
    
    public static void main(String[] args) {
        int arr[]={0,1,2,3,2,4,2,6,7,3,4,2,1,8,9};
        int key=2;
        LinearSearch(arr,key);
    
        
      }
}
