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
 * This is a model class for ReposIssuesIssueNumberLabelsRequest1 type.
 */
public class ReposIssuesIssueNumberLabelsRequest1 {
    private List<Label74> labels;

    /**
     * Default constructor.
     */
    public ReposIssuesIssueNumberLabelsRequest1() {
    }

    /**
     * Initialization constructor.
     * @param  labels  List of Label74 value for labels.
     */
    public ReposIssuesIssueNumberLabelsRequest1(
            List<Label74> labels) {
        this.labels = labels;
    }

    /**
     * Getter for Labels.
     * @return Returns the List of Label74
     */
    @JsonGetter("labels")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Label74> getLabels() {
        return labels;
    }

    /**
     * Setter for Labels.
     * @param labels Value for List of Label74
     */
    @JsonSetter("labels")
    public void setLabels(List<Label74> labels) {
        this.labels = labels;
    }

    /**
     * Converts this ReposIssuesIssueNumberLabelsRequest1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposIssuesIssueNumberLabelsRequest1 [" + "labels=" + labels + "]";
    }

    /**
     * Builds a new {@link ReposIssuesIssueNumberLabelsRequest1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposIssuesIssueNumberLabelsRequest1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .labels(getLabels());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposIssuesIssueNumberLabelsRequest1}.
     */
    public static class Builder {
        private List<Label74> labels;



        /**
         * Setter for labels.
         * @param  labels  List of Label74 value for labels.
         * @return Builder
         */
        public Builder labels(List<Label74> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Builds a new {@link ReposIssuesIssueNumberLabelsRequest1} object using the set fields.
         * @return {@link ReposIssuesIssueNumberLabelsRequest1}
         */
        public ReposIssuesIssueNumberLabelsRequest1 build() {
            return new ReposIssuesIssueNumberLabelsRequest1(labels);
        }
    }
}
