public class SingeltonLanHan{
	public static void main(String[] args){
		Car car1 = Car.getInstance();
		Car car2 = Car.getInstance();
		if(car1 == car2){
			System.out.println("two instance is equal");
		}
		
	}
}
class Car{
	private Car(){}
	private static Car instance = null;
	public static Car getInstance(){
		if(instance == null){
			instance = new Car();
		}
		
	     return instance;
	}
}