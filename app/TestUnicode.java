import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.grammar.v3.ANTLRv3Parser.finallyClause_return;
import org.dom4j.Branch;


public class TestUnicode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//String test = "&#26519;&#34949;&#34949;&#29978;&#33267;&#25925;&#24847;&#35828;&#30340;&#38472;&#19971;&#27861;&#21147;&#19981;&#27982;&#65292;";
		//System.out.println(test);
		
		File file = new File("d:\\aa.txt");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			while ((line = br.readLine())!=null) {
				System.out.println(line);
				
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
		}
		
	}

}
