import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JSortStars {
	private static ArrayList<Star> listStars  = null;

	private static void readFile(String filename) {
		listStars = new ArrayList<Star>();
		try {
			FileReader fileReader = new FileReader(new File(filename));
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] parts = line.split(":");
				listStars.add(new Star(parts[0], Double.parseDouble(parts[1])));
			}
			fileReader.close();			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

	public static void print(String sFirstLine, int nNumbers) {
		System.out.println(sFirstLine);
		for (int i = 0; i < nNumbers; i++)
			listStars.get(i).print();
	}

	public static void main(String[] args) {
		readFile("Data_Stars.txt");
		print("Before Sorting", 10);
		Collections.sort(listStars, new StarComparator());
		print("After Sorting", 10);
	}
}

class StarComparator implements Comparator<Star> {
    public int compare(Star a, Star b) {
        return a.distance < b.distance ? -1 : a.distance == b.distance ? 0 : 1;
    }
}

class Star {
    String name;
    double distance;

    Star(String n, double d) {
        name		= n;
        distance	= d;
    }

    public void print() {
		System.out.println(name+" : "+distance);
    }
}
