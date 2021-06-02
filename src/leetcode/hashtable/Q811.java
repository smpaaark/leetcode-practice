package leetcode.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode
 * 811. Subdomain Visit Count
 */
public class Q811 {

    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (String domain : cpdomains) {
            String[] strArray = domain.split(" ");
            int visitCount = Integer.parseInt(strArray[0]);

            String url = strArray[1];
            String[] urlArray = url.split("\\.");
            if (map.containsKey(urlArray[urlArray.length - 1])) {
                map.put(urlArray[urlArray.length - 1], map.get(urlArray[urlArray.length - 1]) + visitCount);
            } else {
                map.put(urlArray[urlArray.length - 1], visitCount);
            }

            String prev = urlArray[urlArray.length - 1];
            for (int i = urlArray.length - 2; i >= 0; i--) {
                String str = urlArray[i] + "." + prev;
                if (map.containsKey(str)) {
                    map.put(str, map.get(str) + visitCount);
                } else {
                    map.put(str, visitCount);
                }
                prev = str;
            }
        }

        return createList(map);
    }

    private List<String> createList(Map<String, Integer> map) {
        List<String> list = new ArrayList<>();
        for (String key : map.keySet()) {
            list.add(map.get(key) + " " + key);
        }

        return list;
    }

}
