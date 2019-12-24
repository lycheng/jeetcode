package me.lycheng.jeetcode.algorithm.hash;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/subdomain-visit-count/
 */
public class SubdomainVisitCount {

    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> domainVisitMap = new HashMap<>();

        for (String cp : cpdomains) {
            String[] items = cp.split(" ");
            int cnt = Integer.parseInt(items[0]);
            String domain = items[1];

            List<String> subDomains = getSubdomains(domain);
            for (String subDomain : subDomains) {
                domainVisitMap.put(subDomain, cnt +
                        domainVisitMap.getOrDefault(subDomain, 0));
            }
        }

        List<String> res = new LinkedList<>();
        domainVisitMap.forEach((k, v) -> {
            String s = String.format("%d %s", v, k);
            res.add(s);
        });
        return res;
    }

    public List<String> getSubdomains(String domain) {
        List<String> res = new LinkedList<>();
        while (domain.indexOf('.') >= 0) {
            res.add(domain);
            domain = domain.substring(domain.indexOf('.') + 1);
        }
        res.add(domain);
        return res;
    }
}
