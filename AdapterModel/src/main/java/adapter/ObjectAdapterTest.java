package adapter;

import inter.Target;
import inter.impl.ObjectAdapter;

public class ObjectAdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("对象适配器模式测试:");
		Adapter adapter = new Adapter();
		Target target = new ObjectAdapter(adapter);
		target.request();
	}

}
