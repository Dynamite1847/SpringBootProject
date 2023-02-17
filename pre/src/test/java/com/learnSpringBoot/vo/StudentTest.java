package com.learnSpringBoot.vo;

import com.learnSpringBoot.config.SpringConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class StudentTest {

    @Test
    public void test1(){
        String config = "bean.xml";
//        创建spring容器对象，从类路径中加载spring配置文件
//        对象已经被创建
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
//        从容器中获取对象
        Student myStudent = (Student) ac.getBean("myStudent");

        System.out.println(myStudent);

    }


    @Test
    public void test2(){
        ApplicationContext ctx  = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student= (Student) ctx.getBean("student1");
        System.out.println(student);
    }

    @Test
    public void test3(){
        ApplicationContext ctx  = new AnnotationConfigApplicationContext(SpringConfig.class);
        Cat cat= (Cat) ctx.getBean("myCat");
        System.out.println(cat);
    }

    @Test
    public void test4(){
        ApplicationContext ctx  = new AnnotationConfigApplicationContext(SpringConfig.class);
        Tiger tiger= (Tiger) ctx.getBean("tiger");
        System.out.println(tiger);
    }
}