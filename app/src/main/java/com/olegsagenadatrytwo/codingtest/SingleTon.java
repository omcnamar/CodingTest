package com.olegsagenadatrytwo.codingtest;

/**
 * Created by omcna on 8/7/2017.
 */

public class SingleTon {

    private static SingleTon mSingleTon;

    private SingleTon(){

    }

    public SingleTon getInstance(){
        if(mSingleTon == null){
            return  new SingleTon();
        }else{
            return mSingleTon;
        }
    }
}
