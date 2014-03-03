package com.bionic.javase.week4;

import java.nio.file.Path;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

//Написати консольне застосування, яке підраховує кількість слів у текстовому файлі та виводить на екран 
//частоти входжень кожного слова в порядку спадання частот. 
//Ім’я файлу має задаватися як аргумент командного рядка. Використати сортування колекції HashMap

public class WordsCounter {
	
	Map<String, Integer> map;
	String ls;
	
	public WordsCounter() {
		map = new TreeMap<>();
	}

	public void readFile(Path filePath) {
		
		String charsetName = "UTF-8";
		// Read a file
		BufferedFileIO<String> bufFile = new BufferedFileIO<String>(charsetName);
		
		ls = new String();
		
		ls = bufFile.readFile(filePath, ls);
	}
	
	public void inflateMap() {
		String[] sa = ls.replaceAll("^[,.-]", "").replaceAll("\\(", "").replaceAll("\\)", "").split(" ");
		for(String i : sa) {
			if(map.containsKey(i))
				map.put(i, map.get(i) + 1);
			else
				map.put(i, 1);
		}
	}
	
	public Map getSortedMap() {
		ValueComparator bvc =  new ValueComparator(map);
        TreeMap<String, Integer> sorted_map = new TreeMap<>(bvc);
        sorted_map.putAll(map);
        return sorted_map;
	}
}


class ValueComparator implements Comparator<String> {

    Map<String, Integer> base;
    public ValueComparator(Map<String, Integer> base) {
        this.base = base;
    }

    // Note: this comparator imposes orderings that are inconsistent with equals.    
    public int compare(String a, String b) {
        if (base.get(a) >= base.get(b)) {
            return 1;
        } else {
            return -1;
        } // returning 0 would merge keys
    }
}