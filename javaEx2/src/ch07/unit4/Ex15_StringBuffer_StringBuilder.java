package ch07.unit4;

public class Ex15_StringBuffer_StringBuilder {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		StringBuilder builder = new StringBuilder();
		
		new Thread(()-> {
			for(int i=0; i<10000; i++) {
				buffer.append(i);
				builder.append(i);
			}
		}).start();

		new Thread(()-> {
			for(int i=0; i<10000; i++) {
				buffer.append(i); // buffer는 왔다 갔다해도 안전, builder는 불안전.
				builder.append(i);
			}
		}).start();
		
		new Thread(()->{
			try {
				Thread.sleep(5000);
				
				System.out.println("StringBuffer length : "+ buffer.length());
				System.out.println("StringBuilder length : "+ builder.length());

			} catch (Exception e) {
			}
		}).start();
		
	}

}
