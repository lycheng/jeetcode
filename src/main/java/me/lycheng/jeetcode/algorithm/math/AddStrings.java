package me.lycheng.jeetcode.algorithm.math;

import java.util.LinkedList;
import java.util.List;

/*
 * https://leetcode.com/problems/add-strings/description/
 */
public class AddStrings {
    public String addStrings(String num1, String num2) {
        String biggerNum = num1.length() > num2.length()? num1: num2;
        String smallerNum = num1.length() > num2.length()? num2: num1;

        biggerNum = new StringBuilder(biggerNum).reverse().toString();
        StringBuilder smallerNumSb = new StringBuilder(smallerNum).reverse();

        int smallerNumLen = smallerNumSb.length();
        for (int i = 0; i < biggerNum.length() - smallerNumLen; i++) {
            smallerNumSb.append("0");
        }
        smallerNum = smallerNumSb.toString();

        int carry = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < biggerNum.length(); i++) {
            int a = smallerNum.charAt(i) - '0';
            int b = biggerNum.charAt(i) - '0';

            sb.append((a + b + carry) % 10);
            carry = (a + b + carry) / 10;
        }

        if (carry > 0) {
            sb.append(carry);
        }

        return sb.reverse().toString();
    }
}
