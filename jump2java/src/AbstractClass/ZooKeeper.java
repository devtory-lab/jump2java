package AbstractClass;

public class ZooKeeper {
	
	void feed(Predator predator) {
		System.out.println("feed " + predator.getFood());
	}

	public static void main(String[] args) {
		ZooKeeper zooKeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		zooKeeper.feed(tiger);
		zooKeeper.feed(lion);

	}

}
