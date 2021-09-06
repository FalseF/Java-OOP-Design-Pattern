package OOP_Chain_Responsibility_Pattern;

public interface Chain {
	public void setNext(Chain nextChain);
	public void ServiceSupport(Service request);

}
