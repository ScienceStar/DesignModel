package inter.impl;

import adapter.Adapter;
import inter.Target;

public class ClassAdapter extends Adapter implements Target {

	@Override
	public void request() {
		// TODO Auto-generated method stub
		specificRequest();
	}

}
