package Javaprograms;

public class Adding_array_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5};
int x[]= new int[a.length];

int result[]=new int[x.length];
for(int i=0;i<a.length;i++) {
	
	x[i]=a[a.length-1-i];
	//System.out.println(x[i]);
	
}

for(int i=0;i<x.length;i++) {
	
	result[i]=x[i]+a[i];
	System.out.println(result[i]);
}
	}

}
