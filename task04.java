import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Каталог товаров книжного магазина сохранен 
 * в виде двумерного списка List<ArrayList<String>> 
 * так, что на 0й позиции каждого внутреннего списка
 * содержится название жанра, 
 * а на остальных позициях - названия книг. 
 * Напишите метод для заполнения данной структуры.
 */

 public class task04 {
    public static void main(String[] args) {
        List<ArrayList<String>> arr = new ArrayList<>();
        arr.add(new ArrayList<>(List.of("проза", "Война и мир", "12 стульев")));
        arr.add(new ArrayList<>(List.of("Фэнтези", "Гарри Поттер", "Волшебник Земноморья")));
        arr.add(new ArrayList<>(List.of("триллер", "Код да Винчи", "Мистер Мерседес")));
        
        for (int i = 0; i < arr.size(); i++) {
            if (i == 0) {
                System.out.println(String.join("\t  |\t      \t", arr.get(0).get(i), arr.get(1).get(i), arr.get(02).get(i)));
            } else {
                System.out.println(String.join("  |      ", arr.get(0).get(i), arr.get(1).get(i), arr.get(02).get(i)));
            }
        }
 
    }    
}
