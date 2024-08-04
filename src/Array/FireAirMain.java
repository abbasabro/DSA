package Array;


import java.util.Scanner;

class FireAir{
    String[][] song;
    int rows ,cols,pos=0;
    Scanner sc=new Scanner(System.in);
    FireAir(int r,int c){
        song=new String[r][c];
        rows=r;
        cols=c;
    }

    void display(){
        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(song[i][j] + " ");
            }
            System.out.println();
        }
    }
    void add(){
        if(pos==rows) {
            System.out.println("Memory is Full");
        } else {
            System.out.println("Enter Song Name : ");
            song[pos][0]=sc.nextLine();
            System.out.println("Enter Song Number : ");
            song[pos][1]=sc.nextLine();
            pos++;
        }
    }
    void update(){
        System.out.println("Enter the Song Name to Update : ");
        String name= sc.nextLine();
        for(int i=0;i<=pos;i++){
            if(song[i][0].equals(name)){
                System.out.println("Enter New Name : ");
                song[i][0]=sc.nextLine();
                break;
            }
        }
    }
    void searchByName(){
        System.out.println("Enter the Song Name to search : ");
        String name= sc.nextLine();
        for(int i=0;i<=pos;i++){
            if(song[i][0].equals(name)){
                System.out.println("Song Found at Number " + song[i][1]);
                break;
            }
        }
    }
    void searchByNumber(){
        System.out.println("Enter the Song Number to search : ");
        String num= sc.nextLine();
        for(int i=0;i<=pos;i++){
            if(song[i][0].equals(num)){
                System.out.println("Song Found  " + song[i][0]);
                break;
            }
        }
    }
}
public class FireAirMain {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Rows : ");
        int rows=sc.nextInt();
        FireAir song=new FireAir(rows,2);
        while(true){
            System.out.println("Choose Option :  1:Display , 2:Add , 3:Update , 4:Search by Name , 5:Search by Number , 6:Exit");
            int opt=sc.nextInt();
            switch (opt){
                case 1 : song.display();break;
                case 2 : song.add();break;
                case 3 : song.update();break;
                case 4 : song.searchByName();break;
                case 5 : song.searchByNumber();break;
                case 6 : System.exit(0);break;
                default:
                    System.out.println("Try Again");
            }
        }

    }
}
