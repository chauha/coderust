package com.coderust.string;

import java.util.HashSet;

public class RemoveDuplicatesInString {


    public static Character[] removeDuplicates(char[] str) {
        int reader_index = 0;
        int writer_index = 0;
        HashSet<Character> chars = new HashSet<>();
        while (reader_index < str.length) {
            if (chars.contains(str[reader_index])) {
                ++reader_index;
                continue;
            } else {
                chars.add(str[reader_index]);
                str[writer_index] = str[reader_index];
                ++writer_index;
                ++reader_index;
            }
        }
        Character[] result = new Character[writer_index + 1];
        for (int i = 0; i < result.length - 1; i++) {
            result[i] = str[i];
        }
        result[result.length - 1] = '\0';
        return result;


    }


    public static void main(String[] args) {
        final String s = new String("asabab");
        for (char c:removeDuplicates(s.toCharArray()) ){
            System.out.print(c);

        }

    }


}
