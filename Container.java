import java.io.*;
import java.util.*;

// written by kyra lee 2019

public class Container implements LinkedWeb
{
   Map<String, ArrayList<String>> map = new HashMap();

   public String getNeighbors(String country)
   {
      ArrayList<String> neighbors = map.get(country);
      String neighborList = "";
      for(int i = 0; i < neighbors.size(); i++)
      {
         neighborList += neighbors.get(i);
         neighborList += ", ";
      }
      return neighborList;
   }
      
   public ArrayList<String []> readFile(String fileName) throws IOException 
   {
      Scanner in = new Scanner(new FileReader(fileName));
      ArrayList<String []> countries = new ArrayList();
      while(in.hasNextLine())
      {
         String country = in.nextLine();
         if(!((country.substring(0, 0 +1)).equals("/")))
         {
            String[] counNeighbors = country.split(" ");
            countries.add(counNeighbors);
         }
      }
      in.close();
      return countries;
     
   }
   
   public Map<String, ArrayList<String>> setNeighbors(ArrayList<String []> x)
   {
      ArrayList<String> neighbors = new ArrayList();
   
      for(int i = 0; i < x.size(); i++) // go through arraylist of all countries/ neighbors
      {
         String [] specific = x.get(i); // gets specific line
          
         for(int z = 1; z < specific.length; z++)
         {
            neighbors.add(specific[z]); // get neighbors
         }
         map.put(specific[0], neighbors); // create key/ value
         neighbors = new ArrayList();
      }
      
      return map;
   }
   
   public boolean isNeighbors(String counA, String counB)
   {
      ArrayList<String> neigh = map.get(counA);
      for(int i = 0; i < neigh.size(); i++)
      {
         if(counB.equals(neigh.get(i)))
            return true;
      }
      return false;
   }
   
}



