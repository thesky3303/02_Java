package run;

import study.Monkey;
import study.Tiger;
import study.Zoo;

public class Run {
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		
		zoo.addAnimal(new Tiger("호랑이"));
		zoo.addAnimal(new Monkey("원숭이"));
		zoo.displayMenu();
	}
}
