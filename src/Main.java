import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 8, 9, 10, 2, 3, 4, 4, 11, 11, 10, 5, 5, 6, 12, 7));
        List<String> strings = new ArrayList<>(List.of("Egor", "privet", "egor", "egor", "000", "1234", "privet", "poka", "egor", "000", "Egor", "opopop", "123", "123"));
        List<String> strings1 = new ArrayList<>(List.of("один", "один", "два","два", "два", "два", "три", "три", "три", "три"));
        task_1(nums);
        task_2(nums);
        task_3(strings);
        task_4(strings1);
    }

    public static void task_1(List<Integer> nums){
        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i)%2 != 0){
                System.out.println(nums.get(i));
            }
        }
    }

    public static void task_2(List<Integer> nums){
        Set<Integer> numsSet = new HashSet<>();
        Collections.sort(nums);
        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i)%2==0){
                numsSet.add(nums.get(i));
            }
        }
        System.out.println(numsSet);
    }

    public static void task_3(List<String> strings){
        for (int i = 0; i < strings.size() - 1; i++) {
            String check = strings.get(i);
            for (int j = i+1; j < strings.size(); j++) {
                if(strings.get(j).equals(check)){
                    strings.remove(j);
                }
            }
        }
        System.out.println(strings);
    }

    public static void task_4(List<String> strings){
        List<String> str = new ArrayList<>();
        for (int i = 0; i < strings.size() - 1; i++) {
            String check = strings.get(i);
            int dubles = 0;
            if(str.contains(check)){
                continue;
            }
            for (int j = i+1; j < strings.size(); j++) {
                if(strings.get(j).equals(check)){
                    dubles++;
                }
            }
            str.add(check);
            System.out.println(dubles);
        }
    }
}