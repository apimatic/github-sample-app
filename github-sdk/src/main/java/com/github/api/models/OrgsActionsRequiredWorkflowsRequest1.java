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
 * This is a model class for OrgsActionsRequiredWorkflowsRequest1 type.
 */
public class OrgsActionsRequiredWorkflowsRequest1 {
    private String workflowFilePath;
    private String repositoryId;
    private Scope7Enum scope;
    private List<Integer> selectedRepositoryIds;

    /**
     * Default constructor.
     */
    public OrgsActionsRequiredWorkflowsRequest1() {
    }

    /**
     * Initialization constructor.
     * @param  workflowFilePath  String value for workflowFilePath.
     * @param  repositoryId  String value for repositoryId.
     * @param  scope  Scope7Enum value for scope.
     * @param  selectedRepositoryIds  List of Integer value for selectedRepositoryIds.
     */
    public OrgsActionsRequiredWorkflowsRequest1(
            String workflowFilePath,
            String repositoryId,
            Scope7Enum scope,
            List<Integer> selectedRepositoryIds) {
        this.workflowFilePath = workflowFilePath;
        this.repositoryId = repositoryId;
        this.scope = scope;
        this.selectedRepositoryIds = selectedRepositoryIds;
    }

    /**
     * Getter for WorkflowFilePath.
     * Path of the workflow file to be configured as a required workflow.
     * @return Returns the String
     */
    @JsonGetter("workflow_file_path")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getWorkflowFilePath() {
        return workflowFilePath;
    }

    /**
     * Setter for WorkflowFilePath.
     * Path of the workflow file to be configured as a required workflow.
     * @param workflowFilePath Value for String
     */
    @JsonSetter("workflow_file_path")
    public void setWorkflowFilePath(String workflowFilePath) {
        this.workflowFilePath = workflowFilePath;
    }

    /**
     * Getter for RepositoryId.
     * The ID of the repository that contains the workflow file.
     * @return Returns the String
     */
    @JsonGetter("repository_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRepositoryId() {
        return repositoryId;
    }

    /**
     * Setter for RepositoryId.
     * The ID of the repository that contains the workflow file.
     * @param repositoryId Value for String
     */
    @JsonSetter("repository_id")
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    /**
     * Getter for Scope.
     * @return Returns the Scope7Enum
     */
    @JsonGetter("scope")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Scope7Enum getScope() {
        return scope;
    }

    /**
     * Setter for Scope.
     * @param scope Value for Scope7Enum
     */
    @JsonSetter("scope")
    public void setScope(Scope7Enum scope) {
        this.scope = scope;
    }

    /**
     * Getter for SelectedRepositoryIds.
     * A list of repository IDs where you want to enable the required workflow. A list of repository
     * IDs where you want to enable the required workflow. You can only provide a list of repository
     * ids when the `scope` is set to `selected`.
     * @return Returns the List of Integer
     */
    @JsonGetter("selected_repository_ids")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Integer> getSelectedRepositoryIds() {
        return selectedRepositoryIds;
    }

    /**
     * Setter for SelectedRepositoryIds.
     * A list of repository IDs where you want to enable the required workflow. A list of repository
     * IDs where you want to enable the required workflow. You can only provide a list of repository
     * ids when the `scope` is set to `selected`.
     * @param selectedRepositoryIds Value for List of Integer
     */
    @JsonSetter("selected_repository_ids")
    public void setSelectedRepositoryIds(List<Integer> selectedRepositoryIds) {
        this.selectedRepositoryIds = selectedRepositoryIds;
    }

    /**
     * Converts this OrgsActionsRequiredWorkflowsRequest1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrgsActionsRequiredWorkflowsRequest1 [" + "workflowFilePath=" + workflowFilePath
                + ", repositoryId=" + repositoryId + ", scope=" + scope + ", selectedRepositoryIds="
                + selectedRepositoryIds + "]";
    }

    /**
     * Builds a new {@link OrgsActionsRequiredWorkflowsRequest1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrgsActionsRequiredWorkflowsRequest1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .workflowFilePath(getWorkflowFilePath())
                .repositoryId(getRepositoryId())
                .scope(getScope())
                .selectedRepositoryIds(getSelectedRepositoryIds());
        return builder;
    }

    /**
     * Class to build instances of {@link OrgsActionsRequiredWorkflowsRequest1}.
     */
    public static class Builder {
        private String workflowFilePath;
        private String repositoryId;
        private Scope7Enum scope;
        private List<Integer> selectedRepositoryIds;



        /**
         * Setter for workflowFilePath.
         * @param  workflowFilePath  String value for workflowFilePath.
         * @return Builder
         */
        public Builder workflowFilePath(String workflowFilePath) {
            this.workflowFilePath = workflowFilePath;
            return this;
        }

        /**
         * Setter for repositoryId.
         * @param  repositoryId  String value for repositoryId.
         * @return Builder
         */
        public Builder repositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            return this;
        }

        /**
         * Setter for scope.
         * @param  scope  Scope7Enum value for scope.
         * @return Builder
         */
        public Builder scope(Scope7Enum scope) {
            this.scope = scope;
            return this;
        }

        /**
         * Setter for selectedRepositoryIds.
         * @param  selectedRepositoryIds  List of Integer value for selectedRepositoryIds.
         * @return Builder
         */
        public Builder selectedRepositoryIds(List<Integer> selectedRepositoryIds) {
            this.selectedRepositoryIds = selectedRepositoryIds;
            return this;
        }

        /**
         * Builds a new {@link OrgsActionsRequiredWorkflowsRequest1} object using the set fields.
         * @return {@link OrgsActionsRequiredWorkflowsRequest1}
         */
        public OrgsActionsRequiredWorkflowsRequest1 build() {
            return new OrgsActionsRequiredWorkflowsRequest1(workflowFilePath, repositoryId, scope,
                    selectedRepositoryIds);
        }
    }
}
