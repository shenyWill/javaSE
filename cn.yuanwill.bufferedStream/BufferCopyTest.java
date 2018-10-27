package cn.yuanwill.bufferedStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferCopyTest {

	public static void main(String[] args) throws IOException {
		File inputfile = new File("C:\\Users\\shenyuan\\Desktop\\test\\test1.txt");
		FileReader fr = new FileReader(inputfile);
		BufferedReader br = new BufferedReader(fr);
		
		File outputfile = new File("C:\\Users\\shenyuan\\Desktop\\test\\test3.txt");
		FileWriter fw = new FileWriter(outputfile);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String textLine = null;
		while((textLine = br.readLine()) != null) {
			bw.write(textLine);
			bw.newLine();
			bw.flush();
		}
		br.close();
		bw.close();
	}

}
