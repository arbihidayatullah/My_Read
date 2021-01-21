package com.myread.ProjectMyRead;

public class Romance {
    private String mImageUrl;
    private String mCreator;
    private String mLikes;

    public Romance(String imageUrl, String creator, String likes) {
        mImageUrl = imageUrl;
        mCreator = creator;
        mLikes = likes;
    }

    public String getImageUrl(){
        return mImageUrl;
    }
    public String getCreator() {
        return mCreator;
    }

    public String getLikeCount() {
        return mLikes;
    }
}
