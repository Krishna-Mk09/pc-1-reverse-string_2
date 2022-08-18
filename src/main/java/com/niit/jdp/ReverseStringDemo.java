package com.niit.jdp;

public class ReverseStringDemo {
    public static void main(String[] args) {
        ReverseStringDemo input = new ReverseStringDemo();
        String result = input.getReverseString("Programming");
        System.out.println("result = " + result);
    }

    /**
     * We create a char array from the string, then we loop through the array backwards and append each character to a
     * StringBuilder
     *
     * @param string The string to reverse.
     * @return The reverse of the string.
     */
    public String getReverseString(String string) {
        char[] chars = string.toCharArray();
        StringBuilder reverse = new StringBuilder();
        for (int index = chars.length - 1; index >= 0; index--) {
            reverse.append(chars[index]);
        }
        return reverse.toString();

    }
}

