package com.java.upcastingnDowncasting;
class P
{
	void show(){
		System.out.println("P Show");
	}
	void add(int x, int y){
		System.out.println("P Add "+(x+y));
	}
}
class Q extends P
{
	@Override
	void show(){
		System.out.println("Q Show");
	}
	void add(int x, int y){
		System.out.println("Q Add1 "+(x+y));
	}
	void add(int x, int y , int z){
		System.out.println("Q Add2 "+(x+y+z));
	}
}
class K extends P
{
	void show(int x){
		System.out.println("K Show");
	}
	void disp(){
		System.out.println("K Disp");
	}
}

public class TestUpcastDowncast {
	void PFamily(P obj){
		obj.show();
		obj.add(10,20);
		if(obj instanceof K){
			K k = (K)obj;
			k.disp();
					
		}
		if(obj instanceof Q)
		{
			Q q = (Q) obj;
			q.add(1,2,3);
			
		}
	}

	public static void main(String[] args) {
		TestUpcastDowncast obj = new TestUpcastDowncast();
		obj.PFamily(new P());
		obj.PFamily(new Q());
		obj.PFamily(new K());
		

	}

}
