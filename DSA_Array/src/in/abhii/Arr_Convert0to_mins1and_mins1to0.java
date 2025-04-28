package in.abhii;
//Convert 0 to -1 and -1 to 0

public class Arr_Convert0to_mins1and_mins1to0 {
	public static void main(String[] args) {
		int[] arr = {0, 2, -1, 0, 2, -1, 3};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				arr[i]=-1;
			}else if(arr[i]==-1) {
				arr[i]=0;
			}
			System.out.print(arr[i]+" ");
		}
	}

}
