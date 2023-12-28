package practice;

public class Person1 {
	String name;
	int age;
	String gender;

	public Person1(String n, int a) {
		name = n;
		age= a;
		
	}
	public Person1(String n, int a, String g) {
		name = n;
		age = a;
		gender = g;
	}

	public static void main(String[] args) {
		Person1 p1 = new Person1("Rohit" , 12);
		Person1 p2 = new Person1("ritesh", 123, "male");
		System.out.println(p2.name + " " + p2.age+" "+p2.gender);
		System.out.println(p1.name+" "+p1.age);
		// TODO Auto-generated method stub

	}

}
