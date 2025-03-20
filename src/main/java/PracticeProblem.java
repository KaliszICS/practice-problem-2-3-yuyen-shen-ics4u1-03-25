public class PracticeProblem {

	public static void main(String args[]) {
		bubbleSortString(new String[] {"A", "c", "d", "B"});

	}

	public static void bubbleSortString(String[] strings){
		boolean swap = true;
		for (int a = 0; a < strings.length - 1 && swap; a++){
			swap = false;
			for (int b = 0; b < strings.length - 1 - a; b++){
				if ((strings[b]).compareToIgnoreCase(strings[b+1]) > 0){
					String temp = strings[b];
					strings[b] = strings[b+1];
					strings[b+1] = temp;
					swap = true;
				}
			}
		}
		
	}

}
