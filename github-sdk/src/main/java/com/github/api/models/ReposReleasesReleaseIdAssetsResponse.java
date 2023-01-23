/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.github.api.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;

/**
 * This is a model class for ReposReleasesReleaseIdAssetsResponse type.
 */
public class ReposReleasesReleaseIdAssetsResponse {
    private String url;
    private String browserDownloadUrl;
    private int id;
    private String nodeId;
    private String name;
    private String label;
    private State14Enum state;
    private String contentType;
    private int size;
    private int downloadCount;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Object uploader;

    /**
     * Default constructor.
     */
    public ReposReleasesReleaseIdAssetsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  url  String value for url.
     * @param  browserDownloadUrl  String value for browserDownloadUrl.
     * @param  id  int value for id.
     * @param  nodeId  String value for nodeId.
     * @param  name  String value for name.
     * @param  label  String value for label.
     * @param  state  State14Enum value for state.
     * @param  contentType  String value for contentType.
     * @param  size  int value for size.
     * @param  downloadCount  int value for downloadCount.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  uploader  Object value for uploader.
     */
    public ReposReleasesReleaseIdAssetsResponse(
            String url,
            String browserDownloadUrl,
            int id,
            String nodeId,
            String name,
            String label,
            State14Enum state,
            String contentType,
            int size,
            int downloadCount,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            Object uploader) {
        this.url = url;
        this.browserDownloadUrl = browserDownloadUrl;
        this.id = id;
        this.nodeId = nodeId;
        this.name = name;
        this.label = label;
        this.state = state;
        this.contentType = contentType;
        this.size = size;
        this.downloadCount = downloadCount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.uploader = uploader;
    }

    /**
     * Getter for Url.
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for BrowserDownloadUrl.
     * @return Returns the String
     */
    @JsonGetter("browser_download_url")
    public String getBrowserDownloadUrl() {
        return browserDownloadUrl;
    }

    /**
     * Setter for BrowserDownloadUrl.
     * @param browserDownloadUrl Value for String
     */
    @JsonSetter("browser_download_url")
    public void setBrowserDownloadUrl(String browserDownloadUrl) {
        this.browserDownloadUrl = browserDownloadUrl;
    }

    /**
     * Getter for Id.
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for int
     */
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for NodeId.
     * @return Returns the String
     */
    @JsonGetter("node_id")
    public String getNodeId() {
        return nodeId;
    }

    /**
     * Setter for NodeId.
     * @param nodeId Value for String
     */
    @JsonSetter("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * Getter for Name.
     * The file name of the asset.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The file name of the asset.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Label.
     * @return Returns the String
     */
    @JsonGetter("label")
    public String getLabel() {
        return label;
    }

    /**
     * Setter for Label.
     * @param label Value for String
     */
    @JsonSetter("label")
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Getter for State.
     * @return Returns the State14Enum
     */
    @JsonGetter("state")
    public State14Enum getState() {
        return state;
    }

    /**
     * Setter for State.
     * @param state Value for State14Enum
     */
    @JsonSetter("state")
    public void setState(State14Enum state) {
        this.state = state;
    }

    /**
     * Getter for ContentType.
     * @return Returns the String
     */
    @JsonGetter("content_type")
    public String getContentType() {
        return contentType;
    }

    /**
     * Setter for ContentType.
     * @param contentType Value for String
     */
    @JsonSetter("content_type")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Getter for Size.
     * @return Returns the int
     */
    @JsonGetter("size")
    public int getSize() {
        return size;
    }

    /**
     * Setter for Size.
     * @param size Value for int
     */
    @JsonSetter("size")
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Getter for DownloadCount.
     * @return Returns the int
     */
    @JsonGetter("download_count")
    public int getDownloadCount() {
        return downloadCount;
    }

    /**
     * Setter for DownloadCount.
     * @param downloadCount Value for int
     */
    @JsonSetter("download_count")
    public void setDownloadCount(int downloadCount) {
        this.downloadCount = downloadCount;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for LocalDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("updated_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for LocalDateTime
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for Uploader.
     * @return Returns the Object
     */
    @JsonGetter("uploader")
    public Object getUploader() {
        return uploader;
    }

    /**
     * Setter for Uploader.
     * @param uploader Value for Object
     */
    @JsonSetter("uploader")
    public void setUploader(Object uploader) {
        this.uploader = uploader;
    }

    /**
     * Converts this ReposReleasesReleaseIdAssetsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposReleasesReleaseIdAssetsResponse [" + "url=" + url + ", browserDownloadUrl="
                + browserDownloadUrl + ", id=" + id + ", nodeId=" + nodeId + ", name=" + name
                + ", label=" + label + ", state=" + state + ", contentType=" + contentType
                + ", size=" + size + ", downloadCount=" + downloadCount + ", createdAt=" + createdAt
                + ", updatedAt=" + updatedAt + ", uploader=" + uploader + "]";
    }

    /**
     * Builds a new {@link ReposReleasesReleaseIdAssetsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposReleasesReleaseIdAssetsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(url, browserDownloadUrl, id, nodeId, name, label, state,
                contentType, size, downloadCount, createdAt, updatedAt, uploader);
        return builder;
    }

    /**
     * Class to build instances of {@link ReposReleasesReleaseIdAssetsResponse}.
     */
    public static class Builder {
        private String url;
        private String browserDownloadUrl;
        private int id;
        private String nodeId;
        private String name;
        private String label;
        private State14Enum state;
        private String contentType;
        private int size;
        private int downloadCount;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private Object uploader;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  url  String value for url.
         * @param  browserDownloadUrl  String value for browserDownloadUrl.
         * @param  id  int value for id.
         * @param  nodeId  String value for nodeId.
         * @param  name  String value for name.
         * @param  label  String value for label.
         * @param  state  State14Enum value for state.
         * @param  contentType  String value for contentType.
         * @param  size  int value for size.
         * @param  downloadCount  int value for downloadCount.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @param  uploader  Object value for uploader.
         */
        public Builder(String url, String browserDownloadUrl, int id, String nodeId, String name,
                String label, State14Enum state, String contentType, int size, int downloadCount,
                LocalDateTime createdAt, LocalDateTime updatedAt, Object uploader) {
            this.url = url;
            this.browserDownloadUrl = browserDownloadUrl;
            this.id = id;
            this.nodeId = nodeId;
            this.name = name;
            this.label = label;
            this.state = state;
            this.contentType = contentType;
            this.size = size;
            this.downloadCount = downloadCount;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
            this.uploader = uploader;
        }

        /**
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Setter for browserDownloadUrl.
         * @param  browserDownloadUrl  String value for browserDownloadUrl.
         * @return Builder
         */
        public Builder browserDownloadUrl(String browserDownloadUrl) {
            this.browserDownloadUrl = browserDownloadUrl;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  int value for id.
         * @return Builder
         */
        public Builder id(int id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for nodeId.
         * @param  nodeId  String value for nodeId.
         * @return Builder
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for label.
         * @param  label  String value for label.
         * @return Builder
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  State14Enum value for state.
         * @return Builder
         */
        public Builder state(State14Enum state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for contentType.
         * @param  contentType  String value for contentType.
         * @return Builder
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * Setter for size.
         * @param  size  int value for size.
         * @return Builder
         */
        public Builder size(int size) {
            this.size = size;
            return this;
        }

        /**
         * Setter for downloadCount.
         * @param  downloadCount  int value for downloadCount.
         * @return Builder
         */
        public Builder downloadCount(int downloadCount) {
            this.downloadCount = downloadCount;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Setter for uploader.
         * @param  uploader  Object value for uploader.
         * @return Builder
         */
        public Builder uploader(Object uploader) {
            this.uploader = uploader;
            return this;
        }

        /**
         * Builds a new {@link ReposReleasesReleaseIdAssetsResponse} object using the set fields.
         * @return {@link ReposReleasesReleaseIdAssetsResponse}
         */
        public ReposReleasesReleaseIdAssetsResponse build() {
            return new ReposReleasesReleaseIdAssetsResponse(url, browserDownloadUrl, id, nodeId,
                    name, label, state, contentType, size, downloadCount, createdAt, updatedAt,
                    uploader);
        }
    }
}