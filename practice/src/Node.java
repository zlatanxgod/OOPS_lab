public class Node {

    public class node
    {
        public int value;
        public node next;

        node(int value)
        {
            this.value = value;
        }
    }

    node yolo ;

    public void tippi(int x)
    {
        if (yolo.next == null)
        {
            var temp = new node(x);
            yolo.next = temp;
        }
        else
        {
            var temp = new node(x);
        }
    }

}
