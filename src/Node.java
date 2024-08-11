public class Node {
    int data;
    Node next;
    public Node(int data){
        this.data=data;
    }
    public Node(int data, Node next){
        this.data=data;
        this.next=next;
    }
    //Insert Element Function
    static Node insert(int x,Node start){
        if(start==null || start.data > x){
            start=new Node(x,start);
            return start;
        }
        Node p=start;
        while(p.next!=null){
            if(p.next.data>x)
                break;
            p=p.next;
        }
        p.next=new Node(x,p.next);
        return start;
    }
    static int add(Node start){
        int sum=0;
        for (Node q=start;q!=null;q=q.next){
            sum += q.data;
        }
        return sum;
    }
    //Filter Out even and odd elements
    static void evenOddFilter(Node start){
        System.out.println("Even");
        for (Node q=start;q!=null;q=q.next){
            if(q.data%2==0){
                System.out.print(q.data+ " ");
            }
        }
        System.out.println("Odd");
        for (Node q=start;q!=null;q=q.next){
            if(q.data%2!=0){
                System.out.print(q.data+ " ");
            }
        }
        
    }
    //Even Positon element Function
    static void evenPosition(Node start){
        int position=1;
        for (Node q=start;q!=null;q=q.next){
            if(position%2==0){
                System.out.println(q.data);
            }
            position++;
        }
    }
    //Odd Positon element Function
    static void oddPosition(Node start){
        int position=1;
        for (Node q=start;q!=null;q=q.next){
            if(position%2!=0){
                System.out.println(q.data);
            }
            position++;
        }
    }  
    //Delete Function
    static Node delete(Node start ,int x){
        if(start==null || start.data>x)
            return start;
        if(start.data==x)
           return start.next;
        for(Node p=start;p.next!=null;p=p.next){
            if(p.next.data>x)
              break;
            if(p.next.data==x){
                p.next=p.next.next;
                break;
            }
        }
        return start;
    } 
    //Merge Function
    static Node merge(Node list1,Node list2){
        // Node dummy=new Node(0);
        // Node adder=dummy;
        // while(list1!=null && list2!=null){
        //     if(list1.data<=list2.data){
        //         adder.next=list1;
        //         list1=list1.next;
        //     }else{
        //         adder.next=list2;
        //         list2=list2.next;
        //     }
        //     adder=adder.next;
        // }
        // if(list1!=null){
        //     adder.next=list1;
        // }else{
        //     adder.next=list2;
        // }
        // return dummy.next;
        for(Node q=list2;q!=null;q=q.next){
            list1=insert(q.data, list1);
        }
        return list1;
    }  
    //Copy
    public static Node copy(Node p){
        Node q=new Node(p.data);
        Node temp=q;
        p=p.next;
        while (p!=null) {
            temp.next=new Node(p.data);
            temp=temp.next;
            p=p.next;
        }
        return q;
    }
     //Divide List into n parts
    //sublist
    //randomize the list                                                                                        
    public static void main(String[]args){

//        Node start=new Node(11);
//        start.next=new Node(22);
//        start.next.next=new Node(33);
//        start.next.next.next=new Node(44);


//        Node start=new Node(11);
//        Node p;
//        p=start;
//        p.next=new Node(22);
//        p=p.next;
//        p.next=new Node(33);
//        p=p.next;
//        p.next=new Node(44);
//        p=p.next;
//        p.next=new Node(55);

//
//        Node start=new Node(11);
//        Node p;
//        p=start;
//        for(int i=0;i<4;i++){
//            p.next=new Node(22+11*i);
//            p=p.next;
//        }

//        System.out.println(start.data);
//        System.out.println(start.next.data);
//        System.out.println(start.next.next.data);
//        System.out.println(start.next.next.next.data);

        Node start=new Node(1);
        int counter=0;
        insert(2,start);
        insert(6,start);
        insert(5,start);
        insert(7,start);
        insert(10,start);
        insert(9,start);
        insert(4,start);
        insert(3,start);
        insert(8,start);
        insert(12, start);
        Node newNode=new Node(20);
        insert(15, newNode);
        insert(16, newNode);
        insert(18, newNode);
        insert(13, newNode);
        insert(14, newNode);
        insert(17, newNode);
        insert(19, newNode);


        System.out.println("Before Deleting :");
        for(Node q=start;q!=null;q=q.next){
            System.out.println(q.data);
            counter++;
        }
        System.out.println("Number of Nodes are "+counter);
        int sum= add(start);
        System.out.println("Sum of List = "+sum);
       // evenOddFilter(start);
        evenPosition(start);
        //Delete
        delete(start, 10);
        System.out.println("After Deleting :");
        for(Node q=start;q!=null;q=q.next){
            System.out.println(q.data);
            counter++;
        }
        //Merge
        Node mergNode=merge(newNode, start);
        System.out.println("Merged : ");
        for(Node q=mergNode;q!=null;q=q.next){
            System.out.println(q.data);
            counter++;
        }

    }
}