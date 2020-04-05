package basics;

public class BiggestAmongThreeNum2 {
public static void main(String[] args) {
	
int x=78,y=98,z=76;
if(x>y && x>z)
	System.out.println(x+" is biggest");
else if(y>z)
	System.out.println(y+" is biggest");
else
	System.out.println(z+" is biggest");
}
}
