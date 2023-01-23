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
 * This is a model class for OrgsReposRequest type.
 */
public class OrgsReposRequest {
    private String name;
    private String description;
    private String homepage;
    private Boolean mPrivate;
    private Visibility88Enum visibility;
    private Boolean hasIssues;
    private Boolean hasProjects;
    private Boolean hasWiki;
    private Boolean hasDownloads;
    private Boolean isTemplate;
    private Integer teamId;
    private Boolean autoInit;
    private String gitignoreTemplate;
    private String licenseTemplate;
    private Boolean allowSquashMerge;
    private Boolean allowMergeCommit;
    private Boolean allowRebaseMerge;
    private Boolean allowAutoMerge;
    private Boolean deleteBranchOnMerge;
    private Boolean useSquashPrTitleAsDefault;
    private SquashMergeCommitTitleEnum squashMergeCommitTitle;
    private SquashMergeCommitMessageEnum squashMergeCommitMessage;
    private MergeCommitTitleEnum mergeCommitTitle;
    private MergeCommitMessageEnum mergeCommitMessage;

    /**
     * Default constructor.
     */
    public OrgsReposRequest() {
        mPrivate = false;
        hasIssues = true;
        hasProjects = true;
        hasWiki = true;
        hasDownloads = true;
        isTemplate = false;
        autoInit = false;
        allowSquashMerge = true;
        allowMergeCommit = true;
        allowRebaseMerge = true;
        allowAutoMerge = false;
        deleteBranchOnMerge = false;
        useSquashPrTitleAsDefault = false;
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  description  String value for description.
     * @param  homepage  String value for homepage.
     * @param  mPrivate  Boolean value for mPrivate.
     * @param  visibility  Visibility88Enum value for visibility.
     * @param  hasIssues  Boolean value for hasIssues.
     * @param  hasProjects  Boolean value for hasProjects.
     * @param  hasWiki  Boolean value for hasWiki.
     * @param  hasDownloads  Boolean value for hasDownloads.
     * @param  isTemplate  Boolean value for isTemplate.
     * @param  teamId  Integer value for teamId.
     * @param  autoInit  Boolean value for autoInit.
     * @param  gitignoreTemplate  String value for gitignoreTemplate.
     * @param  licenseTemplate  String value for licenseTemplate.
     * @param  allowSquashMerge  Boolean value for allowSquashMerge.
     * @param  allowMergeCommit  Boolean value for allowMergeCommit.
     * @param  allowRebaseMerge  Boolean value for allowRebaseMerge.
     * @param  allowAutoMerge  Boolean value for allowAutoMerge.
     * @param  deleteBranchOnMerge  Boolean value for deleteBranchOnMerge.
     * @param  useSquashPrTitleAsDefault  Boolean value for useSquashPrTitleAsDefault.
     * @param  squashMergeCommitTitle  SquashMergeCommitTitleEnum value for squashMergeCommitTitle.
     * @param  squashMergeCommitMessage  SquashMergeCommitMessageEnum value for
     *         squashMergeCommitMessage.
     * @param  mergeCommitTitle  MergeCommitTitleEnum value for mergeCommitTitle.
     * @param  mergeCommitMessage  MergeCommitMessageEnum value for mergeCommitMessage.
     */
    public OrgsReposRequest(
            String name,
            String description,
            String homepage,
            Boolean mPrivate,
            Visibility88Enum visibility,
            Boolean hasIssues,
            Boolean hasProjects,
            Boolean hasWiki,
            Boolean hasDownloads,
            Boolean isTemplate,
            Integer teamId,
            Boolean autoInit,
            String gitignoreTemplate,
            String licenseTemplate,
            Boolean allowSquashMerge,
            Boolean allowMergeCommit,
            Boolean allowRebaseMerge,
            Boolean allowAutoMerge,
            Boolean deleteBranchOnMerge,
            Boolean useSquashPrTitleAsDefault,
            SquashMergeCommitTitleEnum squashMergeCommitTitle,
            SquashMergeCommitMessageEnum squashMergeCommitMessage,
            MergeCommitTitleEnum mergeCommitTitle,
            MergeCommitMessageEnum mergeCommitMessage) {
        this.name = name;
        this.description = description;
        this.homepage = homepage;
        this.mPrivate = mPrivate;
        this.visibility = visibility;
        this.hasIssues = hasIssues;
        this.hasProjects = hasProjects;
        this.hasWiki = hasWiki;
        this.hasDownloads = hasDownloads;
        this.isTemplate = isTemplate;
        this.teamId = teamId;
        this.autoInit = autoInit;
        this.gitignoreTemplate = gitignoreTemplate;
        this.licenseTemplate = licenseTemplate;
        this.allowSquashMerge = allowSquashMerge;
        this.allowMergeCommit = allowMergeCommit;
        this.allowRebaseMerge = allowRebaseMerge;
        this.allowAutoMerge = allowAutoMerge;
        this.deleteBranchOnMerge = deleteBranchOnMerge;
        this.useSquashPrTitleAsDefault = useSquashPrTitleAsDefault;
        this.squashMergeCommitTitle = squashMergeCommitTitle;
        this.squashMergeCommitMessage = squashMergeCommitMessage;
        this.mergeCommitTitle = mergeCommitTitle;
        this.mergeCommitMessage = mergeCommitMessage;
    }

    /**
     * Getter for Name.
     * The name of the repository.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the repository.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Description.
     * A short description of the repository.
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * A short description of the repository.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Homepage.
     * A URL with more information about the repository.
     * @return Returns the String
     */
    @JsonGetter("homepage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getHomepage() {
        return homepage;
    }

    /**
     * Setter for Homepage.
     * A URL with more information about the repository.
     * @param homepage Value for String
     */
    @JsonSetter("homepage")
    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    /**
     * Getter for Private.
     * Whether the repository is private.
     * @return Returns the Boolean
     */
    @JsonGetter("private")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPrivate() {
        return mPrivate;
    }

    /**
     * Setter for Private.
     * Whether the repository is private.
     * @param mPrivate Value for Boolean
     */
    @JsonSetter("private")
    public void setPrivate(Boolean mPrivate) {
        this.mPrivate = mPrivate;
    }

    /**
     * Getter for Visibility.
     * @return Returns the Visibility88Enum
     */
    @JsonGetter("visibility")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Visibility88Enum getVisibility() {
        return visibility;
    }

    /**
     * Setter for Visibility.
     * @param visibility Value for Visibility88Enum
     */
    @JsonSetter("visibility")
    public void setVisibility(Visibility88Enum visibility) {
        this.visibility = visibility;
    }

    /**
     * Getter for HasIssues.
     * Either `true` to enable issues for this repository or `false` to disable them.
     * @return Returns the Boolean
     */
    @JsonGetter("has_issues")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getHasIssues() {
        return hasIssues;
    }

    /**
     * Setter for HasIssues.
     * Either `true` to enable issues for this repository or `false` to disable them.
     * @param hasIssues Value for Boolean
     */
    @JsonSetter("has_issues")
    public void setHasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    /**
     * Getter for HasProjects.
     * Either `true` to enable projects for this repository or `false` to disable them. **Note:** If
     * you're creating a repository in an organization that has disabled repository projects, the
     * default is `false`, and if you pass `true`, the API returns an error.
     * @return Returns the Boolean
     */
    @JsonGetter("has_projects")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getHasProjects() {
        return hasProjects;
    }

    /**
     * Setter for HasProjects.
     * Either `true` to enable projects for this repository or `false` to disable them. **Note:** If
     * you're creating a repository in an organization that has disabled repository projects, the
     * default is `false`, and if you pass `true`, the API returns an error.
     * @param hasProjects Value for Boolean
     */
    @JsonSetter("has_projects")
    public void setHasProjects(Boolean hasProjects) {
        this.hasProjects = hasProjects;
    }

    /**
     * Getter for HasWiki.
     * Either `true` to enable the wiki for this repository or `false` to disable it.
     * @return Returns the Boolean
     */
    @JsonGetter("has_wiki")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getHasWiki() {
        return hasWiki;
    }

    /**
     * Setter for HasWiki.
     * Either `true` to enable the wiki for this repository or `false` to disable it.
     * @param hasWiki Value for Boolean
     */
    @JsonSetter("has_wiki")
    public void setHasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    /**
     * Getter for HasDownloads.
     * Whether downloads are enabled.
     * @return Returns the Boolean
     */
    @JsonGetter("has_downloads")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getHasDownloads() {
        return hasDownloads;
    }

    /**
     * Setter for HasDownloads.
     * Whether downloads are enabled.
     * @param hasDownloads Value for Boolean
     */
    @JsonSetter("has_downloads")
    public void setHasDownloads(Boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
    }

    /**
     * Getter for IsTemplate.
     * Either `true` to make this repo available as a template repository or `false` to prevent it.
     * @return Returns the Boolean
     */
    @JsonGetter("is_template")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsTemplate() {
        return isTemplate;
    }

    /**
     * Setter for IsTemplate.
     * Either `true` to make this repo available as a template repository or `false` to prevent it.
     * @param isTemplate Value for Boolean
     */
    @JsonSetter("is_template")
    public void setIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
    }

    /**
     * Getter for TeamId.
     * The id of the team that will be granted access to this repository. This is only valid when
     * creating a repository in an organization.
     * @return Returns the Integer
     */
    @JsonGetter("team_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTeamId() {
        return teamId;
    }

    /**
     * Setter for TeamId.
     * The id of the team that will be granted access to this repository. This is only valid when
     * creating a repository in an organization.
     * @param teamId Value for Integer
     */
    @JsonSetter("team_id")
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    /**
     * Getter for AutoInit.
     * Pass `true` to create an initial commit with empty README.
     * @return Returns the Boolean
     */
    @JsonGetter("auto_init")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAutoInit() {
        return autoInit;
    }

    /**
     * Setter for AutoInit.
     * Pass `true` to create an initial commit with empty README.
     * @param autoInit Value for Boolean
     */
    @JsonSetter("auto_init")
    public void setAutoInit(Boolean autoInit) {
        this.autoInit = autoInit;
    }

    /**
     * Getter for GitignoreTemplate.
     * Desired language or platform [.gitignore template](https://github.com/github/gitignore) to
     * apply. Use the name of the template without the extension. For example, "Haskell".
     * @return Returns the String
     */
    @JsonGetter("gitignore_template")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGitignoreTemplate() {
        return gitignoreTemplate;
    }

    /**
     * Setter for GitignoreTemplate.
     * Desired language or platform [.gitignore template](https://github.com/github/gitignore) to
     * apply. Use the name of the template without the extension. For example, "Haskell".
     * @param gitignoreTemplate Value for String
     */
    @JsonSetter("gitignore_template")
    public void setGitignoreTemplate(String gitignoreTemplate) {
        this.gitignoreTemplate = gitignoreTemplate;
    }

    /**
     * Getter for LicenseTemplate.
     * Choose an [open source license template](https://choosealicense.com/) that best suits your
     * needs, and then use the [license
     * keyword](https://docs.github.com/articles/licensing-a-repository/#searching-github-by-license-type)
     * as the `license_template` string. For example, "mit" or "mpl-2.0".
     * @return Returns the String
     */
    @JsonGetter("license_template")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLicenseTemplate() {
        return licenseTemplate;
    }

    /**
     * Setter for LicenseTemplate.
     * Choose an [open source license template](https://choosealicense.com/) that best suits your
     * needs, and then use the [license
     * keyword](https://docs.github.com/articles/licensing-a-repository/#searching-github-by-license-type)
     * as the `license_template` string. For example, "mit" or "mpl-2.0".
     * @param licenseTemplate Value for String
     */
    @JsonSetter("license_template")
    public void setLicenseTemplate(String licenseTemplate) {
        this.licenseTemplate = licenseTemplate;
    }

    /**
     * Getter for AllowSquashMerge.
     * Either `true` to allow squash-merging pull requests, or `false` to prevent squash-merging.
     * @return Returns the Boolean
     */
    @JsonGetter("allow_squash_merge")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAllowSquashMerge() {
        return allowSquashMerge;
    }

    /**
     * Setter for AllowSquashMerge.
     * Either `true` to allow squash-merging pull requests, or `false` to prevent squash-merging.
     * @param allowSquashMerge Value for Boolean
     */
    @JsonSetter("allow_squash_merge")
    public void setAllowSquashMerge(Boolean allowSquashMerge) {
        this.allowSquashMerge = allowSquashMerge;
    }

    /**
     * Getter for AllowMergeCommit.
     * Either `true` to allow merging pull requests with a merge commit, or `false` to prevent
     * merging pull requests with merge commits.
     * @return Returns the Boolean
     */
    @JsonGetter("allow_merge_commit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAllowMergeCommit() {
        return allowMergeCommit;
    }

    /**
     * Setter for AllowMergeCommit.
     * Either `true` to allow merging pull requests with a merge commit, or `false` to prevent
     * merging pull requests with merge commits.
     * @param allowMergeCommit Value for Boolean
     */
    @JsonSetter("allow_merge_commit")
    public void setAllowMergeCommit(Boolean allowMergeCommit) {
        this.allowMergeCommit = allowMergeCommit;
    }

    /**
     * Getter for AllowRebaseMerge.
     * Either `true` to allow rebase-merging pull requests, or `false` to prevent rebase-merging.
     * @return Returns the Boolean
     */
    @JsonGetter("allow_rebase_merge")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAllowRebaseMerge() {
        return allowRebaseMerge;
    }

    /**
     * Setter for AllowRebaseMerge.
     * Either `true` to allow rebase-merging pull requests, or `false` to prevent rebase-merging.
     * @param allowRebaseMerge Value for Boolean
     */
    @JsonSetter("allow_rebase_merge")
    public void setAllowRebaseMerge(Boolean allowRebaseMerge) {
        this.allowRebaseMerge = allowRebaseMerge;
    }

    /**
     * Getter for AllowAutoMerge.
     * Either `true` to allow auto-merge on pull requests, or `false` to disallow auto-merge.
     * @return Returns the Boolean
     */
    @JsonGetter("allow_auto_merge")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAllowAutoMerge() {
        return allowAutoMerge;
    }

    /**
     * Setter for AllowAutoMerge.
     * Either `true` to allow auto-merge on pull requests, or `false` to disallow auto-merge.
     * @param allowAutoMerge Value for Boolean
     */
    @JsonSetter("allow_auto_merge")
    public void setAllowAutoMerge(Boolean allowAutoMerge) {
        this.allowAutoMerge = allowAutoMerge;
    }

    /**
     * Getter for DeleteBranchOnMerge.
     * Either `true` to allow automatically deleting head branches when pull requests are merged, or
     * `false` to prevent automatic deletion.
     * @return Returns the Boolean
     */
    @JsonGetter("delete_branch_on_merge")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDeleteBranchOnMerge() {
        return deleteBranchOnMerge;
    }

    /**
     * Setter for DeleteBranchOnMerge.
     * Either `true` to allow automatically deleting head branches when pull requests are merged, or
     * `false` to prevent automatic deletion.
     * @param deleteBranchOnMerge Value for Boolean
     */
    @JsonSetter("delete_branch_on_merge")
    public void setDeleteBranchOnMerge(Boolean deleteBranchOnMerge) {
        this.deleteBranchOnMerge = deleteBranchOnMerge;
    }

    /**
     * Getter for UseSquashPrTitleAsDefault.
     * Either `true` to allow squash-merge commits to use pull request title, or `false` to use
     * commit message. **This property has been deprecated. Please use `squash_merge_commit_title`
     * instead.
     * @return Returns the Boolean
     */
    @JsonGetter("use_squash_pr_title_as_default")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getUseSquashPrTitleAsDefault() {
        return useSquashPrTitleAsDefault;
    }

    /**
     * Setter for UseSquashPrTitleAsDefault.
     * Either `true` to allow squash-merge commits to use pull request title, or `false` to use
     * commit message. **This property has been deprecated. Please use `squash_merge_commit_title`
     * instead.
     * @param useSquashPrTitleAsDefault Value for Boolean
     */
    @JsonSetter("use_squash_pr_title_as_default")
    public void setUseSquashPrTitleAsDefault(Boolean useSquashPrTitleAsDefault) {
        this.useSquashPrTitleAsDefault = useSquashPrTitleAsDefault;
    }

    /**
     * Getter for SquashMergeCommitTitle.
     * @return Returns the SquashMergeCommitTitleEnum
     */
    @JsonGetter("squash_merge_commit_title")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SquashMergeCommitTitleEnum getSquashMergeCommitTitle() {
        return squashMergeCommitTitle;
    }

    /**
     * Setter for SquashMergeCommitTitle.
     * @param squashMergeCommitTitle Value for SquashMergeCommitTitleEnum
     */
    @JsonSetter("squash_merge_commit_title")
    public void setSquashMergeCommitTitle(SquashMergeCommitTitleEnum squashMergeCommitTitle) {
        this.squashMergeCommitTitle = squashMergeCommitTitle;
    }

    /**
     * Getter for SquashMergeCommitMessage.
     * @return Returns the SquashMergeCommitMessageEnum
     */
    @JsonGetter("squash_merge_commit_message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SquashMergeCommitMessageEnum getSquashMergeCommitMessage() {
        return squashMergeCommitMessage;
    }

    /**
     * Setter for SquashMergeCommitMessage.
     * @param squashMergeCommitMessage Value for SquashMergeCommitMessageEnum
     */
    @JsonSetter("squash_merge_commit_message")
    public void setSquashMergeCommitMessage(SquashMergeCommitMessageEnum squashMergeCommitMessage) {
        this.squashMergeCommitMessage = squashMergeCommitMessage;
    }

    /**
     * Getter for MergeCommitTitle.
     * @return Returns the MergeCommitTitleEnum
     */
    @JsonGetter("merge_commit_title")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MergeCommitTitleEnum getMergeCommitTitle() {
        return mergeCommitTitle;
    }

    /**
     * Setter for MergeCommitTitle.
     * @param mergeCommitTitle Value for MergeCommitTitleEnum
     */
    @JsonSetter("merge_commit_title")
    public void setMergeCommitTitle(MergeCommitTitleEnum mergeCommitTitle) {
        this.mergeCommitTitle = mergeCommitTitle;
    }

    /**
     * Getter for MergeCommitMessage.
     * @return Returns the MergeCommitMessageEnum
     */
    @JsonGetter("merge_commit_message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MergeCommitMessageEnum getMergeCommitMessage() {
        return mergeCommitMessage;
    }

    /**
     * Setter for MergeCommitMessage.
     * @param mergeCommitMessage Value for MergeCommitMessageEnum
     */
    @JsonSetter("merge_commit_message")
    public void setMergeCommitMessage(MergeCommitMessageEnum mergeCommitMessage) {
        this.mergeCommitMessage = mergeCommitMessage;
    }

    /**
     * Converts this OrgsReposRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrgsReposRequest [" + "name=" + name + ", description=" + description
                + ", homepage=" + homepage + ", mPrivate=" + mPrivate + ", visibility=" + visibility
                + ", hasIssues=" + hasIssues + ", hasProjects=" + hasProjects + ", hasWiki="
                + hasWiki + ", hasDownloads=" + hasDownloads + ", isTemplate=" + isTemplate
                + ", teamId=" + teamId + ", autoInit=" + autoInit + ", gitignoreTemplate="
                + gitignoreTemplate + ", licenseTemplate=" + licenseTemplate + ", allowSquashMerge="
                + allowSquashMerge + ", allowMergeCommit=" + allowMergeCommit
                + ", allowRebaseMerge=" + allowRebaseMerge + ", allowAutoMerge=" + allowAutoMerge
                + ", deleteBranchOnMerge=" + deleteBranchOnMerge + ", useSquashPrTitleAsDefault="
                + useSquashPrTitleAsDefault + ", squashMergeCommitTitle=" + squashMergeCommitTitle
                + ", squashMergeCommitMessage=" + squashMergeCommitMessage + ", mergeCommitTitle="
                + mergeCommitTitle + ", mergeCommitMessage=" + mergeCommitMessage + "]";
    }

    /**
     * Builds a new {@link OrgsReposRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrgsReposRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name)
                .description(getDescription())
                .homepage(getHomepage())
                .mPrivate(getPrivate())
                .visibility(getVisibility())
                .hasIssues(getHasIssues())
                .hasProjects(getHasProjects())
                .hasWiki(getHasWiki())
                .hasDownloads(getHasDownloads())
                .isTemplate(getIsTemplate())
                .teamId(getTeamId())
                .autoInit(getAutoInit())
                .gitignoreTemplate(getGitignoreTemplate())
                .licenseTemplate(getLicenseTemplate())
                .allowSquashMerge(getAllowSquashMerge())
                .allowMergeCommit(getAllowMergeCommit())
                .allowRebaseMerge(getAllowRebaseMerge())
                .allowAutoMerge(getAllowAutoMerge())
                .deleteBranchOnMerge(getDeleteBranchOnMerge())
                .useSquashPrTitleAsDefault(getUseSquashPrTitleAsDefault())
                .squashMergeCommitTitle(getSquashMergeCommitTitle())
                .squashMergeCommitMessage(getSquashMergeCommitMessage())
                .mergeCommitTitle(getMergeCommitTitle())
                .mergeCommitMessage(getMergeCommitMessage());
        return builder;
    }

    /**
     * Class to build instances of {@link OrgsReposRequest}.
     */
    public static class Builder {
        private String name;
        private String description;
        private String homepage;
        private Boolean mPrivate = false;
        private Visibility88Enum visibility;
        private Boolean hasIssues = true;
        private Boolean hasProjects = true;
        private Boolean hasWiki = true;
        private Boolean hasDownloads = true;
        private Boolean isTemplate = false;
        private Integer teamId;
        private Boolean autoInit = false;
        private String gitignoreTemplate;
        private String licenseTemplate;
        private Boolean allowSquashMerge = true;
        private Boolean allowMergeCommit = true;
        private Boolean allowRebaseMerge = true;
        private Boolean allowAutoMerge = false;
        private Boolean deleteBranchOnMerge = false;
        private Boolean useSquashPrTitleAsDefault = false;
        private SquashMergeCommitTitleEnum squashMergeCommitTitle;
        private SquashMergeCommitMessageEnum squashMergeCommitMessage;
        private MergeCommitTitleEnum mergeCommitTitle;
        private MergeCommitMessageEnum mergeCommitMessage;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         */
        public Builder(String name) {
            this.name = name;
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
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for homepage.
         * @param  homepage  String value for homepage.
         * @return Builder
         */
        public Builder homepage(String homepage) {
            this.homepage = homepage;
            return this;
        }

        /**
         * Setter for mPrivate.
         * @param  mPrivate  Boolean value for mPrivate.
         * @return Builder
         */
        public Builder mPrivate(Boolean mPrivate) {
            this.mPrivate = mPrivate;
            return this;
        }

        /**
         * Setter for visibility.
         * @param  visibility  Visibility88Enum value for visibility.
         * @return Builder
         */
        public Builder visibility(Visibility88Enum visibility) {
            this.visibility = visibility;
            return this;
        }

        /**
         * Setter for hasIssues.
         * @param  hasIssues  Boolean value for hasIssues.
         * @return Builder
         */
        public Builder hasIssues(Boolean hasIssues) {
            this.hasIssues = hasIssues;
            return this;
        }

        /**
         * Setter for hasProjects.
         * @param  hasProjects  Boolean value for hasProjects.
         * @return Builder
         */
        public Builder hasProjects(Boolean hasProjects) {
            this.hasProjects = hasProjects;
            return this;
        }

        /**
         * Setter for hasWiki.
         * @param  hasWiki  Boolean value for hasWiki.
         * @return Builder
         */
        public Builder hasWiki(Boolean hasWiki) {
            this.hasWiki = hasWiki;
            return this;
        }

        /**
         * Setter for hasDownloads.
         * @param  hasDownloads  Boolean value for hasDownloads.
         * @return Builder
         */
        public Builder hasDownloads(Boolean hasDownloads) {
            this.hasDownloads = hasDownloads;
            return this;
        }

        /**
         * Setter for isTemplate.
         * @param  isTemplate  Boolean value for isTemplate.
         * @return Builder
         */
        public Builder isTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }

        /**
         * Setter for teamId.
         * @param  teamId  Integer value for teamId.
         * @return Builder
         */
        public Builder teamId(Integer teamId) {
            this.teamId = teamId;
            return this;
        }

        /**
         * Setter for autoInit.
         * @param  autoInit  Boolean value for autoInit.
         * @return Builder
         */
        public Builder autoInit(Boolean autoInit) {
            this.autoInit = autoInit;
            return this;
        }

        /**
         * Setter for gitignoreTemplate.
         * @param  gitignoreTemplate  String value for gitignoreTemplate.
         * @return Builder
         */
        public Builder gitignoreTemplate(String gitignoreTemplate) {
            this.gitignoreTemplate = gitignoreTemplate;
            return this;
        }

        /**
         * Setter for licenseTemplate.
         * @param  licenseTemplate  String value for licenseTemplate.
         * @return Builder
         */
        public Builder licenseTemplate(String licenseTemplate) {
            this.licenseTemplate = licenseTemplate;
            return this;
        }

        /**
         * Setter for allowSquashMerge.
         * @param  allowSquashMerge  Boolean value for allowSquashMerge.
         * @return Builder
         */
        public Builder allowSquashMerge(Boolean allowSquashMerge) {
            this.allowSquashMerge = allowSquashMerge;
            return this;
        }

        /**
         * Setter for allowMergeCommit.
         * @param  allowMergeCommit  Boolean value for allowMergeCommit.
         * @return Builder
         */
        public Builder allowMergeCommit(Boolean allowMergeCommit) {
            this.allowMergeCommit = allowMergeCommit;
            return this;
        }

        /**
         * Setter for allowRebaseMerge.
         * @param  allowRebaseMerge  Boolean value for allowRebaseMerge.
         * @return Builder
         */
        public Builder allowRebaseMerge(Boolean allowRebaseMerge) {
            this.allowRebaseMerge = allowRebaseMerge;
            return this;
        }

        /**
         * Setter for allowAutoMerge.
         * @param  allowAutoMerge  Boolean value for allowAutoMerge.
         * @return Builder
         */
        public Builder allowAutoMerge(Boolean allowAutoMerge) {
            this.allowAutoMerge = allowAutoMerge;
            return this;
        }

        /**
         * Setter for deleteBranchOnMerge.
         * @param  deleteBranchOnMerge  Boolean value for deleteBranchOnMerge.
         * @return Builder
         */
        public Builder deleteBranchOnMerge(Boolean deleteBranchOnMerge) {
            this.deleteBranchOnMerge = deleteBranchOnMerge;
            return this;
        }

        /**
         * Setter for useSquashPrTitleAsDefault.
         * @param  useSquashPrTitleAsDefault  Boolean value for useSquashPrTitleAsDefault.
         * @return Builder
         */
        public Builder useSquashPrTitleAsDefault(Boolean useSquashPrTitleAsDefault) {
            this.useSquashPrTitleAsDefault = useSquashPrTitleAsDefault;
            return this;
        }

        /**
         * Setter for squashMergeCommitTitle.
         * @param  squashMergeCommitTitle  SquashMergeCommitTitleEnum value for
         *         squashMergeCommitTitle.
         * @return Builder
         */
        public Builder squashMergeCommitTitle(SquashMergeCommitTitleEnum squashMergeCommitTitle) {
            this.squashMergeCommitTitle = squashMergeCommitTitle;
            return this;
        }

        /**
         * Setter for squashMergeCommitMessage.
         * @param  squashMergeCommitMessage  SquashMergeCommitMessageEnum value for
         *         squashMergeCommitMessage.
         * @return Builder
         */
        public Builder squashMergeCommitMessage(
                SquashMergeCommitMessageEnum squashMergeCommitMessage) {
            this.squashMergeCommitMessage = squashMergeCommitMessage;
            return this;
        }

        /**
         * Setter for mergeCommitTitle.
         * @param  mergeCommitTitle  MergeCommitTitleEnum value for mergeCommitTitle.
         * @return Builder
         */
        public Builder mergeCommitTitle(MergeCommitTitleEnum mergeCommitTitle) {
            this.mergeCommitTitle = mergeCommitTitle;
            return this;
        }

        /**
         * Setter for mergeCommitMessage.
         * @param  mergeCommitMessage  MergeCommitMessageEnum value for mergeCommitMessage.
         * @return Builder
         */
        public Builder mergeCommitMessage(MergeCommitMessageEnum mergeCommitMessage) {
            this.mergeCommitMessage = mergeCommitMessage;
            return this;
        }

        /**
         * Builds a new {@link OrgsReposRequest} object using the set fields.
         * @return {@link OrgsReposRequest}
         */
        public OrgsReposRequest build() {
            return new OrgsReposRequest(name, description, homepage, mPrivate, visibility,
                    hasIssues, hasProjects, hasWiki, hasDownloads, isTemplate, teamId, autoInit,
                    gitignoreTemplate, licenseTemplate, allowSquashMerge, allowMergeCommit,
                    allowRebaseMerge, allowAutoMerge, deleteBranchOnMerge,
                    useSquashPrTitleAsDefault, squashMergeCommitTitle, squashMergeCommitMessage,
                    mergeCommitTitle, mergeCommitMessage);
        }
    }
}