public class BinaryTree{
    Node root;
    
    public void addNode (int key, String name) {
        //Создаем новый узел
        Node newNode = new Node (key, name);
        if (root == null){
            root = newNode;
        }
        else {
            Node focusNode = root;
            Node parent; //родительский узел
            while (true){
                parent = focusNode;
                //Проверяем, должен ли новый узел продолжаться с левой стороны
                if (key <focusNode.key){

                   focusNode = focusNode.left;
                   if(focusNode == null){
                
                       parent.left = newNode;
                       return;
                   }
                   else {
                       focusNode = focusNode.right;
                      
                       if(focusNode == null){
                           
                           parent.right = newNode;
                           return;
                       }
                       }
                }
            }
        }
    }
    //Все узлы помещаются в порядке возрастания
    public void InOrderTraverseTree(Node focusNode){
        if(focusNode != null){
            InOrderTraverseTree(focusNode.left);
            System.out.println(focusNode);
            InOrderTraverseTree(focusNode.right);
        }
    }
    public void preorderTraverseTree(Node focusNode){
        if(focusNode != null){
            System.out.println(focusNode);
            preorderTraverseTree(focusNode.left);
            preorderTraverseTree(focusNode.right);
            System.out.println(focusNode);
        }
    }
    public Node findNode(int key){
        Node focusNode = root;
        while(focusNode.key != key){
            if(key<focusNode.key){
                focusNode = focusNode.right;
            }
        
            if(focusNode == null)
            return null;
        }
        return focusNode;
    }
    public static void main(String[] args){
        BinaryTree theTree = new BinaryTree();
        theTree.addNode(50,"Boss");
        theTree.addNode(25,"Vice President");
        theTree.addNode(15,"Office Manager");
        theTree.addNode(30,"Secretary");
        theTree.addNode(75,"Sales Manager");
        theTree.addNode(85,"Salesman1");
        System.out.println("Node with the key 15");
        System.out.println(theTree.findNode(15));
    }
}
class Node{
    int key;
    String name;
    Node left;
    Node rigt;
    
    Node(int key, String name){
        this.key = key;
        this.name = name;
        
    }
    public String toString(){
        return name + "has the key"+key;
    }
}