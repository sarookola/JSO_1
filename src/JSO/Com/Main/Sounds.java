/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JSO.Com.Main;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

/**
 *
 * @author shayan
 */
public class Sounds {

    boolean mute = false;

    Thread player1, player2;
    Player playert1, playert2;

    public void stopAll() {
        stopmp32();
        stopmp31();
    }

    public void mute() {
        stopAll();
        mute = true;
    }

    public void muteOff() {
        mute = false;
    }

    public void playmp31(String st) {
        if (!mute) {
            if (player1 != null && player1.isAlive()) {
                player1.stop();
            }
            player1 = new Thread() {
                public void run() {
                    try {
                        BufferedInputStream buffer = new BufferedInputStream(new FileInputStream(st));
                        playert1 = new Player(buffer);
                        playert1.play();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }

            };
            player1.start();
        }
    }

    public void playmp32(String st) {
        if (!mute) {
            if (player2 != null && player2.isAlive()) {
                player2.stop();
            }
            player2 = new Thread() {
                public void run() {
                    try {
                        BufferedInputStream buffer = new BufferedInputStream(new FileInputStream(st));
                        playert2 = new Player(buffer);
                        playert2.play();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }

            };
            player2.start();
        }
    }

    public void stopmp32() {
        if (player2 != null && player2.isAlive()) {
            player2.stop();
        }
    }

    public void stopmp31() {
        if (player1 != null && player1.isAlive()) {
            player1.stop();
        }
    }
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
