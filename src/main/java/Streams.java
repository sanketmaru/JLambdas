package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
	
	public static void main(String ar[]){
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(4);
		list.add(10);
		
		Streams s = new Streams();
		int filter = s.filter(list);
		List<Integer> map = s.map(list);
	}
	
	/**
	 * Perform filter operation on ArrayList
	 * @param list
	 * @return transformed list after filter operation
	 */
	private int filter(List<Integer> list){
		
		List<Integer> filteredList = list.stream().filter(i -> i != null && i > 4).collect(Collectors.toList());
		return filteredList.size();
		
	}
	
	/**
	 * Perform map and sorted operation on ArrayList
	 * @param list
	 * @return transformed list
	 */
	private List<Integer> map(List<Integer> list){
		List<Integer> filteredList = list
				.stream()
				.filter(i -> i != null && i > 4)
				.map(i -> i + 5)
				.sorted()
				.collect(Collectors.toList());
		return filteredList;
	}

}
