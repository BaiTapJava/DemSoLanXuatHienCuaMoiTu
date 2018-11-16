import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character,Integer> treeMap = new TreeMap<>();

        System.out.println("Input string: ");
        String string = scanner.nextLine();
        string = string.toLowerCase();

        int i =0;
        while (i!=string.length())
        {
            if (treeMap.containsKey(string.charAt(i)))
            {
                int value = treeMap.get(string.charAt(i));
                treeMap.remove(string.charAt(i));
                treeMap.put(string.charAt(i),value+1);
            }
            else {
                treeMap.put(string.charAt(i),1);
            }
            i++;
        }

        System.out.println(treeMap);
    }
}
