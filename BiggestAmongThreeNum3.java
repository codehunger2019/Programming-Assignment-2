package basics;

public class BiggestAmongThreeNum3 {
public static void main(String[] args) {
	int x=89,y=33,z=787;
	int big=(x>y && y>z)?x:(y>z)?y:z;
	System.out.println("Biggest is "+big);
}
}
