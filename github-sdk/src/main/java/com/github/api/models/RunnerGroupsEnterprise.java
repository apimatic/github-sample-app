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
 * This is a model class for RunnerGroupsEnterprise type.
 */
public class RunnerGroupsEnterprise {
    private double id;
    private String name;
    private String visibility;
    private boolean mDefault;
    private String selectedOrganizationsUrl;
    private String runnersUrl;
    private boolean allowsPublicRepositories;
    private Boolean workflowRestrictionsReadOnly;
    private Boolean restrictedToWorkflows;
    private List<String> selectedWorkflows;

    /**
     * Default constructor.
     */
    public RunnerGroupsEnterprise() {
        workflowRestrictionsReadOnly = false;
        restrictedToWorkflows = false;
    }

    /**
     * Initialization constructor.
     * @param  id  double value for id.
     * @param  name  String value for name.
     * @param  visibility  String value for visibility.
     * @param  mDefault  boolean value for mDefault.
     * @param  runnersUrl  String value for runnersUrl.
     * @param  allowsPublicRepositories  boolean value for allowsPublicRepositories.
     * @param  selectedOrganizationsUrl  String value for selectedOrganizationsUrl.
     * @param  workflowRestrictionsReadOnly  Boolean value for workflowRestrictionsReadOnly.
     * @param  restrictedToWorkflows  Boolean value for restrictedToWorkflows.
     * @param  selectedWorkflows  List of String value for selectedWorkflows.
     */
    public RunnerGroupsEnterprise(
            double id,
            String name,
            String visibility,
            boolean mDefault,
            String runnersUrl,
            boolean allowsPublicRepositories,
            String selectedOrganizationsUrl,
            Boolean workflowRestrictionsReadOnly,
            Boolean restrictedToWorkflows,
            List<String> selectedWorkflows) {
        this.id = id;
        this.name = name;
        this.visibility = visibility;
        this.mDefault = mDefault;
        this.selectedOrganizationsUrl = selectedOrganizationsUrl;
        this.runnersUrl = runnersUrl;
        this.allowsPublicRepositories = allowsPublicRepositories;
        this.workflowRestrictionsReadOnly = workflowRestrictionsReadOnly;
        this.restrictedToWorkflows = restrictedToWorkflows;
        this.selectedWorkflows = selectedWorkflows;
    }

    /**
     * Getter for Id.
     * @return Returns the double
     */
    @JsonGetter("id")
    public double getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for double
     */
    @JsonSetter("id")
    public void setId(double id) {
        this.id = id;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Visibility.
     * @return Returns the String
     */
    @JsonGetter("visibility")
    public String getVisibility() {
        return visibility;
    }

    /**
     * Setter for Visibility.
     * @param visibility Value for String
     */
    @JsonSetter("visibility")
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * Getter for Default.
     * @return Returns the boolean
     */
    @JsonGetter("default")
    public boolean getDefault() {
        return mDefault;
    }

    /**
     * Setter for Default.
     * @param mDefault Value for boolean
     */
    @JsonSetter("default")
    public void setDefault(boolean mDefault) {
        this.mDefault = mDefault;
    }

    /**
     * Getter for SelectedOrganizationsUrl.
     * @return Returns the String
     */
    @JsonGetter("selected_organizations_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSelectedOrganizationsUrl() {
        return selectedOrganizationsUrl;
    }

    /**
     * Setter for SelectedOrganizationsUrl.
     * @param selectedOrganizationsUrl Value for String
     */
    @JsonSetter("selected_organizations_url")
    public void setSelectedOrganizationsUrl(String selectedOrganizationsUrl) {
        this.selectedOrganizationsUrl = selectedOrganizationsUrl;
    }

    /**
     * Getter for RunnersUrl.
     * @return Returns the String
     */
    @JsonGetter("runners_url")
    public String getRunnersUrl() {
        return runnersUrl;
    }

    /**
     * Setter for RunnersUrl.
     * @param runnersUrl Value for String
     */
    @JsonSetter("runners_url")
    public void setRunnersUrl(String runnersUrl) {
        this.runnersUrl = runnersUrl;
    }

    /**
     * Getter for AllowsPublicRepositories.
     * @return Returns the boolean
     */
    @JsonGetter("allows_public_repositories")
    public boolean getAllowsPublicRepositories() {
        return allowsPublicRepositories;
    }

    /**
     * Setter for AllowsPublicRepositories.
     * @param allowsPublicRepositories Value for boolean
     */
    @JsonSetter("allows_public_repositories")
    public void setAllowsPublicRepositories(boolean allowsPublicRepositories) {
        this.allowsPublicRepositories = allowsPublicRepositories;
    }

    /**
     * Getter for WorkflowRestrictionsReadOnly.
     * If `true`, the `restricted_to_workflows` and `selected_workflows` fields cannot be modified.
     * @return Returns the Boolean
     */
    @JsonGetter("workflow_restrictions_read_only")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getWorkflowRestrictionsReadOnly() {
        return workflowRestrictionsReadOnly;
    }

    /**
     * Setter for WorkflowRestrictionsReadOnly.
     * If `true`, the `restricted_to_workflows` and `selected_workflows` fields cannot be modified.
     * @param workflowRestrictionsReadOnly Value for Boolean
     */
    @JsonSetter("workflow_restrictions_read_only")
    public void setWorkflowRestrictionsReadOnly(Boolean workflowRestrictionsReadOnly) {
        this.workflowRestrictionsReadOnly = workflowRestrictionsReadOnly;
    }

    /**
     * Getter for RestrictedToWorkflows.
     * If `true`, the runner group will be restricted to running only the workflows specified in the
     * `selected_workflows` array.
     * @return Returns the Boolean
     */
    @JsonGetter("restricted_to_workflows")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRestrictedToWorkflows() {
        return restrictedToWorkflows;
    }

    /**
     * Setter for RestrictedToWorkflows.
     * If `true`, the runner group will be restricted to running only the workflows specified in the
     * `selected_workflows` array.
     * @param restrictedToWorkflows Value for Boolean
     */
    @JsonSetter("restricted_to_workflows")
    public void setRestrictedToWorkflows(Boolean restrictedToWorkflows) {
        this.restrictedToWorkflows = restrictedToWorkflows;
    }

    /**
     * Getter for SelectedWorkflows.
     * List of workflows the runner group should be allowed to run. This setting will be ignored
     * unless `restricted_to_workflows` is set to `true`.
     * @return Returns the List of String
     */
    @JsonGetter("selected_workflows")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getSelectedWorkflows() {
        return selectedWorkflows;
    }

    /**
     * Setter for SelectedWorkflows.
     * List of workflows the runner group should be allowed to run. This setting will be ignored
     * unless `restricted_to_workflows` is set to `true`.
     * @param selectedWorkflows Value for List of String
     */
    @JsonSetter("selected_workflows")
    public void setSelectedWorkflows(List<String> selectedWorkflows) {
        this.selectedWorkflows = selectedWorkflows;
    }

    /**
     * Converts this RunnerGroupsEnterprise into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RunnerGroupsEnterprise [" + "id=" + id + ", name=" + name + ", visibility="
                + visibility + ", mDefault=" + mDefault + ", runnersUrl=" + runnersUrl
                + ", allowsPublicRepositories=" + allowsPublicRepositories
                + ", selectedOrganizationsUrl=" + selectedOrganizationsUrl
                + ", workflowRestrictionsReadOnly=" + workflowRestrictionsReadOnly
                + ", restrictedToWorkflows=" + restrictedToWorkflows + ", selectedWorkflows="
                + selectedWorkflows + "]";
    }

    /**
     * Builds a new {@link RunnerGroupsEnterprise.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RunnerGroupsEnterprise.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, name, visibility, mDefault, runnersUrl,
                allowsPublicRepositories)
                .selectedOrganizationsUrl(getSelectedOrganizationsUrl())
                .workflowRestrictionsReadOnly(getWorkflowRestrictionsReadOnly())
                .restrictedToWorkflows(getRestrictedToWorkflows())
                .selectedWorkflows(getSelectedWorkflows());
        return builder;
    }

    /**
     * Class to build instances of {@link RunnerGroupsEnterprise}.
     */
    public static class Builder {
        private double id;
        private String name;
        private String visibility;
        private boolean mDefault;
        private String runnersUrl;
        private boolean allowsPublicRepositories;
        private String selectedOrganizationsUrl;
        private Boolean workflowRestrictionsReadOnly = false;
        private Boolean restrictedToWorkflows = false;
        private List<String> selectedWorkflows;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  double value for id.
         * @param  name  String value for name.
         * @param  visibility  String value for visibility.
         * @param  mDefault  boolean value for mDefault.
         * @param  runnersUrl  String value for runnersUrl.
         * @param  allowsPublicRepositories  boolean value for allowsPublicRepositories.
         */
        public Builder(double id, String name, String visibility, boolean mDefault,
                String runnersUrl, boolean allowsPublicRepositories) {
            this.id = id;
            this.name = name;
            this.visibility = visibility;
            this.mDefault = mDefault;
            this.runnersUrl = runnersUrl;
            this.allowsPublicRepositories = allowsPublicRepositories;
        }

        /**
         * Setter for id.
         * @param  id  double value for id.
         * @return Builder
         */
        public Builder id(double id) {
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
         * Setter for visibility.
         * @param  visibility  String value for visibility.
         * @return Builder
         */
        public Builder visibility(String visibility) {
            this.visibility = visibility;
            return this;
        }

        /**
         * Setter for mDefault.
         * @param  mDefault  boolean value for mDefault.
         * @return Builder
         */
        public Builder mDefault(boolean mDefault) {
            this.mDefault = mDefault;
            return this;
        }

        /**
         * Setter for runnersUrl.
         * @param  runnersUrl  String value for runnersUrl.
         * @return Builder
         */
        public Builder runnersUrl(String runnersUrl) {
            this.runnersUrl = runnersUrl;
            return this;
        }

        /**
         * Setter for allowsPublicRepositories.
         * @param  allowsPublicRepositories  boolean value for allowsPublicRepositories.
         * @return Builder
         */
        public Builder allowsPublicRepositories(boolean allowsPublicRepositories) {
            this.allowsPublicRepositories = allowsPublicRepositories;
            return this;
        }

        /**
         * Setter for selectedOrganizationsUrl.
         * @param  selectedOrganizationsUrl  String value for selectedOrganizationsUrl.
         * @return Builder
         */
        public Builder selectedOrganizationsUrl(String selectedOrganizationsUrl) {
            this.selectedOrganizationsUrl = selectedOrganizationsUrl;
            return this;
        }

        /**
         * Setter for workflowRestrictionsReadOnly.
         * @param  workflowRestrictionsReadOnly  Boolean value for workflowRestrictionsReadOnly.
         * @return Builder
         */
        public Builder workflowRestrictionsReadOnly(Boolean workflowRestrictionsReadOnly) {
            this.workflowRestrictionsReadOnly = workflowRestrictionsReadOnly;
            return this;
        }

        /**
         * Setter for restrictedToWorkflows.
         * @param  restrictedToWorkflows  Boolean value for restrictedToWorkflows.
         * @return Builder
         */
        public Builder restrictedToWorkflows(Boolean restrictedToWorkflows) {
            this.restrictedToWorkflows = restrictedToWorkflows;
            return this;
        }

        /**
         * Setter for selectedWorkflows.
         * @param  selectedWorkflows  List of String value for selectedWorkflows.
         * @return Builder
         */
        public Builder selectedWorkflows(List<String> selectedWorkflows) {
            this.selectedWorkflows = selectedWorkflows;
            return this;
        }

        /**
         * Builds a new {@link RunnerGroupsEnterprise} object using the set fields.
         * @return {@link RunnerGroupsEnterprise}
         */
        public RunnerGroupsEnterprise build() {
            return new RunnerGroupsEnterprise(id, name, visibility, mDefault, runnersUrl,
                    allowsPublicRepositories, selectedOrganizationsUrl,
                    workflowRestrictionsReadOnly, restrictedToWorkflows, selectedWorkflows);
        }
    }
}