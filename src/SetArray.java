import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetArray {
    public static Set<Integer> set = new TreeSet<>();
    public static void main(String[] args) {
        SetArray.addS();
        SetArray.delSet();
        SetArray.getSet();

    }

    public static void addS(){
        String str = "";
        for(int i = 0; i < 20; i++){
            int a = (int)(1 + Math.random()*10);
            str +=  a + " ";
            set.add(a);
        }
        System.out.println("Пример вывода рандомных 20 чисел: " + str);
        String st = "";
        for(Integer s : set){
           st += s + " ";
        }
        System.out.println("Пример вывода этих же чисел, но через коллекцию set: " + st);
    }

    public static void delSet(){
            set.remove(4);
            set.remove(8);
        String st = "";
        for(Integer s : set){
            st += s + " ";
        }
        System.out.println("Удаление из коллекции set чисел 4 и 8: " + st);
    }

    public static void getSet(){
        String stroka = "";
        for(Integer s : set){
            if(s % 2 == 0){
                stroka += s + " ";
            }
        }
        System.out.println("Выборка четных чисел из коллекции set: " + stroka);
    }
}
