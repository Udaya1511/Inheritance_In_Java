package Inheritence;

public class Child_Class extends Base_Class {
	
	public void multiple() {
		
		System.out.println("multiplication is 300");
	}
	
	public void add() {
		System.out.println("addition is 150");

	}
	
	public static void main(String[] args) {
		Base_Class obj = new Child_Class();
		
		obj.add();
		obj.sub();
		
		
		System.out.println("===============");
		
		Base_Class obj1 = new Base_Class();
		
		
		
		obj1.add();
		obj1.sub();
	}

}
