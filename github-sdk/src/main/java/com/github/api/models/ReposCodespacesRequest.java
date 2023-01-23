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
 * This is a model class for ReposCodespacesRequest type.
 */
public class ReposCodespacesRequest {
    private String ref;
    private String location;
    private String clientIp;
    private String machine;
    private String devcontainerPath;
    private Boolean multiRepoPermissionsOptOut;
    private String workingDirectory;
    private Integer idleTimeoutMinutes;
    private String displayName;
    private Integer retentionPeriodMinutes;

    /**
     * Default constructor.
     */
    public ReposCodespacesRequest() {
    }

    /**
     * Initialization constructor.
     * @param  ref  String value for ref.
     * @param  location  String value for location.
     * @param  clientIp  String value for clientIp.
     * @param  machine  String value for machine.
     * @param  devcontainerPath  String value for devcontainerPath.
     * @param  multiRepoPermissionsOptOut  Boolean value for multiRepoPermissionsOptOut.
     * @param  workingDirectory  String value for workingDirectory.
     * @param  idleTimeoutMinutes  Integer value for idleTimeoutMinutes.
     * @param  displayName  String value for displayName.
     * @param  retentionPeriodMinutes  Integer value for retentionPeriodMinutes.
     */
    public ReposCodespacesRequest(
            String ref,
            String location,
            String clientIp,
            String machine,
            String devcontainerPath,
            Boolean multiRepoPermissionsOptOut,
            String workingDirectory,
            Integer idleTimeoutMinutes,
            String displayName,
            Integer retentionPeriodMinutes) {
        this.ref = ref;
        this.location = location;
        this.clientIp = clientIp;
        this.machine = machine;
        this.devcontainerPath = devcontainerPath;
        this.multiRepoPermissionsOptOut = multiRepoPermissionsOptOut;
        this.workingDirectory = workingDirectory;
        this.idleTimeoutMinutes = idleTimeoutMinutes;
        this.displayName = displayName;
        this.retentionPeriodMinutes = retentionPeriodMinutes;
    }

    /**
     * Getter for Ref.
     * Git ref (typically a branch name) for this codespace
     * @return Returns the String
     */
    @JsonGetter("ref")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRef() {
        return ref;
    }

    /**
     * Setter for Ref.
     * Git ref (typically a branch name) for this codespace
     * @param ref Value for String
     */
    @JsonSetter("ref")
    public void setRef(String ref) {
        this.ref = ref;
    }

    /**
     * Getter for Location.
     * Location for this codespace. Assigned by IP if not provided
     * @return Returns the String
     */
    @JsonGetter("location")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLocation() {
        return location;
    }

    /**
     * Setter for Location.
     * Location for this codespace. Assigned by IP if not provided
     * @param location Value for String
     */
    @JsonSetter("location")
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Getter for ClientIp.
     * IP for location auto-detection when proxying a request
     * @return Returns the String
     */
    @JsonGetter("client_ip")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getClientIp() {
        return clientIp;
    }

    /**
     * Setter for ClientIp.
     * IP for location auto-detection when proxying a request
     * @param clientIp Value for String
     */
    @JsonSetter("client_ip")
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    /**
     * Getter for Machine.
     * Machine type to use for this codespace
     * @return Returns the String
     */
    @JsonGetter("machine")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMachine() {
        return machine;
    }

    /**
     * Setter for Machine.
     * Machine type to use for this codespace
     * @param machine Value for String
     */
    @JsonSetter("machine")
    public void setMachine(String machine) {
        this.machine = machine;
    }

    /**
     * Getter for DevcontainerPath.
     * Path to devcontainer.json config to use for this codespace
     * @return Returns the String
     */
    @JsonGetter("devcontainer_path")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDevcontainerPath() {
        return devcontainerPath;
    }

    /**
     * Setter for DevcontainerPath.
     * Path to devcontainer.json config to use for this codespace
     * @param devcontainerPath Value for String
     */
    @JsonSetter("devcontainer_path")
    public void setDevcontainerPath(String devcontainerPath) {
        this.devcontainerPath = devcontainerPath;
    }

    /**
     * Getter for MultiRepoPermissionsOptOut.
     * Whether to authorize requested permissions from devcontainer.json
     * @return Returns the Boolean
     */
    @JsonGetter("multi_repo_permissions_opt_out")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getMultiRepoPermissionsOptOut() {
        return multiRepoPermissionsOptOut;
    }

    /**
     * Setter for MultiRepoPermissionsOptOut.
     * Whether to authorize requested permissions from devcontainer.json
     * @param multiRepoPermissionsOptOut Value for Boolean
     */
    @JsonSetter("multi_repo_permissions_opt_out")
    public void setMultiRepoPermissionsOptOut(Boolean multiRepoPermissionsOptOut) {
        this.multiRepoPermissionsOptOut = multiRepoPermissionsOptOut;
    }

    /**
     * Getter for WorkingDirectory.
     * Working directory for this codespace
     * @return Returns the String
     */
    @JsonGetter("working_directory")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getWorkingDirectory() {
        return workingDirectory;
    }

    /**
     * Setter for WorkingDirectory.
     * Working directory for this codespace
     * @param workingDirectory Value for String
     */
    @JsonSetter("working_directory")
    public void setWorkingDirectory(String workingDirectory) {
        this.workingDirectory = workingDirectory;
    }

    /**
     * Getter for IdleTimeoutMinutes.
     * Time in minutes before codespace stops from inactivity
     * @return Returns the Integer
     */
    @JsonGetter("idle_timeout_minutes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getIdleTimeoutMinutes() {
        return idleTimeoutMinutes;
    }

    /**
     * Setter for IdleTimeoutMinutes.
     * Time in minutes before codespace stops from inactivity
     * @param idleTimeoutMinutes Value for Integer
     */
    @JsonSetter("idle_timeout_minutes")
    public void setIdleTimeoutMinutes(Integer idleTimeoutMinutes) {
        this.idleTimeoutMinutes = idleTimeoutMinutes;
    }

    /**
     * Getter for DisplayName.
     * Display name for this codespace
     * @return Returns the String
     */
    @JsonGetter("display_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Setter for DisplayName.
     * Display name for this codespace
     * @param displayName Value for String
     */
    @JsonSetter("display_name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Getter for RetentionPeriodMinutes.
     * Duration in minutes after codespace has gone idle in which it will be deleted. Must be
     * integer minutes between 0 and 43200 (30 days).
     * @return Returns the Integer
     */
    @JsonGetter("retention_period_minutes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getRetentionPeriodMinutes() {
        return retentionPeriodMinutes;
    }

    /**
     * Setter for RetentionPeriodMinutes.
     * Duration in minutes after codespace has gone idle in which it will be deleted. Must be
     * integer minutes between 0 and 43200 (30 days).
     * @param retentionPeriodMinutes Value for Integer
     */
    @JsonSetter("retention_period_minutes")
    public void setRetentionPeriodMinutes(Integer retentionPeriodMinutes) {
        this.retentionPeriodMinutes = retentionPeriodMinutes;
    }

    /**
     * Converts this ReposCodespacesRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposCodespacesRequest [" + "ref=" + ref + ", location=" + location + ", clientIp="
                + clientIp + ", machine=" + machine + ", devcontainerPath=" + devcontainerPath
                + ", multiRepoPermissionsOptOut=" + multiRepoPermissionsOptOut
                + ", workingDirectory=" + workingDirectory + ", idleTimeoutMinutes="
                + idleTimeoutMinutes + ", displayName=" + displayName + ", retentionPeriodMinutes="
                + retentionPeriodMinutes + "]";
    }

    /**
     * Builds a new {@link ReposCodespacesRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposCodespacesRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .ref(getRef())
                .location(getLocation())
                .clientIp(getClientIp())
                .machine(getMachine())
                .devcontainerPath(getDevcontainerPath())
                .multiRepoPermissionsOptOut(getMultiRepoPermissionsOptOut())
                .workingDirectory(getWorkingDirectory())
                .idleTimeoutMinutes(getIdleTimeoutMinutes())
                .displayName(getDisplayName())
                .retentionPeriodMinutes(getRetentionPeriodMinutes());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposCodespacesRequest}.
     */
    public static class Builder {
        private String ref;
        private String location;
        private String clientIp;
        private String machine;
        private String devcontainerPath;
        private Boolean multiRepoPermissionsOptOut;
        private String workingDirectory;
        private Integer idleTimeoutMinutes;
        private String displayName;
        private Integer retentionPeriodMinutes;



        /**
         * Setter for ref.
         * @param  ref  String value for ref.
         * @return Builder
         */
        public Builder ref(String ref) {
            this.ref = ref;
            return this;
        }

        /**
         * Setter for location.
         * @param  location  String value for location.
         * @return Builder
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * Setter for clientIp.
         * @param  clientIp  String value for clientIp.
         * @return Builder
         */
        public Builder clientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }

        /**
         * Setter for machine.
         * @param  machine  String value for machine.
         * @return Builder
         */
        public Builder machine(String machine) {
            this.machine = machine;
            return this;
        }

        /**
         * Setter for devcontainerPath.
         * @param  devcontainerPath  String value for devcontainerPath.
         * @return Builder
         */
        public Builder devcontainerPath(String devcontainerPath) {
            this.devcontainerPath = devcontainerPath;
            return this;
        }

        /**
         * Setter for multiRepoPermissionsOptOut.
         * @param  multiRepoPermissionsOptOut  Boolean value for multiRepoPermissionsOptOut.
         * @return Builder
         */
        public Builder multiRepoPermissionsOptOut(Boolean multiRepoPermissionsOptOut) {
            this.multiRepoPermissionsOptOut = multiRepoPermissionsOptOut;
            return this;
        }

        /**
         * Setter for workingDirectory.
         * @param  workingDirectory  String value for workingDirectory.
         * @return Builder
         */
        public Builder workingDirectory(String workingDirectory) {
            this.workingDirectory = workingDirectory;
            return this;
        }

        /**
         * Setter for idleTimeoutMinutes.
         * @param  idleTimeoutMinutes  Integer value for idleTimeoutMinutes.
         * @return Builder
         */
        public Builder idleTimeoutMinutes(Integer idleTimeoutMinutes) {
            this.idleTimeoutMinutes = idleTimeoutMinutes;
            return this;
        }

        /**
         * Setter for displayName.
         * @param  displayName  String value for displayName.
         * @return Builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Setter for retentionPeriodMinutes.
         * @param  retentionPeriodMinutes  Integer value for retentionPeriodMinutes.
         * @return Builder
         */
        public Builder retentionPeriodMinutes(Integer retentionPeriodMinutes) {
            this.retentionPeriodMinutes = retentionPeriodMinutes;
            return this;
        }

        /**
         * Builds a new {@link ReposCodespacesRequest} object using the set fields.
         * @return {@link ReposCodespacesRequest}
         */
        public ReposCodespacesRequest build() {
            return new ReposCodespacesRequest(ref, location, clientIp, machine, devcontainerPath,
                    multiRepoPermissionsOptOut, workingDirectory, idleTimeoutMinutes, displayName,
                    retentionPeriodMinutes);
        }
    }
}
