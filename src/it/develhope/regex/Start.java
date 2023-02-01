package it.develhope.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Start {

    public static void main(String[] args) {
        String input = " are you able to climb, are you able to swim or are you able to fly?";
        String pattern = "\\sare";
        String replacement = " _XYZ";
        String output = input.replaceAll(pattern, replacement);
        System.out.println(output);
            }
        }
