package examples;
import java.util.*;
import java.io.*;

public class SerialiseHashmap {

	public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(11, "AB");
        hmap.put(2, "CD");
        hmap.put(33, "EF");
        hmap.put(9, "GH");
        hmap.put(3, "IJ");	
        try {
        FileOutputStream fos = new FileOutputStream("hmap.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(hmap);
        oos.close();
        fos.close();
        System.out.println("serialized data is saved in hmap.ser");
        }catch(IOException ioe)
        {
        	ioe.printStackTrace();
        }

	}

}
