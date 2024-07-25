package com.proretention.scrm.Integration.CompositeEntity;

public class CompositeEntity {
    private CoarseGrainedObject cgo=new CoarseGrainedObject();
    public void   setData(String ob1,String ob2)
    {
        cgo.setData(ob1,ob2);
    }
    public String[] getData(){
        return cgo.getData();
    }
}
