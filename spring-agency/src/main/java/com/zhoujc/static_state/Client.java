package com.zhoujc.static_state;

public class Client {
    public static void main(String[] args) {
        HouseMaster houseMaster = new HouseMaster();

        Proxy proxy = new Proxy(houseMaster);

        proxy.rent();
    }
}
