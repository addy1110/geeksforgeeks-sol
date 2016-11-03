package Basic;

import java.util.*;
import java.util.Scanner;

/*Given a positive integer N, print count of set bits in it. For example, if the given number is 6, output should be 2 as there are two set bits in it.

Input:

The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. The next T lines will contain an integer N.

Output:
Corresponding to each test case, in a new line, print count of set bits in it.

Constraints:

1 ≤ T ≤ 100

1 ≤ N ≤ 1000000


Example:

Input:

2
6
11
 

Output:
2
3
*/


class GFG {
	public static void main (String[] args) {
		
	    Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
	    ArrayList<Integer> numbers = new ArrayList<>();
	    
	    for(int i=0;i<num;i++){
	    	int temp = in.nextInt();
	    	numbers.add(i,temp);
	    }
	    for(int i=0;i<num;i++){	
	    	int count=0;
	    	//System.out.println(Integer.toBinaryString(numbers.get(i)));
	    	for(int j=0;j<Integer.toBinaryString(numbers.get(i)).length();j++){
	    		if(Integer.toBinaryString(numbers.get(i)).charAt(j) == '1'){
	    			count++;
	    		}
	    		
	    	}
	    	System.out.println(count);
	    }
	    
	}
}