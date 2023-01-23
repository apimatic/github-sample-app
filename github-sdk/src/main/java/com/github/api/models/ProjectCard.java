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

/**
 * This is a model class for ProjectCard type.
 */
public class ProjectCard {
    private String url;
    private int id;
    private String nodeId;
    private String note;
    private Object creator;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean archived;
    private String columnName;
    private String projectId;
    private String columnUrl;
    private String contentUrl;
    private String projectUrl;

    /**
     * Default constructor.
     */
    public ProjectCard() {
    }

    /**
     * Initialization constructor.
     * @param  url  String value for url.
     * @param  id  int value for id.
     * @param  nodeId  String value for nodeId.
     * @param  note  String value for note.
     * @param  creator  Object value for creator.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  columnUrl  String value for columnUrl.
     * @param  projectUrl  String value for projectUrl.
     * @param  archived  Boolean value for archived.
     * @param  columnName  String value for columnName.
     * @param  projectId  String value for projectId.
     * @param  contentUrl  String value for contentUrl.
     */
    public ProjectCard(
            String url,
            int id,
            String nodeId,
            String note,
            Object creator,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            String columnUrl,
            String projectUrl,
            Boolean archived,
            String columnName,
            String projectId,
            String contentUrl) {
        this.url = url;
        this.id = id;
        this.nodeId = nodeId;
        this.note = note;
        this.creator = creator;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.archived = archived;
        this.columnName = columnName;
        this.projectId = projectId;
        this.columnUrl = columnUrl;
        this.contentUrl = contentUrl;
        this.projectUrl = projectUrl;
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
     * Getter for Id.
     * The project card's ID
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The project card's ID
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
     * Getter for Note.
     * @return Returns the String
     */
    @JsonGetter("note")
    public String getNote() {
        return note;
    }

    /**
     * Setter for Note.
     * @param note Value for String
     */
    @JsonSetter("note")
    public void setNote(String note) {
        this.note = note;
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
     * Getter for Archived.
     * Whether or not the card is archived
     * @return Returns the Boolean
     */
    @JsonGetter("archived")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getArchived() {
        return archived;
    }

    /**
     * Setter for Archived.
     * Whether or not the card is archived
     * @param archived Value for Boolean
     */
    @JsonSetter("archived")
    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    /**
     * Getter for ColumnName.
     * @return Returns the String
     */
    @JsonGetter("column_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getColumnName() {
        return columnName;
    }

    /**
     * Setter for ColumnName.
     * @param columnName Value for String
     */
    @JsonSetter("column_name")
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * Getter for ProjectId.
     * @return Returns the String
     */
    @JsonGetter("project_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProjectId() {
        return projectId;
    }

    /**
     * Setter for ProjectId.
     * @param projectId Value for String
     */
    @JsonSetter("project_id")
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * Getter for ColumnUrl.
     * @return Returns the String
     */
    @JsonGetter("column_url")
    public String getColumnUrl() {
        return columnUrl;
    }

    /**
     * Setter for ColumnUrl.
     * @param columnUrl Value for String
     */
    @JsonSetter("column_url")
    public void setColumnUrl(String columnUrl) {
        this.columnUrl = columnUrl;
    }

    /**
     * Getter for ContentUrl.
     * @return Returns the String
     */
    @JsonGetter("content_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getContentUrl() {
        return contentUrl;
    }

    /**
     * Setter for ContentUrl.
     * @param contentUrl Value for String
     */
    @JsonSetter("content_url")
    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    /**
     * Getter for ProjectUrl.
     * @return Returns the String
     */
    @JsonGetter("project_url")
    public String getProjectUrl() {
        return projectUrl;
    }

    /**
     * Setter for ProjectUrl.
     * @param projectUrl Value for String
     */
    @JsonSetter("project_url")
    public void setProjectUrl(String projectUrl) {
        this.projectUrl = projectUrl;
    }

    /**
     * Converts this ProjectCard into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProjectCard [" + "url=" + url + ", id=" + id + ", nodeId=" + nodeId + ", note="
                + note + ", creator=" + creator + ", createdAt=" + createdAt + ", updatedAt="
                + updatedAt + ", columnUrl=" + columnUrl + ", projectUrl=" + projectUrl
                + ", archived=" + archived + ", columnName=" + columnName + ", projectId="
                + projectId + ", contentUrl=" + contentUrl + "]";
    }

    /**
     * Builds a new {@link ProjectCard.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProjectCard.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(url, id, nodeId, note, creator, createdAt, updatedAt,
                columnUrl, projectUrl)
                .archived(getArchived())
                .columnName(getColumnName())
                .projectId(getProjectId())
                .contentUrl(getContentUrl());
        return builder;
    }

    /**
     * Class to build instances of {@link ProjectCard}.
     */
    public static class Builder {
        private String url;
        private int id;
        private String nodeId;
        private String note;
        private Object creator;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private String columnUrl;
        private String projectUrl;
        private Boolean archived;
        private String columnName;
        private String projectId;
        private String contentUrl;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  url  String value for url.
         * @param  id  int value for id.
         * @param  nodeId  String value for nodeId.
         * @param  note  String value for note.
         * @param  creator  Object value for creator.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @param  columnUrl  String value for columnUrl.
         * @param  projectUrl  String value for projectUrl.
         */
        public Builder(String url, int id, String nodeId, String note, Object creator,
                LocalDateTime createdAt, LocalDateTime updatedAt, String columnUrl,
                String projectUrl) {
            this.url = url;
            this.id = id;
            this.nodeId = nodeId;
            this.note = note;
            this.creator = creator;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
            this.columnUrl = columnUrl;
            this.projectUrl = projectUrl;
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
         * Setter for note.
         * @param  note  String value for note.
         * @return Builder
         */
        public Builder note(String note) {
            this.note = note;
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
         * Setter for columnUrl.
         * @param  columnUrl  String value for columnUrl.
         * @return Builder
         */
        public Builder columnUrl(String columnUrl) {
            this.columnUrl = columnUrl;
            return this;
        }

        /**
         * Setter for projectUrl.
         * @param  projectUrl  String value for projectUrl.
         * @return Builder
         */
        public Builder projectUrl(String projectUrl) {
            this.projectUrl = projectUrl;
            return this;
        }

        /**
         * Setter for archived.
         * @param  archived  Boolean value for archived.
         * @return Builder
         */
        public Builder archived(Boolean archived) {
            this.archived = archived;
            return this;
        }

        /**
         * Setter for columnName.
         * @param  columnName  String value for columnName.
         * @return Builder
         */
        public Builder columnName(String columnName) {
            this.columnName = columnName;
            return this;
        }

        /**
         * Setter for projectId.
         * @param  projectId  String value for projectId.
         * @return Builder
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * Setter for contentUrl.
         * @param  contentUrl  String value for contentUrl.
         * @return Builder
         */
        public Builder contentUrl(String contentUrl) {
            this.contentUrl = contentUrl;
            return this;
        }

        /**
         * Builds a new {@link ProjectCard} object using the set fields.
         * @return {@link ProjectCard}
         */
        public ProjectCard build() {
            return new ProjectCard(url, id, nodeId, note, creator, createdAt, updatedAt, columnUrl,
                    projectUrl, archived, columnName, projectId, contentUrl);
        }
    }
}
