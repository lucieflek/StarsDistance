import java.util.*; 

class JGenericsExample
{
	static void myListWithoutGenerics() {
		ArrayList alist=new ArrayList();  
		//alist.add(25);
		alist.add("Mainz");
		alist.add("Wiesbaden");

		String s = (String) alist.get(0);
		System.out.println(s);
	}

	static void myListWithGenerics() {
		ArrayList<String> alist=new ArrayList<String>();  
		//alist.add(36);
		alist.add("Frankfurt");
		alist.add("Darmstadt");

		String s = alist.get(0);
		System.out.println(s);
	}
	
	public static void main(String[] args)
	{
		//myListWithoutGenerics();
		myListWithGenerics();
	}
}
