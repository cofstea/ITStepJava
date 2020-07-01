package com.itstep.lesson._11.homeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CharList {

    public ArrayList<Character> internalCharList;

    public CharList() {
        internalCharList = new ArrayList<>();
    }

    public CharList(ArrayList<Character> internalCharList) {
        this.internalCharList = internalCharList;
    }

    public CharList(String line) {
        internalCharList = new ArrayList<>();

        for (char ch : line.toCharArray()) {
            internalCharList.add(ch);
        }
    }

    @Override
    public String toString() {
        String line = "";

        for (char character : internalCharList) {
            line += character;
        }

        return line;
    }

    public int length() {
        return internalCharList.size();
    }

    public char charAt(int index) {
        return internalCharList.get(index);
    }

    public int indexOf(char c) {
        if (contains(c)) {

            for (int i = 0; i < internalCharList.size(); i++) {
                if (charAt(i) == c) {
                    return i;
                }
            }
        }
        return -1;
    }

    public CharList subString(int start, int end) {
        String stringCut = this.toString().substring(start, end);
        return new CharList(stringCut);
    }

    public CharList removeDuplicates() {
        HashSet<Character> withoutDuplicates = new HashSet<>(internalCharList);
        return new CharList(new ArrayList<>(withoutDuplicates));
    }

    public CharList removeAll(Character c) {
        ArrayList<Character> tempList = new ArrayList<>(internalCharList);
        tempList.removeAll(Collections.singletonList(c));
        return new CharList(tempList);
    }

    public boolean isEmpty() {
        return internalCharList.isEmpty();
    }

    public boolean contains(Character c) {
        return internalCharList.contains(c);
    }

    public CharList clearList() {
        internalCharList.clear();
        return this;
    }

    public CharList sortList() {
        Collections.sort(internalCharList);
        return this;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CharList)) {
            return false;
        }

        final CharList charList1 = (CharList) o;

        if (this.internalCharList != null) {
            return this.internalCharList.equals(charList1.internalCharList);
        }
        return charList1.internalCharList == null;
    }

    @Override
    public int hashCode() {
        return internalCharList != null ? internalCharList.hashCode() : 0;
    }

    public CharList reverseList() {
        ArrayList<Character> temp = new ArrayList<>(internalCharList);
        Collections.reverse(temp);

        return new CharList(temp);
    }

    public CharList mixedList() {
        Collections.shuffle(internalCharList);
        return this;
    }

    public CharList trim() {
        String temp = this.toString().trim();
        return new CharList(temp);
    }

    public CharList concat(CharList charList) {
        // this.charList.addAll(charList.charList);
        // return this;
        String temp = this.toString().concat(charList.toString());
        return new CharList(temp);
    }

    public CharList replaceFirst(Character old, Character newOne) {
        String temp = toString().replaceFirst(String.valueOf(old), String.valueOf(newOne));
        return new CharList(temp);
    }

    public CharList replaceLast(Character old, Character newOne) {
        return reverseList().replaceFirst(old, newOne);
    }

    public boolean endsWith(CharList charList) {
        return this.toString().endsWith(charList.toString());
    }

    public CharList toLowerCase() {
        return new CharList(this.toString().toLowerCase());
    }

    public CharList toUpperCase() {
        return new CharList(this.toString().toUpperCase());
    }

    public boolean isPalindrome() {
        CharList lastHalf = subString(length() / 2, length() - 1);
        return this.toString().startsWith(lastHalf.reverseList().toString());
    }

}
