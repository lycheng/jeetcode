package me.lycheng.jeetcode.algorithm.string;

/**
 * https://leetcode.com/problems/defanging-an-ip-address/
 */
public class DefangingAnIPAddress {

    public String defangIPaddr(String address) {
        StringBuilder builder = new StringBuilder();

        address.chars().forEach(i -> {
            if (i == '.') {
                builder.append("[.]");
            } else {
                builder.append((char) i);
            }
        });
        return builder.toString();
    }
}
