package com.example.book_system.domain;

import java.util.List;

public class Pagination<E> {

    private Integer currentPageIndex;  //The current page index
    private Integer pageCount; //The number of pages
    private final Integer PAGESIZE = 5;
    private List<E> results;

    public Pagination() {
    }

    public Pagination(Integer currentPageIndex) {
        this.currentPageIndex = currentPageIndex;
        this.pageCount = pageCount;
    }

    public Integer getCurrentPageIndex() {
        return currentPageIndex;
    }

    public void setCurrentPageIndex(Integer currentPageIndex) {
        this.currentPageIndex = currentPageIndex;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getPAGESIZE() {
        return PAGESIZE;
    }

    public List<E> getResults() {
        return results;
    }

    public void setResults(List<E> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Pagination{" +
                "currentPageIndex=" + currentPageIndex +
                ", pageCount=" + pageCount +
                ", results=" + results +
                '}';
    }
}
