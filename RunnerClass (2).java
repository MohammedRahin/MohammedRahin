import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class RunnerClass {
	File file = new File("output.txt");

	private List<WorkingWithFiles> p = new ArrayList<WorkingWithFiles>();
	private ArrayList<String> list = new ArrayList<String>();

	public static void main(String[] args) throws IOException {
		RunnerClass one = new RunnerClass();
		WorkingWithFiles a = new WorkingWithFiles("Rahin", "Student", 1);
		WorkingWithFiles b = new WorkingWithFiles("Ali", "Student", 1);
		WorkingWithFiles c = new WorkingWithFiles("Ben", "Student", 1);
		WorkingWithFiles d = new WorkingWithFiles("Jack", "Student", 1);
		WorkingWithFiles e = new WorkingWithFiles("Jhon", "Student", 1);

		one.p.add(a);
		one.p.add(b);
		one.p.add(c);
		one.p.add(d);
		one.p.add(e);
		one.readFile();
		
		File f = new File ("C:\\Users\\Administrator\\Desktop\\Sample.txt");
        if (!f.exists()) {
            f.createNewFile();
        }
        FileWriter fw = new FileWriter(f.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);

        for(WorkingWithFiles s : one.p) {
            bw.write(s + System.getProperty("line.separator")); 
        }
        bw.close();


	}
	public void readFile() {
	    String fileName = "Sample.txt";
	    String line;

	    try{
	        BufferedReader input = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\Sample.txt"));
	        if(!input.ready()){
	            throw new IOException();
	        }
	        while((line = input.readLine()) != null){
	        	list.add(line);
	        	
	        	
	        }
	        for (String item : list) { 
                System.out.println(item); 
             }
	        

	        input.close();
	    } catch(IOException e){
	        System.out.println(e);
	    }


	
	}
	

}
