import java.util.ArrayList;
import java.util.List;

public class ListArray {
    public static ArrayList<Integer> arr = new ArrayList<>();
    public static void main(String[] args) {
        ListArray.addArr();
        ListArray.removeArr();
        ListArray.getArr();
    }
    public static void addArr(){
        for(int i = 1; i < 11; i++){
            arr.add(i);
        }
        System.out.println("Добавили элементы в коллекцию arr: " + arr);
    }
    public static void removeArr (){
        for(int i = arr.size() - 1; i > 0; i = i - 2){
            arr.remove(i);
        }
        System.out.println("Удалили все четные числа из коллекции arr: " + arr);
    }
    public static void getArr (){
        for(int i = 1; i < arr.size(); i++){
            if(i % 2 != 0){
                arr.set(i, arr.get(i + 1));
            }
        }
        System.out.println("Нашли все четные элементы в коллекции arr и заменили на числа стоящие перед ними: " + arr);
    }
}
