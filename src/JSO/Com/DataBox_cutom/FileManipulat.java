/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSO.Com.DataBox_cutom;

import JSO.Com.DataBox.ControolPack;
import JSO.Com.DataBox_cutom.DatabaseMain;
import JSO.Com.DataBox.SettingPack;
import JSO.Com.DataBox.LightBox;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author shayan
 */
public class FileManipulat {

    SettingPack settings;

    public void saveObject(String st, Object obj) {
        Gson gson = new Gson();

        // convert java object to JSON format,
        // and returned as JSON formatted string
        String json = gson.toJson(obj);

        try {
            //write converted json data to a file named "file.json"
            FileOutputStream file = new FileOutputStream(st);
            Writer out = new BufferedWriter(
                    new OutputStreamWriter(file, "UTF8"));
//            FileWriter writer = new FileWriter(st);
            out.write(json);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void saveString(String st, String json) {
        try {
            //write converted json data to a file named "file.json"
            FileOutputStream file = new FileOutputStream(st);
            Writer out = new BufferedWriter(
                    new OutputStreamWriter(file, "UTF8"));
//            FileWriter writer = new FileWriter(st);
            out.write(json);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public SettingPack loadSetting(String st) {
        SettingPack settings;
        Gson gson = new Gson();
        BufferedReader br = null;

        try {
//            Reader reader = new InputStreamReader(st);                            
//            Gson gson = new GsonBuilder().create();
//                settings = gson.fromJson(reader, SettingPack.class);
//            Person p = gson.fromJson(reader, Person.class);
//            System.out.println(p);
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(st), "UTF8"));

//            br = new BufferedReader(
//                    new FileReader(st));
            settings = gson.fromJson(br, SettingPack.class);
//                convert the json string back to object

        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println("Here is new json creating ");
            settings = new SettingPack();
        }
        return settings;
    }

    public BufferedReader loadObject(String st) {
        BufferedReader br = null;

        try {
//            Reader reader = new InputStreamReader(st);                            
//            Gson gson = new GsonBuilder().create();
//                settings = gson.fromJson(reader, SettingPack.class);
//            Person p = gson.fromJson(reader, Person.class);
//            System.out.println(p);
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(st), "UTF8"));

//            br = new BufferedReader(
//                convert the json string back to object
        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println("caonnt read bufferreader ");

        }
        return br;
    }

    public void loadControlData(String lastontrolDataFile,ControolPack controolpack) {//
       ControolPack obj;
        Gson gson = new Gson();
        BufferedReader br = null;

        try {

            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(lastontrolDataFile), "UTF8"));
            obj = gson.fromJson(br, ControolPack.class);
            for (int i = 0; i < controolpack.getVis_Anim_Bool().size(); i++) {
                controolpack.addVis_Anim_Bool(controolpack.getVis_Anim_Bool(i).getId(),controolpack.getVis_Anim_Bool(i).isvis());
            }
            //convert the json string back to object

        } catch (IOException e) {
            System.out.println("load Control data pack failed");
//            obj = new ControolPack();

        }
//        return obj;
    }

    public LightBox loadLightBox(String path) {
        LightBox obj;
        Gson gson = new Gson();
        BufferedReader br = null;

        try {

            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(path), "UTF8"));
            obj = gson.fromJson(br, LightBox.class);
            //convert the json string back to object

        } catch (IOException e) {
            System.out.println("load LightBox data pack failed and renew");
            obj = new LightBox();

        }
        return obj;
    }

    public DatabaseMain loadDatabase0(String databasefilename) {
        DatabaseMain Loadclass;
        Gson gson = new Gson();
        BufferedReader br = null;

        try {

            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(databasefilename), "UTF8"));
            Loadclass = gson.fromJson(br, DatabaseMain.class);
            //convert the json string back to object

        } catch (IOException e) {
//            e.printStackTrace();
            Loadclass = new DatabaseMain();
            System.out.println("Here is new json creating database0 " + Loadclass.toString());

        }
        return Loadclass;
    }

    public ControolPack loadControolPack(String st, int objecsArrayLenght) {
        ControolPack settings = null;
        Gson gson = new Gson();
        BufferedReader br = null;

        try {
//            Reader reader = new InputStreamReader(st);                            
//            Gson gson = new GsonBuilder().create();
//                settings = gson.fromJson(reader, SettingPack.class);
//            Person p = gson.fromJson(reader, Person.class);
//            System.out.println(p);
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(st), "UTF8"));

//            br = new BufferedReader(
//                    new FileReader(st));
            settings = gson.fromJson(br, ControolPack.class);
//                convert the json string back to object

        } catch (IOException e) {
            e.printStackTrace();
            settings = new ControolPack();
            System.out.println("Here is new json creating Setting");

        }
        return settings;
    }

//    public Database1 loadDatabase1(String databasefilename) {
//        Database1 Loadclass;
//        Gson gson = new Gson();
//        BufferedReader br = null;
//
//        try {
//
//            br = new BufferedReader(
//                    new InputStreamReader(
//                            new FileInputStream(databasefilename), "UTF8"));
//            Loadclass = gson.fromJson(br, Database1.class);
//            //convert the json string back to object
//
//        } catch (IOException e) {
////            e.printStackTrace();
//            Loadclass = new Database1();
//            System.out.println("Here is new json creating database1" + Loadclass.toString());
//
//        }
//        return Loadclass;
//    }
//
//    public int[][] readsettingdata(int max_number) {
//        int pos[][] = new int[max_number][2];
//        FileReader fileReader = null;
//        BufferedReader reader = null;
//
//        java.awt.FileDialog fd = new java.awt.FileDialog(new JFrame(" pos file"), "select posFile", java.awt.FileDialog.LOAD);
////fd.setMultipleMode(true);
//        fd.setDirectory("\\src\\");
//        fd.setVisible(true);
//
//        if (fd.getFile() == null) {
//            return pos;
//        } else {
//            File file = fd.getFiles()[0];
//            System.out.println("file=" + file.getAbsolutePath());
//            try {
//                reader = new BufferedReader(
//                        new InputStreamReader(
//                                new FileInputStream(file), "UTF8"));
//                String st = "";
//                int i = 0;
//                int number = 0;
//// st=reader.readLine();
////                    System.out.println("st="+st);
////                     st=reader.readLine();
////                    System.out.println("st="+st);
////                     st=reader.readLine();
////                    System.out.println("st="+st);
////                     st=reader.readLine();
////                    System.out.println("st="+st);
//                while (reader.readLine() != null & i < max_number) {
//                    st = reader.readLine();
//                    System.out.println("st=" + st);
//                    number = Integer.parseInt(st);
//                    pos[i][0] = number;
//                    st = reader.readLine();
//                    System.out.println("st=" + st);
//                    number = Integer.parseInt(st);
//                    pos[i][1] = number;
//                    i++;
//                }
//
//            } catch (IOException ex) {
//
//            } finally {
//                try {
////                fileReader.close();
//                    reader.close();
//                } catch (IOException ex) {
//
//                }
//
//            }
//            return pos;
//        }
//    }

   
}
