package com.myread.ProjectMyRead;

public class Pendidikan {
    private String mImageUrl;
    private String mCreator;
    private String mLikes;

    public Pendidikan(String imageUrl, String creator, String likes) {
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