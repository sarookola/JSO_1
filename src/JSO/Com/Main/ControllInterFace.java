/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSO.Com.Main;

import JSO.Com.DataBox.ControolPack;


/**
 *
 * @author Shayan
 */
public interface ControllInterFace {

    ControllCommandSetBase getControllCommandSet();

    ControolPack getControolPack();

    boolean isNewsha();

    void setControllCommandSet(ControllCommandSetBase controllCommandSet);

    void setControolPack(ControolPack controolPack);

    void setNewsha(boolean newsha);

    void updateControlpack();
    
    public void RecieveComPort(int c);


}
