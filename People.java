 class People{
	 private int age;
	 private String name;
	 public void setAge(int age){
		 this.age = age;
	 }
	 public int getAge(){
		 return age;
	 }
	 public void setName(String name){
		 this.name = name;
	 }
	 public String getName(){
		 return name;
	 }
	 public People(){}
	 public People(int age , String name){
		 this.age = age;
		 this.name = name;
	 }
	 public String toString(){
		 return "Hello,My name is"+name+",I am "+ age + " years old.";
	 }
 }