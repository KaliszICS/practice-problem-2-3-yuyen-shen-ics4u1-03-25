
class Notes {
	public static void main(String[] args) {

		//Bubble sort

		int numArray[] = {54, 5, 8, 2, 54, 78, 1, 0, 54};
		boolean swapped = true;

		for (int i = 0; i < numArray.length - 1 && swapped; i++ ) {
			swapped = false;
			for (int j = 0; j < numArray.length - 1 - i; j++)  {
				if (numArray[j] > numArray[j+1]) {
					//swap
					int temp = numArray[j];
					numArray[j] = numArray[j + 1];
					numArray[j + 1] = temp;
					swapped = true;
				}
			}
		}

	
		for (int i = 0; i < numArray.length; i++) {
			System.out.print(numArray[i] + " ");
		}


		
		
		// for (int i = 1; i < numArray.length; i++) {//how many elements at the end of the array the code ignores
		// 	boolean sorted = true;
		// 	for (int j = 0; j < numArray.length - i; j++) { //loops the unsorted section of the array
				
		// 		//When we swap
		// 		if (numArray[j] > numArray[j+1]) {
		// 			//Swap the two elements
		// 			int temp;
		// 			temp = numArray[j];
		// 			numArray[j] = numArray[j+1];
		// 			numArray[j+1] = temp;
		// 			//change sorted to false becuase we swapped
		// 			sorted = false;
		// 		}
		// 	} 
		// 	//optimization to stop when it is sorted
		// 	if (sorted) {
		// 		break;
		// 	}
		// }

		// for (int i = 0; i < numArray.length; i++) {
		// 	System.out.print(numArray[i] + " ");
		// }
		
	}
}
