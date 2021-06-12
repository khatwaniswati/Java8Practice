package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class ExceptionInStreams {
	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(0,1,2,3,4,5);
		int key=0;
		
		/*
		 * List<Integer> collect = lst.stream() .map(i->i/key)
		 * .collect(Collectors.toList()); System.out.println(collect);
		 */
		
		
		process(lst,key, wrapperLambda((v,k)->System.out.println(v/k)));
	}

	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (v,k)->{
			try {
				consumer.accept(v, k);
			}catch (ArithmeticException e) {
				System.out.println("Divide By Zero Exception");
			}
		};
	}

	private static void process(List<Integer> lst, int key, BiConsumer<Integer, Integer> consumer) {
		lst.forEach(i->consumer.accept(i, key));
	}

}