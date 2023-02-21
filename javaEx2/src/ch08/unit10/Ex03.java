package ch08.unit10;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class Ex03 {
	public static void main(String[] args) {
		Test3 obj = new Test3();
		obj.sub1();
		System.out.println();
		
		// Test3 클래스의 모든 메소드 정보
		Method[]mm =  Test3.class.getDeclaredMethods();
		
		for(Method m : mm) {
			//System.out.println(m.getName());
			
			// MyPrint 애노테이션이 적용된 메소드인지 확인
			if(m.isAnnotationPresent(MyPrint.class)) {
				
				// MyPrint 객체 가져오기
				MyPrint mp = m.getAnnotation(MyPrint.class);
				
				// 메소드 이름 출력
				System.out.println("["+ m.getName()+"]");
				
				// 구분선 출력
				for(int i=0; i<mp.number(); i++) {
					System.out.print(mp.value());
				}
				System.out.println();
				
				try {
					// 메소드 호출
					m.invoke(obj);
				} catch (Exception e) {
				}
			}
		}
		
		
		
	}
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyPrint{
	// 애노테이션 속성 설정
	public String value()  default "-";
	public int number() default 15;
}

class Test3{
	public void sub() {
		System.out.println("실행...");
	}
	
	@MyPrint
	public void sub1() {
		System.out.println("실행 1");
	}
	@MyPrint("*")
	public void sub2() {
		System.out.println("실행 2");
	}
	@MyPrint(value = "#", number =20)
	public void sub3() {
		System.out.println("실행 3");
	}
}