package inter.impl;

import inter.ITwoWayAdapter;

public class AdapteeRealize implements ITwoWayAdapter {

	@Override
	public void specificRequest() {
		// TODO Auto-generated method stub
		System.out.println("适配者代码被调用。。。。。");
	}

}
