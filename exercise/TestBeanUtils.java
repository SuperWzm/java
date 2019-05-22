package com.bittch.reflect.exercise;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wang
 * Date: 2019-05-21
 * Time: 18:55
 **/
public class TestBeanUtils {


    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setAge(28);
        teacher.setBirthday(new Date());
        teacher.setName("jack");

        Student student = new Student();

        System.out.println("copy before:");
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("copy after:");
        BeanUtils.copy(teacher,student);
        System.out.println(teacher);
        System.out.println(student);
    }
}
    class Student{
        private String name;
        private Integer age;
        private String skill;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getSkill() {
            return skill;
        }

        public void setSkill(String skill) {
            this.skill = skill;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", skill='" + skill + '\'' +
                    '}';
        }
    }


    class Teacher {
        private String name;
        private Integer age;
        private Date birthday;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Date getBirthday() {
            return birthday;
        }

        public void setBirthday(Date birthday) {
            this.birthday = birthday;
        }

        @Override
        public String toString() {
            return "Teacher{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", birthday=" + birthday +
                    '}';
        }
    }
    