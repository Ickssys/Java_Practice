import java.util.*;

public class ListExercises {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 66, 80, 50, 9, 12, 93, 84, 86, 36));
        List<Integer> nums2 = new ArrayList<>(List.of(78, 16, 97, 46, 16, 48, 58, 86, 82, 81));
        List<String> words = new ArrayList<>(List.of("four", "score", "and" , "seven", "years", "ago"));
        System.out.println(sum(nums));
        System.out.println(evens(nums));
        System.out.println(common(nums, nums2));
        System.out.println(countOccurrencesOfC(words, 'x'));
    }

    public static int sum(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }

    public static List<Integer> evens(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        for (int num : list) {
            if (num % 2 == 0) {
                newList.add(num);
            }
        }
        return newList;
    }

    public static List<Integer> common(List<Integer> l1, List<Integer> l2) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < l1.size(); i++) {
            for (int j = 0; j < l2.size(); j++) {
                if (l1.get(i) == l2.get(j)) {
                    newList.add(l1.get(i));
                }
            }
        }
        return newList;
    }

    public static int countOccurrencesOfC(List<String> words, char c){
        int count = 0;
        for(int i = 0; i < words.size(); i++){
            String word = words.get(i);
            for(int j = 0; j < word.length(); j++){
                if(word.charAt(j) == c){
                    count++;
                }
            }
        }
        return count;
    }
}