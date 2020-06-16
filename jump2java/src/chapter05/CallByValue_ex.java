package chapter05;

class Updater{
	//변수
	public void update(int count){
		count++;
	}
	
	//객체
	public void update(CallByValue_ex counter){
		counter.count++;
	}
}

public class CallByValue_ex {

	int count = 0;
	
	public static void main(String[] args) {
		
		CallByValue_ex myCounter = new CallByValue_ex();
		System.out.println("before update : " + myCounter.count);
		
		Updater myUpdater = new Updater();
		//myUpdater.update(myCounter.count);		//변수로 넘기면. 작동안함
		myUpdater.update(myCounter);		//객체로 넘기면. 작동함
		System.out.println("after update : " + myCounter.count);

	}

}
