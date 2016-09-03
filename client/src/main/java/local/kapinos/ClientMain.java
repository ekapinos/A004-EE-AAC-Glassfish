package local.kapinos;

import javax.ejb.EJB;

public class ClientMain {

	@EJB
	private static TestBeanRemote testBeanRemote;
	
	public static void main(String[] args) {
		System.out.println(testBeanRemote.doSomething());
	}

}
