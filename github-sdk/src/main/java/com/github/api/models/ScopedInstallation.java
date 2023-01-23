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
 * This is a model class for ScopedInstallation type.
 */
public class ScopedInstallation {
    private Permissions3 permissions;
    private RepositorySelectionEnum repositorySelection;
    private String singleFileName;
    private Boolean hasMultipleSingleFiles;
    private List<String> singleFilePaths;
    private String repositoriesUrl;
    private Account12 account;

    /**
     * Default constructor.
     */
    public ScopedInstallation() {
    }

    /**
     * Initialization constructor.
     * @param  permissions  Permissions3 value for permissions.
     * @param  repositorySelection  RepositorySelectionEnum value for repositorySelection.
     * @param  singleFileName  String value for singleFileName.
     * @param  repositoriesUrl  String value for repositoriesUrl.
     * @param  account  Account12 value for account.
     * @param  hasMultipleSingleFiles  Boolean value for hasMultipleSingleFiles.
     * @param  singleFilePaths  List of String value for singleFilePaths.
     */
    public ScopedInstallation(
            Permissions3 permissions,
            RepositorySelectionEnum repositorySelection,
            String singleFileName,
            String repositoriesUrl,
            Account12 account,
            Boolean hasMultipleSingleFiles,
            List<String> singleFilePaths) {
        this.permissions = permissions;
        this.repositorySelection = repositorySelection;
        this.singleFileName = singleFileName;
        this.hasMultipleSingleFiles = hasMultipleSingleFiles;
        this.singleFilePaths = singleFilePaths;
        this.repositoriesUrl = repositoriesUrl;
        this.account = account;
    }

    /**
     * Getter for Permissions.
     * @return Returns the Permissions3
     */
    @JsonGetter("permissions")
    public Permissions3 getPermissions() {
        return permissions;
    }

    /**
     * Setter for Permissions.
     * @param permissions Value for Permissions3
     */
    @JsonSetter("permissions")
    public void setPermissions(Permissions3 permissions) {
        this.permissions = permissions;
    }

    /**
     * Getter for RepositorySelection.
     * @return Returns the RepositorySelectionEnum
     */
    @JsonGetter("repository_selection")
    public RepositorySelectionEnum getRepositorySelection() {
        return repositorySelection;
    }

    /**
     * Setter for RepositorySelection.
     * @param repositorySelection Value for RepositorySelectionEnum
     */
    @JsonSetter("repository_selection")
    public void setRepositorySelection(RepositorySelectionEnum repositorySelection) {
        this.repositorySelection = repositorySelection;
    }

    /**
     * Getter for SingleFileName.
     * @return Returns the String
     */
    @JsonGetter("single_file_name")
    public String getSingleFileName() {
        return singleFileName;
    }

    /**
     * Setter for SingleFileName.
     * @param singleFileName Value for String
     */
    @JsonSetter("single_file_name")
    public void setSingleFileName(String singleFileName) {
        this.singleFileName = singleFileName;
    }

    /**
     * Getter for HasMultipleSingleFiles.
     * @return Returns the Boolean
     */
    @JsonGetter("has_multiple_single_files")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getHasMultipleSingleFiles() {
        return hasMultipleSingleFiles;
    }

    /**
     * Setter for HasMultipleSingleFiles.
     * @param hasMultipleSingleFiles Value for Boolean
     */
    @JsonSetter("has_multiple_single_files")
    public void setHasMultipleSingleFiles(Boolean hasMultipleSingleFiles) {
        this.hasMultipleSingleFiles = hasMultipleSingleFiles;
    }

    /**
     * Getter for SingleFilePaths.
     * @return Returns the List of String
     */
    @JsonGetter("single_file_paths")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getSingleFilePaths() {
        return singleFilePaths;
    }

    /**
     * Setter for SingleFilePaths.
     * @param singleFilePaths Value for List of String
     */
    @JsonSetter("single_file_paths")
    public void setSingleFilePaths(List<String> singleFilePaths) {
        this.singleFilePaths = singleFilePaths;
    }

    /**
     * Getter for RepositoriesUrl.
     * @return Returns the String
     */
    @JsonGetter("repositories_url")
    public String getRepositoriesUrl() {
        return repositoriesUrl;
    }

    /**
     * Setter for RepositoriesUrl.
     * @param repositoriesUrl Value for String
     */
    @JsonSetter("repositories_url")
    public void setRepositoriesUrl(String repositoriesUrl) {
        this.repositoriesUrl = repositoriesUrl;
    }

    /**
     * Getter for Account.
     * @return Returns the Account12
     */
    @JsonGetter("account")
    public Account12 getAccount() {
        return account;
    }

    /**
     * Setter for Account.
     * @param account Value for Account12
     */
    @JsonSetter("account")
    public void setAccount(Account12 account) {
        this.account = account;
    }

    /**
     * Converts this ScopedInstallation into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ScopedInstallation [" + "permissions=" + permissions + ", repositorySelection="
                + repositorySelection + ", singleFileName=" + singleFileName + ", repositoriesUrl="
                + repositoriesUrl + ", account=" + account + ", hasMultipleSingleFiles="
                + hasMultipleSingleFiles + ", singleFilePaths=" + singleFilePaths + "]";
    }

    /**
     * Builds a new {@link ScopedInstallation.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ScopedInstallation.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(permissions, repositorySelection, singleFileName,
                repositoriesUrl, account)
                .hasMultipleSingleFiles(getHasMultipleSingleFiles())
                .singleFilePaths(getSingleFilePaths());
        return builder;
    }

    /**
     * Class to build instances of {@link ScopedInstallation}.
     */
    public static class Builder {
        private Permissions3 permissions;
        private RepositorySelectionEnum repositorySelection;
        private String singleFileName;
        private String repositoriesUrl;
        private Account12 account;
        private Boolean hasMultipleSingleFiles;
        private List<String> singleFilePaths;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  permissions  Permissions3 value for permissions.
         * @param  repositorySelection  RepositorySelectionEnum value for repositorySelection.
         * @param  singleFileName  String value for singleFileName.
         * @param  repositoriesUrl  String value for repositoriesUrl.
         * @param  account  Account12 value for account.
         */
        public Builder(Permissions3 permissions, RepositorySelectionEnum repositorySelection,
                String singleFileName, String repositoriesUrl, Account12 account) {
            this.permissions = permissions;
            this.repositorySelection = repositorySelection;
            this.singleFileName = singleFileName;
            this.repositoriesUrl = repositoriesUrl;
            this.account = account;
        }

        /**
         * Setter for permissions.
         * @param  permissions  Permissions3 value for permissions.
         * @return Builder
         */
        public Builder permissions(Permissions3 permissions) {
            this.permissions = permissions;
            return this;
        }

        /**
         * Setter for repositorySelection.
         * @param  repositorySelection  RepositorySelectionEnum value for repositorySelection.
         * @return Builder
         */
        public Builder repositorySelection(RepositorySelectionEnum repositorySelection) {
            this.repositorySelection = repositorySelection;
            return this;
        }

        /**
         * Setter for singleFileName.
         * @param  singleFileName  String value for singleFileName.
         * @return Builder
         */
        public Builder singleFileName(String singleFileName) {
            this.singleFileName = singleFileName;
            return this;
        }

        /**
         * Setter for repositoriesUrl.
         * @param  repositoriesUrl  String value for repositoriesUrl.
         * @return Builder
         */
        public Builder repositoriesUrl(String repositoriesUrl) {
            this.repositoriesUrl = repositoriesUrl;
            return this;
        }

        /**
         * Setter for account.
         * @param  account  Account12 value for account.
         * @return Builder
         */
        public Builder account(Account12 account) {
            this.account = account;
            return this;
        }

        /**
         * Setter for hasMultipleSingleFiles.
         * @param  hasMultipleSingleFiles  Boolean value for hasMultipleSingleFiles.
         * @return Builder
         */
        public Builder hasMultipleSingleFiles(Boolean hasMultipleSingleFiles) {
            this.hasMultipleSingleFiles = hasMultipleSingleFiles;
            return this;
        }

        /**
         * Setter for singleFilePaths.
         * @param  singleFilePaths  List of String value for singleFilePaths.
         * @return Builder
         */
        public Builder singleFilePaths(List<String> singleFilePaths) {
            this.singleFilePaths = singleFilePaths;
            return this;
        }

        /**
         * Builds a new {@link ScopedInstallation} object using the set fields.
         * @return {@link ScopedInstallation}
         */
        public ScopedInstallation build() {
            return new ScopedInstallation(permissions, repositorySelection, singleFileName,
                    repositoriesUrl, account, hasMultipleSingleFiles, singleFilePaths);
        }
    }
}
