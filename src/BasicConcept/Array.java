package BasicConcept;

public class Array {
public static void main(String[] args) {
	int[] myArr = new int[5];
	myArr[0] = 98;
	myArr[1] = 88;
	myArr[3] = 68;
	myArr[2] = 78;
	myArr[4] = 58;
//	System.out.println(myArr[2]);
	
	int[] myArr1 = {1, 2,3,4 ,5};
	int i=0;
	while(i<myArr1.length) {
		System.out.println(myArr1[i]);
		i++;
	}
}
}
