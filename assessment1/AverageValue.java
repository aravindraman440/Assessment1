package assessment1;

public class AverageValue {
public static void main(String[] args) {
	int[] array = {2,4,5,7,8,9,10,20,30,3};
	double total = 0;
	for (int i = 0; i < array.length; i++) {
		//System.out.print(array[i]);
	
	total=total+array[i];
	}
	double average=total/array.length;
	System.out.println(average);
	}
}

