package edu.kh.io.pack2.run;

import edu.kh.io.pack2.model.service.ByteService;

public class ByteRun {
	public static void main(String[] args) {
		ByteService Service = new ByteService();
		//Service.fileByteOutput();
		//Service.bufferedFileByteOutput();
		//Service.fileByteInput();
		//Service.fileByteInput2();
		//Service.bufferedFileByteInput();
		Service.filecopy();
	}
}
