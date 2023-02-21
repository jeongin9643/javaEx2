package ch06.di;
/*
 Exception in thread "main" java.lang.NullPointerException: Cannot invoke "ch06.di.User.getList()" because "this.user" is null
	at javaEx2/ch06.di.UserResult.printAll(UserResult.java:7)
	at javaEx2/ch06.di.UserUI.print(UserUI.java:51)
	at javaEx2/ch06.di.UserUI.menu(UserUI.java:29)
	at javaEx2/ch06.di.App.main(App.java:6)
	
	nullpointer 객체가 null일 때 오류. 
 */
public class App {

	public static void main(String[] args) {
		new UserUI().menu();
	}

}
