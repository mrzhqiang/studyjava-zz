package zq_master_8_1_3;

public class Test {

	public static void main(String[] args) {
		ImageSaver gif = new GIFSaver();
		gif.save();
		ImageSaver jpg = new JPEGSaver();
		jpg.save();
		ImageSaver png = new PNGSaver();
		png.save();
	}
}
