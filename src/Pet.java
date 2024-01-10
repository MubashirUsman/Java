
public class Pet {
	
	double height;
	int age;
	String name;
	
	
	public void nameHeight(Pet anyPet) {
		System.out.println("Pet name: " + anyPet.name + " and height: " + anyPet.height );
	}
	
	public void nameAge(Pet anyPet) {
		System.out.println("Pet name: " + anyPet.name + " and age: " + anyPet.age );
	}
	
	public static boolean isFriendly() {
		
		return true;
	}
	
	
	public static void main(String[] args) {
		Pet cat = new Pet();
		cat.height = 20.5;
		cat.age = 2;
		cat.name = "White cat";
		
		cat.nameHeight(cat);
		
		}

}