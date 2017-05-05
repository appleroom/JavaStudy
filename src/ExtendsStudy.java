public class ExtendsStudy {
	public static void main(String args[]){
		animal();
	}

	public static void animal(){
		Dog inu = new Dog();
		Human hito = new Human();


		inu.bark();
		hito.myNameIs();

		System.out.println("inu 元気:" + inu.genki);
		System.out.println("hito 元気:" + hito.genki);

		inu.sleep();
		System.out.println("inu 元気:" + inu.genki);
		System.out.println("hito 元気:" + hito.genki);


		System.out.println("inu 位置:" + inu.position);
		System.out.println("hito 位置:" + hito.position);
		inu.move();
		hito.move();
		System.out.println("inu 位置:" + inu.position);
		System.out.println("hito 位置:" + hito.position);


		hito.whereAreYou();
	}
}
