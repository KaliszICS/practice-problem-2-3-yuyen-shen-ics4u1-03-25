
class Notes {
	public static void main(String[] args) {

		//Bubble sort

		int numArray[] = {54, 5, 8, 2, 54, 78, 1, 0, 54};

		for (int j = 1; j < numArray.length; j++)  {
			boolean sorted = true;
			for (int i = 0; i < numArray.length - j; i++) {
				if (numArray[i] > numArray[i + 1]) {
					//swap
					//change a boolean
					sorted = false;
					int temp = numArray[i];
					numArray[i] = numArray[i + 1];
					numArray[i + 1] = temp;
				}
			}
			if (sorted) { //stops the loop if no swaps were made
				j = numArray.length;
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
