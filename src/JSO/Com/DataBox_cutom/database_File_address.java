/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSO.Com.DataBox_cutom;

/**
 *
 * @author shayan
 */
public class database_File_address {

    String backtv = "pictures\\Media\\Tv_fix.png";
 
    String getselectedRamzShowFile(int selectedid) {
        String st = "pictures\\Media\\GameFiles\\Rotate\\r" + String.format("%02d", selectedid) + ".avi";
        System.out.println("st=" + st);
        return st;
    }
}
