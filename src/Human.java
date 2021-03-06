
public class Human extends Animal{
	String name;
	int age;

	/*
	 * コンストラクタ
	 * Class名と同じ
	 * 返り値が表記されてない(void すら書いてない)
	 */
	public Human(String name, int age){
		this.name = name;
		this.age = age;
	}

	/*
	 * これもコンストラクタ
	 */
	public Human(){
		this("sato", 5);
	}

	/*
	 * これはコンストラクタではない
	 */
	public String Human(String name, int age){
		this.name = name;
		this.age = age;

		return "ok";
	}

	public void move(){
		super.position += 15;
	}

	public void whereAreYou(){
		System.out.println("私は" + super.position + "にいます");
	}

	public void myNameIs(){
		System.out.println("my name is " + this.name);
	}

	public void birthDay(){
		this.age++;
	}

	public void whatYourName(){
		System.out.println(this.name + ":" + this.age);
	}
}