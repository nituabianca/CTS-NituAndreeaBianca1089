package singleton;

public class Singleton {

	private static Singleton instance=null;
	
	private Singleton() {
		//trb pus chiar daca e gol pt ca altfel eclipse il face automat public
	}
	
	public static synchronized Singleton getInstance()
	{
		if(instance==null)
		{
			instance=new Singleton();	
		}
		return instance;
	}
	
	
}
