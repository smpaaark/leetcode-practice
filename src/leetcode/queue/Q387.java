package leetcode.queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Q387 {

    public int firstUniqChar(String s) {
        if (s.length() < 2) {
            return 0;
        }

        Queue<Integer> queue = new LinkedList<>();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                queue.offer(i);
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }

            while (!queue.isEmpty() && map.get(s.charAt(queue.peek())) > 1) {
                queue.poll();
            }
        }

        if (queue.isEmpty()) {
            return -1;
        }

        return queue.peek();
    }

}
