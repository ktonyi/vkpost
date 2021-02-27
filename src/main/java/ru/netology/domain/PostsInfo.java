package ru.netology.domain;

public class PostsInfo {
    private int PostId;
    private String PostName;
    private String DatePost;
    private String TimePost;
    private String ImageUrl;
    private String Text;
    private int LikesCounter;
    private String RepostsInfo;
    private int ViewsCounter;

    public int getPostId() {
        return PostId;
    }

    public void setPostId(int postId) {
        PostId = postId;
    }

    public String getPostName() {
        return PostName;
    }

    public void setPostName(String postName) {
        PostName = postName;
    }

    public String getDatePost() {
        return DatePost;
    }

    public void setDatePost(String datePost) {
        DatePost = datePost;
    }

    public String getTimePost() {
        return TimePost;
    }

    public void setTimePost(String timePost) {
        TimePost = timePost;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public int getLikesCounter() {
        return LikesCounter;
    }

    public void setLikesCounter(int likesCounter) {
        LikesCounter = likesCounter;
    }

    public String getRepostsInfo() {
        return RepostsInfo;
    }

    public void setRepostsInfo(String repostsInfo) {
        RepostsInfo = repostsInfo;
    }

    public int getViewsCounter() {
        return ViewsCounter;
    }

    public void setViewsCounter(int viewsCounter) {
        ViewsCounter = viewsCounter;
    }
}