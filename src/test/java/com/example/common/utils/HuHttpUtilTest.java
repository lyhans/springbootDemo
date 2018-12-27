package com.example.common.utils;

import cn.hutool.http.HttpUtil;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * <p>
 *
 * @author <a href="mailto:lyhans@yeah.net">Young</a>
 * @version 2018/12/27 22:40
 */
public class HuHttpUtilTest {

    @Test
    public void test(){
        String result3= HttpRequestUtil.post("http://localhost:8081/test/test.json","");
        System.out.println(result3);
    }

}