/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for BaseCommit type.
 */
public class BaseCommit {
    private String url;
    private String sha;
    private String nodeId;
    private String htmlUrl;
    private String commentsUrl;
    private Commit2 commit;
    private Object author;
    private Object committer;
    private List<Parent> parents;
    private ChangeStatus stats;
    private List<DiffEntry> files;

    /**
     * Default constructor.
     */
    public BaseCommit() {
    }

    /**
     * Initialization constructor.
     * @param  url  String value for url.
     * @param  sha  String value for sha.
     * @param  nodeId  String value for nodeId.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  commentsUrl  String value for commentsUrl.
     * @param  commit  Commit2 value for commit.
     * @param  author  Object value for author.
     * @param  committer  Object value for committer.
     * @param  parents  List of Parent value for parents.
     * @param  stats  ChangeStatus value for stats.
     * @param  files  List of DiffEntry value for files.
     */
    public BaseCommit(
            String url,
            String sha,
            String nodeId,
            String htmlUrl,
            String commentsUrl,
            Commit2 commit,
            Object author,
            Object committer,
            List<Parent> parents,
            ChangeStatus stats,
            List<DiffEntry> files) {
        this.url = url;
        this.sha = sha;
        this.nodeId = nodeId;
        this.htmlUrl = htmlUrl;
        this.commentsUrl = commentsUrl;
        this.commit = commit;
        this.author = author;
        this.committer = committer;
        this.parents = parents;
        this.stats = stats;
        this.files = files;
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
     * @return Returns the Commit2
     */
    @JsonGetter("commit")
    public Commit2 getCommit() {
        return commit;
    }

    /**
     * Setter for Commit.
     * @param commit Value for Commit2
     */
    @JsonSetter("commit")
    public void setCommit(Commit2 commit) {
        this.commit = commit;
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
     * Getter for Parents.
     * @return Returns the List of Parent
     */
    @JsonGetter("parents")
    public List<Parent> getParents() {
        return parents;
    }

    /**
     * Setter for Parents.
     * @param parents Value for List of Parent
     */
    @JsonSetter("parents")
    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    /**
     * Getter for Stats.
     * @return Returns the ChangeStatus
     */
    @JsonGetter("stats")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ChangeStatus getStats() {
        return stats;
    }

    /**
     * Setter for Stats.
     * @param stats Value for ChangeStatus
     */
    @JsonSetter("stats")
    public void setStats(ChangeStatus stats) {
        this.stats = stats;
    }

    /**
     * Getter for Files.
     * @return Returns the List of DiffEntry
     */
    @JsonGetter("files")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<DiffEntry> getFiles() {
        return files;
    }

    /**
     * Setter for Files.
     * @param files Value for List of DiffEntry
     */
    @JsonSetter("files")
    public void setFiles(List<DiffEntry> files) {
        this.files = files;
    }

    /**
     * Converts this BaseCommit into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BaseCommit [" + "url=" + url + ", sha=" + sha + ", nodeId=" + nodeId + ", htmlUrl="
                + htmlUrl + ", commentsUrl=" + commentsUrl + ", commit=" + commit + ", author="
                + author + ", committer=" + committer + ", parents=" + parents + ", stats=" + stats
                + ", files=" + files + "]";
    }

    /**
     * Builds a new {@link BaseCommit.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BaseCommit.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(url, sha, nodeId, htmlUrl, commentsUrl, commit, author,
                committer, parents)
                .stats(getStats())
                .files(getFiles());
        return builder;
    }

    /**
     * Class to build instances of {@link BaseCommit}.
     */
    public static class Builder {
        private String url;
        private String sha;
        private String nodeId;
        private String htmlUrl;
        private String commentsUrl;
        private Commit2 commit;
        private Object author;
        private Object committer;
        private List<Parent> parents;
        private ChangeStatus stats;
        private List<DiffEntry> files;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  url  String value for url.
         * @param  sha  String value for sha.
         * @param  nodeId  String value for nodeId.
         * @param  htmlUrl  String value for htmlUrl.
         * @param  commentsUrl  String value for commentsUrl.
         * @param  commit  Commit2 value for commit.
         * @param  author  Object value for author.
         * @param  committer  Object value for committer.
         * @param  parents  List of Parent value for parents.
         */
        public Builder(String url, String sha, String nodeId, String htmlUrl, String commentsUrl,
                Commit2 commit, Object author, Object committer, List<Parent> parents) {
            this.url = url;
            this.sha = sha;
            this.nodeId = nodeId;
            this.htmlUrl = htmlUrl;
            this.commentsUrl = commentsUrl;
            this.commit = commit;
            this.author = author;
            this.committer = committer;
            this.parents = parents;
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
         * Setter for sha.
         * @param  sha  String value for sha.
         * @return Builder
         */
        public Builder sha(String sha) {
            this.sha = sha;
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
         * Setter for htmlUrl.
         * @param  htmlUrl  String value for htmlUrl.
         * @return Builder
         */
        public Builder htmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
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
         * @param  commit  Commit2 value for commit.
         * @return Builder
         */
        public Builder commit(Commit2 commit) {
            this.commit = commit;
            return this;
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
         * Setter for committer.
         * @param  committer  Object value for committer.
         * @return Builder
         */
        public Builder committer(Object committer) {
            this.committer = committer;
            return this;
        }

        /**
         * Setter for parents.
         * @param  parents  List of Parent value for parents.
         * @return Builder
         */
        public Builder parents(List<Parent> parents) {
            this.parents = parents;
            return this;
        }

        /**
         * Setter for stats.
         * @param  stats  ChangeStatus value for stats.
         * @return Builder
         */
        public Builder stats(ChangeStatus stats) {
            this.stats = stats;
            return this;
        }

        /**
         * Setter for files.
         * @param  files  List of DiffEntry value for files.
         * @return Builder
         */
        public Builder files(List<DiffEntry> files) {
            this.files = files;
            return this;
        }

        /**
         * Builds a new {@link BaseCommit} object using the set fields.
         * @return {@link BaseCommit}
         */
        public BaseCommit build() {
            return new BaseCommit(url, sha, nodeId, htmlUrl, commentsUrl, commit, author, committer,
                    parents, stats, files);
        }
    }
}
