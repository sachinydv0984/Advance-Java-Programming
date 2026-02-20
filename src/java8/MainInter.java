package java8;

interface Message{
	void displayMsg();
	default void displayMsg(String msg) {
		System.out.println(msg);
	}
	static void diplayInfo() {
		System.out.println("This is display info");
	}
	private void msgInfo(String msg) {
		System.out.println(msg);
	}
}
class DisplayMessage implements Message{
	
	@Override
	public void displayMsg() {
		System.out.print("This is Mian Display method")
	}
	
}
	void msgInfo(String msg) {
	System.out.println("Message by DM class =" +msg);
	}
	
public class MainInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			DisplayMessage dm=new DisplayMessage();
			dm.displayMsg();
			dm.displayMsg("This is second method");
			Message.displayInfo();
	}

}
