package com.Facebook;

import java.util.List;

public interface fbInterface {
    public void post(int userId, int postId);
    public void follow(int followerId, int followeeId);
    public void unfollow(int followerId, int followeeId);
    public List<Integer> getNewsFeed(int userId);
    public List<Integer> getNewsFeedPaginated(Integer userId, Integer pageNumber);
    public void deletePost(int postId);
}
