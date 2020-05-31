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
public class gamesIdSpec {
    int id[];
    String file[] ;

    public gamesIdSpec() {
        id = new int[40];
        file = new String[40];
        
        for (int i = 0; i < 20; i++) {
            id[i]=i+1;
        }
        
    }
    
}
