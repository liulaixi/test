import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.regex.Pattern;

import org.apache.commons.codec.binary.Base64;
import org.mvel2.MVEL;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//
//		File u8 = new File("C:\\Users\\ausus\\Desktop\\utf-8.txt");
//		File ub = new File("C:\\Users\\ausus\\Desktop\\unicode-be.txt");
//		File u = new File("C:\\Users\\ausus\\Desktop\\unicode.txt");
//		File a = new File("C:\\Users\\ausus\\Desktop\\ansi.txt");
//		try {
//			FileInputStream u8fis = new FileInputStream(u8);
//			FileInputStream ubfis = new FileInputStream(ub);
//			FileInputStream ufis = new FileInputStream(u);
//			FileInputStream afis = new FileInputStream(a);
//			byte[] b = new byte[8];
//			while(u8fis.read(b)!=-1){
//				
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		String macs = "54:52:00:20:8E:82";
//		macs = macs.replace("-", "");
//		macs = macs.replace(":", "");
//		macs = MD5(macs);
//		String key = macs.substring(0,8)+"-" +macs.substring(8,16)+"-" +macs.substring(16,24)+"-"+macs.substring(24,32);
//		System.out.println(key);
//		
//		//反射静态方法
//		try {
//			Class t = Class.forName("laixi.Test");
//			Method m = t.getMethod("printStatic");
//			m.invoke(null);
//			
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}catch (NoSuchMethodException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}catch (InvocationTargetException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}catch (IllegalAccessException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		//反射非静态方法
//		
//		try {
//			Class t = Class.forName("laixi.Test");
//			Object o = t.newInstance();
//			Method m = t.getMethod("print");
//			m.invoke(o);
//			
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}catch (NoSuchMethodException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}catch (InvocationTargetException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}catch (IllegalAccessException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}catch (InstantiationException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		
//		String str = "dddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddaddadd";
//		boolean flag = isCharNum(str);
//		System.out.println(flag);
		
//		String filename = "ise.fjls.efk.jpg";
//		String extendName = filename.substring(filename.lastIndexOf("."),filename.length());
//		//缩略图路径
//		System.out.println(extendName);
//		try {
//			byte[] byte1 = Base64.decodeBase64("dGhpc2lzdGVzdA==".getBytes("UTF-8"));
//			System.out.println(new String(byte1,"UTF-8"));
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Integer aa = new Integer(0);
//		System.out.println(aa.toString());
		bean bean = new bean();
		
		bean.setA("111");
		bean.setB(3);
		
		Object pk = MVEL.getProperty("a",
				bean);
		System.out.println(pk.toString());
		MVEL.setProperty(bean, "a", 222);
		
		System.out.println(bean.getA());
	}
	
	public static boolean isCharNum(String str){

	    Pattern pattern = Pattern.compile("^[A-Za-z0-9]{3,512}");

	    return pattern.matcher(str).matches();   

	} 
	
	public static String MD5(String s) {
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'A', 'B', 'C', 'D', 'E', 'F' };
		try {
			byte[] strTemp = s.getBytes();
			MessageDigest mdTemp = MessageDigest.getInstance("MD5");
			mdTemp.update(strTemp);
			byte[] md = mdTemp.digest();
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(str);
		} catch (Exception e) {
			return null;
		}
	}

}
