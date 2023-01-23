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
 * This is a model class for Milestone7 type.
 */
public class Milestone7 {
    private LocalDateTime closedAt;
    private int closedIssues;
    private LocalDateTime createdAt;
    private Object creator;
    private String description;
    private LocalDateTime dueOn;
    private String htmlUrl;
    private int id;
    private String labelsUrl;
    private String nodeId;
    private int number;
    private int openIssues;
    private State1Enum state;
    private String title;
    private LocalDateTime updatedAt;
    private String url;

    /**
     * Default constructor.
     */
    public Milestone7() {
    }

    /**
     * Initialization constructor.
     * @param  closedAt  LocalDateTime value for closedAt.
     * @param  closedIssues  int value for closedIssues.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  creator  Object value for creator.
     * @param  description  String value for description.
     * @param  dueOn  LocalDateTime value for dueOn.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  id  int value for id.
     * @param  labelsUrl  String value for labelsUrl.
     * @param  nodeId  String value for nodeId.
     * @param  number  int value for number.
     * @param  openIssues  int value for openIssues.
     * @param  state  State1Enum value for state.
     * @param  title  String value for title.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  url  String value for url.
     */
    public Milestone7(
            LocalDateTime closedAt,
            int closedIssues,
            LocalDateTime createdAt,
            Object creator,
            String description,
            LocalDateTime dueOn,
            String htmlUrl,
            int id,
            String labelsUrl,
            String nodeId,
            int number,
            int openIssues,
            State1Enum state,
            String title,
            LocalDateTime updatedAt,
            String url) {
        this.closedAt = closedAt;
        this.closedIssues = closedIssues;
        this.createdAt = createdAt;
        this.creator = creator;
        this.description = description;
        this.dueOn = dueOn;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.labelsUrl = labelsUrl;
        this.nodeId = nodeId;
        this.number = number;
        this.openIssues = openIssues;
        this.state = state;
        this.title = title;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    /**
     * Getter for ClosedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("closed_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getClosedAt() {
        return closedAt;
    }

    /**
     * Setter for ClosedAt.
     * @param closedAt Value for LocalDateTime
     */
    @JsonSetter("closed_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setClosedAt(LocalDateTime closedAt) {
        this.closedAt = closedAt;
    }

    /**
     * Getter for ClosedIssues.
     * @return Returns the int
     */
    @JsonGetter("closed_issues")
    public int getClosedIssues() {
        return closedIssues;
    }

    /**
     * Setter for ClosedIssues.
     * @param closedIssues Value for int
     */
    @JsonSetter("closed_issues")
    public void setClosedIssues(int closedIssues) {
        this.closedIssues = closedIssues;
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
     * Getter for Creator.
     * @return Returns the Object
     */
    @JsonGetter("creator")
    public Object getCreator() {
        return creator;
    }

    /**
     * Setter for Creator.
     * @param creator Value for Object
     */
    @JsonSetter("creator")
    public void setCreator(Object creator) {
        this.creator = creator;
    }

    /**
     * Getter for Description.
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for DueOn.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("due_on")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getDueOn() {
        return dueOn;
    }

    /**
     * Setter for DueOn.
     * @param dueOn Value for LocalDateTime
     */
    @JsonSetter("due_on")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDueOn(LocalDateTime dueOn) {
        this.dueOn = dueOn;
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
     * Getter for LabelsUrl.
     * @return Returns the String
     */
    @JsonGetter("labels_url")
    public String getLabelsUrl() {
        return labelsUrl;
    }

    /**
     * Setter for LabelsUrl.
     * @param labelsUrl Value for String
     */
    @JsonSetter("labels_url")
    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
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
     * Getter for Number.
     * The number of the milestone.
     * @return Returns the int
     */
    @JsonGetter("number")
    public int getNumber() {
        return number;
    }

    /**
     * Setter for Number.
     * The number of the milestone.
     * @param number Value for int
     */
    @JsonSetter("number")
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Getter for OpenIssues.
     * @return Returns the int
     */
    @JsonGetter("open_issues")
    public int getOpenIssues() {
        return openIssues;
    }

    /**
     * Setter for OpenIssues.
     * @param openIssues Value for int
     */
    @JsonSetter("open_issues")
    public void setOpenIssues(int openIssues) {
        this.openIssues = openIssues;
    }

    /**
     * Getter for State.
     * @return Returns the State1Enum
     */
    @JsonGetter("state")
    public State1Enum getState() {
        return state;
    }

    /**
     * Setter for State.
     * @param state Value for State1Enum
     */
    @JsonSetter("state")
    public void setState(State1Enum state) {
        this.state = state;
    }

    /**
     * Getter for Title.
     * The title of the milestone.
     * @return Returns the String
     */
    @JsonGetter("title")
    public String getTitle() {
        return title;
    }

    /**
     * Setter for Title.
     * The title of the milestone.
     * @param title Value for String
     */
    @JsonSetter("title")
    public void setTitle(String title) {
        this.title = title;
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
     * Converts this Milestone7 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Milestone7 [" + "closedAt=" + closedAt + ", closedIssues=" + closedIssues
                + ", createdAt=" + createdAt + ", creator=" + creator + ", description="
                + description + ", dueOn=" + dueOn + ", htmlUrl=" + htmlUrl + ", id=" + id
                + ", labelsUrl=" + labelsUrl + ", nodeId=" + nodeId + ", number=" + number
                + ", openIssues=" + openIssues + ", state=" + state + ", title=" + title
                + ", updatedAt=" + updatedAt + ", url=" + url + "]";
    }

    /**
     * Builds a new {@link Milestone7.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Milestone7.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(closedAt, closedIssues, createdAt, creator, description,
                dueOn, htmlUrl, id, labelsUrl, nodeId, number, openIssues, state, title, updatedAt,
                url);
        return builder;
    }

    /**
     * Class to build instances of {@link Milestone7}.
     */
    public static class Builder {
        private LocalDateTime closedAt;
        private int closedIssues;
        private LocalDateTime createdAt;
        private Object creator;
        private String description;
        private LocalDateTime dueOn;
        private String htmlUrl;
        private int id;
        private String labelsUrl;
        private String nodeId;
        private int number;
        private int openIssues;
        private State1Enum state;
        private String title;
        private LocalDateTime updatedAt;
        private String url;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  closedAt  LocalDateTime value for closedAt.
         * @param  closedIssues  int value for closedIssues.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  creator  Object value for creator.
         * @param  description  String value for description.
         * @param  dueOn  LocalDateTime value for dueOn.
         * @param  htmlUrl  String value for htmlUrl.
         * @param  id  int value for id.
         * @param  labelsUrl  String value for labelsUrl.
         * @param  nodeId  String value for nodeId.
         * @param  number  int value for number.
         * @param  openIssues  int value for openIssues.
         * @param  state  State1Enum value for state.
         * @param  title  String value for title.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @param  url  String value for url.
         */
        public Builder(LocalDateTime closedAt, int closedIssues, LocalDateTime createdAt,
                Object creator, String description, LocalDateTime dueOn, String htmlUrl, int id,
                String labelsUrl, String nodeId, int number, int openIssues, State1Enum state,
                String title, LocalDateTime updatedAt, String url) {
            this.closedAt = closedAt;
            this.closedIssues = closedIssues;
            this.createdAt = createdAt;
            this.creator = creator;
            this.description = description;
            this.dueOn = dueOn;
            this.htmlUrl = htmlUrl;
            this.id = id;
            this.labelsUrl = labelsUrl;
            this.nodeId = nodeId;
            this.number = number;
            this.openIssues = openIssues;
            this.state = state;
            this.title = title;
            this.updatedAt = updatedAt;
            this.url = url;
        }

        /**
         * Setter for closedAt.
         * @param  closedAt  LocalDateTime value for closedAt.
         * @return Builder
         */
        public Builder closedAt(LocalDateTime closedAt) {
            this.closedAt = closedAt;
            return this;
        }

        /**
         * Setter for closedIssues.
         * @param  closedIssues  int value for closedIssues.
         * @return Builder
         */
        public Builder closedIssues(int closedIssues) {
            this.closedIssues = closedIssues;
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
         * Setter for creator.
         * @param  creator  Object value for creator.
         * @return Builder
         */
        public Builder creator(Object creator) {
            this.creator = creator;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for dueOn.
         * @param  dueOn  LocalDateTime value for dueOn.
         * @return Builder
         */
        public Builder dueOn(LocalDateTime dueOn) {
            this.dueOn = dueOn;
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
         * Setter for labelsUrl.
         * @param  labelsUrl  String value for labelsUrl.
         * @return Builder
         */
        public Builder labelsUrl(String labelsUrl) {
            this.labelsUrl = labelsUrl;
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
         * Setter for number.
         * @param  number  int value for number.
         * @return Builder
         */
        public Builder number(int number) {
            this.number = number;
            return this;
        }

        /**
         * Setter for openIssues.
         * @param  openIssues  int value for openIssues.
         * @return Builder
         */
        public Builder openIssues(int openIssues) {
            this.openIssues = openIssues;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  State1Enum value for state.
         * @return Builder
         */
        public Builder state(State1Enum state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for title.
         * @param  title  String value for title.
         * @return Builder
         */
        public Builder title(String title) {
            this.title = title;
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
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Builds a new {@link Milestone7} object using the set fields.
         * @return {@link Milestone7}
         */
        public Milestone7 build() {
            return new Milestone7(closedAt, closedIssues, createdAt, creator, description, dueOn,
                    htmlUrl, id, labelsUrl, nodeId, number, openIssues, state, title, updatedAt,
                    url);
        }
    }
}
