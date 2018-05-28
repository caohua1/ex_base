package com.ex.pojo;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class FileEntity {

    private int id;
    private String type;
    private String size;
    private String path;
    private String titleOrig;
    private String titleAlter;
    private Timestamp uploadTime;

    @Override
    public String toString() {
        return "FileEntity{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", path='" + path + '\'' +
                ", titleOrig='" + titleOrig + '\'' +
                ", titleAlter='" + titleAlter + '\'' +
                ", uploadTime=" + uploadTime +
                '}';
    }

    public FileEntity() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTitleOrig() {
        return titleOrig;
    }

    public void setTitleOrig(String titleOrig) {
        this.titleOrig = titleOrig;
    }

    public String getTitleAlter() {
        return titleAlter;
    }

    public void setTitleAlter(String titleAlter) {
        this.titleAlter = titleAlter;
    }

    public Timestamp getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Timestamp uploadTime) {
        this.uploadTime = uploadTime;
    }
}
