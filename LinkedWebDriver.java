import java.io.*;
import java.util.*;
// written by kyra lee 2019
public class LinkedWebDriver
{
   public static void main (String [] args) throws IOException
   {
      Scanner in = new Scanner (System.in);
      Container x = new Container();
      Map<String, ArrayList<String>> theCountries = new HashMap();
      ArrayList<String []> temp = new ArrayList();
      temp = x.readFile("RiskMap.txt");
      theCountries = x.setNeighbors(temp);
      System.out.println("Which countries do you want to check are neighbors?\nCountry 1: ");
      String country1 = in.nextLine();
      System.out.println("Country 2: ");
      String country2 = in.nextLine();
      if(x.isNeighbors(country1.toUpperCase(), country2.toUpperCase()))
         System.out.println("yes");
      else
         System.out.println("no");
      
      System.out.println("Whose neighbors do you want? ");
      String neighborCheck = in.nextLine();
      String neighbors = x.getNeighbors(neighborCheck.toUpperCase()); // ALASKA: KAMCHATKA, NORTH-WEST-TERRITORY, ALBERTA
      System.out.println(neighborCheck+"'s neighbors: " + neighbors);
   }
}


