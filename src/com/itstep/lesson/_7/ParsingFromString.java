package com.itstep.lesson._7;

public class ParsingFromString {

    public static void main(String[] args) {
        String asInt = "11";
        String asDouble = "13.25";
        String asBoolean = "true";
        String asChar = "A";

        int parsedInt = Integer.parseInt(asInt);
        double parsedDouble = Double.parseDouble(asDouble);
        boolean parsedBoolean = Boolean.parseBoolean(asBoolean);
        char parsedChar = asChar.charAt(0);

        String.valueOf(true);
        String.valueOf(22.35);
        String.valueOf('A');
    }

}
