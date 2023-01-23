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

/**
 * This is a model class for ProjectCard1 type.
 */
public class ProjectCard1 {
    private int id;
    private String url;
    private int projectId;
    private String projectUrl;
    private String columnName;
    private String previousColumnName;

    /**
     * Default constructor.
     */
    public ProjectCard1() {
    }

    /**
     * Initialization constructor.
     * @param  id  int value for id.
     * @param  url  String value for url.
     * @param  projectId  int value for projectId.
     * @param  projectUrl  String value for projectUrl.
     * @param  columnName  String value for columnName.
     * @param  previousColumnName  String value for previousColumnName.
     */
    public ProjectCard1(
            int id,
            String url,
            int projectId,
            String projectUrl,
            String columnName,
            String previousColumnName) {
        this.id = id;
        this.url = url;
        this.projectId = projectId;
        this.projectUrl = projectUrl;
        this.columnName = columnName;
        this.previousColumnName = previousColumnName;
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
     * Getter for ProjectId.
     * @return Returns the int
     */
    @JsonGetter("project_id")
    public int getProjectId() {
        return projectId;
    }

    /**
     * Setter for ProjectId.
     * @param projectId Value for int
     */
    @JsonSetter("project_id")
    public void setProjectId(int projectId) {
        this.projectId = projectId;
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
     * Getter for ColumnName.
     * @return Returns the String
     */
    @JsonGetter("column_name")
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
     * Getter for PreviousColumnName.
     * @return Returns the String
     */
    @JsonGetter("previous_column_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPreviousColumnName() {
        return previousColumnName;
    }

    /**
     * Setter for PreviousColumnName.
     * @param previousColumnName Value for String
     */
    @JsonSetter("previous_column_name")
    public void setPreviousColumnName(String previousColumnName) {
        this.previousColumnName = previousColumnName;
    }

    /**
     * Converts this ProjectCard1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProjectCard1 [" + "id=" + id + ", url=" + url + ", projectId=" + projectId
                + ", projectUrl=" + projectUrl + ", columnName=" + columnName
                + ", previousColumnName=" + previousColumnName + "]";
    }

    /**
     * Builds a new {@link ProjectCard1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProjectCard1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, url, projectId, projectUrl, columnName)
                .previousColumnName(getPreviousColumnName());
        return builder;
    }

    /**
     * Class to build instances of {@link ProjectCard1}.
     */
    public static class Builder {
        private int id;
        private String url;
        private int projectId;
        private String projectUrl;
        private String columnName;
        private String previousColumnName;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  int value for id.
         * @param  url  String value for url.
         * @param  projectId  int value for projectId.
         * @param  projectUrl  String value for projectUrl.
         * @param  columnName  String value for columnName.
         */
        public Builder(int id, String url, int projectId, String projectUrl, String columnName) {
            this.id = id;
            this.url = url;
            this.projectId = projectId;
            this.projectUrl = projectUrl;
            this.columnName = columnName;
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
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Setter for projectId.
         * @param  projectId  int value for projectId.
         * @return Builder
         */
        public Builder projectId(int projectId) {
            this.projectId = projectId;
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
         * Setter for columnName.
         * @param  columnName  String value for columnName.
         * @return Builder
         */
        public Builder columnName(String columnName) {
            this.columnName = columnName;
            return this;
        }

        /**
         * Setter for previousColumnName.
         * @param  previousColumnName  String value for previousColumnName.
         * @return Builder
         */
        public Builder previousColumnName(String previousColumnName) {
            this.previousColumnName = previousColumnName;
            return this;
        }

        /**
         * Builds a new {@link ProjectCard1} object using the set fields.
         * @return {@link ProjectCard1}
         */
        public ProjectCard1 build() {
            return new ProjectCard1(id, url, projectId, projectUrl, columnName, previousColumnName);
        }
    }
}