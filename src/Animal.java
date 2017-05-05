
public class Animal {
	int genki = 0;
	int onaka = 0;
	int position = 0;

	public void eat(){
		this.onaka += 100;
	}

	public void move(){
		this.position += 10;
	}

	public void sleep(){
		this.genki += 100;
	}

}
