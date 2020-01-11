package com.rakuten.prj.dao;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdaxample {
	public static void main(String args[]) {
		Function<Integer, Double> f1 = new Function<Integer, Double>() { // anonmyous class

			@Override
			public Double apply(Integer t) {

				return t / 2.0;
			}

		};
		System.out.println(f1.apply(5));

		Function<Integer, Double> f2 = (Integer t) -> {

			return t / 2.0;
		};
		System.out.println(f2.apply(6));

		Function<Integer, Double> f3 = t -> t / 2.0; //lambda

		System.out.println(f3.apply(8));

		BiFunction<Integer, Integer, Double> s1 = new BiFunction<Integer, Integer, Double>() { // anonmyous class

			@Override
			public Double apply(Integer a, Integer b) {

				return (double) (a + b);
			}

		};
		System.out.println(s1.apply(4, 5));

		BiFunction<Integer, Integer, Double> s2 = (Integer a, Integer b) -> {

			return (double) (a * b);
		};
		System.out.println(s2.apply(4, 5));
		BiFunction<Integer, Integer, Double> s3=(a,b)-> (double) a*b; //lambda
		System.out.println(s3.apply(3, 2));
		

	}
}