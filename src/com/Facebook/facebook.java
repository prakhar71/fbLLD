package com.Facebook;

import java.util.*;


public class facebook implements fbInterface {
    Map<Integer,User> userMap;
    Map<Integer,Post> postMap;
    List<Post> feedPost;
    facebook(){
     userMap = new HashMap<>();
     postMap = new HashMap<>();
    }

    public void post(int userId, int postId){
        User user=userMap.get(userId);
        Post post=new Post(postId,user);
        user.posts.add(post);
        postMap.put(postId,post);
    }
    public void follow(int followerId, int followeeId){
        User followerUser=userMap.get(followerId);
        User followeeUser=userMap.get(followeeId);
        followerUser.following.add(followeeUser);
        followeeUser.followers.add(followerUser);
    }
    public void unfollow(int followerId, int followeeId){
        User followerUser=userMap.get(followerId);
        User followeeUser=userMap.get(followeeId);
        followerUser.following.remove(followeeUser);
        followeeUser.followers.remove(followerUser);
    }
    public List<Integer> getNewsFeed(int userId){
        feedPost=new Vector<>();
        User user=userMap.get(userId);
        List<User> friends = user.following;
        for(User u:friends){
            /* u.sortPosts();
            if(u.posts.size()>=1) feedPost.add(u.posts.get(1));
            if(u.posts.size()>=0) feedPost.add(u.posts.get(0)); */
           Iterator<Post> it=u.posts.iterator();
           while (it.hasNext()){
               Post p = it.next();
               if(p.postID==-1) {
                   it.remove();continue;
               }
               feedPost.add(p);
            }


        }
        List<Integer> ans=new Vector<>();
        for(Post p : feedPost)
            ans.add(p.postID);
        return ans;
    }
    public List<Integer> getNewsFeedPaginated(Integer userId, Integer pageNumber){
        getNewsFeed(userId);
        List<Integer> ans=new Vector<>();
        int st=(pageNumber-1)*3 , end=st+3;
        for(int i=st;i<end && i<feedPost.size();i++)
            ans.add(feedPost.get(i).postID);

        return  ans;
    }
    public void deletePost(int postId){
        Post post=postMap.get(postId);
        postMap.remove(postId);
        post.postID=-1;

    }
}

















