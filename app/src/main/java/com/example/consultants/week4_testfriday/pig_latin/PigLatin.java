package com.example.consultants.week4_testfriday.pig_latin;

class PigLatin {

    String doPigLatin(String word) {

        String[] ary = word.split(" ");

        StringBuilder finalString = new StringBuilder();
        for (String s : ary) {
            s = changeConsonants(s);
            finalString.append(s).append(" ");
        }

        return finalString.toString();
    }

    private String changeConsonants(String s) {
        int count = 0;
        String finalS;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                count++;
            } else {
                break;
            }
        }
        String firstS = s.substring(0, count);
        String secondS = s.substring(count, s.length());
        finalS = secondS + firstS + "ay";

        return finalS;
    }

}
