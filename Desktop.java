package week3.day1;

public class Desktop extends Computer {
	
	public void desktopSize(){
		System.out.println("This is desktopSize");
	}
	public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.desktopSize();
		desk.computerMethod();
	}

}
