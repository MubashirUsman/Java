public class PetConstructor {
	
	double height;
	int age;
	String name;
	
	public PetConstructor(double whateverHeightis, int whateverAgeis) {
		this.height = whateverHeightis;
		this.age = whateverAgeis;
	}
	
	public void nameHeight(PetConstructor anyPet) {
		System.out.println("Pet name: " + anyPet.name + " and height: " + anyPet.height );
	}
	
	public void nameAge(PetConstructor anyPet) {
		System.out.println("Pet name: " + anyPet.name + " and age: " + anyPet.age );
	}
	
	public static boolean isFriendly() {
		
		return true;
	}
	
	
	public static void main(String[] args) {
		PetConstructor cat = new PetConstructor(20.5, 2);
//		cat.height = 20.5;
//		cat.age = 2;
		cat.name = "White cat";
		
		cat.nameHeight(cat);
		
		}
}