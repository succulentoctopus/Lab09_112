class Node {
    int num;
    Node prev;
    public Node(int num) {
        this.num = num;
    }
}

//String

public class MyDS extends OrderedCollection{
    Node end;

    public MyDS() {
        end = null;
    }
    public void append(int toAppend){
        Node appNode = new Node(toAppend);
        appNode.prev = end;
        end = appNode;
    }
    public int peek(){
        if (end == null) {
            return 0;
        }
        return end.num;
    }
    public int pop(){
        if (end == null) {
            return 0;
        }
        int fin = end.num;
        end = end.prev;
        return fin;
    }
    public String toString(){
        String s = "";
        Node n = end;
        while (n != null) {
            s = n.num + " " + s;
            n = n.prev;
        }

        return s;
    }
    public int length(){
        int count = 0;
        Node n = end;
        while (n != null) {
            count++;
            n = n.prev;
        }
        return count;
    }



}