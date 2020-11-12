package com.kwgdev.inputscanner;

import com.kwgdev.exceptions.FooRuntimeException;

public class MyFileUtils {

    public int subtract10FromLargerNumber(int number) throws Exception{
        if(number < 10) {
            throw new FooRuntimeException("Number must be greater than 10!");
        }
        return number -10;
    }



    }

