package local.kapinos;

import javax.ejb.Remote;

@Remote
public interface TestBeanRemote {
	String doSomething();
}
