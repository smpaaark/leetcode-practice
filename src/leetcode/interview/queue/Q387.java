package leetcode.interview.queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * LeetCode
 * 387. First Unique Character in a String
 * Queue
 */
public class Q387 {

    public int firstUniqChar(String s) {
        int[] alphabet = new int[26];
        for (char c : s.toCharArray()) {
            alphabet[c - 'a']++;
        }

        for (int i = 0; i <s.length(); i++) {
            if (alphabet[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public int firstUniqChar2(String s) {
        Map<Character,Integer> map = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)){ // map에 없으면 queue에 해당 index를 넣고 map에도 추가한다.
                queue.offer(i);
                map.put(c, 1);
            } else{ // map에 있으면 map의 값을 +1 증가시킨다.
                map.put(c, map.get(c) + 1);
            }

            while(!queue.isEmpty() && map.get(s.charAt(queue.peek())) > 1) { // queue의 맨 앞 값으로 map을 조회해서 1보다 크면 해당 인덱스를 queue에서 제거한다.
                queue.poll();
            }
        }

        if(queue.isEmpty()) { // queue가 비어있으면 -1 리턴
            return -1;
        }

        return queue.peek(); // queue의 맨 앞 index 리턴
    }

}
