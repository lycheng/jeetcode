package me.lycheng.jeetcode.algorithm.string;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/unique-email-addresses/
 */
public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> emailSet = new HashSet<>();
        for (String email: emails) {
            emailSet.add(filterEmail(email));
        }
        return emailSet.size();
    }

    public String filterEmail(String originEmail) {
        String[] items = originEmail.split("@");
        String localName = items[0];
        localName = localName.split("\\+")[0];
        return localName.replaceAll("\\.", "") + "@" + items[1];
    }
}
