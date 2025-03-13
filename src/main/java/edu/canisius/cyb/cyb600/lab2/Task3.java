package edu.canisius.cyb.cyb600.lab2;

import java.util.*;
import java.util.stream.Collectors;

public class Task3 {
    public ArrayList<String> removeDuplicates(String inputText) {
        if (inputText == null || inputText.equals("")) {
            return new ArrayList<>();
        }

        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();
        for (char ch : inputText.toCharArray()) {
            uniqueChars.add(ch);
        }

        return uniqueChars.stream().map(Object::toString).collect(Collectors.toCollection(ArrayList::new));
    }

    public boolean areTheseAnagrams(String str1, String str2){
        if ((str1 == null || str2 == null) || str1.length() != str2.length()) {
            return false;
        }else{
            char[] anagram1 = str1.toCharArray();
            char[] anagram2 = str2.toCharArray();
            Arrays.sort(anagram1);
            Arrays.sort(anagram2);
            return Arrays.equals(anagram1, anagram2);

        }
    }
}
