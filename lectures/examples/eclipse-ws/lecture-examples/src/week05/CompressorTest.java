package week05;

public class CompressorTest {

	public static void main(String[] args) {
		String s = "aabbbbbcdddeeeeeeffff";
		String c = Compressor.compress(s);
		System.out.println("Compressed: " + c);
		String d = Compressor.decompress(c);
		System.out.println("Decompressed: " + d);
		
	}

}
