package ua.lviv.lgs;

public class FrogApplication {
	public static void main(String[] args) {
		
		FrogsLive eat = (Amphybia amphybia) -> amphybia.eat();
		FrogsLive wolk = (Amphybia amphybia) -> amphybia.wolk();
		FrogsLive sleep = (Amphybia amphybia) -> amphybia.sleep();
		FrogsLive sweem = (Amphybia amphybia) -> amphybia.sweem();
		
		Frog frog = new Frog();
		eat.frogDoes(frog);
		wolk.frogDoes(frog);
		sleep.frogDoes(frog);
		sweem.frogDoes(frog);
		
		
		
	}

}
interface FrogsLive{
	void frogDoes(Amphybia amphybia);
}
