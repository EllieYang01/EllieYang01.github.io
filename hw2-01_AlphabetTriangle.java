public class AlphabetTriangle
{
	public static void main(String[] args) {
		char alphabet = ' ';
		int line = 6;
		
		for (int i = 1; i <= line; i++) {
			switch (i) {
				case 1:
					alphabet = 'A';
					break;
				case 2:
					alphabet = 'B';
					break;
				case 3:
					alphabet = 'C';
					break;
				case 4:
					alphabet = 'D';
					break;
				case 5:
					alphabet = 'E';
					break;
				case 6:
					alphabet = 'F';
					break;
			}
			
			for (int print_num = 0; print_num <= i; print_num++) {
	    			if(print_num < i) {
	    				System.out.print(alphabet);
	    			}else if(print_num == i){
	    			    System.out.println("");
	    			}
			}
		}
	}
}
