package designpattern;

public class SingletonClassExample {

	public static volatile SingletonClassExample sce;//=new SingletonClassExample();
	private SingletonClassExample() {
		if(sce!=null) {
			throw new RuntimeException("runtime exception getInstance()");
		}
	} // it is an example of singleton design pattern once you have created 
	// private consturctor it is achieved
	// 2nd object can be created by using reflection (loop hole)
	public static SingletonClassExample getInstance() {
		
		if(sce==null) {
			synchronized (SingletonClassExample.class) {
				if(sce==null)
				{
					sce=new SingletonClassExample();
				}
			}
			//sce=new SingletonClassExample();
		}
		return sce;
	}
}
