package com.diego.Repaso.inversionDependencias;

import com.diego.Repaso.model.Alumno;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InversionDependencias
{
    public static void main(String[] args)
    {
        BeanFactory factory = new ClassPathXmlApplicationContext("app-context.xml");
        Alumno a = (Alumno)factory.getBean("alumno");
        System.out.println(a);
    }
}
