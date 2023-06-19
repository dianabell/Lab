//реализация двухсвязного списка
public class Node {
    public int data;
    public Node prev;
    
    public Node(int data){
        this.data = data;
    }
}
public class List{
    private Node head;
    private Node tail;
    
    public List(){
        head = null;
        tail = null;
    }
    private boolean isEmpty (){
        return head == null;
    }
    
    //метод вставки в начало
    public void addFirst (int data){
        Node temp = new Node (data);
        
        if (isEmpty())
        tail=temp;
        else 
        head.prev = temp;
        
        temp.next = head;
        head = temp;
    }
    
    //метод вставки в конец
    public void addLast(int data){
        Node temp = new Node (data);
        if (isEmpty())
        head = temp;
        else 
        tail.next = temp;
        temp.prev = tail;
        tail = temp;
    }
    
    //метод вставки по выбранному индексу
    public void addByIndex (int data, int index){
        Node cur = head;
        int c = 0;
        
        while (cur != null && c != index){
            cur = cur.next;
            c++;
        }
        Node temp = new Node (data);
        
        cur.prev.next = temp;
        temp.prev = cur.prev;
        cur.prev = temp;
        temp.next = cur;
    }
    
    //удаление начального элемента
    public void removeFirst(){
        
        if (head.next == null){
            tail = null;
        }
        else 
        head.next.prev = null;
        
        head = head.next;
    }
    
    //удаление последнего элемента
    public void removeLast(){
        if (head.next == null)
             head = null;
        else 
             tail.prev.next = null;
        tail = tail.prev;
    }
    
    //удаление по ключу
    public void removeAt (int key){
        Node cur = head;
        
        while (cur.data != key){
            cur = cur.next;
            
        if (cur == null)
        return;
        }
        
        if (cur == head)
            removeFirst();
        else 
            cur.prev.next = cur.next;
        
        if (cur ==tail)
            removeLast();
        else 
            cur.next.prev= cur.prev;
    }
    
    //метод вывода
    public void print(){
        Node temp = head;
        
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
public class Main{
    public static void main (String[] arge){
        List list = new List();
        
        list.addFirst(data: 1);
        list.addFirst(data: 2);
        list.addLast(data: 3);
        list.addByIndex(data:4, index:1);
        List.print();
        
        System.out.println();
        list.removeAt(key:1);
        list.print();
    }
}