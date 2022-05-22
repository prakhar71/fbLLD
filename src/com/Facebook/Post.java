package com.Facebook;

import java.util.List;
import java.util.Random;

public class Post {
    int postID;
    int uid;
    int dateposted;
    User postedBy;
    String description;
    List<Like> likes;
    List<Comment> comments;

    Post(int postID,User user){
        this.postID=postID;
        this.postedBy = user;
        this.uid=postedBy.uid;

   }

}
