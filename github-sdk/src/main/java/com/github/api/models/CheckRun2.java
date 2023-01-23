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
 * This is a model class for CheckRun2 type.
 */
public class CheckRun2 {
    private LocalDateTime completedAt;
    private Object conclusion;
    private String detailsUrl;
    private String externalId;
    private String headSha;
    private String htmlUrl;
    private int id;
    private String name;
    private String nodeId;
    private LocalDateTime startedAt;
    private Status18Enum status;
    private String url;

    /**
     * Default constructor.
     */
    public CheckRun2() {
    }

    /**
     * Initialization constructor.
     * @param  completedAt  LocalDateTime value for completedAt.
     * @param  conclusion  Object value for conclusion.
     * @param  detailsUrl  String value for detailsUrl.
     * @param  externalId  String value for externalId.
     * @param  headSha  String value for headSha.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  id  int value for id.
     * @param  name  String value for name.
     * @param  nodeId  String value for nodeId.
     * @param  startedAt  LocalDateTime value for startedAt.
     * @param  status  Status18Enum value for status.
     * @param  url  String value for url.
     */
    public CheckRun2(
            LocalDateTime completedAt,
            Object conclusion,
            String detailsUrl,
            String externalId,
            String headSha,
            String htmlUrl,
            int id,
            String name,
            String nodeId,
            LocalDateTime startedAt,
            Status18Enum status,
            String url) {
        this.completedAt = completedAt;
        this.conclusion = conclusion;
        this.detailsUrl = detailsUrl;
        this.externalId = externalId;
        this.headSha = headSha;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.name = name;
        this.nodeId = nodeId;
        this.startedAt = startedAt;
        this.status = status;
        this.url = url;
    }

    /**
     * Getter for CompletedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("completed_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCompletedAt() {
        return completedAt;
    }

    /**
     * Setter for CompletedAt.
     * @param completedAt Value for LocalDateTime
     */
    @JsonSetter("completed_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCompletedAt(LocalDateTime completedAt) {
        this.completedAt = completedAt;
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
     * Getter for DetailsUrl.
     * @return Returns the String
     */
    @JsonGetter("details_url")
    public String getDetailsUrl() {
        return detailsUrl;
    }

    /**
     * Setter for DetailsUrl.
     * @param detailsUrl Value for String
     */
    @JsonSetter("details_url")
    public void setDetailsUrl(String detailsUrl) {
        this.detailsUrl = detailsUrl;
    }

    /**
     * Getter for ExternalId.
     * @return Returns the String
     */
    @JsonGetter("external_id")
    public String getExternalId() {
        return externalId;
    }

    /**
     * Setter for ExternalId.
     * @param externalId Value for String
     */
    @JsonSetter("external_id")
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * Getter for HeadSha.
     * The SHA of the commit that is being checked.
     * @return Returns the String
     */
    @JsonGetter("head_sha")
    public String getHeadSha() {
        return headSha;
    }

    /**
     * Setter for HeadSha.
     * The SHA of the commit that is being checked.
     * @param headSha Value for String
     */
    @JsonSetter("head_sha")
    public void setHeadSha(String headSha) {
        this.headSha = headSha;
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
     * Getter for Id.
     * The id of the check.
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The id of the check.
     * @param id Value for int
     */
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for Name.
     * The name of the check run.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the check run.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
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
     * Getter for StartedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("started_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getStartedAt() {
        return startedAt;
    }

    /**
     * Setter for StartedAt.
     * @param startedAt Value for LocalDateTime
     */
    @JsonSetter("started_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setStartedAt(LocalDateTime startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * Getter for Status.
     * @return Returns the Status18Enum
     */
    @JsonGetter("status")
    public Status18Enum getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for Status18Enum
     */
    @JsonSetter("status")
    public void setStatus(Status18Enum status) {
        this.status = status;
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
     * Converts this CheckRun2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CheckRun2 [" + "completedAt=" + completedAt + ", conclusion=" + conclusion
                + ", detailsUrl=" + detailsUrl + ", externalId=" + externalId + ", headSha="
                + headSha + ", htmlUrl=" + htmlUrl + ", id=" + id + ", name=" + name + ", nodeId="
                + nodeId + ", startedAt=" + startedAt + ", status=" + status + ", url=" + url + "]";
    }

    /**
     * Builds a new {@link CheckRun2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CheckRun2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(completedAt, conclusion, detailsUrl, externalId, headSha,
                htmlUrl, id, name, nodeId, startedAt, status, url);
        return builder;
    }

    /**
     * Class to build instances of {@link CheckRun2}.
     */
    public static class Builder {
        private LocalDateTime completedAt;
        private Object conclusion;
        private String detailsUrl;
        private String externalId;
        private String headSha;
        private String htmlUrl;
        private int id;
        private String name;
        private String nodeId;
        private LocalDateTime startedAt;
        private Status18Enum status;
        private String url;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  completedAt  LocalDateTime value for completedAt.
         * @param  conclusion  Object value for conclusion.
         * @param  detailsUrl  String value for detailsUrl.
         * @param  externalId  String value for externalId.
         * @param  headSha  String value for headSha.
         * @param  htmlUrl  String value for htmlUrl.
         * @param  id  int value for id.
         * @param  name  String value for name.
         * @param  nodeId  String value for nodeId.
         * @param  startedAt  LocalDateTime value for startedAt.
         * @param  status  Status18Enum value for status.
         * @param  url  String value for url.
         */
        public Builder(LocalDateTime completedAt, Object conclusion, String detailsUrl,
                String externalId, String headSha, String htmlUrl, int id, String name,
                String nodeId, LocalDateTime startedAt, Status18Enum status, String url) {
            this.completedAt = completedAt;
            this.conclusion = conclusion;
            this.detailsUrl = detailsUrl;
            this.externalId = externalId;
            this.headSha = headSha;
            this.htmlUrl = htmlUrl;
            this.id = id;
            this.name = name;
            this.nodeId = nodeId;
            this.startedAt = startedAt;
            this.status = status;
            this.url = url;
        }

        /**
         * Setter for completedAt.
         * @param  completedAt  LocalDateTime value for completedAt.
         * @return Builder
         */
        public Builder completedAt(LocalDateTime completedAt) {
            this.completedAt = completedAt;
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
         * Setter for detailsUrl.
         * @param  detailsUrl  String value for detailsUrl.
         * @return Builder
         */
        public Builder detailsUrl(String detailsUrl) {
            this.detailsUrl = detailsUrl;
            return this;
        }

        /**
         * Setter for externalId.
         * @param  externalId  String value for externalId.
         * @return Builder
         */
        public Builder externalId(String externalId) {
            this.externalId = externalId;
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
         * Setter for htmlUrl.
         * @param  htmlUrl  String value for htmlUrl.
         * @return Builder
         */
        public Builder htmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
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
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
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
         * Setter for startedAt.
         * @param  startedAt  LocalDateTime value for startedAt.
         * @return Builder
         */
        public Builder startedAt(LocalDateTime startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  Status18Enum value for status.
         * @return Builder
         */
        public Builder status(Status18Enum status) {
            this.status = status;
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
         * Builds a new {@link CheckRun2} object using the set fields.
         * @return {@link CheckRun2}
         */
        public CheckRun2 build() {
            return new CheckRun2(completedAt, conclusion, detailsUrl, externalId, headSha, htmlUrl,
                    id, name, nodeId, startedAt, status, url);
        }
    }
}
