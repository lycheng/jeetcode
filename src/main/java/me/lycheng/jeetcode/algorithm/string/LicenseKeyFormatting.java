package me.lycheng.jeetcode.algorithm.string;

/**
 * https://leetcode.com/problems/license-key-formatting/
 */
public class LicenseKeyFormatting {

    public String licenseKeyFormatting(String S, int K) {
        StringBuilder sb = new StringBuilder();

        for (char c : S.toCharArray()) {
            if (c == '-')
                continue;
            sb.append(c);
        }
        int offset = sb.length() % K == 0 ? K : sb.length() % K;
        while (offset < sb.length()) {
            sb.insert(offset, '-');
            offset += K + 1;
        }
        return sb.toString().toUpperCase();
    }
}
