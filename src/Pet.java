
public class Pet {
	
	private String name;
	private int age;
	private String location;
	private String type;
	
	public Pet() {
		
	}
	
	public Pet(String name, int age, String location, String type) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}

//		GET METHODS
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getType() {
		return type;
	}

	
//		SET METHODS
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

// TWO CONSTRUCTORS
		Pet myPet = new Pet("Ryan", 5, "Virginia","Rottweiler");
		Pet myPet2 = new Pet();

// GET METHODS
		String petName = myPet2.getName();
		int petAge = myPet2.getAge();
		String petBreed = myPet2.getType();
		System.out.println("My Second pet has not been given a name and is too young to identify the breed!!");
		System.out.println("Name: " + petName + "\nAge: " + petAge + "\nAnimal Type: " + petBreed);

// SET METHODS
	    myPet.setName("Zues");
	    myPet.setAge(15);
	    System.out.println("\nName: " + myPet.getName() + "\nAge: " + myPet.getAge() + 
	    					"\nAnimal Type: " + myPet2.getType());
	}
	
	
}
