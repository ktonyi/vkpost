package ru.netology.domain;
public class LikesInfo {

    private int count;
    private int UserLikes;
    private boolean canLike;
    private boolean canPublish;

    public int getCount() {

        return count;
    }

    public void setCount(int count) {

        this.count = count;
    }

    public int getUserLikes() {

        return UserLikes;
    }

    public void setUserLikes(int userLikes) {

        UserLikes = userLikes;
    }

    public boolean isCanLike() {

        return canLike;
    }

    public void setCanLike(boolean canLike) {

        this.canLike = canLike;
    }

    public boolean isCanPublish() {

        return canPublish;
    }

    public void setCanPublish(boolean canPublish) {

        this.canPublish = canPublish;
    }

}