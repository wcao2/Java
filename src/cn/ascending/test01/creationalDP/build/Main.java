package cn.ascending.test01.creationalDP.build;

public class Main {
    //https://www.jianshu.com/p/e2a2fe3555b9
    public static void main(String[] args) {
        //like chain call
        User u=new User.UserBuilder("Wei").age(25).phone("911").build();
        System.out.println(u.getAddress());
    }
}

/*
*  the reason I use build dp vs factory
*  1: some of the parameters might be optional but in Factory pattern, we are forced to send all the parameters and optional parameters need to send as NULL
*  2: If the obj is heavy and its creation is complex, then all that complexity will be part of Factory classes that is confusing
*
* */

/*
*  example: s3Client, SQSClient, 永远是用build做的
*
* */