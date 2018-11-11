import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

import org.testng.Assert;

public class Examples {
	
	public static void Example1()
	{
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Obj1");  
		al.add("Obj2");  
		al.add("obj3");  
		  
		for(String s:al){  
		 System.out.println(s);  
		}  
	}
	
	public static void Example1_int()
	{
		ArrayList<Integer> al=new ArrayList<Integer>();  
		al.add(1);  
		al.add(2);  
		al.add(4);  
		  
		for(Integer s:al){  
		 System.out.println(s);  
		}  
	}

	
	public static void Example2()
	{
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Obj1");  
		al.add("Obj2");  
		al.add("obj3");  
		al.add(1,"obj");  
		System.out.println("Element at 2nd position: "+al.get(2));  
		for(String s:al){  
		 System.out.println(s);  
		}  
	}

	public static void ListComparison()
	{
		Collection<String> listOne = new ArrayList(Arrays.asList("a","b", "c", "d", "e", "f", "g"));
	    Collection<String> listTwo = new ArrayList(Arrays.asList("a","b",  "d", "e", "f", "gg", "h"));


	    ArrayList<String> sourceList = new ArrayList<String>(listOne);
	    ArrayList<String> destinationList = new ArrayList<String>(listTwo);


	    sourceList.removeAll( listTwo );
	    destinationList.removeAll( listOne );



	    System.out.println( sourceList );
	    System.out.println( destinationList );
		
	}
	
	
	
	
	//ListComparison
	public static void Comparisonexample()
	{
		//web
		 ArrayList<String> sourceList1 = new ArrayList<String>();
		 sourceList1.add("1");
		 sourceList1.add("2");
		 sourceList1.add("3");
		 
		 //database data/excel/Text
		 ArrayList<String> sourceList2 = new ArrayList<String>();
		 sourceList2.add("1");
		 sourceList2.add("2");
		 sourceList2.add("3");
		 
		 //
		 if(sourceList1.equals(sourceList2))
		 {
			 System.out.println("**Matching**");
		 }
		 else
		 {
			 System.out.println("**Not Matching**");
			 Assert.fail("Not Matching");
		 }
		 
		 //
		 Assert.assertEquals(sourceList1, sourceList1);
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	

	public static  void setexample()
	{
		int count[] = {34, 22,10,60,30,22};
	      Set<Integer> set = new HashSet<Integer>();
	      try {
	         for(int i = 0; i < 5; i++) {
	            set.add(count[i]);
	         }
	         System.out.println(set);

	         TreeSet sortedSet = new TreeSet<Integer>(set);
	         System.out.println("The sorted list is:");
	         System.out.println(sortedSet);

	         System.out.println("The First element of the set is: "+ (Integer)sortedSet.first());
	         System.out.println("The last element of the set is: "+ (Integer)sortedSet.last());
	      }
	      catch(Exception e) {}
	}
	
	public static void SetBasic()
	{
		Set<String> names = new HashSet<>();
		names.add("Tom");
		names.add("Mary");
		names.add("Peter");
		names.add("Alice");
		 
		 
		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
		    String name = iterator.next();
		    System.out.println(name);
		}
		
		//enhanced loop
		for (String name : names) {
		    System.out.println(name);
		}
		
		//foreach
		names.forEach(System.out::println);
		
		//search
		if (names.contains("Mary")) {
		    System.out.println("Found Mary");
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Comparisonexample();
		Properties prop ;
		//final String filepath = "./Data.txt";
		
		File src=new File("./Data.properties");
		 
		// Create  FileInputStream object
		FileInputStream fis=new FileInputStream(src);
		 
		// Create Properties class object to read properties file
		Properties pro=new Properties();
		 
		// Load file so we can use into our script
		pro.load(fis);
		
		System.out.println("****"+pro.getProperty("url"));
		
		
		Comparisonexample();

	}

}
