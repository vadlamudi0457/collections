package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		List<Character> characters = List.of('A','Z','A','B','Z','U');
		
		Set<Character> treeSet = new TreeSet<>(characters);
		System.out.println("TreeSet: "+treeSet);

		Set<Character> hashSet = new HashSet<>(characters);
		System.out.println("HashSet: "+hashSet);
		
		Set<Character> linkedhashSet = new LinkedHashSet<>(characters);
		System.out.println("LinkedhashSet: "+linkedhashSet);
	}

}
