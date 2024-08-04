package Array;

import java.util.Scanner;

public class Arr2D {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String arr[][];
        System.out.print("Enter Rows : ");
        int rows=sc.nextInt();
        int cols;
        do {
            System.out.print("Enter Columns must be 2 : ");
            cols=sc.nextInt();
        }while(cols!=2);

            arr=new String[rows][cols];
            for(int i=0;i<arr.length;i++){

                 for (int j=0;j<arr[i].length;j++){
                     if(j%2==0){
                         System.out.print("Enter Name: ");
                     }else{
                         System.out.print("Enter Number : ");
                     }
                    arr[i][j]=sc.next();
                 }

            }
            for(int i=0;i<arr.length;i++){

                  for (int j=0;j<arr[i].length;j++){
                      if(j%2==0){
                          System.out.print("Name : ");
                      }else{
                          System.out.print("Number : ");
                      }
                     System.out.println(arr[i][j]);
                  }
            }


            sc.close();

    }
}
