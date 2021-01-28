package ua.lviv.lgs;

public class ApplicationPet {
	public static void main(String[] args) {
		
		PetVoice cow = (Pet pet) -> System.out.println(pet.voice() + "I say Mu-Mu");
		PetVoice dog = (Pet pet) -> System.out.println(pet.voice() + "I say Gau-Gau");
		PetVoice cat = (Pet pet) -> System.out.println(pet.voice() + "I say Miu-Miu");

		cow.funvoice(new Cow());
		dog.funvoice(new Dog());
		cat.funvoice(new Cat());
						
	}	
}
interface PetVoice {
	void funvoice(Pet pet); 		
};