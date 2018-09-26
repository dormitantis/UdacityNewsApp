package com.example.dormitantis.newsapp;

/**
 * A {@link News} object contains information related to each news.
 */
public class News {
    private String web;
    private String title;
    private String section;
    private String authors;

    /**
     * Constructs a new {@link News} object.
     *
     * @param web     is the webUrl of the news
     * @param title   is the headline of the news
     * @param section is the section the news refers to
     * @param authors is the string containing names of all authors separated by comma
     */
    public News(String web, String title, String section, String authors) {
        this.web = web;
        this.title = title;
        this.section = section;
        this.authors = authors;
    }

    public String getWeb() {
        return web;
    }

    public String getTitle() {
        return title;
    }

    public String getSection() {
        return section;
    }

    public String getAuthors() {
        return authors;
    }
}
