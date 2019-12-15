package com.sample.structural.proxy;

import com.sample.structural.proxy.service.RealObject;
import com.sample.structural.proxy.service.proxy.RealObjectProxy;

public class Client
{
    public static void main(String[] args)
    {
        RealObject proxy = new RealObjectProxy();
        proxy.doSomething();
    }
}