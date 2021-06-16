package leetcode.greedy;

/**
 * LeetCode
 * 1518. Water Bottles
 */
public class Q1518 {

    public static void main(String[] args) {
        Q1518 q = new Q1518();
        System.out.println(q.numWaterBottles(15, 4));
    }

    public int numWaterBottles(int numBottles, int numExchange) {
        int result = numBottles;
        int emptyBottles = numBottles;
        while (emptyBottles >= numExchange) {
            int plusBottles = (emptyBottles / numExchange);
            result += plusBottles;
            emptyBottles = emptyBottles % numExchange + plusBottles;
        }

        return result;
    }

}
