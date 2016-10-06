package util_package;

import java.util.Observable;
import java.util.Observer;

class watcher implements Observer
{
	@Override
	public void update(Observable arg0, Object arg1) 
	{
	   System.out.println("Update() method called "+((Integer)arg1).intValue());	
	}	
}

class watcher1 implements Observer
{

	@Override
	public void update(Observable arg0, Object arg1) 
	{
	   int myvalue=((Integer)arg1).intValue();
	   if(myvalue==0)
		   System.out.println("The Loop ends up you can try next time to start !!");
		
	}
	
}

class beingwatched extends Observable
{
	void counter(int period)
	{
		for(;period>=0;period--){
			setChanged();
			notifyObservers(new Integer(period));
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
}


public class observer 
{
	public static void main(String args[])
	{
		watcher mywatcher=new watcher();
		beingwatched beingwatch=new beingwatched();
		
		beingwatch.addObserver(mywatcher);
		beingwatch.addObserver(new watcher1());
		beingwatch.counter(10);
		
		
		
	}
	
}
