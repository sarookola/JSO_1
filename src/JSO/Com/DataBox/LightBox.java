/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSO.Com.DataBox;

/**
 *
 * @author shayan
 */
public class LightBox {

    int port;
    int ls[][];

    public LightBox() {
        port = 6;
        ls = new int[7][4];
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int[][] getLs() {
        return ls;
    }

    public void setLs(int[][] ls) {
        this.ls = ls;
    }

}
