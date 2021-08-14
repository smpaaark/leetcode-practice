package codility.demo;

import java.util.HashSet;
import java.util.Set;

public class Task1 {

    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int num : A) {
            set.add(num);
        }

        int num = 1;
        for (; num <= 1000001; num++) {
            if (!set.contains(num)) {
                return num;
            }
        }

        return -1;
    }

}
