package designpattern;

public class SingleTomAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonClassExample sc=SingletonClassExample.getInstance();
		System.out.println(sc);
		SingletonClassExample sc1=SingletonClassExample.getInstance();
		System.out.println(sc1);
	}

}
