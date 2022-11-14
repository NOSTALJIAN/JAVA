package together.ch08;

public class Q03_Main {
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
		}

	private static void printSound(Q03_Soundable soundable) {
	System.out.println(soundable.sound());
	}
}
class Dog implements Q03_Soundable {
public String sound() {
	return "멍멍";
		}
}
class Cat implements Q03_Soundable {
public String sound() {
	return "야옹";
	}
}
