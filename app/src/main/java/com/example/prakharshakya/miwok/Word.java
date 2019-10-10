package com.example.prakharshakya.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mimageresourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
    private int mAudioResourceId;

    public Word(String defaultTranslation,String miwokTranslation,int audioResourceId)
    {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mAudioResourceId=audioResourceId;
    }
    public Word(String defaultTranslation,String miwokTranslation,int imageresourceId,int audioResourceId)
    {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mimageresourceId=imageresourceId;
        mAudioResourceId=audioResourceId;
    }

    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation()
    {
        return  mMiwokTranslation;
    }

    public int getImageresourceId()
    {
        return mimageresourceId;
    }

    public boolean hasImage()
    {
        return mimageresourceId!= NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId() { return mAudioResourceId; }
}
