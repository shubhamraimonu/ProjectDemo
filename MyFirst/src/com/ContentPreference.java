
package com;

public class ContentPreference {
  private String contentId;
  private String contentProviderId;
  private String contentProviderResourceId;
  private Integer legacyPriority;
  private String contentType;
  public ContentPreference() {
    // default constructor
  }
  public String getContentId() {
    return contentId;
  }
  public void setContentId(String contentId) {
    this.contentId = contentId;
  }
  public String getContentProviderId() {
    return contentProviderId;
  }
  public void setContentProviderId(String contentProviderId) {
    this.contentProviderId = contentProviderId;
  }
  public String getContentProviderResourceId() {
    return contentProviderResourceId;
  }
  public void setContentProviderResourceId(String contentProviderResourceId) {
    this.contentProviderResourceId = contentProviderResourceId;
  }
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }
  public Integer getLegacyPriority() {
    return legacyPriority;
  }
  public void setLegacyPriority(Integer legacyPriority) {
    this.legacyPriority = legacyPriority;
  }
}