package inter.impl;

import inter.Subject;

public class Prox implements Subject {
	
	private RealSubject realSubject;

	@Override
	public void Request() {
		// TODO Auto-generated method stub
		if (realSubject==null)
        {
            realSubject=new RealSubject();
        }
        preRequest();
        realSubject.Request();
        postRequest();
	}
	 public void preRequest()
	    {
	        System.out.println("访问真实主题之前的预处理。");
	    }
	    public void postRequest()
	    {
	        System.out.println("访问真实主题之后的后续处理。");
	    }

}
