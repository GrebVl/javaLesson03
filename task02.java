import java.util.ArrayList;
import java.util.Random;

/**
 * Пусть дан произвольный список целых чисел,
 * удалить из него четные числа
 */
public class task02 {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();
        Random rnd = new Random();
        int size = rnd.nextInt(10);
        for(int i = 0; i < size; i++){
            arr.add(rnd.nextInt(50));
        }
        System.out.println(arr.toString());

        int index = 0;
        while (index != size){
            if(arr.get(index) % 2 != 0){
                arr.remove(index);
                size--;
            }
            else{
                index += 1;
            }
        }        
        System.out.println(arr.toString());
    }
}
