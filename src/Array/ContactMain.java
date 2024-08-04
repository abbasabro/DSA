package Array;

import java.util.Scanner;

class ContactApp{
    String[][] contacts;
    int rows,cols,pos=0;
    Scanner sc = new Scanner(System.in);

    ContactApp(int r ,int c){
        contacts=new String[r][c];
        rows=r;
        cols=c;
    }

    void display(){
        System.out.println("Your Contact List : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(contacts[i][j]+" ");
            }
            System.out.println();
        }
    }
    void insert(){
        if(pos==rows){
            System.out.println("Buy a new Phone");
        }else{
            System.out.println("Enter Name : ");
            contacts[pos][0]=sc.nextLine();
            System.out.println("Enter Number : ");
            contacts[pos][1]=sc.nextLine();
            pos++;
        }
    }
    void update(){
        System.out.println("Enter Name You want To Update : ");
        String name= sc.nextLine();
        for (int i=0;i<=pos;i++){
            if(contacts[i][0].equals(name)){
                System.out.println("Enter New Name : ");
                contacts[i][0]=sc.nextLine();
                break;
            }
        }
    }

    void search(){
        System.out.println("Enter Name You want to search: ");
        String name= sc.nextLine();
        for(int i=0;i<=pos;i++){
            if(contacts[i][0].equals(name)){
                System.out.println(name + " contact found : "+ contacts[i][1]);
                break;
            }
        }
    }

    void delete(){
        System.out.println("Enter the Name You want to delete");
        String name= sc.nextLine();
        for(int i=0;i<=pos;i++){
            if(contacts[i][0].equals(name)){
                for(int j=i;j<pos-1;j++){
                    contacts[j][0]=contacts[j+1][0];
                    contacts[j][1]=contacts[j+1][1];
                }
                contacts[pos-1][0]=null;
                contacts[pos-1][1]=null;
                pos--;
                System.out.println("Contact Deleted");
                break;
            }
        }
    }
}
public class ContactMain {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int r= sc.nextInt();
        ContactApp c1=new ContactApp(r,2);

        while(true){
            System.out.println("Select Option : 1:Display , 2:Insert , 3: Update , 4: Search ,5:Delete ,6:Exit ");
            int opt=sc.nextInt();
            switch (opt){
                case 1 : c1.display();break;
                case 2 : c1.insert();break;
                case 3 : c1.update();break;
                case 4 : c1.search();break;
                case 5 : c1.delete();break;
                case 6 : System.exit(0);break;
                default:
                    System.out.println("Try again");
            }
        }
    }
}
