package leetcode.interview.queue;

import java.util.*;

/**
 * LeetCode
 * 341. Flatten Nested List Iterator
 * Queue
 */
public class Q341 {

    class NestedIterator implements Iterator<Integer> {

        private Queue<Integer> queue = new LinkedList<>();

        public NestedIterator(List<NestedInteger> nestedList) {
            initQueue(nestedList);
        }

        private void initQueue(List<NestedInteger> nestedList) {
            for (NestedInteger nestedInteger : nestedList) {
                if (nestedInteger.isInteger()) {
                    queue.offer(nestedInteger.getInteger());
                } else {
                    initQueue(nestedInteger.getList());
                }
            }
        }

        @Override
        public Integer next() {
            return queue.poll();
        }

        @Override
        public boolean hasNext() {
            return !queue.isEmpty();
        }

    }

    class NestedIterator2 implements Iterator<Integer> {

        Deque<NestedInteger> deque = new ArrayDeque<>();

        public NestedIterator2(List<NestedInteger> nestedList) {
            prepareStack(nestedList);
        }

        @Override
        public Integer next() {
            if (!hasNext()) { // deque가 비어있으면 null
                return null;
            }
            return deque.pop().getInteger(); // 이때 deque의 맨 앞 값은 항상 정수이다.
        }

        @Override
        public boolean hasNext() { // deque의 맨 앞 요소를 정수로 만들어주는 작업을 한다.
            while (!deque.isEmpty() && !deque.peek().isInteger()) { // deque의 맨 앞 요소가 정수가 아니면 반복
                List<NestedInteger> list = deque.pop().getList(); // deque의 맨 앞 리스트를 꺼냅니다.
                prepareStack(list); // prepareStack 호출하여 리스트의 요소들을 하나하나 deque의 앞쪽에 쌓는다.
            }
            return !deque.isEmpty();
        }

        private void prepareStack(List<NestedInteger> nestedList) {
            for (int i = nestedList.size() - 1; i >= 0; i--) { // 마지막 요소부터 push하여 첫 요소가 deque의 맨 앞에 오게 합니다.
                deque.push(nestedList.get(i));
            }
        }

    }

    interface NestedInteger {

        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        public boolean isInteger();

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        public Integer getInteger();

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return empty list if this NestedInteger holds a single integer
        public List<NestedInteger> getList();

    }

}
