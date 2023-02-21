package ch08.unit10;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Ex02 {
	public static void main(String[] args) {
		TestService ts = new TestService();
		ts.execute();
	}
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME) // 애노테이션 유지 시간
@interface MyAnno{
}

class TestService{
	@MyAnno
	public void execute() {
		System.out.println("애노테이션...");
	}
}