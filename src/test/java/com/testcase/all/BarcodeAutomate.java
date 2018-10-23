package com.testcase.all;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class BarcodeAutomate {
	public static void main(String...s) throws Exception{
		
    	System.setProperty("webdriver.chrome.driver","/Users/ashiwani.ranjan/Downloads/chromedriver");
    	WebDriver dr=new ChromeDriver();
    	dr.get("https://barcode.tec-it.com/en");
    	String bcode=dr.findElement(By.tagName("img")).getAttribute("src");
    	URL url=new URL(bcode);
    	BufferedImage buffImage=ImageIO.read(url);
    	LuminanceSource lsrc = new BufferedImageLuminanceSource(buffImage);
    	BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(lsrc));
    	Reader reader = new MultiFormatReader();
    	Result result = reader.decode(bitmap);
    	System.out.println(result.getText());
    	dr.close();


		
	
//	String code = "";
//	//String imgPath = "/Users/ashiwani.ranjan/Downloads/qrcode.jpg";
//	String imgPath = System.getProperty("user.dir")+"/src/test/resources/barcode.gif";
//	InputStream barCodeIS = new FileInputStream(imgPath);
//	BufferedImage buffImage = ImageIO.read(barCodeIS);
//   	Reader reader = new MultiFormatReader();
//	LuminanceSource lsrc = new BufferedImageLuminanceSource(buffImage);
//	BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(lsrc));
//	Result result = reader.decode(bitmap);s
//	code = result.getText();
//	System.out.println("Image Barcode / QR Code : " + code);
	
	


}
}