package Client;
import remote.RemoteTypeOne;
import remote.RemoteTypeTwo;
import tv.TV;
import tv.SonyTV;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	TV sonyTVRemoteOne = new SonyTV(new RemoteTypeOne());
	sonyTVRemoteOne.on();
	sonyTVRemoteOne.off();
	System.out.println();
	
	TV sonyTVRemoteTwo = new SonyTV(new RemoteTypeTwo());
	sonyTVRemoteTwo.on();
	sonyTVRemoteTwo.off();
	System.out.println();
	
	}

}
