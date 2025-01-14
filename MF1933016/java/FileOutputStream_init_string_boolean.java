﻿import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;

/**类名_方法名(_形参类型_形参类型)
 * @author: MG1933016 dingzhu
 * @className: FileOutputStream_init_string_boolean
 * @apiSignature: java.io.FileOutputStream$FileOutputStream(String name, 
                boolean append)
 * @description: Test java api java.io.FileOutputStream$FileOutputStream(String name, 
                boolean append)
 * @Map: OutputStream$init?(toFileAtPath path: String, append shouldAppend: Bool)
 */

public class FileOutputStream_init_string_boolean{
/**
     * input: 2
     * name name = "helloworld.txt"
     * append append = true
     * output: 1
     * ret0 FileOutputStream$ret0
     * File$file-File$File(String fileName)& String$fileName="wgx_test.txt" & https://www.geeksforgeeks.org/file-class-in-java/
     */
public static void init0(){
String name = "helloworld.txt";
File file = new File(name);
     try {
	 String str = "helloworld";
	 Boolean append = true;
         FileOutputStream ret0 = new FileOutputStream(name,append);
	 ret0.write(str.getBytes());
	 FileInputStream input = new FileInputStream(file);
         int iAvail = input.available();
         byte[] bytes = new byte[iAvail];
         input.read(bytes);
         str =  new String(bytes);
         assert (str.equals("helloworld"));
         System.out.println(str);
     }catch (FileNotFoundException e){
         e.printStackTrace();
     }catch (IOException e) {
         e.printStackTrace();
     }
}
/**
     * input: 2
     * name name = "helloearth.txt"
     * append append = true
     * output: 1
     * ret0 FileOutputStream$ret0
     * File$file-File$File(String fileName)& String$fileName="wgx_test.txt" & https://www.geeksforgeeks.org/file-class-in-java/
     */

public static void init1(){
String name = "helloearth.txt";
File file = new File(name);
     try {
	 String str = "helloearth";
	 Boolean append = true;
         FileOutputStream ret0 = new FileOutputStream(name,append);
	 ret0.write(str.getBytes());
	 FileInputStream input = new FileInputStream(file);
         int iAvail = input.available();
         byte[] bytes = new byte[iAvail];
         input.read(bytes);
         str =  new String(bytes);
         assert (str.equals("helloearth"));
         System.out.println(str);
     }catch (FileNotFoundException e){
         e.printStackTrace();
     }catch (IOException e) {
         e.printStackTrace();
     }
}
public static void main(String[] args){
	FileOutputStream_init_string_boolean.init0();
	FileOutputStream_init_string_boolean.init1();
    }
}
