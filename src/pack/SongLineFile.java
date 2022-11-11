package pack;
import java.io.File;
public class SongLineFile {

	public static void main(String[] args) {
		File file1 = new File("src/pack/SongLyric.txt");  
		File file2 = new File("src/pack/SongLyric Copy.txt");  
		System.out.println(file1.length());
		System.out.println(file2.length());
		System.out.println("File 2 is %" + file2.length()/file1.length() + " Larger than file1, File2 was made with MS Word and file1 was made with eclipse");

	}

}
