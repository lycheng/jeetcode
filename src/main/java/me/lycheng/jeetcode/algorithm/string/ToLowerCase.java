package me.lycheng.jeetcode.algorithm.string;

/**
 * https://leetcode.com/problems/to-lower-case/
 */
public class ToLowerCase {
    public String toLowerCase(String str) {
        StringBuffer sb = new StringBuffer();
        for(char c : str.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                c += 'a' - 'A';
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
