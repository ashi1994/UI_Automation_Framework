package com.testcase.all;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class BarcodeAutomate {
	public static void main(String...s) throws Exception{
		
	
	String code = "";
	//String imgPath = "/Users/ashiwani.ranjan/Downloads/qrcode.jpg";
	String imgPath = System.getProperty("user.dir")+"/src/test/resources/barcode.gif";

	//Create instance of Reader
	Reader reader = new MultiFormatReader();

	// Pass the image a parameter, which converts the image into binary bitmap
	InputStream barCodeIS = new FileInputStream(imgPath);
	BufferedImage buffImage = ImageIO.read(barCodeIS);

	LuminanceSource lsrc = new BufferedImageLuminanceSource(buffImage);
	BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(lsrc));

	// Reader decodes the bitmap & extract the data
	Result result = reader.decode(bitmap);

	code = result.getText();
	System.out.println("Image Barcode / QR Code : " + code);
	
	


}
}