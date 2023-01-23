/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.github.api.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;
import java.util.List;

/**
 * This is a model class for ReposCheckSuitesCheckSuiteIdResponse type.
 */
public class ReposCheckSuitesCheckSuiteIdResponse {
    private int id;
    private String nodeId;
    private String headBranch;
    private String headSha;
    private Object status;
    private Object conclusion;
    private String url;
    private String before;
    private String after;
    private List<PullRequestMinimal> pullRequests;
    private Object app;
    private Repository7 repository;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private HeadCommit headCommit;
    private int latestCheckRunsCount;
    private String checkRunsUrl;
    private Boolean rerequestable;
    private Boolean runsRerequestable;

    /**
     * Default constructor.
     */
    public ReposCheckSuitesCheckSuiteIdResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  int value for id.
     * @param  nodeId  String value for nodeId.
     * @param  headBranch  String value for headBranch.
     * @param  headSha  String value for headSha.
     * @param  status  Object value for status.
     * @param  conclusion  Object value for conclusion.
     * @param  url  String value for url.
     * @param  before  String value for before.
     * @param  after  String value for after.
     * @param  pullRequests  List of PullRequestMinimal value for pullRequests.
     * @param  app  Object value for app.
     * @param  repository  Repository7 value for repository.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  headCommit  HeadCommit value for headCommit.
     * @param  latestCheckRunsCount  int value for latestCheckRunsCount.
     * @param  checkRunsUrl  String value for checkRunsUrl.
     * @param  rerequestable  Boolean value for rerequestable.
     * @param  runsRerequestable  Boolean value for runsRerequestable.
     */
    public ReposCheckSuitesCheckSuiteIdResponse(
            int id,
            String nodeId,
            String headBranch,
            String headSha,
            Object status,
            Object conclusion,
            String url,
            String before,
            String after,
            List<PullRequestMinimal> pullRequests,
            Object app,
            Repository7 repository,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            HeadCommit headCommit,
            int latestCheckRunsCount,
            String checkRunsUrl,
            Boolean rerequestable,
            Boolean runsRerequestable) {
        this.id = id;
        this.nodeId = nodeId;
        this.headBranch = headBranch;
        this.headSha = headSha;
        this.status = status;
        this.conclusion = conclusion;
        this.url = url;
        this.before = before;
        this.after = after;
        this.pullRequests = pullRequests;
        this.app = app;
        this.repository = repository;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.headCommit = headCommit;
        this.latestCheckRunsCount = latestCheckRunsCount;
        this.checkRunsUrl = checkRunsUrl;
        this.rerequestable = rerequestable;
        this.runsRerequestable = runsRerequestable;
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
     * Getter for HeadBranch.
     * @return Returns the String
     */
    @JsonGetter("head_branch")
    public String getHeadBranch() {
        return headBranch;
    }

    /**
     * Setter for HeadBranch.
     * @param headBranch Value for String
     */
    @JsonSetter("head_branch")
    public void setHeadBranch(String headBranch) {
        this.headBranch = headBranch;
    }

    /**
     * Getter for HeadSha.
     * The SHA of the head commit that is being checked.
     * @return Returns the String
     */
    @JsonGetter("head_sha")
    public String getHeadSha() {
        return headSha;
    }

    /**
     * Setter for HeadSha.
     * The SHA of the head commit that is being checked.
     * @param headSha Value for String
     */
    @JsonSetter("head_sha")
    public void setHeadSha(String headSha) {
        this.headSha = headSha;
    }

    /**
     * Getter for Status.
     * @return Returns the Object
     */
    @JsonGetter("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for Object
     */
    @JsonSetter("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    /**
     * Getter for Conclusion.
     * @return Returns the Object
     */
    @JsonGetter("conclusion")
    public Object getConclusion() {
        return conclusion;
    }

    /**
     * Setter for Conclusion.
     * @param conclusion Value for Object
     */
    @JsonSetter("conclusion")
    public void setConclusion(Object conclusion) {
        this.conclusion = conclusion;
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
     * Getter for Before.
     * @return Returns the String
     */
    @JsonGetter("before")
    public String getBefore() {
        return before;
    }

    /**
     * Setter for Before.
     * @param before Value for String
     */
    @JsonSetter("before")
    public void setBefore(String before) {
        this.before = before;
    }

    /**
     * Getter for After.
     * @return Returns the String
     */
    @JsonGetter("after")
    public String getAfter() {
        return after;
    }

    /**
     * Setter for After.
     * @param after Value for String
     */
    @JsonSetter("after")
    public void setAfter(String after) {
        this.after = after;
    }

    /**
     * Getter for PullRequests.
     * @return Returns the List of PullRequestMinimal
     */
    @JsonGetter("pull_requests")
    public List<PullRequestMinimal> getPullRequests() {
        return pullRequests;
    }

    /**
     * Setter for PullRequests.
     * @param pullRequests Value for List of PullRequestMinimal
     */
    @JsonSetter("pull_requests")
    public void setPullRequests(List<PullRequestMinimal> pullRequests) {
        this.pullRequests = pullRequests;
    }

    /**
     * Getter for App.
     * @return Returns the Object
     */
    @JsonGetter("app")
    public Object getApp() {
        return app;
    }

    /**
     * Setter for App.
     * @param app Value for Object
     */
    @JsonSetter("app")
    public void setApp(Object app) {
        this.app = app;
    }

    /**
     * Getter for Repository.
     * @return Returns the Repository7
     */
    @JsonGetter("repository")
    public Repository7 getRepository() {
        return repository;
    }

    /**
     * Setter for Repository.
     * @param repository Value for Repository7
     */
    @JsonSetter("repository")
    public void setRepository(Repository7 repository) {
        this.repository = repository;
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
     * Getter for HeadCommit.
     * @return Returns the HeadCommit
     */
    @JsonGetter("head_commit")
    public HeadCommit getHeadCommit() {
        return headCommit;
    }

    /**
     * Setter for HeadCommit.
     * @param headCommit Value for HeadCommit
     */
    @JsonSetter("head_commit")
    public void setHeadCommit(HeadCommit headCommit) {
        this.headCommit = headCommit;
    }

    /**
     * Getter for LatestCheckRunsCount.
     * @return Returns the int
     */
    @JsonGetter("latest_check_runs_count")
    public int getLatestCheckRunsCount() {
        return latestCheckRunsCount;
    }

    /**
     * Setter for LatestCheckRunsCount.
     * @param latestCheckRunsCount Value for int
     */
    @JsonSetter("latest_check_runs_count")
    public void setLatestCheckRunsCount(int latestCheckRunsCount) {
        this.latestCheckRunsCount = latestCheckRunsCount;
    }

    /**
     * Getter for CheckRunsUrl.
     * @return Returns the String
     */
    @JsonGetter("check_runs_url")
    public String getCheckRunsUrl() {
        return checkRunsUrl;
    }

    /**
     * Setter for CheckRunsUrl.
     * @param checkRunsUrl Value for String
     */
    @JsonSetter("check_runs_url")
    public void setCheckRunsUrl(String checkRunsUrl) {
        this.checkRunsUrl = checkRunsUrl;
    }

    /**
     * Getter for Rerequestable.
     * @return Returns the Boolean
     */
    @JsonGetter("rerequestable")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRerequestable() {
        return rerequestable;
    }

    /**
     * Setter for Rerequestable.
     * @param rerequestable Value for Boolean
     */
    @JsonSetter("rerequestable")
    public void setRerequestable(Boolean rerequestable) {
        this.rerequestable = rerequestable;
    }

    /**
     * Getter for RunsRerequestable.
     * @return Returns the Boolean
     */
    @JsonGetter("runs_rerequestable")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRunsRerequestable() {
        return runsRerequestable;
    }

    /**
     * Setter for RunsRerequestable.
     * @param runsRerequestable Value for Boolean
     */
    @JsonSetter("runs_rerequestable")
    public void setRunsRerequestable(Boolean runsRerequestable) {
        this.runsRerequestable = runsRerequestable;
    }

    /**
     * Converts this ReposCheckSuitesCheckSuiteIdResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposCheckSuitesCheckSuiteIdResponse [" + "id=" + id + ", nodeId=" + nodeId
                + ", headBranch=" + headBranch + ", headSha=" + headSha + ", status=" + status
                + ", conclusion=" + conclusion + ", url=" + url + ", before=" + before + ", after="
                + after + ", pullRequests=" + pullRequests + ", app=" + app + ", repository="
                + repository + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
                + ", headCommit=" + headCommit + ", latestCheckRunsCount=" + latestCheckRunsCount
                + ", checkRunsUrl=" + checkRunsUrl + ", rerequestable=" + rerequestable
                + ", runsRerequestable=" + runsRerequestable + "]";
    }

    /**
     * Builds a new {@link ReposCheckSuitesCheckSuiteIdResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposCheckSuitesCheckSuiteIdResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, nodeId, headBranch, headSha, status, conclusion, url,
                before, after, pullRequests, app, repository, createdAt, updatedAt, headCommit,
                latestCheckRunsCount, checkRunsUrl)
                .rerequestable(getRerequestable())
                .runsRerequestable(getRunsRerequestable());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposCheckSuitesCheckSuiteIdResponse}.
     */
    public static class Builder {
        private int id;
        private String nodeId;
        private String headBranch;
        private String headSha;
        private Object status;
        private Object conclusion;
        private String url;
        private String before;
        private String after;
        private List<PullRequestMinimal> pullRequests;
        private Object app;
        private Repository7 repository;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private HeadCommit headCommit;
        private int latestCheckRunsCount;
        private String checkRunsUrl;
        private Boolean rerequestable;
        private Boolean runsRerequestable;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  int value for id.
         * @param  nodeId  String value for nodeId.
         * @param  headBranch  String value for headBranch.
         * @param  headSha  String value for headSha.
         * @param  status  Object value for status.
         * @param  conclusion  Object value for conclusion.
         * @param  url  String value for url.
         * @param  before  String value for before.
         * @param  after  String value for after.
         * @param  pullRequests  List of PullRequestMinimal value for pullRequests.
         * @param  app  Object value for app.
         * @param  repository  Repository7 value for repository.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @param  headCommit  HeadCommit value for headCommit.
         * @param  latestCheckRunsCount  int value for latestCheckRunsCount.
         * @param  checkRunsUrl  String value for checkRunsUrl.
         */
        public Builder(int id, String nodeId, String headBranch, String headSha, Object status,
                Object conclusion, String url, String before, String after,
                List<PullRequestMinimal> pullRequests, Object app, Repository7 repository,
                LocalDateTime createdAt, LocalDateTime updatedAt, HeadCommit headCommit,
                int latestCheckRunsCount, String checkRunsUrl) {
            this.id = id;
            this.nodeId = nodeId;
            this.headBranch = headBranch;
            this.headSha = headSha;
            this.status = status;
            this.conclusion = conclusion;
            this.url = url;
            this.before = before;
            this.after = after;
            this.pullRequests = pullRequests;
            this.app = app;
            this.repository = repository;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
            this.headCommit = headCommit;
            this.latestCheckRunsCount = latestCheckRunsCount;
            this.checkRunsUrl = checkRunsUrl;
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
         * Setter for headBranch.
         * @param  headBranch  String value for headBranch.
         * @return Builder
         */
        public Builder headBranch(String headBranch) {
            this.headBranch = headBranch;
            return this;
        }

        /**
         * Setter for headSha.
         * @param  headSha  String value for headSha.
         * @return Builder
         */
        public Builder headSha(String headSha) {
            this.headSha = headSha;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  Object value for status.
         * @return Builder
         */
        public Builder status(Object status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for conclusion.
         * @param  conclusion  Object value for conclusion.
         * @return Builder
         */
        public Builder conclusion(Object conclusion) {
            this.conclusion = conclusion;
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
         * Setter for before.
         * @param  before  String value for before.
         * @return Builder
         */
        public Builder before(String before) {
            this.before = before;
            return this;
        }

        /**
         * Setter for after.
         * @param  after  String value for after.
         * @return Builder
         */
        public Builder after(String after) {
            this.after = after;
            return this;
        }

        /**
         * Setter for pullRequests.
         * @param  pullRequests  List of PullRequestMinimal value for pullRequests.
         * @return Builder
         */
        public Builder pullRequests(List<PullRequestMinimal> pullRequests) {
            this.pullRequests = pullRequests;
            return this;
        }

        /**
         * Setter for app.
         * @param  app  Object value for app.
         * @return Builder
         */
        public Builder app(Object app) {
            this.app = app;
            return this;
        }

        /**
         * Setter for repository.
         * @param  repository  Repository7 value for repository.
         * @return Builder
         */
        public Builder repository(Repository7 repository) {
            this.repository = repository;
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
         * Setter for headCommit.
         * @param  headCommit  HeadCommit value for headCommit.
         * @return Builder
         */
        public Builder headCommit(HeadCommit headCommit) {
            this.headCommit = headCommit;
            return this;
        }

        /**
         * Setter for latestCheckRunsCount.
         * @param  latestCheckRunsCount  int value for latestCheckRunsCount.
         * @return Builder
         */
        public Builder latestCheckRunsCount(int latestCheckRunsCount) {
            this.latestCheckRunsCount = latestCheckRunsCount;
            return this;
        }

        /**
         * Setter for checkRunsUrl.
         * @param  checkRunsUrl  String value for checkRunsUrl.
         * @return Builder
         */
        public Builder checkRunsUrl(String checkRunsUrl) {
            this.checkRunsUrl = checkRunsUrl;
            return this;
        }

        /**
         * Setter for rerequestable.
         * @param  rerequestable  Boolean value for rerequestable.
         * @return Builder
         */
        public Builder rerequestable(Boolean rerequestable) {
            this.rerequestable = rerequestable;
            return this;
        }

        /**
         * Setter for runsRerequestable.
         * @param  runsRerequestable  Boolean value for runsRerequestable.
         * @return Builder
         */
        public Builder runsRerequestable(Boolean runsRerequestable) {
            this.runsRerequestable = runsRerequestable;
            return this;
        }

        /**
         * Builds a new {@link ReposCheckSuitesCheckSuiteIdResponse} object using the set fields.
         * @return {@link ReposCheckSuitesCheckSuiteIdResponse}
         */
        public ReposCheckSuitesCheckSuiteIdResponse build() {
            return new ReposCheckSuitesCheckSuiteIdResponse(id, nodeId, headBranch, headSha, status,
                    conclusion, url, before, after, pullRequests, app, repository, createdAt,
                    updatedAt, headCommit, latestCheckRunsCount, checkRunsUrl, rerequestable,
                    runsRerequestable);
        }
    }
}
