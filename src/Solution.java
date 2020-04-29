import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        Map <Character,Integer> map = new LinkedHashMap<>();
        for(int i=0; i<alphabet.size(); i++) {
            map.put(alphabet.get(i), 0);
        }
        for (String str : list){
            char[] inCharArray = str.toCharArray();
            for( char temp : inCharArray){
                map.put(temp,map.get(temp) + 1);
            }
        }
        for (Map.Entry<Character,Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}

