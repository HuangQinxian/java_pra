package 自定义注解类;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*
 * 用@Retention(RetentionPolicy.CLASS)修饰的注解，表示注解的信息被保留在class文件(字节码文件)中当程序编译时，但不会被虚拟机读取在运行的时候；
 * 用@Retention(RetentionPolicy.SOURCE )修饰的注解,表示注解的信息会被编译器抛弃，不会留在class文件中，注解的信息只会留在源文件中；
 * 用@Retention(RetentionPolicy.RUNTIME )修饰的注解，表示注解的信息被保留在class文件(字节码文件)中当程序编译时，会被虚拟机保留在运行时，
 */

//如果沒有使用@Retention(RetentionPolicy.RUNTIME),自定义注解不会保存到class文件中,即反射时不会获取到此注解信息。
@Retention(RetentionPolicy.RUNTIME)  
public @interface MyAnnotation {
	String value() default "hello world";
	int[] num();
}
