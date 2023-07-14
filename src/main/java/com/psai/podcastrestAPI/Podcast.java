package com.psai.podcastrestAPI;

public class Podcast {
  private int id;
  private String name;
  private String url;

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public String getUrl() {
    return this.url;
  }

  public void setId(int id){
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
