import java.util.ArrayList;

/**
 * Задан целочисленный список ArrayList.
 * Найти минимальное, максимальное и среднее из этого списка.
 */
import java.util.Random;

public class task03 {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();
        Random rnd = new Random();
        int minRnd = 3;
        int maxRnd = 10;
        int diffRnd = maxRnd - minRnd;
        int size = rnd.nextInt(diffRnd) + minRnd;
        for(int i = 0; i < size; i++){
            arr.add(rnd.nextInt(50));
        }
        System.out.println(arr.toString());
        arr.sort(null);
        System.out.println(arr.toString());
        int minNum = arr.get(0);
        int maxNum = arr.get(size-1);
        int meanNum = arr.get(size/2);  
        System.out.printf("минимальное %d, максимальное %d и среднее %d\n", minNum, maxNum, meanNum);
    }    
}
