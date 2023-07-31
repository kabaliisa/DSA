public class BST{
    public static void main(String[] args) {
        Node root = null;

        root = insert(root, 5);
        root = insert(root, 3);
        root = insert(root, 2);
        root = insert(root, 4);
//        System.out.println(root);
        preOrder(root);

//        Node node = new Node();
//        node.data = 5;
//        System.out.println(insert(node, 3));
    }
    public static Node insert(Node head, int val){
        if(head == null){
            head = new Node();
            head.data = val;
            head.right = null;
            head.left = null;
            return head;
        }else{
            if(val < head.data){
                head.left = insert(head.left, val);

            }else {
                head.right = insert(head.right, val);
            }
        }
        return head;
    }

    private static void preOrder(Node node) {
//        (1+(2*3)+((8)/4))+1
        if (node == null) {
            return;
        }
        System.out.printf("%s ", node.data);
        preOrder(node.left);

        preOrder(node.right);

    }

}


 class Node {
    int data;
    Node right;
    Node left;

     @Override
     public String toString() {
         return "Node{" +
                 "data=" + data +
                 ", right=" + right +
                 ", left=" + left +
                 '}';
     }
 }




