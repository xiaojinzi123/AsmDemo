package com.test;

import okhttp3.Interceptor;

import java.util.ArrayList;
import java.util.List;

public class TestInterceptorClass {

    private List<Interceptor> interceptors = new ArrayList<>();

    public List<Interceptor> interceptors() {
        ArrayList<Interceptor> result = new ArrayList<>(this.interceptors);
        result.add(new LogInterceptor());
        return result;
    }

}
