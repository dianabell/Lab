//реализация очереди с помощью массива
public class Queue{
    int [] array;//массив для хранения элементов
    int rear;//указывает на последни элемент в очереди
    int front;//указывает на передний элемент в очереди
    int count;//текущий размер очереди
    
    //инициализируем очередь
    public Queue (int size){
        array = new int [size];
        rear=-1;
        front=-1;
        count=0;
    }
    
    //проверка, пуста ли очередь
    public boolean isEmpty(){
        boolean response = false;
        if(count==0){
            response = true;
        }
    return response;
    }
    
    //метод удаления из очереди
    public int dequeue (){
        int response=0;
        if(count != 0){
            front++;
            response = queue[front];
            count--;
        }
        return response;
    }
    
    //метод получения переднего элемента
    public int peek(){
        int recponse=0;
        if(!isEmpty()){
            response = queue[front +1];
        }
        
    //определить размер очереди
    public int getSize(){
        return count;
    }
    }
}
public class Main {
    public static void main [String [] args]{
        Queue queue = new Queue (size:10);
        System.out.println(queue.enqueue(element:100));
        System.out.println(queue.enqueue(element:200));
        System.out.println(queue.enqueue(element:500));
        System.out.println(queue.getSize());
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        System.out.println(queue.dequeue() + "deleted from the list");
        System.out.println(queue.peek());
        System.out.println("size =" +queue.getSize());
    }
}