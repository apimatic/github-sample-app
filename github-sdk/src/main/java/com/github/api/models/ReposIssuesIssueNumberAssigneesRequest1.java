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
 * This is a model class for ReposIssuesIssueNumberAssigneesRequest1 type.
 */
public class ReposIssuesIssueNumberAssigneesRequest1 {
    private List<String> assignees;

    /**
     * Default constructor.
     */
    public ReposIssuesIssueNumberAssigneesRequest1() {
    }

    /**
     * Initialization constructor.
     * @param  assignees  List of String value for assignees.
     */
    public ReposIssuesIssueNumberAssigneesRequest1(
            List<String> assignees) {
        this.assignees = assignees;
    }

    /**
     * Getter for Assignees.
     * Usernames of assignees to remove from an issue. _NOTE: Only users with push access can remove
     * assignees from an issue. Assignees are silently ignored otherwise._
     * @return Returns the List of String
     */
    @JsonGetter("assignees")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getAssignees() {
        return assignees;
    }

    /**
     * Setter for Assignees.
     * Usernames of assignees to remove from an issue. _NOTE: Only users with push access can remove
     * assignees from an issue. Assignees are silently ignored otherwise._
     * @param assignees Value for List of String
     */
    @JsonSetter("assignees")
    public void setAssignees(List<String> assignees) {
        this.assignees = assignees;
    }

    /**
     * Converts this ReposIssuesIssueNumberAssigneesRequest1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposIssuesIssueNumberAssigneesRequest1 [" + "assignees=" + assignees + "]";
    }

    /**
     * Builds a new {@link ReposIssuesIssueNumberAssigneesRequest1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposIssuesIssueNumberAssigneesRequest1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .assignees(getAssignees());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposIssuesIssueNumberAssigneesRequest1}.
     */
    public static class Builder {
        private List<String> assignees;



        /**
         * Setter for assignees.
         * @param  assignees  List of String value for assignees.
         * @return Builder
         */
        public Builder assignees(List<String> assignees) {
            this.assignees = assignees;
            return this;
        }

        /**
         * Builds a new {@link ReposIssuesIssueNumberAssigneesRequest1} object using the set fields.
         * @return {@link ReposIssuesIssueNumberAssigneesRequest1}
         */
        public ReposIssuesIssueNumberAssigneesRequest1 build() {
            return new ReposIssuesIssueNumberAssigneesRequest1(assignees);
        }
    }
}