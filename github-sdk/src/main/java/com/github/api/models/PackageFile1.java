/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for PackageFile1 type.
 */
public class PackageFile1 {
    private String contentType;
    private String createdAt;
    private String downloadUrl;
    private int id;
    private String md5;
    private String name;
    private String sha1;
    private String sha256;
    private int size;
    private String state;
    private String updatedAt;

    /**
     * Default constructor.
     */
    public PackageFile1() {
    }

    /**
     * Initialization constructor.
     * @param  contentType  String value for contentType.
     * @param  createdAt  String value for createdAt.
     * @param  downloadUrl  String value for downloadUrl.
     * @param  id  int value for id.
     * @param  md5  String value for md5.
     * @param  name  String value for name.
     * @param  sha1  String value for sha1.
     * @param  sha256  String value for sha256.
     * @param  size  int value for size.
     * @param  state  String value for state.
     * @param  updatedAt  String value for updatedAt.
     */
    public PackageFile1(
            String contentType,
            String createdAt,
            String downloadUrl,
            int id,
            String md5,
            String name,
            String sha1,
            String sha256,
            int size,
            String state,
            String updatedAt) {
        this.contentType = contentType;
        this.createdAt = createdAt;
        this.downloadUrl = downloadUrl;
        this.id = id;
        this.md5 = md5;
        this.name = name;
        this.sha1 = sha1;
        this.sha256 = sha256;
        this.size = size;
        this.state = state;
        this.updatedAt = updatedAt;
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
     * Getter for CreatedAt.
     * @return Returns the String
     */
    @JsonGetter("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for String
     */
    @JsonSetter("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for DownloadUrl.
     * @return Returns the String
     */
    @JsonGetter("download_url")
    public String getDownloadUrl() {
        return downloadUrl;
    }

    /**
     * Setter for DownloadUrl.
     * @param downloadUrl Value for String
     */
    @JsonSetter("download_url")
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
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
     * Getter for Md5.
     * @return Returns the String
     */
    @JsonGetter("md5")
    public String getMd5() {
        return md5;
    }

    /**
     * Setter for Md5.
     * @param md5 Value for String
     */
    @JsonSetter("md5")
    public void setMd5(String md5) {
        this.md5 = md5;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Sha1.
     * @return Returns the String
     */
    @JsonGetter("sha1")
    public String getSha1() {
        return sha1;
    }

    /**
     * Setter for Sha1.
     * @param sha1 Value for String
     */
    @JsonSetter("sha1")
    public void setSha1(String sha1) {
        this.sha1 = sha1;
    }

    /**
     * Getter for Sha256.
     * @return Returns the String
     */
    @JsonGetter("sha256")
    public String getSha256() {
        return sha256;
    }

    /**
     * Setter for Sha256.
     * @param sha256 Value for String
     */
    @JsonSetter("sha256")
    public void setSha256(String sha256) {
        this.sha256 = sha256;
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
     * Getter for State.
     * @return Returns the String
     */
    @JsonGetter("state")
    public String getState() {
        return state;
    }

    /**
     * Setter for State.
     * @param state Value for String
     */
    @JsonSetter("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the String
     */
    @JsonGetter("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for String
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Converts this PackageFile1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PackageFile1 [" + "contentType=" + contentType + ", createdAt=" + createdAt
                + ", downloadUrl=" + downloadUrl + ", id=" + id + ", md5=" + md5 + ", name=" + name
                + ", sha1=" + sha1 + ", sha256=" + sha256 + ", size=" + size + ", state=" + state
                + ", updatedAt=" + updatedAt + "]";
    }

    /**
     * Builds a new {@link PackageFile1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PackageFile1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(contentType, createdAt, downloadUrl, id, md5, name, sha1,
                sha256, size, state, updatedAt);
        return builder;
    }

    /**
     * Class to build instances of {@link PackageFile1}.
     */
    public static class Builder {
        private String contentType;
        private String createdAt;
        private String downloadUrl;
        private int id;
        private String md5;
        private String name;
        private String sha1;
        private String sha256;
        private int size;
        private String state;
        private String updatedAt;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  contentType  String value for contentType.
         * @param  createdAt  String value for createdAt.
         * @param  downloadUrl  String value for downloadUrl.
         * @param  id  int value for id.
         * @param  md5  String value for md5.
         * @param  name  String value for name.
         * @param  sha1  String value for sha1.
         * @param  sha256  String value for sha256.
         * @param  size  int value for size.
         * @param  state  String value for state.
         * @param  updatedAt  String value for updatedAt.
         */
        public Builder(String contentType, String createdAt, String downloadUrl, int id, String md5,
                String name, String sha1, String sha256, int size, String state, String updatedAt) {
            this.contentType = contentType;
            this.createdAt = createdAt;
            this.downloadUrl = downloadUrl;
            this.id = id;
            this.md5 = md5;
            this.name = name;
            this.sha1 = sha1;
            this.sha256 = sha256;
            this.size = size;
            this.state = state;
            this.updatedAt = updatedAt;
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
         * Setter for createdAt.
         * @param  createdAt  String value for createdAt.
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for downloadUrl.
         * @param  downloadUrl  String value for downloadUrl.
         * @return Builder
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
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
         * Setter for md5.
         * @param  md5  String value for md5.
         * @return Builder
         */
        public Builder md5(String md5) {
            this.md5 = md5;
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
         * Setter for sha1.
         * @param  sha1  String value for sha1.
         * @return Builder
         */
        public Builder sha1(String sha1) {
            this.sha1 = sha1;
            return this;
        }

        /**
         * Setter for sha256.
         * @param  sha256  String value for sha256.
         * @return Builder
         */
        public Builder sha256(String sha256) {
            this.sha256 = sha256;
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
         * Setter for state.
         * @param  state  String value for state.
         * @return Builder
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  String value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Builds a new {@link PackageFile1} object using the set fields.
         * @return {@link PackageFile1}
         */
        public PackageFile1 build() {
            return new PackageFile1(contentType, createdAt, downloadUrl, id, md5, name, sha1,
                    sha256, size, state, updatedAt);
        }
    }
}
