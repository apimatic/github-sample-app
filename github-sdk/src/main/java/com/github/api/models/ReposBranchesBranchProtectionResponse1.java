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
 * This is a model class for ReposBranchesBranchProtectionResponse1 type.
 */
public class ReposBranchesBranchProtectionResponse1 {
    private String url;
    private RequiredStatusChecks12 requiredStatusChecks;
    private RequiredPullRequestReviews requiredPullRequestReviews;
    private EnforceAdmins requiredSignatures;
    private EnforceAdmins enforceAdmins;
    private AllowDeletions1 requiredLinearHistory;
    private AllowDeletions1 allowForcePushes;
    private AllowDeletions1 allowDeletions;
    private Restrictions1 restrictions;
    private AllowDeletions requiredConversationResolution;
    private AllowDeletions1 blockCreations;
    private AllowDeletions lockBranch;
    private AllowDeletions allowForkSyncing;

    /**
     * Default constructor.
     */
    public ReposBranchesBranchProtectionResponse1() {
    }

    /**
     * Initialization constructor.
     * @param  url  String value for url.
     * @param  requiredStatusChecks  RequiredStatusChecks12 value for requiredStatusChecks.
     * @param  requiredPullRequestReviews  RequiredPullRequestReviews value for
     *         requiredPullRequestReviews.
     * @param  requiredSignatures  EnforceAdmins value for requiredSignatures.
     * @param  enforceAdmins  EnforceAdmins value for enforceAdmins.
     * @param  requiredLinearHistory  AllowDeletions1 value for requiredLinearHistory.
     * @param  allowForcePushes  AllowDeletions1 value for allowForcePushes.
     * @param  allowDeletions  AllowDeletions1 value for allowDeletions.
     * @param  restrictions  Restrictions1 value for restrictions.
     * @param  requiredConversationResolution  AllowDeletions value for
     *         requiredConversationResolution.
     * @param  blockCreations  AllowDeletions1 value for blockCreations.
     * @param  lockBranch  AllowDeletions value for lockBranch.
     * @param  allowForkSyncing  AllowDeletions value for allowForkSyncing.
     */
    public ReposBranchesBranchProtectionResponse1(
            String url,
            RequiredStatusChecks12 requiredStatusChecks,
            RequiredPullRequestReviews requiredPullRequestReviews,
            EnforceAdmins requiredSignatures,
            EnforceAdmins enforceAdmins,
            AllowDeletions1 requiredLinearHistory,
            AllowDeletions1 allowForcePushes,
            AllowDeletions1 allowDeletions,
            Restrictions1 restrictions,
            AllowDeletions requiredConversationResolution,
            AllowDeletions1 blockCreations,
            AllowDeletions lockBranch,
            AllowDeletions allowForkSyncing) {
        this.url = url;
        this.requiredStatusChecks = requiredStatusChecks;
        this.requiredPullRequestReviews = requiredPullRequestReviews;
        this.requiredSignatures = requiredSignatures;
        this.enforceAdmins = enforceAdmins;
        this.requiredLinearHistory = requiredLinearHistory;
        this.allowForcePushes = allowForcePushes;
        this.allowDeletions = allowDeletions;
        this.restrictions = restrictions;
        this.requiredConversationResolution = requiredConversationResolution;
        this.blockCreations = blockCreations;
        this.lockBranch = lockBranch;
        this.allowForkSyncing = allowForkSyncing;
    }

    /**
     * Getter for Url.
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for RequiredStatusChecks.
     * @return Returns the RequiredStatusChecks12
     */
    @JsonGetter("required_status_checks")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RequiredStatusChecks12 getRequiredStatusChecks() {
        return requiredStatusChecks;
    }

    /**
     * Setter for RequiredStatusChecks.
     * @param requiredStatusChecks Value for RequiredStatusChecks12
     */
    @JsonSetter("required_status_checks")
    public void setRequiredStatusChecks(RequiredStatusChecks12 requiredStatusChecks) {
        this.requiredStatusChecks = requiredStatusChecks;
    }

    /**
     * Getter for RequiredPullRequestReviews.
     * @return Returns the RequiredPullRequestReviews
     */
    @JsonGetter("required_pull_request_reviews")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RequiredPullRequestReviews getRequiredPullRequestReviews() {
        return requiredPullRequestReviews;
    }

    /**
     * Setter for RequiredPullRequestReviews.
     * @param requiredPullRequestReviews Value for RequiredPullRequestReviews
     */
    @JsonSetter("required_pull_request_reviews")
    public void setRequiredPullRequestReviews(RequiredPullRequestReviews requiredPullRequestReviews) {
        this.requiredPullRequestReviews = requiredPullRequestReviews;
    }

    /**
     * Getter for RequiredSignatures.
     * @return Returns the EnforceAdmins
     */
    @JsonGetter("required_signatures")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public EnforceAdmins getRequiredSignatures() {
        return requiredSignatures;
    }

    /**
     * Setter for RequiredSignatures.
     * @param requiredSignatures Value for EnforceAdmins
     */
    @JsonSetter("required_signatures")
    public void setRequiredSignatures(EnforceAdmins requiredSignatures) {
        this.requiredSignatures = requiredSignatures;
    }

    /**
     * Getter for EnforceAdmins.
     * @return Returns the EnforceAdmins
     */
    @JsonGetter("enforce_admins")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public EnforceAdmins getEnforceAdmins() {
        return enforceAdmins;
    }

    /**
     * Setter for EnforceAdmins.
     * @param enforceAdmins Value for EnforceAdmins
     */
    @JsonSetter("enforce_admins")
    public void setEnforceAdmins(EnforceAdmins enforceAdmins) {
        this.enforceAdmins = enforceAdmins;
    }

    /**
     * Getter for RequiredLinearHistory.
     * @return Returns the AllowDeletions1
     */
    @JsonGetter("required_linear_history")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AllowDeletions1 getRequiredLinearHistory() {
        return requiredLinearHistory;
    }

    /**
     * Setter for RequiredLinearHistory.
     * @param requiredLinearHistory Value for AllowDeletions1
     */
    @JsonSetter("required_linear_history")
    public void setRequiredLinearHistory(AllowDeletions1 requiredLinearHistory) {
        this.requiredLinearHistory = requiredLinearHistory;
    }

    /**
     * Getter for AllowForcePushes.
     * @return Returns the AllowDeletions1
     */
    @JsonGetter("allow_force_pushes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AllowDeletions1 getAllowForcePushes() {
        return allowForcePushes;
    }

    /**
     * Setter for AllowForcePushes.
     * @param allowForcePushes Value for AllowDeletions1
     */
    @JsonSetter("allow_force_pushes")
    public void setAllowForcePushes(AllowDeletions1 allowForcePushes) {
        this.allowForcePushes = allowForcePushes;
    }

    /**
     * Getter for AllowDeletions.
     * @return Returns the AllowDeletions1
     */
    @JsonGetter("allow_deletions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AllowDeletions1 getAllowDeletions() {
        return allowDeletions;
    }

    /**
     * Setter for AllowDeletions.
     * @param allowDeletions Value for AllowDeletions1
     */
    @JsonSetter("allow_deletions")
    public void setAllowDeletions(AllowDeletions1 allowDeletions) {
        this.allowDeletions = allowDeletions;
    }

    /**
     * Getter for Restrictions.
     * @return Returns the Restrictions1
     */
    @JsonGetter("restrictions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Restrictions1 getRestrictions() {
        return restrictions;
    }

    /**
     * Setter for Restrictions.
     * @param restrictions Value for Restrictions1
     */
    @JsonSetter("restrictions")
    public void setRestrictions(Restrictions1 restrictions) {
        this.restrictions = restrictions;
    }

    /**
     * Getter for RequiredConversationResolution.
     * @return Returns the AllowDeletions
     */
    @JsonGetter("required_conversation_resolution")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AllowDeletions getRequiredConversationResolution() {
        return requiredConversationResolution;
    }

    /**
     * Setter for RequiredConversationResolution.
     * @param requiredConversationResolution Value for AllowDeletions
     */
    @JsonSetter("required_conversation_resolution")
    public void setRequiredConversationResolution(AllowDeletions requiredConversationResolution) {
        this.requiredConversationResolution = requiredConversationResolution;
    }

    /**
     * Getter for BlockCreations.
     * @return Returns the AllowDeletions1
     */
    @JsonGetter("block_creations")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AllowDeletions1 getBlockCreations() {
        return blockCreations;
    }

    /**
     * Setter for BlockCreations.
     * @param blockCreations Value for AllowDeletions1
     */
    @JsonSetter("block_creations")
    public void setBlockCreations(AllowDeletions1 blockCreations) {
        this.blockCreations = blockCreations;
    }

    /**
     * Getter for LockBranch.
     * @return Returns the AllowDeletions
     */
    @JsonGetter("lock_branch")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AllowDeletions getLockBranch() {
        return lockBranch;
    }

    /**
     * Setter for LockBranch.
     * @param lockBranch Value for AllowDeletions
     */
    @JsonSetter("lock_branch")
    public void setLockBranch(AllowDeletions lockBranch) {
        this.lockBranch = lockBranch;
    }

    /**
     * Getter for AllowForkSyncing.
     * @return Returns the AllowDeletions
     */
    @JsonGetter("allow_fork_syncing")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AllowDeletions getAllowForkSyncing() {
        return allowForkSyncing;
    }

    /**
     * Setter for AllowForkSyncing.
     * @param allowForkSyncing Value for AllowDeletions
     */
    @JsonSetter("allow_fork_syncing")
    public void setAllowForkSyncing(AllowDeletions allowForkSyncing) {
        this.allowForkSyncing = allowForkSyncing;
    }

    /**
     * Converts this ReposBranchesBranchProtectionResponse1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposBranchesBranchProtectionResponse1 [" + "url=" + url + ", requiredStatusChecks="
                + requiredStatusChecks + ", requiredPullRequestReviews="
                + requiredPullRequestReviews + ", requiredSignatures=" + requiredSignatures
                + ", enforceAdmins=" + enforceAdmins + ", requiredLinearHistory="
                + requiredLinearHistory + ", allowForcePushes=" + allowForcePushes
                + ", allowDeletions=" + allowDeletions + ", restrictions=" + restrictions
                + ", requiredConversationResolution=" + requiredConversationResolution
                + ", blockCreations=" + blockCreations + ", lockBranch=" + lockBranch
                + ", allowForkSyncing=" + allowForkSyncing + "]";
    }

    /**
     * Builds a new {@link ReposBranchesBranchProtectionResponse1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposBranchesBranchProtectionResponse1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(url)
                .requiredStatusChecks(getRequiredStatusChecks())
                .requiredPullRequestReviews(getRequiredPullRequestReviews())
                .requiredSignatures(getRequiredSignatures())
                .enforceAdmins(getEnforceAdmins())
                .requiredLinearHistory(getRequiredLinearHistory())
                .allowForcePushes(getAllowForcePushes())
                .allowDeletions(getAllowDeletions())
                .restrictions(getRestrictions())
                .requiredConversationResolution(getRequiredConversationResolution())
                .blockCreations(getBlockCreations())
                .lockBranch(getLockBranch())
                .allowForkSyncing(getAllowForkSyncing());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposBranchesBranchProtectionResponse1}.
     */
    public static class Builder {
        private String url;
        private RequiredStatusChecks12 requiredStatusChecks;
        private RequiredPullRequestReviews requiredPullRequestReviews;
        private EnforceAdmins requiredSignatures;
        private EnforceAdmins enforceAdmins;
        private AllowDeletions1 requiredLinearHistory;
        private AllowDeletions1 allowForcePushes;
        private AllowDeletions1 allowDeletions;
        private Restrictions1 restrictions;
        private AllowDeletions requiredConversationResolution;
        private AllowDeletions1 blockCreations;
        private AllowDeletions lockBranch;
        private AllowDeletions allowForkSyncing;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  url  String value for url.
         */
        public Builder(String url) {
            this.url = url;
        }

        /**
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Setter for requiredStatusChecks.
         * @param  requiredStatusChecks  RequiredStatusChecks12 value for requiredStatusChecks.
         * @return Builder
         */
        public Builder requiredStatusChecks(RequiredStatusChecks12 requiredStatusChecks) {
            this.requiredStatusChecks = requiredStatusChecks;
            return this;
        }

        /**
         * Setter for requiredPullRequestReviews.
         * @param  requiredPullRequestReviews  RequiredPullRequestReviews value for
         *         requiredPullRequestReviews.
         * @return Builder
         */
        public Builder requiredPullRequestReviews(
                RequiredPullRequestReviews requiredPullRequestReviews) {
            this.requiredPullRequestReviews = requiredPullRequestReviews;
            return this;
        }

        /**
         * Setter for requiredSignatures.
         * @param  requiredSignatures  EnforceAdmins value for requiredSignatures.
         * @return Builder
         */
        public Builder requiredSignatures(EnforceAdmins requiredSignatures) {
            this.requiredSignatures = requiredSignatures;
            return this;
        }

        /**
         * Setter for enforceAdmins.
         * @param  enforceAdmins  EnforceAdmins value for enforceAdmins.
         * @return Builder
         */
        public Builder enforceAdmins(EnforceAdmins enforceAdmins) {
            this.enforceAdmins = enforceAdmins;
            return this;
        }

        /**
         * Setter for requiredLinearHistory.
         * @param  requiredLinearHistory  AllowDeletions1 value for requiredLinearHistory.
         * @return Builder
         */
        public Builder requiredLinearHistory(AllowDeletions1 requiredLinearHistory) {
            this.requiredLinearHistory = requiredLinearHistory;
            return this;
        }

        /**
         * Setter for allowForcePushes.
         * @param  allowForcePushes  AllowDeletions1 value for allowForcePushes.
         * @return Builder
         */
        public Builder allowForcePushes(AllowDeletions1 allowForcePushes) {
            this.allowForcePushes = allowForcePushes;
            return this;
        }

        /**
         * Setter for allowDeletions.
         * @param  allowDeletions  AllowDeletions1 value for allowDeletions.
         * @return Builder
         */
        public Builder allowDeletions(AllowDeletions1 allowDeletions) {
            this.allowDeletions = allowDeletions;
            return this;
        }

        /**
         * Setter for restrictions.
         * @param  restrictions  Restrictions1 value for restrictions.
         * @return Builder
         */
        public Builder restrictions(Restrictions1 restrictions) {
            this.restrictions = restrictions;
            return this;
        }

        /**
         * Setter for requiredConversationResolution.
         * @param  requiredConversationResolution  AllowDeletions value for
         *         requiredConversationResolution.
         * @return Builder
         */
        public Builder requiredConversationResolution(
                AllowDeletions requiredConversationResolution) {
            this.requiredConversationResolution = requiredConversationResolution;
            return this;
        }

        /**
         * Setter for blockCreations.
         * @param  blockCreations  AllowDeletions1 value for blockCreations.
         * @return Builder
         */
        public Builder blockCreations(AllowDeletions1 blockCreations) {
            this.blockCreations = blockCreations;
            return this;
        }

        /**
         * Setter for lockBranch.
         * @param  lockBranch  AllowDeletions value for lockBranch.
         * @return Builder
         */
        public Builder lockBranch(AllowDeletions lockBranch) {
            this.lockBranch = lockBranch;
            return this;
        }

        /**
         * Setter for allowForkSyncing.
         * @param  allowForkSyncing  AllowDeletions value for allowForkSyncing.
         * @return Builder
         */
        public Builder allowForkSyncing(AllowDeletions allowForkSyncing) {
            this.allowForkSyncing = allowForkSyncing;
            return this;
        }

        /**
         * Builds a new {@link ReposBranchesBranchProtectionResponse1} object using the set fields.
         * @return {@link ReposBranchesBranchProtectionResponse1}
         */
        public ReposBranchesBranchProtectionResponse1 build() {
            return new ReposBranchesBranchProtectionResponse1(url, requiredStatusChecks,
                    requiredPullRequestReviews, requiredSignatures, enforceAdmins,
                    requiredLinearHistory, allowForcePushes, allowDeletions, restrictions,
                    requiredConversationResolution, blockCreations, lockBranch, allowForkSyncing);
        }
    }
}
