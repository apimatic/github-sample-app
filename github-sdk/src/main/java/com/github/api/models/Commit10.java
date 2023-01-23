/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for Commit10 type.
 */
public class Commit10 {
    private Object author;
    private String commentsUrl;
    private Commit11 commit;
    private Object committer;
    private String htmlUrl;
    private String nodeId;
    private List<Parent71> parents;
    private String sha;
    private String url;

    /**
     * Default constructor.
     */
    public Commit10() {
    }

    /**
     * Initialization constructor.
     * @param  author  Object value for author.
     * @param  commentsUrl  String value for commentsUrl.
     * @param  commit  Commit11 value for commit.
     * @param  committer  Object value for committer.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  nodeId  String value for nodeId.
     * @param  parents  List of Parent71 value for parents.
     * @param  sha  String value for sha.
     * @param  url  String value for url.
     */
    public Commit10(
            Object author,
            String commentsUrl,
            Commit11 commit,
            Object committer,
            String htmlUrl,
            String nodeId,
            List<Parent71> parents,
            String sha,
            String url) {
        this.author = author;
        this.commentsUrl = commentsUrl;
        this.commit = commit;
        this.committer = committer;
        this.htmlUrl = htmlUrl;
        this.nodeId = nodeId;
        this.parents = parents;
        this.sha = sha;
        this.url = url;
    }

    /**
     * Getter for Author.
     * @return Returns the Object
     */
    @JsonGetter("author")
    public Object getAuthor() {
        return author;
    }

    /**
     * Setter for Author.
     * @param author Value for Object
     */
    @JsonSetter("author")
    public void setAuthor(Object author) {
        this.author = author;
    }

    /**
     * Getter for CommentsUrl.
     * @return Returns the String
     */
    @JsonGetter("comments_url")
    public String getCommentsUrl() {
        return commentsUrl;
    }

    /**
     * Setter for CommentsUrl.
     * @param commentsUrl Value for String
     */
    @JsonSetter("comments_url")
    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    /**
     * Getter for Commit.
     * @return Returns the Commit11
     */
    @JsonGetter("commit")
    public Commit11 getCommit() {
        return commit;
    }

    /**
     * Setter for Commit.
     * @param commit Value for Commit11
     */
    @JsonSetter("commit")
    public void setCommit(Commit11 commit) {
        this.commit = commit;
    }

    /**
     * Getter for Committer.
     * @return Returns the Object
     */
    @JsonGetter("committer")
    public Object getCommitter() {
        return committer;
    }

    /**
     * Setter for Committer.
     * @param committer Value for Object
     */
    @JsonSetter("committer")
    public void setCommitter(Object committer) {
        this.committer = committer;
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
     * Getter for Parents.
     * @return Returns the List of Parent71
     */
    @JsonGetter("parents")
    public List<Parent71> getParents() {
        return parents;
    }

    /**
     * Setter for Parents.
     * @param parents Value for List of Parent71
     */
    @JsonSetter("parents")
    public void setParents(List<Parent71> parents) {
        this.parents = parents;
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
     * Converts this Commit10 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Commit10 [" + "author=" + author + ", commentsUrl=" + commentsUrl + ", commit="
                + commit + ", committer=" + committer + ", htmlUrl=" + htmlUrl + ", nodeId="
                + nodeId + ", parents=" + parents + ", sha=" + sha + ", url=" + url + "]";
    }

    /**
     * Builds a new {@link Commit10.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Commit10.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(author, commentsUrl, commit, committer, htmlUrl, nodeId,
                parents, sha, url);
        return builder;
    }

    /**
     * Class to build instances of {@link Commit10}.
     */
    public static class Builder {
        private Object author;
        private String commentsUrl;
        private Commit11 commit;
        private Object committer;
        private String htmlUrl;
        private String nodeId;
        private List<Parent71> parents;
        private String sha;
        private String url;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  author  Object value for author.
         * @param  commentsUrl  String value for commentsUrl.
         * @param  commit  Commit11 value for commit.
         * @param  committer  Object value for committer.
         * @param  htmlUrl  String value for htmlUrl.
         * @param  nodeId  String value for nodeId.
         * @param  parents  List of Parent71 value for parents.
         * @param  sha  String value for sha.
         * @param  url  String value for url.
         */
        public Builder(Object author, String commentsUrl, Commit11 commit, Object committer,
                String htmlUrl, String nodeId, List<Parent71> parents, String sha, String url) {
            this.author = author;
            this.commentsUrl = commentsUrl;
            this.commit = commit;
            this.committer = committer;
            this.htmlUrl = htmlUrl;
            this.nodeId = nodeId;
            this.parents = parents;
            this.sha = sha;
            this.url = url;
        }

        /**
         * Setter for author.
         * @param  author  Object value for author.
         * @return Builder
         */
        public Builder author(Object author) {
            this.author = author;
            return this;
        }

        /**
         * Setter for commentsUrl.
         * @param  commentsUrl  String value for commentsUrl.
         * @return Builder
         */
        public Builder commentsUrl(String commentsUrl) {
            this.commentsUrl = commentsUrl;
            return this;
        }

        /**
         * Setter for commit.
         * @param  commit  Commit11 value for commit.
         * @return Builder
         */
        public Builder commit(Commit11 commit) {
            this.commit = commit;
            return this;
        }

        /**
         * Setter for committer.
         * @param  committer  Object value for committer.
         * @return Builder
         */
        public Builder committer(Object committer) {
            this.committer = committer;
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
         * Setter for nodeId.
         * @param  nodeId  String value for nodeId.
         * @return Builder
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Setter for parents.
         * @param  parents  List of Parent71 value for parents.
         * @return Builder
         */
        public Builder parents(List<Parent71> parents) {
            this.parents = parents;
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
         * Builds a new {@link Commit10} object using the set fields.
         * @return {@link Commit10}
         */
        public Commit10 build() {
            return new Commit10(author, commentsUrl, commit, committer, htmlUrl, nodeId, parents,
                    sha, url);
        }
    }
}