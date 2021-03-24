package leetcode.string;

public class Q1108 {
	
	public static void main(String[] args) {
		Q1108 q = new Q1108();
		System.out.println(q.defangIPaddr("1.1.1.1"));
		System.out.println(q.defangIPaddr("255.100.50.0"));
	}
	
	public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
	
}
