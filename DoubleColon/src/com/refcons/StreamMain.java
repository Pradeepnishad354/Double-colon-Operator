package com.refcons;

import java.util.List;

public class StreamMain {
	
	public static void main(String[] args) {
		
		
List<Integer> integer=	List.of(11,22,33,55,66,88);	
System.out.println(integer);

//integer.stream().forEach(e->{
//	System.out.println(e);
//});
		
//using method reference 

integer.stream().forEach(System.out::println);
	}

}
