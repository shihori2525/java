package classMethod;

public class Human04 {
	static public int humanCount = 0;
	public String name;
	
	public Human04(String name) {
		this.name = name;
		Human04.humanCount++;
	}
	
	static public void staticMethodPrint() {
		System.out.println("人の数は" + Human04.humanCount)
	}

}
