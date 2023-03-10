/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;
import java.util.Map;

/**
 * This is a model class for GistsResponse type.
 */
public class GistsResponse {
    private OptionalNullable<List<Fork>> forks;
    private OptionalNullable<List<GistHistory>> history;
    private Object forkOf;
    private String url;
    private String forksUrl;
    private String commitsUrl;
    private String id;
    private String nodeId;
    private String gitPullUrl;
    private String gitPushUrl;
    private String htmlUrl;
    private Map<String, Files2> files;
    private Boolean mPublic;
    private String createdAt;
    private String updatedAt;
    private OptionalNullable<String> description;
    private Integer comments;
    private OptionalNullable<String> user;
    private String commentsUrl;
    private Owner1 owner;
    private Boolean truncated;

    /**
     * Default constructor.
     */
    public GistsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  forks  List of Fork value for forks.
     * @param  history  List of GistHistory value for history.
     * @param  forkOf  Object value for forkOf.
     * @param  url  String value for url.
     * @param  forksUrl  String value for forksUrl.
     * @param  commitsUrl  String value for commitsUrl.
     * @param  id  String value for id.
     * @param  nodeId  String value for nodeId.
     * @param  gitPullUrl  String value for gitPullUrl.
     * @param  gitPushUrl  String value for gitPushUrl.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  files  Map of String, value for files.
     * @param  mPublic  Boolean value for mPublic.
     * @param  createdAt  String value for createdAt.
     * @param  updatedAt  String value for updatedAt.
     * @param  description  String value for description.
     * @param  comments  Integer value for comments.
     * @param  user  String value for user.
     * @param  commentsUrl  String value for commentsUrl.
     * @param  owner  Owner1 value for owner.
     * @param  truncated  Boolean value for truncated.
     */
    public GistsResponse(
            List<Fork> forks,
            List<GistHistory> history,
            Object forkOf,
            String url,
            String forksUrl,
            String commitsUrl,
            String id,
            String nodeId,
            String gitPullUrl,
            String gitPushUrl,
            String htmlUrl,
            Map<String, Files2> files,
            Boolean mPublic,
            String createdAt,
            String updatedAt,
            String description,
            Integer comments,
            String user,
            String commentsUrl,
            Owner1 owner,
            Boolean truncated) {
        this.forks = OptionalNullable.of(forks);
        this.history = OptionalNullable.of(history);
        this.forkOf = forkOf;
        this.url = url;
        this.forksUrl = forksUrl;
        this.commitsUrl = commitsUrl;
        this.id = id;
        this.nodeId = nodeId;
        this.gitPullUrl = gitPullUrl;
        this.gitPushUrl = gitPushUrl;
        this.htmlUrl = htmlUrl;
        this.files = files;
        this.mPublic = mPublic;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.description = OptionalNullable.of(description);
        this.comments = comments;
        this.user = OptionalNullable.of(user);
        this.commentsUrl = commentsUrl;
        this.owner = owner;
        this.truncated = truncated;
    }

    /**
     * Internal initialization constructor.
     */
    protected GistsResponse(OptionalNullable<List<Fork>> forks,
            OptionalNullable<List<GistHistory>> history, Object forkOf, String url, String forksUrl,
            String commitsUrl, String id, String nodeId, String gitPullUrl, String gitPushUrl,
            String htmlUrl, Map<String, Files2> files, Boolean mPublic, String createdAt,
            String updatedAt, OptionalNullable<String> description, Integer comments,
            OptionalNullable<String> user, String commentsUrl, Owner1 owner, Boolean truncated) {
        this.forks = forks;
        this.history = history;
        this.forkOf = forkOf;
        this.url = url;
        this.forksUrl = forksUrl;
        this.commitsUrl = commitsUrl;
        this.id = id;
        this.nodeId = nodeId;
        this.gitPullUrl = gitPullUrl;
        this.gitPushUrl = gitPushUrl;
        this.htmlUrl = htmlUrl;
        this.files = files;
        this.mPublic = mPublic;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.description = description;
        this.comments = comments;
        this.user = user;
        this.commentsUrl = commentsUrl;
        this.owner = owner;
        this.truncated = truncated;
    }

    /**
     * Internal Getter for Forks.
     * @return Returns the Internal List of Fork
     */
    @JsonGetter("forks")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<Fork>> internalGetForks() {
        return this.forks;
    }

    /**
     * Getter for Forks.
     * @return Returns the List of Fork
     */
    public List<Fork> getForks() {
        return OptionalNullable.getFrom(forks);
    }

    /**
     * Setter for Forks.
     * @param forks Value for List of Fork
     */
    @JsonSetter("forks")
    public void setForks(List<Fork> forks) {
        this.forks = OptionalNullable.of(forks);
    }

    /**
     * UnSetter for Forks.
     */
    public void unsetForks() {
        forks = null;
    }

    /**
     * Internal Getter for History.
     * @return Returns the Internal List of GistHistory
     */
    @JsonGetter("history")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<GistHistory>> internalGetHistory() {
        return this.history;
    }

    /**
     * Getter for History.
     * @return Returns the List of GistHistory
     */
    public List<GistHistory> getHistory() {
        return OptionalNullable.getFrom(history);
    }

    /**
     * Setter for History.
     * @param history Value for List of GistHistory
     */
    @JsonSetter("history")
    public void setHistory(List<GistHistory> history) {
        this.history = OptionalNullable.of(history);
    }

    /**
     * UnSetter for History.
     */
    public void unsetHistory() {
        history = null;
    }

    /**
     * Getter for ForkOf.
     * @return Returns the Object
     */
    @JsonGetter("fork_of")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getForkOf() {
        return forkOf;
    }

    /**
     * Setter for ForkOf.
     * @param forkOf Value for Object
     */
    @JsonSetter("fork_of")
    public void setForkOf(Object forkOf) {
        this.forkOf = forkOf;
    }

    /**
     * Getter for Url.
     * @return Returns the String
     */
    @JsonGetter("url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for ForksUrl.
     * @return Returns the String
     */
    @JsonGetter("forks_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getForksUrl() {
        return forksUrl;
    }

    /**
     * Setter for ForksUrl.
     * @param forksUrl Value for String
     */
    @JsonSetter("forks_url")
    public void setForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
    }

    /**
     * Getter for CommitsUrl.
     * @return Returns the String
     */
    @JsonGetter("commits_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCommitsUrl() {
        return commitsUrl;
    }

    /**
     * Setter for CommitsUrl.
     * @param commitsUrl Value for String
     */
    @JsonSetter("commits_url")
    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    /**
     * Getter for Id.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for NodeId.
     * @return Returns the String
     */
    @JsonGetter("node_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for GitPullUrl.
     * @return Returns the String
     */
    @JsonGetter("git_pull_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGitPullUrl() {
        return gitPullUrl;
    }

    /**
     * Setter for GitPullUrl.
     * @param gitPullUrl Value for String
     */
    @JsonSetter("git_pull_url")
    public void setGitPullUrl(String gitPullUrl) {
        this.gitPullUrl = gitPullUrl;
    }

    /**
     * Getter for GitPushUrl.
     * @return Returns the String
     */
    @JsonGetter("git_push_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGitPushUrl() {
        return gitPushUrl;
    }

    /**
     * Setter for GitPushUrl.
     * @param gitPushUrl Value for String
     */
    @JsonSetter("git_push_url")
    public void setGitPushUrl(String gitPushUrl) {
        this.gitPushUrl = gitPushUrl;
    }

    /**
     * Getter for HtmlUrl.
     * @return Returns the String
     */
    @JsonGetter("html_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for Files.
     * @return Returns the Map of String, Files2
     */
    @JsonGetter("files")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String, Files2> getFiles() {
        return files;
    }

    /**
     * Setter for Files.
     * @param files Value for Map of String, Files2
     */
    @JsonSetter("files")
    public void setFiles(Map<String, Files2> files) {
        this.files = files;
    }

    /**
     * Getter for Public.
     * @return Returns the Boolean
     */
    @JsonGetter("public")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPublic() {
        return mPublic;
    }

    /**
     * Setter for Public.
     * @param mPublic Value for Boolean
     */
    @JsonSetter("public")
    public void setPublic(Boolean mPublic) {
        this.mPublic = mPublic;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the String
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for UpdatedAt.
     * @return Returns the String
     */
    @JsonGetter("updated_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Internal Getter for Description.
     * @return Returns the Internal String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDescription() {
        return this.description;
    }

    /**
     * Getter for Description.
     * @return Returns the String
     */
    public String getDescription() {
        return OptionalNullable.getFrom(description);
    }

    /**
     * Setter for Description.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = OptionalNullable.of(description);
    }

    /**
     * UnSetter for Description.
     */
    public void unsetDescription() {
        description = null;
    }

    /**
     * Getter for Comments.
     * @return Returns the Integer
     */
    @JsonGetter("comments")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getComments() {
        return comments;
    }

    /**
     * Setter for Comments.
     * @param comments Value for Integer
     */
    @JsonSetter("comments")
    public void setComments(Integer comments) {
        this.comments = comments;
    }

    /**
     * Internal Getter for User.
     * @return Returns the Internal String
     */
    @JsonGetter("user")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetUser() {
        return this.user;
    }

    /**
     * Getter for User.
     * @return Returns the String
     */
    public String getUser() {
        return OptionalNullable.getFrom(user);
    }

    /**
     * Setter for User.
     * @param user Value for String
     */
    @JsonSetter("user")
    public void setUser(String user) {
        this.user = OptionalNullable.of(user);
    }

    /**
     * UnSetter for User.
     */
    public void unsetUser() {
        user = null;
    }

    /**
     * Getter for CommentsUrl.
     * @return Returns the String
     */
    @JsonGetter("comments_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for Owner.
     * @return Returns the Owner1
     */
    @JsonGetter("owner")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Owner1 getOwner() {
        return owner;
    }

    /**
     * Setter for Owner.
     * @param owner Value for Owner1
     */
    @JsonSetter("owner")
    public void setOwner(Owner1 owner) {
        this.owner = owner;
    }

    /**
     * Getter for Truncated.
     * @return Returns the Boolean
     */
    @JsonGetter("truncated")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getTruncated() {
        return truncated;
    }

    /**
     * Setter for Truncated.
     * @param truncated Value for Boolean
     */
    @JsonSetter("truncated")
    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    /**
     * Converts this GistsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GistsResponse [" + "forks=" + forks + ", history=" + history + ", forkOf=" + forkOf
                + ", url=" + url + ", forksUrl=" + forksUrl + ", commitsUrl=" + commitsUrl + ", id="
                + id + ", nodeId=" + nodeId + ", gitPullUrl=" + gitPullUrl + ", gitPushUrl="
                + gitPushUrl + ", htmlUrl=" + htmlUrl + ", files=" + files + ", mPublic=" + mPublic
                + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", description="
                + description + ", comments=" + comments + ", user=" + user + ", commentsUrl="
                + commentsUrl + ", owner=" + owner + ", truncated=" + truncated + "]";
    }

    /**
     * Builds a new {@link GistsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GistsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .forkOf(getForkOf())
                .url(getUrl())
                .forksUrl(getForksUrl())
                .commitsUrl(getCommitsUrl())
                .id(getId())
                .nodeId(getNodeId())
                .gitPullUrl(getGitPullUrl())
                .gitPushUrl(getGitPushUrl())
                .htmlUrl(getHtmlUrl())
                .files(getFiles())
                .mPublic(getPublic())
                .createdAt(getCreatedAt())
                .updatedAt(getUpdatedAt())
                .comments(getComments())
                .commentsUrl(getCommentsUrl())
                .owner(getOwner())
                .truncated(getTruncated());
        builder.forks = internalGetForks();
        builder.history = internalGetHistory();
        builder.description = internalGetDescription();
        builder.user = internalGetUser();
        return builder;
    }

    /**
     * Class to build instances of {@link GistsResponse}.
     */
    public static class Builder {
        private OptionalNullable<List<Fork>> forks;
        private OptionalNullable<List<GistHistory>> history;
        private Object forkOf;
        private String url;
        private String forksUrl;
        private String commitsUrl;
        private String id;
        private String nodeId;
        private String gitPullUrl;
        private String gitPushUrl;
        private String htmlUrl;
        private Map<String, Files2> files;
        private Boolean mPublic;
        private String createdAt;
        private String updatedAt;
        private OptionalNullable<String> description;
        private Integer comments;
        private OptionalNullable<String> user;
        private String commentsUrl;
        private Owner1 owner;
        private Boolean truncated;



        /**
         * Setter for forks.
         * @param  forks  List of Fork value for forks.
         * @return Builder
         */
        public Builder forks(List<Fork> forks) {
            this.forks = OptionalNullable.of(forks);
            return this;
        }

        /**
         * UnSetter for forks.
         * @return Builder
         */
        public Builder unsetForks() {
            forks = null;
            return this;
        }

        /**
         * Setter for history.
         * @param  history  List of GistHistory value for history.
         * @return Builder
         */
        public Builder history(List<GistHistory> history) {
            this.history = OptionalNullable.of(history);
            return this;
        }

        /**
         * UnSetter for history.
         * @return Builder
         */
        public Builder unsetHistory() {
            history = null;
            return this;
        }

        /**
         * Setter for forkOf.
         * @param  forkOf  Object value for forkOf.
         * @return Builder
         */
        public Builder forkOf(Object forkOf) {
            this.forkOf = forkOf;
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
         * Setter for forksUrl.
         * @param  forksUrl  String value for forksUrl.
         * @return Builder
         */
        public Builder forksUrl(String forksUrl) {
            this.forksUrl = forksUrl;
            return this;
        }

        /**
         * Setter for commitsUrl.
         * @param  commitsUrl  String value for commitsUrl.
         * @return Builder
         */
        public Builder commitsUrl(String commitsUrl) {
            this.commitsUrl = commitsUrl;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
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
         * Setter for gitPullUrl.
         * @param  gitPullUrl  String value for gitPullUrl.
         * @return Builder
         */
        public Builder gitPullUrl(String gitPullUrl) {
            this.gitPullUrl = gitPullUrl;
            return this;
        }

        /**
         * Setter for gitPushUrl.
         * @param  gitPushUrl  String value for gitPushUrl.
         * @return Builder
         */
        public Builder gitPushUrl(String gitPushUrl) {
            this.gitPushUrl = gitPushUrl;
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
         * Setter for files.
         * @param  files  Map of String, value for files.
         * @return Builder
         */
        public Builder files(Map<String, Files2> files) {
            this.files = files;
            return this;
        }

        /**
         * Setter for mPublic.
         * @param  mPublic  Boolean value for mPublic.
         * @return Builder
         */
        public Builder mPublic(Boolean mPublic) {
            this.mPublic = mPublic;
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
         * Setter for updatedAt.
         * @param  updatedAt  String value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = OptionalNullable.of(description);
            return this;
        }

        /**
         * UnSetter for description.
         * @return Builder
         */
        public Builder unsetDescription() {
            description = null;
            return this;
        }

        /**
         * Setter for comments.
         * @param  comments  Integer value for comments.
         * @return Builder
         */
        public Builder comments(Integer comments) {
            this.comments = comments;
            return this;
        }

        /**
         * Setter for user.
         * @param  user  String value for user.
         * @return Builder
         */
        public Builder user(String user) {
            this.user = OptionalNullable.of(user);
            return this;
        }

        /**
         * UnSetter for user.
         * @return Builder
         */
        public Builder unsetUser() {
            user = null;
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
         * Setter for owner.
         * @param  owner  Owner1 value for owner.
         * @return Builder
         */
        public Builder owner(Owner1 owner) {
            this.owner = owner;
            return this;
        }

        /**
         * Setter for truncated.
         * @param  truncated  Boolean value for truncated.
         * @return Builder
         */
        public Builder truncated(Boolean truncated) {
            this.truncated = truncated;
            return this;
        }

        /**
         * Builds a new {@link GistsResponse} object using the set fields.
         * @return {@link GistsResponse}
         */
        public GistsResponse build() {
            return new GistsResponse(forks, history, forkOf, url, forksUrl, commitsUrl, id, nodeId,
                    gitPullUrl, gitPushUrl, htmlUrl, files, mPublic, createdAt, updatedAt,
                    description, comments, user, commentsUrl, owner, truncated);
        }
    }
}
