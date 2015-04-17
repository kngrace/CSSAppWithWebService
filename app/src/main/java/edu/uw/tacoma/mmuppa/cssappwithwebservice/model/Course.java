package edu.uw.tacoma.mmuppa.cssappwithwebservice.model;

import java.io.Serializable;

/**
 * Created by mmuppa on 4/13/15.
 */
public class Course implements Serializable {

    private String mCourseId;
    private String mShortDescription;
    private String mLongDescription;
    private String mPrereqs;

    public static final String ID = "id", SHORT_DESC = "shortDesc", LONG_DESC = "longDesc", PRE_REQS = "prereqs";


    public Course(String courseId, String shortDescription, String longDescription, String prereqs) {
        mCourseId = courseId;
        mShortDescription = shortDescription;
        mLongDescription = longDescription;
        mPrereqs = prereqs;
    }

    public String getCourseId() {
        return mCourseId;
    }

    public void setCourseId(String courseId) {
        mCourseId = courseId;
    }

    public String getShortDescription() {
        return mShortDescription;
    }

    public void setShortDescription(String shortDescription) {
        mShortDescription = shortDescription;
    }

    public String getLongDescription() {
        return mLongDescription;
    }

    public void setLongDescription(String longDescription) {
        mLongDescription = longDescription;
    }

    public String getPrereqs() {
        return mPrereqs;
    }

    public void setPrereqs(String prereqs) {
        mPrereqs = prereqs;
    }

    @Override
    public String toString() {
        return "edu.uw.tacoma.mmuppa.cssappwithwebservices.model.Course{" +
                "mCourseId='" + mCourseId + '\'' +
                ", mShortDescription='" + mShortDescription + '\'' +
                ", mLongDescription='" + mLongDescription + '\'' +
                ", mPrereqs=" + mPrereqs +
                '}';
    }
}
