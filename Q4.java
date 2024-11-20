public class Q4 {
	public static void main (String[] a){
		int x = Integer.parseInt(a[0]);
		String s = "";
		for (int i=0; i<x; i++)
		{
			for (int j= 0; j<i; j++)
				s+= "*";
			s+="\n";
		}
		System.out.print(s);
	}
}
