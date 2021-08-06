package org.jimmy.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Request {
    private List<ViewUrl> viewUrls;

    public Request(){ }
    public Request(List<ViewUrl> viewUrls) {
        this.viewUrls = viewUrls;
    }

    public List<ViewUrl> getViewUrls() {
        return viewUrls;
    }
}
