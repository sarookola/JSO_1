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
public class DataBooleanIntStringPack {

    int index, counter;
    boolean active;
    String nameOrpath;
    int dim[] = {0, 0, 10, 10};

    public DataBooleanIntStringPack(int index, boolean active) {
        this.index = index;
        this.active = active;
        nameOrpath = "pictures\\shayanRanjbarTest.png";
    }

    public DataBooleanIntStringPack(int index, boolean active, int counter, int dim[]) {
        this.index = index;
        this.active = active;
        this.dim[0] = dim[0];
        this.dim[1] = dim[1];
        this.dim[2] = dim[2];
        this.dim[3] = dim[3];
        this.counter = counter;
        nameOrpath = "pictures\\shayanRanjbarTest.png";
    }

    public int[] getDim() {
        return dim;
    }

    public void setDim(int[] dim) {
        this.dim = dim;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getNameOrpath() {
        return nameOrpath;
    }

    public void setNameOrpath(String nameOrpath) {
        this.nameOrpath = nameOrpath;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

}
