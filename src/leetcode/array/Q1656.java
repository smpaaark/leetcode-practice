package leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode
 * 1656. Design an Ordered Stream
 */
public class Q1656 {

    static class OrderedStream {

        private String[] stream;
        private int ptr = 1;

        public OrderedStream(int n) {
            this.stream = new String[n + 1];
        }

        public List<String> insert(int idKey, String value) {
            this.stream[idKey] = value;
            List<String> result = new ArrayList<>();
            for (int i = ptr; i < stream.length; i++) {
                if (stream[i] != null) {
                    result.add(stream[i]);
                    ptr++;
                } else {
                    return result;
                }
            }

            return result;
        }

    }

}
