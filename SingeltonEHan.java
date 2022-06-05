public class SingeltonEHan{
	public static void main(String[] args){
		Student s1 = Student.getInstance();
		Student s2 = Student.getInstance();
		if(s1 == s2){
			System.out.println("two instance is equal");
		}
		
	}

}
class Student{
	private Student(){}
	private static Student instance = new Student();
	public static Student getInstance(){
		return instance;
	}
}