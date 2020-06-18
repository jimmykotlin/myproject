package com.jimmy;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        String s = new String("abcde");
        String s = "abcde";
        System.out.println(s.charAt(3));
        System.out.println(s.length());
        System.out.println(s.substring(3));
        System.out.println(s.substring(1,4));

        Person p = new Person("Jimmy",66.5f, 1.7f);
        p.hello();
        System.out.println(p.bmi());
        int score = 88;
        System.out.println(score < 80 || score > 90);
        char c = 'A';
        System.out.println(c > 'a');
    /*    int age = 19;
        Integer age2 = 19; // age2 becomes a object
                           // you can have some method to use when you put a dot at the end
        char c = 'A';
        Character c2 = 'A';
        byte b = 120;
        float weight = 66.5f; //by default, java will use double to storage decimal,
                              //we need to put "f" at the end of the decimal to force it to use float
        Float weight2 = 66.5f;
        double height = 1.7;
        Double height2 = 1.7;
        boolean adult = true;
        boolean enroll = false;
        Boolean adult2 = true;
        //Integer, Character, Float, Double, Boolean....這些為了基本資料型態所設計的類別，稱之為 Wrapper class
        //第一個字大寫
        String name = "Jimmy"; //String is a (Reference data type), so it must be capital in the first letter*/
    }
}
