package com.example.book_system.domain;

import java.sql.Date;

public class BookInfo {
    private Integer bookId;
    private String bookCode;
    private String bookName;
    private Integer bookType;
    private String bookAuthor;
    private String publishPress;
    private Date publishDate;
    private Integer isBorrow;
    private String createdBy;
    private Date creationTime;
    private Date lastUpdatetime;

    public BookInfo() {
    }

    public BookInfo(String bookCode, String bookName, Integer bookType, String bookAuthor, String publishPress, Date publishDate, Integer isBorrow, String createdBy, Date creationTime, Date lastUpdatetime) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.bookType = bookType;
        this.bookAuthor = bookAuthor;
        this.publishPress = publishPress;
        this.publishDate = publishDate;
        this.isBorrow = isBorrow;
        this.createdBy = createdBy;
        this.creationTime = creationTime;
        this.lastUpdatetime = lastUpdatetime;
    }

    public BookInfo(Integer bookId, String bookCode, String bookName, Integer bookType, String bookAuthor, String publishPress, Date publishDate, Integer isBorrow, String createdBy, Date creationTime, Date lastUpdatetime) {
        this.bookId = bookId;
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.bookType = bookType;
        this.bookAuthor = bookAuthor;
        this.publishPress = publishPress;
        this.publishDate = publishDate;
        this.isBorrow = isBorrow;
        this.createdBy = createdBy;
        this.creationTime = creationTime;
        this.lastUpdatetime = lastUpdatetime;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBookType() {
        return bookType;
    }

    public void setBookType(Integer bookType) {
        this.bookType = bookType;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getPublishPress() {
        return publishPress;
    }

    public void setPublishPress(String publishPress) {
        this.publishPress = publishPress;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Integer getIsBorrow() {
        return isBorrow;
    }

    public void setIsBorrow(Integer isBorrow) {
        this.isBorrow = isBorrow;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getLastUpdatetime() {
        return lastUpdatetime;
    }

    public void setLastUpdatetime(Date lastUpdatetime) {
        this.lastUpdatetime = lastUpdatetime;
    }

    @Override
    public String toString() {
        return "BookInfo{" +
                "bookId=" + bookId +
                ", bookCode='" + bookCode + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookType=" + bookType +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", publishPress='" + publishPress + '\'' +
                ", publishDate=" + publishDate +
                ", isBorrow=" + isBorrow +
                ", createdBy='" + createdBy + '\'' +
                ", creationTime=" + creationTime +
                ", lastUpdatetime=" + lastUpdatetime +
                '}';
    }
}
