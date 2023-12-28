package practice;

public class Students {
	String name;
	int age;
	String school;

	public Students(String n, int a, String s) {
		name = n;
		age = a;
		school = s;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Students ist = new Students("Rohit" ,23, "LPU");
		int z= ist.age;
		String y = ist.name;
		String x = ist.school;
		System.out.println(y+" "+z+ " "+ x);
		// TODO Auto-generated method stub

	}

}
