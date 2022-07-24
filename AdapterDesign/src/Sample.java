
public class Sample {
	
	//ignore this code. not related to Adapter design.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("string1");
		StringBuilder sbd = new StringBuilder("string2");
		Thr obj1 = new Thr();
		obj1.start();

	}

}

/*19
19-1 = 18
18
9
18 - 9 = 9
9 + 1 = 10
5
5
9 + 5 = 14
5
5 - 1 = 4
2 + 14 = 16
2 + 1 = 3
2 + 16 = 18*/

class Thr extends Thread {
	public void run() {
		
	}
}
