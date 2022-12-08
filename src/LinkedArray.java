import java.util.Collections;
import java.util.LinkedList;
public class LinkedArray {
    public static LinkedList<String> arr = new LinkedList<>();
    public static void main(String[] args) {
        LinkedArray.addLink();
        LinkedArray.getLink();
        LinkedArray.removeLink();
    }
        public static void addLink(){
            String winter = "Winter";
            String spring = "Spring";
            String summer = "Summer";
            String autumn = "Autumn";
            arr.add(spring);
            arr.add(summer);
            arr.addFirst(winter);//добавили элемент в начало коллекции
            arr.addLast(autumn);//добавили элемент в конец коллекции
            String str = "";
            for(String s : arr){
                str += s + " ";
            }
            System.out.println("Добавили элементы в коллекцию arr: " + str.trim());
        }
        public static void getLink(){
            System.out.println("Получили первый и последний элемент коллекции arr: " + arr.getFirst() + " " + arr.getLast());
        }
        public static void removeLink(){
            arr.removeFirst();//удалили первый элемент из коллекции arr
            arr.removeLast();//удалили последний элемент из коллекции arr
            String str = "";
            for(String s : arr){
                str += s + " ";
            }
            System.out.println("Удалили из коллекции arr первый и последний элементы: " + str.trim());
        }
}
