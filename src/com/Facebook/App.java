package com.Facebook;

import java.util.List;

public class App {

    public static void main(String[] args) {
        facebook fb=new facebook();
        User ram=new User(1,"ram","D","c1","b1");
        User shyam=new User(2,"shyam","C","c1","b1");
        User harry=new User(3,"harry","A","c1","b1");
        User may=new User(4,"may","P","c1","b1");
        fb.userMap.put(1,ram);
        fb.userMap.put(2,shyam);
        fb.userMap.put(3,harry);
        fb.userMap.put(4,may);
        fb.follow(2,3);
        fb.follow(4,1);
        fb.follow(4,2);
        fb.follow(3,4);

//        List<User> dis = fb.userMap.get(4).following;
//        for(User u:dis)
//            System.out.println(u.uid);

        fb.post(3,1);
        fb.post(3,2);
        fb.post(3,3);
        fb.post(3,4);

        fb.post(4,5);
        fb.post(4,6);
        fb.post(4,7);



        fb.post(1,8);

//        List<Post> dis = fb.userMap.get(3).posts;
//        for(Post p:dis)
//            System.out.println(p.postID);
        System.out.println(fb.getNewsFeed(3));
        System.out.println(fb.getNewsFeed(4));
        System.out.println(fb.getNewsFeed(2));
//        fb.deletePost(2);
//        fb.deletePost(7);

//        System.out.println("----------");
//        List<Post> dis1 = fb.userMap.get(3).posts;
//        for(Post p:dis1)
//            System.out.println(p.postID);

//        System.out.println(fb.getNewsFeed(3));
//        System.out.println(fb.getNewsFeed(4));
//        System.out.println(fb.getNewsFeed(2));


        System.out.println(fb.getNewsFeedPaginated(2,2));

    }
}
