package com.apollo.test.classloader;

import java.net.URL;

/**
 * Created by liushanping on 2016/12/23.
 */
public class ClassLoaderTest {

    public static void main(String[] args) {

        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for (int i = 0; i < urls.length; i++) {
            System.out.println(urls[i].toExternalForm());
        }

        System.out.println("======================================");
        ClassLoader loader = ClassLoaderTest.class.getClassLoader();
        while(loader != null) {
            System.out.println(loader);
            loader = loader.getParent();    //获得父类加载器的引用
        }
        System.out.println(loader);
    }

}
