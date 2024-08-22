package week1;

//CLASS_METHOD_OBJECT

public class Students {
	public void writingExam() {
		System.out.println("Writing Exam");
	}

	public void playingGames() {
		System.out.println("Playing Games");
	}

	public void eatingLunch() {
		System.out.println("Eating Lunch");
	}

	public static void main(String[] args) {
		Students obj = new Students();
		obj.writingExam();
		obj.playingGames();
		obj.eatingLunch();

	}
}