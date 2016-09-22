package com.shujushow.justwork.java.object;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by xinshu on 2016/9/22.
 */
public class RabbitTest {

    @Test
    public void getNameInt() throws Exception {
        Rabbit rabbit = new Rabbit();
        rabbit.setName(123);
        Assert.assertNull(rabbit.getName());
    }

    @Test
    public void getNameStr() throws Exception {
        Rabbit rabbit = new Rabbit();
        rabbit.setName("123");
        Assert.assertEquals("123", rabbit.getName());
    }
}