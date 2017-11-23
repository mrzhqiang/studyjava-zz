import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java . util . * ;
public class CoreJava3_7 {
	public static void main (String[]args ) throws IOException{
		//Scanner in = new Scanner (System.in) ;
		/*System.out.print ( " wo bu ai ni la? " ) ;
		String Doubi = in.nextLine();
		System.out.println(Doubi);
		String Erbi = in.next();
		System.out.println(Erbi);
		System.out.println(Doubi);
		double age = in.nextDouble();*/
		/*double x = 100000.0;
		System.out.println(x);*/
		//Scanner in1 = new Scanner(Paths.get("myfile.txt"),"UTF-8");
		PrintWriter out = new PrintWriter("myfile.txt","UTF-8");
		out.println("mrzhqiang");
		out.flush();
		out.close();
		System.out.println("kansita");
		//String dir = System.getProperty("user.dir");
		//System.out.println(dir);
	}
	public static void show(Object ob) {
		System.out.println(ob);
	}
	}

