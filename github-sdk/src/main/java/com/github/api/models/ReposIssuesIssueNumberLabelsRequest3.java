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
 * This is a model class for ReposIssuesIssueNumberLabelsRequest3 type.
 */
public class ReposIssuesIssueNumberLabelsRequest3 {
    private List<String> labels;

    /**
     * Default constructor.
     */
    public ReposIssuesIssueNumberLabelsRequest3() {
    }

    /**
     * Initialization constructor.
     * @param  labels  List of String value for labels.
     */
    public ReposIssuesIssueNumberLabelsRequest3(
            List<String> labels) {
        this.labels = labels;
    }

    /**
     * Getter for Labels.
     * The names of the labels to set for the issue. The labels you set replace any existing labels.
     * You can pass an empty array to remove all labels. Alternatively, you can pass a single label
     * as a `string` or an `array` of labels directly, but GitHub recommends passing an object with
     * the `labels` key. You can also add labels to the existing labels for an issue. For more
     * information, see "[Add labels to an
     * issue](https://docs.github.com/rest/reference/issues#add-labels-to-an-issue)."
     * @return Returns the List of String
     */
    @JsonGetter("labels")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getLabels() {
        return labels;
    }

    /**
     * Setter for Labels.
     * The names of the labels to set for the issue. The labels you set replace any existing labels.
     * You can pass an empty array to remove all labels. Alternatively, you can pass a single label
     * as a `string` or an `array` of labels directly, but GitHub recommends passing an object with
     * the `labels` key. You can also add labels to the existing labels for an issue. For more
     * information, see "[Add labels to an
     * issue](https://docs.github.com/rest/reference/issues#add-labels-to-an-issue)."
     * @param labels Value for List of String
     */
    @JsonSetter("labels")
    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    /**
     * Converts this ReposIssuesIssueNumberLabelsRequest3 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposIssuesIssueNumberLabelsRequest3 [" + "labels=" + labels + "]";
    }

    /**
     * Builds a new {@link ReposIssuesIssueNumberLabelsRequest3.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposIssuesIssueNumberLabelsRequest3.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .labels(getLabels());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposIssuesIssueNumberLabelsRequest3}.
     */
    public static class Builder {
        private List<String> labels;



        /**
         * Setter for labels.
         * @param  labels  List of String value for labels.
         * @return Builder
         */
        public Builder labels(List<String> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Builds a new {@link ReposIssuesIssueNumberLabelsRequest3} object using the set fields.
         * @return {@link ReposIssuesIssueNumberLabelsRequest3}
         */
        public ReposIssuesIssueNumberLabelsRequest3 build() {
            return new ReposIssuesIssueNumberLabelsRequest3(labels);
        }
    }
}