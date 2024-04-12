import java.lang.Object;
import java.util.*;
public class Even {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(even(arr));
	}

	private static String even(int[] arr) {
		int[] ans;
		ans=new int[(arr.length/2)+1];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				ans[j]=arr[i];
				j++;
			}
		}
		String a = Arrays.toString(ans);
		return a;
		
	}

}