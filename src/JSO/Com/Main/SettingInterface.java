/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSO.Com.Main;

/**
 *
 * @author mahan
 */
public interface SettingInterface {

    public boolean isNewsha() ;
    public void setNewsha(boolean b);

    void dimupdateSetting();

    void dimScomboReSelect(int dimSelectedIndex, int activeDimState);

    public void dimSadd(int selectedDimsListIndex, int selectedDim);

    public boolean dimLess(int selectedDimsListIndex);

    public void ItemDelete();

    public void ItemAdd();

    public void ItemDup();

    public void Itemcopy(DimsPanel aThis);

    public void ItemPaste();

}
