import java.io.*;
import java.util.*;
// written by kyra lee 2019

public interface LinkedWeb
{	
  // public abstract String getCountryName(); 
   
   public abstract String getNeighbors(String country); // gets all countries that surround country
   
   public abstract ArrayList<String []> readFile(String fileName) throws IOException; // outputs lines of countries in arrays
   
   public abstract Map<String, ArrayList<String>> setNeighbors(ArrayList<String []> x); // sets neighbors 
}

