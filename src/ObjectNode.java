public class ObjectNode {
    Object data;
    ObjectNode next;

    ObjectNode(Object data, ObjectNode next){
        this.data=data;
        this.next=next;
    }
    public static ObjectNode insert(Object x,ObjectNode start){
        if(start==null ){
            start=new ObjectNode(x, start);
            return start;
        }
        ObjectNode p=start;
        p.next=new ObjectNode(x, p.next);
        return start;
    }
}
