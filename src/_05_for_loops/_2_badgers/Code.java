package _05_for_loops._2_badgers;

public class Code {
	public static void main(String[]args){

		for (int c = 0 ; c < 2 ; c = c +1) {



			for (int i = 0 ; i < 12 ; i = i +1) {
				System.out.print("Badger");
				if( i < 11) {
					System.out.print(", ");
				}
			}




			System.out.println();
			for (int b = 0 ; b < 2 ; b = b + 1) {
				System.out.print("Mushroom");
				if( b < 1) {
					System.out.print(", ");
			}}

			System.out.println();
			System.out.println();
		}
		System.out.println("A Snake!!");
	}
}






