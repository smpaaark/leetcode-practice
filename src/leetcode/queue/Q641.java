package leetcode.queue;

public class Q641 {
	
	public static void main(String[] args) {
		MyCircularDeque circularDeque = new MyCircularDeque(3); // set the size to be 3
		System.out.println(circularDeque.insertFront(8));			// return true
		System.out.println(circularDeque.insertLast(8));			// return true
		System.out.println(circularDeque.insertLast(2));			// return true
		System.out.println(circularDeque.getFront());			// return 4
		System.out.println(circularDeque.deleteLast());			// return true
		System.out.println(circularDeque.getRear());  			// return 2
		System.out.println(circularDeque.insertFront(9));			// return false, the queue is full
		System.out.println(circularDeque.deleteFront());			// return true
		System.out.println(circularDeque.getRear());  			// return 2
		System.out.println(circularDeque.insertLast(2));			// return true
		System.out.println(circularDeque.isFull());				// return true
	}
	
	static class MyCircularDeque {
		
		private int[] array;
		private final int qSize;
		
		/** Initialize your data structure here. Set the size of the deque to be k. */
	    public MyCircularDeque(int k) {
	        this.array = new int[k];
	        for (int i = 0; i < k; i++) {
	        	this.array[i] = -1;
	        }
	        
	        this.qSize = k;
	    }
	    
	    /** Adds an item at the front of Deque. Return true if the operation is successful. */
	    public boolean insertFront(int value) {
	        if (this.isFull()) {
	        	return false;
	        }
	        
	        for (int i = this.qSize - 1; i > 0; i--) {
	        	if (this.array[i - 1] != -1) {
	        		this.array[i] = this.array[i - 1];
	        	}
	        }
	        
	        this.array[0] = value;
	        
	        return true;
	    }
	    
	    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
	    public boolean insertLast(int value) {
	    	if (this.isFull()) {
	        	return false;
	        }
	    	
	    	for (int i = this.qSize - 1; i > 0; i--) {
	        	if (this.array[i - 1] != -1) {
	        		this.array[i] = value;
	        		
	        		return true;
	        	}
	        }
	    	
	    	this.array[0] = value;
	    	return true;
	    }
	    
	    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
	    public boolean deleteFront() {
	    	if (this.isEmpty()) {
	    		return false;
	    	}
	    	
	    	this.array[0] = -1;
	    	
	    	for (int i = 1; i < this.qSize; i++) {
	    		if (this.array[i] != -1) {
	    			this.array[i - 1] = this.array[i];
	    			this.array[i] = -1;
	    		}
	    	}
	    	
	    	return true;
	    }
	    
	    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
	    public boolean deleteLast() {
	    	if (this.isEmpty()) {
	    		return false;
	    	}
	    	
	    	for (int i = this.qSize - 1; i >= 0; i--) {
	        	if (this.array[i] != -1) {
	        		this.array[i] = -1;
	       
	        		return true;
	        	}
	        }
	    	
	    	return false;
	    }
	    
	    /** Get the front item from the deque. */
	    public int getFront() {
	    	if (this.isEmpty()) {
	    		return -1;
	    	}
	    	
	        return this.array[0];
	    }
	    
	    /** Get the last item from the deque. */
	    public int getRear() {
	    	if (this.isEmpty()) {
	    		return -1;
	    	}
	    	
	    	for (int i = this.qSize - 1; i >= 0; i--) {
	        	if (this.array[i] != -1) {
	        		return this.array[i];
	        	}
	        }
	    	
	    	return -1;
	    }
	    
	    /** Checks whether the circular deque is empty or not. */
	    public boolean isEmpty() {
	        if (this.array[0] == -1) {
	        	return true;
	        }
	        
	        return  false;
	    }
	    
	    /** Checks whether the circular deque is full or not. */
	    public boolean isFull() {
	        if (this.array[this.qSize - 1] == -1) {
	        	return false;
	        }
	        
	        return true;
	    }
		
	}
	
}
