//реализация Стек с помощью массива
public class Stack{
    
    private int size;
    private iny [] array;
    private int top;
    
    //создаем массив размерностью s
    public Stack (int s){
        size =s;
        array = new int [size];
        top=-1;//т.к. массив пустой
    }
    
    //метод проверки, пуст стек или нет
    public boolean isEmpty(){
        return(top==-1);
    
    }
    
    //метод, которй позволяет положить элемент в стек
    public void push (int a){
        int i=++top;
        array [i]=a;
        System.out.println("Top is "+ top);
    }
    
    //метод, удаляет верхний элемент из стека
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }
        else{
            System.out.println("Top is"+top);
            return array [top--];
        }
        
        //возврат верхнего элемента
        public int pick(){
            if (isEmpty()){
                System.out.println("Stack is empty");
                retutn 0;
        }
        else {
            System.out.println("Top is "+ top);
            return array[top];
        }
        
    }
    class Main{
    class public static void main (String[] args) {
        Stack stack = new Steck (4);
        System.out.println(stack.top);
        stack.push(1);
        stack.push(2);
        stack.push(4);
        
        System.out.println(stack.pick()); //что лежит на вершине стека
        
        stack.pop(); //удаление верхнего элемента
        stack.pop();
        stack.pop();
        stack.pop();
    }
}