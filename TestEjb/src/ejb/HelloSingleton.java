package ejb;

@javax.ejb.Singleton
public class HelloSingleton {
	
	public String getHello() {
		return "Hello from Singleton : "+this.hashCode();
	}
} 
