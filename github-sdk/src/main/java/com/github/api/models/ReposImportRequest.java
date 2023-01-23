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
 * This is a model class for ReposImportRequest type.
 */
public class ReposImportRequest {
    private String vcsUrl;
    private VcsEnum vcs;
    private String vcsUsername;
    private String vcsPassword;
    private String tfvcProject;

    /**
     * Default constructor.
     */
    public ReposImportRequest() {
    }

    /**
     * Initialization constructor.
     * @param  vcsUrl  String value for vcsUrl.
     * @param  vcs  VcsEnum value for vcs.
     * @param  vcsUsername  String value for vcsUsername.
     * @param  vcsPassword  String value for vcsPassword.
     * @param  tfvcProject  String value for tfvcProject.
     */
    public ReposImportRequest(
            String vcsUrl,
            VcsEnum vcs,
            String vcsUsername,
            String vcsPassword,
            String tfvcProject) {
        this.vcsUrl = vcsUrl;
        this.vcs = vcs;
        this.vcsUsername = vcsUsername;
        this.vcsPassword = vcsPassword;
        this.tfvcProject = tfvcProject;
    }

    /**
     * Getter for VcsUrl.
     * The URL of the originating repository.
     * @return Returns the String
     */
    @JsonGetter("vcs_url")
    public String getVcsUrl() {
        return vcsUrl;
    }

    /**
     * Setter for VcsUrl.
     * The URL of the originating repository.
     * @param vcsUrl Value for String
     */
    @JsonSetter("vcs_url")
    public void setVcsUrl(String vcsUrl) {
        this.vcsUrl = vcsUrl;
    }

    /**
     * Getter for Vcs.
     * @return Returns the VcsEnum
     */
    @JsonGetter("vcs")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public VcsEnum getVcs() {
        return vcs;
    }

    /**
     * Setter for Vcs.
     * @param vcs Value for VcsEnum
     */
    @JsonSetter("vcs")
    public void setVcs(VcsEnum vcs) {
        this.vcs = vcs;
    }

    /**
     * Getter for VcsUsername.
     * If authentication is required, the username to provide to `vcs_url`.
     * @return Returns the String
     */
    @JsonGetter("vcs_username")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVcsUsername() {
        return vcsUsername;
    }

    /**
     * Setter for VcsUsername.
     * If authentication is required, the username to provide to `vcs_url`.
     * @param vcsUsername Value for String
     */
    @JsonSetter("vcs_username")
    public void setVcsUsername(String vcsUsername) {
        this.vcsUsername = vcsUsername;
    }

    /**
     * Getter for VcsPassword.
     * If authentication is required, the password to provide to `vcs_url`.
     * @return Returns the String
     */
    @JsonGetter("vcs_password")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVcsPassword() {
        return vcsPassword;
    }

    /**
     * Setter for VcsPassword.
     * If authentication is required, the password to provide to `vcs_url`.
     * @param vcsPassword Value for String
     */
    @JsonSetter("vcs_password")
    public void setVcsPassword(String vcsPassword) {
        this.vcsPassword = vcsPassword;
    }

    /**
     * Getter for TfvcProject.
     * For a tfvc import, the name of the project that is being imported.
     * @return Returns the String
     */
    @JsonGetter("tfvc_project")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTfvcProject() {
        return tfvcProject;
    }

    /**
     * Setter for TfvcProject.
     * For a tfvc import, the name of the project that is being imported.
     * @param tfvcProject Value for String
     */
    @JsonSetter("tfvc_project")
    public void setTfvcProject(String tfvcProject) {
        this.tfvcProject = tfvcProject;
    }

    /**
     * Converts this ReposImportRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposImportRequest [" + "vcsUrl=" + vcsUrl + ", vcs=" + vcs + ", vcsUsername="
                + vcsUsername + ", vcsPassword=" + vcsPassword + ", tfvcProject=" + tfvcProject
                + "]";
    }

    /**
     * Builds a new {@link ReposImportRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposImportRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(vcsUrl)
                .vcs(getVcs())
                .vcsUsername(getVcsUsername())
                .vcsPassword(getVcsPassword())
                .tfvcProject(getTfvcProject());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposImportRequest}.
     */
    public static class Builder {
        private String vcsUrl;
        private VcsEnum vcs;
        private String vcsUsername;
        private String vcsPassword;
        private String tfvcProject;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  vcsUrl  String value for vcsUrl.
         */
        public Builder(String vcsUrl) {
            this.vcsUrl = vcsUrl;
        }

        /**
         * Setter for vcsUrl.
         * @param  vcsUrl  String value for vcsUrl.
         * @return Builder
         */
        public Builder vcsUrl(String vcsUrl) {
            this.vcsUrl = vcsUrl;
            return this;
        }

        /**
         * Setter for vcs.
         * @param  vcs  VcsEnum value for vcs.
         * @return Builder
         */
        public Builder vcs(VcsEnum vcs) {
            this.vcs = vcs;
            return this;
        }

        /**
         * Setter for vcsUsername.
         * @param  vcsUsername  String value for vcsUsername.
         * @return Builder
         */
        public Builder vcsUsername(String vcsUsername) {
            this.vcsUsername = vcsUsername;
            return this;
        }

        /**
         * Setter for vcsPassword.
         * @param  vcsPassword  String value for vcsPassword.
         * @return Builder
         */
        public Builder vcsPassword(String vcsPassword) {
            this.vcsPassword = vcsPassword;
            return this;
        }

        /**
         * Setter for tfvcProject.
         * @param  tfvcProject  String value for tfvcProject.
         * @return Builder
         */
        public Builder tfvcProject(String tfvcProject) {
            this.tfvcProject = tfvcProject;
            return this;
        }

        /**
         * Builds a new {@link ReposImportRequest} object using the set fields.
         * @return {@link ReposImportRequest}
         */
        public ReposImportRequest build() {
            return new ReposImportRequest(vcsUrl, vcs, vcsUsername, vcsPassword, tfvcProject);
        }
    }
}
