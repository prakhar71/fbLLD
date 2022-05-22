package com.Facebook;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

public class User {
    int uid;
    String name;
    String location;
    String college;
    String bio;

    List<User> followers ;
    List<User> following ;
    List<Post> posts;

    User(int uid,String name,String location,String college ,String bio){
        this.uid=uid;this.name=name;this.location=location;this.college=college;this.bio=bio;
        following=new Vector<>();followers=new Vector<>();
        posts=new Vector<>();
    }

    void sortPosts(){
        Collections.sort(posts, new Comparator<Post>() {
            @Override
            public int compare(Post o1, Post o2) {
                return o2.dateposted-o1.dateposted;
            }
        });
    }
}
