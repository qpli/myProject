package com.lqp.javabasics.demo_classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by lqp
 * Date: 2019/5/10
 */
public class MyClassLoader extends ClassLoader{
    private String path;
    private String classLoaderName;
    public MyClassLoader(String path,String classLoaderName)
    {
        this.path = path;
        this.classLoaderName = classLoaderName;
    }

    //����Ѱ�����ļ�

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] b = loadClassData(name);
        return defineClass(name,b,0,b.length);
    }

    //���ڼ������ļ�
    private byte[] loadClassData(String name) {
        name = path + name + ".class";
        InputStream in = null;
        ByteArrayOutputStream out = null;
        try {
            in = new FileInputStream(new File(name));
            out = new ByteArrayOutputStream();
            int i = 0;
            while ((i = in.read()) != -1) {
                out.write(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return out.toByteArray();
    }
}
