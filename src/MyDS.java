class Node {
    int num;
    Node prev;
    public Node(int num) {
        this.num = num;
    }
}


public class MyDS extends OrderedCollection{
    Node end;
    static int count = 0;

    public MyDS() {
        end = null;
    }

    public void append(int toAppend){
        Node appNode = new Node(toAppend);
        appNode.prev = end;
        end = appNode;
        count++;
        if (count >= 6) {
            stringMessage();
        }
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
        count--;
        if (count >= 6) {
            stringMessage();
        }
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
        //could also create a member variable that increments with append and goes down with pop
    }

    public void stringMessage() {
        Node n = end;
        int count = 6;

        //for a ds that is passed into the method, could check each position
        //also could check that a certain sequence shows up anywhere in the ds, not just
        //at the end.


        if (n.num == 9) {
            n=n.prev;
            count--;
        }
        if (count == 5 && n.num ==5) {
            n = n.prev;
            count--;
        }
        if (count == 4 && n.num == 1) {
            n = n.prev;
            count--;
        }
        if (count == 3 && n.num == 4) {
            n = n.prev;
            count--;
        }
        if (count == 2 && n.num == 1) {
            n = n.prev;
            count--;
        }
        if (count == 1 && n.num == 3) {
            count--;
        }

        if (count == 0) {
            System.out.println("Who has pi on their face now, Pr0HaX0r?");
        }

    }



}