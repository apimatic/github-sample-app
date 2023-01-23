/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for SubmoduleContent type.
 */
public class SubmoduleContent {
    private String type;
    private String submoduleGitUrl;
    private int size;
    private String name;
    private String path;
    private String sha;
    private String url;
    private String gitUrl;
    private String htmlUrl;
    private String downloadUrl;
    private Links3 links;

    /**
     * Default constructor.
     */
    public SubmoduleContent() {
        type = "submodule";
    }

    /**
     * Initialization constructor.
     * @param  type  String value for type.
     * @param  submoduleGitUrl  String value for submoduleGitUrl.
     * @param  size  int value for size.
     * @param  name  String value for name.
     * @param  path  String value for path.
     * @param  sha  String value for sha.
     * @param  url  String value for url.
     * @param  gitUrl  String value for gitUrl.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  downloadUrl  String value for downloadUrl.
     * @param  links  Links3 value for links.
     */
    @JsonCreator
    public SubmoduleContent(
            @JsonProperty("type") String type,
            @JsonProperty("submodule_git_url") String submoduleGitUrl,
            @JsonProperty("size") int size,
            @JsonProperty("name") String name,
            @JsonProperty("path") String path,
            @JsonProperty("sha") String sha,
            @JsonProperty("url") String url,
            @JsonProperty("git_url") String gitUrl,
            @JsonProperty("html_url") String htmlUrl,
            @JsonProperty("download_url") String downloadUrl,
            @JsonProperty("_links") Links3 links) {
        this.type = type;
        this.submoduleGitUrl = submoduleGitUrl;
        this.size = size;
        this.name = name;
        this.path = path;
        this.sha = sha;
        this.url = url;
        this.gitUrl = gitUrl;
        this.htmlUrl = htmlUrl;
        this.downloadUrl = downloadUrl;
        this.links = links;
    }

    /**
     * Getter for Type.
     * @return Returns the String
     */
    @JsonGetter("type")
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * @param type Value for String
     */
    @JsonSetter("type")
    private void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for SubmoduleGitUrl.
     * @return Returns the String
     */
    @JsonGetter("submodule_git_url")
    public String getSubmoduleGitUrl() {
        return submoduleGitUrl;
    }

    /**
     * Setter for SubmoduleGitUrl.
     * @param submoduleGitUrl Value for String
     */
    @JsonSetter("submodule_git_url")
    public void setSubmoduleGitUrl(String submoduleGitUrl) {
        this.submoduleGitUrl = submoduleGitUrl;
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
     * Getter for Path.
     * @return Returns the String
     */
    @JsonGetter("path")
    public String getPath() {
        return path;
    }

    /**
     * Setter for Path.
     * @param path Value for String
     */
    @JsonSetter("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Getter for Sha.
     * @return Returns the String
     */
    @JsonGetter("sha")
    public String getSha() {
        return sha;
    }

    /**
     * Setter for Sha.
     * @param sha Value for String
     */
    @JsonSetter("sha")
    public void setSha(String sha) {
        this.sha = sha;
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
     * Getter for GitUrl.
     * @return Returns the String
     */
    @JsonGetter("git_url")
    public String getGitUrl() {
        return gitUrl;
    }

    /**
     * Setter for GitUrl.
     * @param gitUrl Value for String
     */
    @JsonSetter("git_url")
    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    /**
     * Getter for HtmlUrl.
     * @return Returns the String
     */
    @JsonGetter("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    /**
     * Setter for HtmlUrl.
     * @param htmlUrl Value for String
     */
    @JsonSetter("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
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
     * Getter for Links.
     * @return Returns the Links3
     */
    @JsonGetter("_links")
    public Links3 getLinks() {
        return links;
    }

    /**
     * Setter for Links.
     * @param links Value for Links3
     */
    @JsonSetter("_links")
    public void setLinks(Links3 links) {
        this.links = links;
    }

    /**
     * Converts this SubmoduleContent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubmoduleContent [" + "type=" + type + ", submoduleGitUrl=" + submoduleGitUrl
                + ", size=" + size + ", name=" + name + ", path=" + path + ", sha=" + sha + ", url="
                + url + ", gitUrl=" + gitUrl + ", htmlUrl=" + htmlUrl + ", downloadUrl="
                + downloadUrl + ", links=" + links + "]";
    }

    /**
     * Builds a new {@link SubmoduleContent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubmoduleContent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(type, submoduleGitUrl, size, name, path, sha, url, gitUrl,
                htmlUrl, downloadUrl, links);
        return builder;
    }

    /**
     * Class to build instances of {@link SubmoduleContent}.
     */
    public static class Builder {
        private String type = "submodule";
        private String submoduleGitUrl;
        private int size;
        private String name;
        private String path;
        private String sha;
        private String url;
        private String gitUrl;
        private String htmlUrl;
        private String downloadUrl;
        private Links3 links;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  type  String value for type.
         * @param  submoduleGitUrl  String value for submoduleGitUrl.
         * @param  size  int value for size.
         * @param  name  String value for name.
         * @param  path  String value for path.
         * @param  sha  String value for sha.
         * @param  url  String value for url.
         * @param  gitUrl  String value for gitUrl.
         * @param  htmlUrl  String value for htmlUrl.
         * @param  downloadUrl  String value for downloadUrl.
         * @param  links  Links3 value for links.
         */
        public Builder(String type, String submoduleGitUrl, int size, String name, String path,
                String sha, String url, String gitUrl, String htmlUrl, String downloadUrl,
                Links3 links) {
            this.type = type;
            this.submoduleGitUrl = submoduleGitUrl;
            this.size = size;
            this.name = name;
            this.path = path;
            this.sha = sha;
            this.url = url;
            this.gitUrl = gitUrl;
            this.htmlUrl = htmlUrl;
            this.downloadUrl = downloadUrl;
            this.links = links;
        }

        /**
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for submoduleGitUrl.
         * @param  submoduleGitUrl  String value for submoduleGitUrl.
         * @return Builder
         */
        public Builder submoduleGitUrl(String submoduleGitUrl) {
            this.submoduleGitUrl = submoduleGitUrl;
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
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for path.
         * @param  path  String value for path.
         * @return Builder
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * Setter for sha.
         * @param  sha  String value for sha.
         * @return Builder
         */
        public Builder sha(String sha) {
            this.sha = sha;
            return this;
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
         * Setter for gitUrl.
         * @param  gitUrl  String value for gitUrl.
         * @return Builder
         */
        public Builder gitUrl(String gitUrl) {
            this.gitUrl = gitUrl;
            return this;
        }

        /**
         * Setter for htmlUrl.
         * @param  htmlUrl  String value for htmlUrl.
         * @return Builder
         */
        public Builder htmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
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
         * Setter for links.
         * @param  links  Links3 value for links.
         * @return Builder
         */
        public Builder links(Links3 links) {
            this.links = links;
            return this;
        }

        /**
         * Builds a new {@link SubmoduleContent} object using the set fields.
         * @return {@link SubmoduleContent}
         */
        public SubmoduleContent build() {
            return new SubmoduleContent(type, submoduleGitUrl, size, name, path, sha, url, gitUrl,
                    htmlUrl, downloadUrl, links);
        }
    }
}
