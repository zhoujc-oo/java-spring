package com.zhoujc.static_state;

public class Proxy implements Rent{
    private HouseMaster houseMaster;

    public Proxy(HouseMaster houseMaster){
        this.houseMaster = houseMaster;
    }

    public void rent(){
        seeHouse();
        houseMaster.rent();
        hetong();
        fare();
    }

    public void seeHouse(){
        System.out.println("中介带你看房");
    }
    public void hetong(){
        System.out.println("签合同");
    }

    public void fare(){
        System.out.println("收中介费");
    }

}
