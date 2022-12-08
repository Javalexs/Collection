import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapArray {
    public static HashMap <Integer, String> map = new HashMap<Integer, String>();
    public static void main(String[] args) {
        MapArray.addMap();
        MapArray.getMap();
        MapArray.removeMap();
    }
    //добавим в коллекцию ключ и соответствующий ему день недели
    public static void addMap() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        String[] arst = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], arst[i]);
        }
        for(Map.Entry<Integer, String> item : map.entrySet()){
            System.out.printf("Number: %d  Day: %s \n", item.getKey(), item.getValue());
        }

    }
    //удалим из коллекции все рабочие дни

    public static void getMap() {
        for (Integer s : map.keySet()) {
            if (map.get(s).equals("Friday")) {
                System.out.println("Ура, завтра выходной!");
            }
        }
    }
    public static void removeMap(){
        for(int i = 0; i < 6; i++){
            map.remove(i);
        }
        for(Map.Entry<Integer, String> item : map.entrySet()){
            System.out.printf("Weekend: %s \n", item.getValue());
        }
    }
}

