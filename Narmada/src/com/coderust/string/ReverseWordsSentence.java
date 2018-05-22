package com.coderust.string;

public class ReverseWordsSentence {


    public static void reverse_str(char[] str, int start, int end) {
        if (str == null || str.length < 2) {
            return;
        }
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }


    }

    public static void reverse_words(char[] str){

       int  start=0,end;
        while (true){
            while (str[start] == ' '){
                ++start;
            }
            if (str[start] == '\0') {
                break;
            }

            end=start+1;
            while (str[end] != ' ' && str[end] != '\0') {
                ++end;
            }
            reverse_str(str,start,end);
            start=end;
        }

    }






    public static void main(String[] args) {
        String a = "Ashish is a good boy , who believes in good and bad karma";
        char[] s= new char[a.length()];
        s=a.toCharArray();
        reverse_str(s, 0, s.length-1);
        reverse_words(s);
        System.out.println(s);
    }


}
