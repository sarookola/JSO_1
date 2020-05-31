/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSO.Com.DataBox;

import java.io.Serializable;

/**
 *
 * @author shayan
 */
public class DataPackString implements Serializable {

    int id;
    String st;
    enum language{English,Persion} ;

    public DataPackString(int id, String string) {
        this.id = id;
        this.st = string;
    }
    
       public DataPackString(int id, String string, language lan ) {
        this.id = id;
   if(lan == language.Persion)   this.st = correctnumbersToPErsion(string);
   //     this.st = string;
    }

    public String getString() {
        return st;
    }

//    public void setString(String string) {
//        this.st = string;
//    }

    public int getId() {
        return id;
    }
    
    
     private String correctnumbersToPErsion(String text) {
//        text = text.replaceAll("»", "“");
//        text = text.replaceAll("«", "”");
//        text = text.replaceAll("\"", "”");
        // برای تایپ مجید محمودی
                                     for (int i = 0; i < text.length(); i++) {
if(Character.codePointAt(text.toCharArray(), i)==1616 ||Character.codePointAt(text.toCharArray(), i)==1609 ||Character.codePointAt(text.toCharArray(), i)==1610 )
if(i==0) text = "ی"+text.substring(1);
else if (i< text.length()-1)text = text.substring(0,i)+"ی"+text.substring(i+1);
else text = text.substring(0,text.length()-1)+"ی";
        }
// persion ٠١٢٣٤٥٦٧٨٩
            text = text.replaceAll("0", "٠");
            text = text.replaceAll("1", "١");
            text = text.replaceAll("2", "٢");
            text = text.replaceAll("3", "٣");
            text = text.replaceAll("4", "٤");
            text = text.replaceAll("5", "٥");
            text = text.replaceAll("6", "٦");
            text = text.replaceAll("7", "٧");
            text = text.replaceAll("8", "٨");
            text = text.replaceAll("9", "٩");
            
//            //٠١٢٣٤٥٦٧٨٩
//                        text = text.replaceAll("٠", "٠"); //   
//            text = text.replaceAll("١", "١");
//            text = text.replaceAll("٢", "٢");
//            text = text.replaceAll("٣", "٣");
//            text = text.replaceAll("٤", "٤");
//            text = text.replaceAll("٥", "٥");
//            text = text.replaceAll("٦", "٦");
//            text = text.replaceAll("٧", "٧");
//            text = text.replaceAll("٨", "٨");
//            text = text.replaceAll("٩", "٩");
        return (text);
    }

}