import java.util.*;
public class max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int m=0,x=0;
for(int i=0;i<10;i++) {
	m=sc.nextInt();
	if(m>x)
		x=m;
}
System.out.println(x);
	}

}
