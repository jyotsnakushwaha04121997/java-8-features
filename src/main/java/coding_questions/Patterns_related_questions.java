package coding_questions;

public class Patterns_related_questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sp=0;int st=5;
for(int i=1;i<=5;i++) {
	for(int j=0;j<sp;j++) {
			System.out.print(" ");
	}
	for(int j=0;j<st;j++) {
			System.out.print("*");
	}
	sp++;st--;System.out.println();
}
int stars=4;int spaces=0;
for(int i=1;i<=5;i++) {
	for(int j=0;j<stars;j++) {
			System.out.print(" ");
	}
	for(int j=0;j<spaces;j++) {
			System.out.print("*");
	}
	spaces++;stars--;System.out.println();
}
	}

}
