package adapter;

import inter.ITwoWayAdapter;
import inter.ITwoWayTarget;
import inter.impl.AdapteeRealize;
import inter.impl.TargetRealize;
import inter.impl.TwoWayAdapter;

public class TwoWayAdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("目标通过双向适配器访问适配者：");
        ITwoWayAdapter adapter=new AdapteeRealize();
        ITwoWayTarget target=new TwoWayAdapter(adapter);
        target.request();
        System.out.println("-------------------");
        System.out.println("适配者通过双向适配器访问目标：");
        target=new TargetRealize();
        adapter=new TwoWayAdapter(target);
        adapter.specificRequest();
	}

}
