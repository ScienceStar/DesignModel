package inter.impl;

import inter.ITwoWayAdapter;
import inter.ITwoWayTarget;

public class TwoWayAdapter implements ITwoWayAdapter, ITwoWayTarget {
	
	private ITwoWayTarget target;
    private ITwoWayAdapter adapter;
    public TwoWayAdapter(ITwoWayTarget target)
    {
        this.target=target;
    }
    public TwoWayAdapter(ITwoWayAdapter adapter)
    {
        this.adapter=adapter;
    }
    
	@Override
	public void request() {
		// TODO Auto-generated method stub
		adapter.specificRequest();
	}

	@Override
	public void specificRequest() {
		// TODO Auto-generated method stub
		target.request();
	}

}
