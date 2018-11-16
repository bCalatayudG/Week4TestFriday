package com.example.consultants.week4_testfriday.pig_latin;

/*
PigLatin:

a made-up language formed from English by transferring the initial consonant or consonant
cluster of each word to the end of the word and adding a vocalic syllable (usually ˈpiɡ ˌlatn:
so chicken soup would be translated to ickenchay oupsay . Pig Latin is typically spoken
playfully, as if to convey secrecy.
*/

public class Main {
    public static void main(String[] args) {
        String string_to_change = "chicken soup";
        PigLatin pigLatin = new PigLatin();
        String returnedString = pigLatin.doPigLatin(string_to_change);
        System.out.println("Main.main: " + returnedString);
    }
}
