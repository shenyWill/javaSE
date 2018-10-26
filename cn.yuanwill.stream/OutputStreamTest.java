package cn.yuanwill.outputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamTest {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\shenyuan\\Desktop\\test\\test.txt");
		// 构造函数--》如果文件存在，直接覆盖，如果文件没有，创建一个该文件
		FileOutputStream fos = new FileOutputStream(file);
//		String s = "djasiodas";
//		byte[] b = new byte[s.length()];
//		for (int i = 0; i < s.length(); i++) {
//			b[i] = (byte) s.charAt(i);
//			System.out.println(b[i]);
//		}
//		byte[] b = {(byte) "hs".charAt(0),49,48};
		/*fos.write(49);
		fos.write(48);
		fos.write(48);*/
//		fos.write(b);
		fos.write("我爱你中国".getBytes());
		fos.close();
	}
}
