package tv;
import remote.Remote;
public class SonyTV extends TV{
  
	Remote remoteType;
	public SonyTV(Remote r)
	{
		super(r);
		this.remoteType=r;
	}
	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("Sony TV is On: ");
		remoteType.on();
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("Sony TV is Off: ");
		remoteType.off();
	}

}
