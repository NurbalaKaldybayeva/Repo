package recursionLabAssignment;

public class ArraySum {

	public int sumOfArray(Integer[] a, int index) {
		int result=0;
		int n = index;
		if (index <0) {
            return 0; 
		}else {
			result=a[n]+sumOfArray(a, n-1);
		}
	    return result; 
	}

}
