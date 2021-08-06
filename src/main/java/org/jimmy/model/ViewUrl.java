package org.jimmy.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ViewUrl {
    private String url;

    public ViewUrl () {}
    public ViewUrl (String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
