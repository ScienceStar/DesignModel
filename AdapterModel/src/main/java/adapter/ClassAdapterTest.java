package adapter;

import inter.Target;
import inter.impl.ClassAdapter;

public class ClassAdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("类适配器模式测试......");
		Target target = new ClassAdapter();
		target.request();
	}

}
