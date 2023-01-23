/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for OrgsActionsVariablesResponse type.
 */
public class OrgsActionsVariablesResponse {
    private int totalCount;
    private List<ActionsVariableforanOrganization> variables;

    /**
     * Default constructor.
     */
    public OrgsActionsVariablesResponse() {
    }

    /**
     * Initialization constructor.
     * @param  totalCount  int value for totalCount.
     * @param  variables  List of ActionsVariableforanOrganization value for variables.
     */
    public OrgsActionsVariablesResponse(
            int totalCount,
            List<ActionsVariableforanOrganization> variables) {
        this.totalCount = totalCount;
        this.variables = variables;
    }

    /**
     * Getter for TotalCount.
     * @return Returns the int
     */
    @JsonGetter("total_count")
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Setter for TotalCount.
     * @param totalCount Value for int
     */
    @JsonSetter("total_count")
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * Getter for Variables.
     * @return Returns the List of ActionsVariableforanOrganization
     */
    @JsonGetter("variables")
    public List<ActionsVariableforanOrganization> getVariables() {
        return variables;
    }

    /**
     * Setter for Variables.
     * @param variables Value for List of ActionsVariableforanOrganization
     */
    @JsonSetter("variables")
    public void setVariables(List<ActionsVariableforanOrganization> variables) {
        this.variables = variables;
    }

    /**
     * Converts this OrgsActionsVariablesResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrgsActionsVariablesResponse [" + "totalCount=" + totalCount + ", variables="
                + variables + "]";
    }

    /**
     * Builds a new {@link OrgsActionsVariablesResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrgsActionsVariablesResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(totalCount, variables);
        return builder;
    }

    /**
     * Class to build instances of {@link OrgsActionsVariablesResponse}.
     */
    public static class Builder {
        private int totalCount;
        private List<ActionsVariableforanOrganization> variables;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  totalCount  int value for totalCount.
         * @param  variables  List of ActionsVariableforanOrganization value for variables.
         */
        public Builder(int totalCount, List<ActionsVariableforanOrganization> variables) {
            this.totalCount = totalCount;
            this.variables = variables;
        }

        /**
         * Setter for totalCount.
         * @param  totalCount  int value for totalCount.
         * @return Builder
         */
        public Builder totalCount(int totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Setter for variables.
         * @param  variables  List of ActionsVariableforanOrganization value for variables.
         * @return Builder
         */
        public Builder variables(List<ActionsVariableforanOrganization> variables) {
            this.variables = variables;
            return this;
        }

        /**
         * Builds a new {@link OrgsActionsVariablesResponse} object using the set fields.
         * @return {@link OrgsActionsVariablesResponse}
         */
        public OrgsActionsVariablesResponse build() {
            return new OrgsActionsVariablesResponse(totalCount, variables);
        }
    }
}