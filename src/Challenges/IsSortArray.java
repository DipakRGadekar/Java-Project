package Challenges;

public class IsSortArray {
	public static void main(String[] args) {
		System.out.println("Welcome to array sorting check post");
		int[] numArray = ArrayUtility.inputArray();
		boolean isInc = isIncreasing(numArray);
		boolean isDec = isDecreasing(numArray);
	
		if(isDec || isInc) {
			System.out.println("Your array is sorted");
		}else {
			System.out.println("Your array is not sorted");
		}
	}

	public static boolean isIncreasing(int[] numArr) {
		int i =1;
		while (i < numArr.length) {
			if (numArr[i] < numArr[i-1]) {
				return false;
			}
						i++;
		}
		return true;
	}

	public static boolean isDecreasing(int[] numArr) {
		int i =1;
		while (i < numArr.length) {
			if (numArr[i] > numArr[i-1]) {
				return false;
			}
						i++;
		}
		return true;
	}
	}

