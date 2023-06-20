//сортировка выбором- перестановкой
public class sortSelection{
    pablic static void main (Strong [] args){
        
        int mas[] = new int(10);
        for (int i=0; i<mas.length; i++){
            mas[i] = (int) (Math.random()*10);
        }
        System.out.println("Исходный массив "+Arrays.toString(mas));
        
        for(int min = 0; min<mas.length; min++){ //внешний цикл для перебора элементов
        int least = min;//находим минимальный элемент
        for(int j = min+1; j<mas.length; j++){ //внутренний цикл, который находит индекс следующий минимального элемента
            if (mas[j] < mas[least]){ 
                least = j;//в эту переменную присваемую индекс наименьшего элемента массива
            }
            //меняем местами
            int tmp = mas(min);
            mas min = mas[least];
            mas[least] = tmp;
        }
        
        System.out.println("Отсортированный массив "+Arrays.toString(mas));
    }
}