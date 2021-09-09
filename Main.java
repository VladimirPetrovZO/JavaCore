package lesson4;


import java.util.*;


public class Main {
    public static void main(String[] args) {
        String[] words = {"собака", "кошка", "собака", "животное", "сарай", "квартира", "собака", "сарай", "деньги", "аренда"};

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");

        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");

        Phonebook pb = new Phonebook();

        pb.add("Petrov", "897654321");
        pb.add("Sidorov", "124657489");
        pb.add("Petrov", "1472858369");
        System.out.println("номера Petrov");
        System.out.println(pb.get("Petrov"));
    }
}