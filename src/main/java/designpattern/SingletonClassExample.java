package designpattern;

public class SingletonClassExample {

	public static volatile SingletonClassExample sce;
	private SingletonClassExample() {} // it is an example of singleton design pattern once you have created 
	// private consturctor it is achieved
	public static SingletonClassExample getExample() {
		return sce;
	}
}
