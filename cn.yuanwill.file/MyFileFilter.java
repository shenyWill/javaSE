package cn.yuanwill.file;

import java.io.File;
import java.io.FileFilter;

public class MyFileFilter implements FileFilter {

	@Override
	public boolean accept(File arg0) {
		if(arg0.getName().endsWith("xlsx")) {
			return false;
		} else {
			return true;
		}
	}

}
