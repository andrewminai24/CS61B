class Animal{
	public static void main(String[] args){
		Walrus walrus = new Walrus(3500,10.5);
		int x = 9;
		doStuff(walrus,x);
		System.out.println(walrus);
		System.out.println(x);
	}
	public static void doStuff(walrus W,int x){
		W.weight = W.weight - 100;
		x = x  - 5;
	}
