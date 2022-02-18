package designpattern;

public class SingletonClassExample {

	public static volatile SingletonClassExample sce=new SingletonClassExample();
	private SingletonClassExample() {} // it is an example of singleton design pattern once you have created 
	// private consturctor it is achieved
	// 2nd object can be created by using reflection (loop hole)
	public static SingletonClassExample getInstance() {
		return sce;
	}
}
