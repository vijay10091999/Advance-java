package comj.java8;

class Message{
	Message(String m){
		System.out.println("Motivational msg = "+m);
	}
}

interface message1{
	public Message msg(String m);

}
class Messageimp1 implements message1{

	@Override
	public Message msg(String m) {
		return new Message(m);
	}
	
}
public class ConstructorReference {

	public static void main(String[] args) {
		Messageimp1 m = new Messageimp1();
		m.msg("Work hrad");
		
		message1 m1= Message::new;
		m.msg("Hard work");
	}

}
