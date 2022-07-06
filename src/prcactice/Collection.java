package prcactice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Collection {
	
	public static void main(String[] args) {
		List<Integer>l=new ArrayList<>();
		l.add(23);
		l.add(213);
		l.add(323);
		l.add(423);
		l.add(238);
		System.out.println(l);
		l.remove(0);
		System.out.println(l);
		List<Integer> c = l.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(c);
		 Integer reduce = l.stream().reduce(0,(e1,e2)->e1+e2);
		System.out.println(reduce);
		Optional<Integer> reduce2 = l.stream().reduce((e1,e2)->e1+e2);
		System.out.println(reduce2.get());
		
		System.out.println(l.isEmpty());
		boolean contains = l.contains(213);
		System.out.println(contains);
	
	}

}
