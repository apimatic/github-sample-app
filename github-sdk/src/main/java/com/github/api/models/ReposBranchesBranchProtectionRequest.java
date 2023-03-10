/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for ReposBranchesBranchProtectionRequest type.
 */
public class ReposBranchesBranchProtectionRequest {
    private Object requiredStatusChecks;
    private Boolean enforceAdmins;
    private Object requiredPullRequestReviews;
    private Object restrictions;
    private Boolean requiredLinearHistory;
    private OptionalNullable<Boolean> allowForcePushes;
    private Boolean allowDeletions;
    private Boolean blockCreations;
    private Boolean requiredConversationResolution;
    private Boolean lockBranch;
    private Boolean allowForkSyncing;

    /**
     * Default constructor.
     */
    public ReposBranchesBranchProtectionRequest() {
        lockBranch = false;
        allowForkSyncing = false;
    }

    /**
     * Initialization constructor.
     * @param  requiredStatusChecks  Object value for requiredStatusChecks.
     * @param  enforceAdmins  Boolean value for enforceAdmins.
     * @param  requiredPullRequestReviews  Object value for requiredPullRequestReviews.
     * @param  restrictions  Object value for restrictions.
     * @param  requiredLinearHistory  Boolean value for requiredLinearHistory.
     * @param  allowForcePushes  Boolean value for allowForcePushes.
     * @param  allowDeletions  Boolean value for allowDeletions.
     * @param  blockCreations  Boolean value for blockCreations.
     * @param  requiredConversationResolution  Boolean value for requiredConversationResolution.
     * @param  lockBranch  Boolean value for lockBranch.
     * @param  allowForkSyncing  Boolean value for allowForkSyncing.
     */
    public ReposBranchesBranchProtectionRequest(
            Object requiredStatusChecks,
            Boolean enforceAdmins,
            Object requiredPullRequestReviews,
            Object restrictions,
            Boolean requiredLinearHistory,
            Boolean allowForcePushes,
            Boolean allowDeletions,
            Boolean blockCreations,
            Boolean requiredConversationResolution,
            Boolean lockBranch,
            Boolean allowForkSyncing) {
        this.requiredStatusChecks = requiredStatusChecks;
        this.enforceAdmins = enforceAdmins;
        this.requiredPullRequestReviews = requiredPullRequestReviews;
        this.restrictions = restrictions;
        this.requiredLinearHistory = requiredLinearHistory;
        this.allowForcePushes = OptionalNullable.of(allowForcePushes);
        this.allowDeletions = allowDeletions;
        this.blockCreations = blockCreations;
        this.requiredConversationResolution = requiredConversationResolution;
        this.lockBranch = lockBranch;
        this.allowForkSyncing = allowForkSyncing;
    }

    /**
     * Internal initialization constructor.
     */
    protected ReposBranchesBranchProtectionRequest(Object requiredStatusChecks,
            Boolean enforceAdmins, Object requiredPullRequestReviews, Object restrictions,
            Boolean requiredLinearHistory, OptionalNullable<Boolean> allowForcePushes,
            Boolean allowDeletions, Boolean blockCreations, Boolean requiredConversationResolution,
            Boolean lockBranch, Boolean allowForkSyncing) {
        this.requiredStatusChecks = requiredStatusChecks;
        this.enforceAdmins = enforceAdmins;
        this.requiredPullRequestReviews = requiredPullRequestReviews;
        this.restrictions = restrictions;
        this.requiredLinearHistory = requiredLinearHistory;
        this.allowForcePushes = allowForcePushes;
        this.allowDeletions = allowDeletions;
        this.blockCreations = blockCreations;
        this.requiredConversationResolution = requiredConversationResolution;
        this.lockBranch = lockBranch;
        this.allowForkSyncing = allowForkSyncing;
    }

    /**
     * Getter for RequiredStatusChecks.
     * @return Returns the Object
     */
    @JsonGetter("required_status_checks")
    public Object getRequiredStatusChecks() {
        return requiredStatusChecks;
    }

    /**
     * Setter for RequiredStatusChecks.
     * @param requiredStatusChecks Value for Object
     */
    @JsonSetter("required_status_checks")
    public void setRequiredStatusChecks(Object requiredStatusChecks) {
        this.requiredStatusChecks = requiredStatusChecks;
    }

    /**
     * Getter for EnforceAdmins.
     * Enforce all configured restrictions for administrators. Set to `true` to enforce required
     * status checks for repository administrators. Set to `null` to disable.
     * @return Returns the Boolean
     */
    @JsonGetter("enforce_admins")
    public Boolean getEnforceAdmins() {
        return enforceAdmins;
    }

    /**
     * Setter for EnforceAdmins.
     * Enforce all configured restrictions for administrators. Set to `true` to enforce required
     * status checks for repository administrators. Set to `null` to disable.
     * @param enforceAdmins Value for Boolean
     */
    @JsonSetter("enforce_admins")
    public void setEnforceAdmins(Boolean enforceAdmins) {
        this.enforceAdmins = enforceAdmins;
    }

    /**
     * Getter for RequiredPullRequestReviews.
     * @return Returns the Object
     */
    @JsonGetter("required_pull_request_reviews")
    public Object getRequiredPullRequestReviews() {
        return requiredPullRequestReviews;
    }

    /**
     * Setter for RequiredPullRequestReviews.
     * @param requiredPullRequestReviews Value for Object
     */
    @JsonSetter("required_pull_request_reviews")
    public void setRequiredPullRequestReviews(Object requiredPullRequestReviews) {
        this.requiredPullRequestReviews = requiredPullRequestReviews;
    }

    /**
     * Getter for Restrictions.
     * @return Returns the Object
     */
    @JsonGetter("restrictions")
    public Object getRestrictions() {
        return restrictions;
    }

    /**
     * Setter for Restrictions.
     * @param restrictions Value for Object
     */
    @JsonSetter("restrictions")
    public void setRestrictions(Object restrictions) {
        this.restrictions = restrictions;
    }

    /**
     * Getter for RequiredLinearHistory.
     * Enforces a linear commit Git history, which prevents anyone from pushing merge commits to a
     * branch. Set to `true` to enforce a linear commit history. Set to `false` to disable a linear
     * commit Git history. Your repository must allow squash merging or rebase merging before you
     * can enable a linear commit history. Default: `false`. For more information, see "[Requiring a
     * linear commit
     * history](https://docs.github.com/github/administering-a-repository/requiring-a-linear-commit-history)"
     * in the GitHub Help documentation.
     * @return Returns the Boolean
     */
    @JsonGetter("required_linear_history")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRequiredLinearHistory() {
        return requiredLinearHistory;
    }

    /**
     * Setter for RequiredLinearHistory.
     * Enforces a linear commit Git history, which prevents anyone from pushing merge commits to a
     * branch. Set to `true` to enforce a linear commit history. Set to `false` to disable a linear
     * commit Git history. Your repository must allow squash merging or rebase merging before you
     * can enable a linear commit history. Default: `false`. For more information, see "[Requiring a
     * linear commit
     * history](https://docs.github.com/github/administering-a-repository/requiring-a-linear-commit-history)"
     * in the GitHub Help documentation.
     * @param requiredLinearHistory Value for Boolean
     */
    @JsonSetter("required_linear_history")
    public void setRequiredLinearHistory(Boolean requiredLinearHistory) {
        this.requiredLinearHistory = requiredLinearHistory;
    }

    /**
     * Internal Getter for AllowForcePushes.
     * Permits force pushes to the protected branch by anyone with write access to the repository.
     * Set to `true` to allow force pushes. Set to `false` or `null` to block force pushes. Default:
     * `false`. For more information, see "[Enabling force pushes to a protected
     * branch](https://docs.github.com/github/administering-a-repository/enabling-force-pushes-to-a-protected-branch)"
     * in the GitHub Help documentation."
     * @return Returns the Internal Boolean
     */
    @JsonGetter("allow_force_pushes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetAllowForcePushes() {
        return this.allowForcePushes;
    }

    /**
     * Getter for AllowForcePushes.
     * Permits force pushes to the protected branch by anyone with write access to the repository.
     * Set to `true` to allow force pushes. Set to `false` or `null` to block force pushes. Default:
     * `false`. For more information, see "[Enabling force pushes to a protected
     * branch](https://docs.github.com/github/administering-a-repository/enabling-force-pushes-to-a-protected-branch)"
     * in the GitHub Help documentation."
     * @return Returns the Boolean
     */
    public Boolean getAllowForcePushes() {
        return OptionalNullable.getFrom(allowForcePushes);
    }

    /**
     * Setter for AllowForcePushes.
     * Permits force pushes to the protected branch by anyone with write access to the repository.
     * Set to `true` to allow force pushes. Set to `false` or `null` to block force pushes. Default:
     * `false`. For more information, see "[Enabling force pushes to a protected
     * branch](https://docs.github.com/github/administering-a-repository/enabling-force-pushes-to-a-protected-branch)"
     * in the GitHub Help documentation."
     * @param allowForcePushes Value for Boolean
     */
    @JsonSetter("allow_force_pushes")
    public void setAllowForcePushes(Boolean allowForcePushes) {
        this.allowForcePushes = OptionalNullable.of(allowForcePushes);
    }

    /**
     * UnSetter for AllowForcePushes.
     * Permits force pushes to the protected branch by anyone with write access to the repository.
     * Set to `true` to allow force pushes. Set to `false` or `null` to block force pushes. Default:
     * `false`. For more information, see "[Enabling force pushes to a protected
     * branch](https://docs.github.com/github/administering-a-repository/enabling-force-pushes-to-a-protected-branch)"
     * in the GitHub Help documentation."
     */
    public void unsetAllowForcePushes() {
        allowForcePushes = null;
    }

    /**
     * Getter for AllowDeletions.
     * Allows deletion of the protected branch by anyone with write access to the repository. Set to
     * `false` to prevent deletion of the protected branch. Default: `false`. For more information,
     * see "[Enabling force pushes to a protected
     * branch](https://docs.github.com/github/administering-a-repository/enabling-force-pushes-to-a-protected-branch)"
     * in the GitHub Help documentation.
     * @return Returns the Boolean
     */
    @JsonGetter("allow_deletions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAllowDeletions() {
        return allowDeletions;
    }

    /**
     * Setter for AllowDeletions.
     * Allows deletion of the protected branch by anyone with write access to the repository. Set to
     * `false` to prevent deletion of the protected branch. Default: `false`. For more information,
     * see "[Enabling force pushes to a protected
     * branch](https://docs.github.com/github/administering-a-repository/enabling-force-pushes-to-a-protected-branch)"
     * in the GitHub Help documentation.
     * @param allowDeletions Value for Boolean
     */
    @JsonSetter("allow_deletions")
    public void setAllowDeletions(Boolean allowDeletions) {
        this.allowDeletions = allowDeletions;
    }

    /**
     * Getter for BlockCreations.
     * If set to `true`, the `restrictions` branch protection settings which limits who can push
     * will also block pushes which create new branches, unless the push is initiated by a user,
     * team, or app which has the ability to push. Set to `true` to restrict new branch creation.
     * Default: `false`.
     * @return Returns the Boolean
     */
    @JsonGetter("block_creations")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getBlockCreations() {
        return blockCreations;
    }

    /**
     * Setter for BlockCreations.
     * If set to `true`, the `restrictions` branch protection settings which limits who can push
     * will also block pushes which create new branches, unless the push is initiated by a user,
     * team, or app which has the ability to push. Set to `true` to restrict new branch creation.
     * Default: `false`.
     * @param blockCreations Value for Boolean
     */
    @JsonSetter("block_creations")
    public void setBlockCreations(Boolean blockCreations) {
        this.blockCreations = blockCreations;
    }

    /**
     * Getter for RequiredConversationResolution.
     * Requires all conversations on code to be resolved before a pull request can be merged into a
     * branch that matches this rule. Set to `false` to disable. Default: `false`.
     * @return Returns the Boolean
     */
    @JsonGetter("required_conversation_resolution")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRequiredConversationResolution() {
        return requiredConversationResolution;
    }

    /**
     * Setter for RequiredConversationResolution.
     * Requires all conversations on code to be resolved before a pull request can be merged into a
     * branch that matches this rule. Set to `false` to disable. Default: `false`.
     * @param requiredConversationResolution Value for Boolean
     */
    @JsonSetter("required_conversation_resolution")
    public void setRequiredConversationResolution(Boolean requiredConversationResolution) {
        this.requiredConversationResolution = requiredConversationResolution;
    }

    /**
     * Getter for LockBranch.
     * Whether to set the branch as read-only. If this is true, users will not be able to push to
     * the branch. Default: `false`.
     * @return Returns the Boolean
     */
    @JsonGetter("lock_branch")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getLockBranch() {
        return lockBranch;
    }

    /**
     * Setter for LockBranch.
     * Whether to set the branch as read-only. If this is true, users will not be able to push to
     * the branch. Default: `false`.
     * @param lockBranch Value for Boolean
     */
    @JsonSetter("lock_branch")
    public void setLockBranch(Boolean lockBranch) {
        this.lockBranch = lockBranch;
    }

    /**
     * Getter for AllowForkSyncing.
     * Whether users can pull changes from upstream when the branch is locked. Set to `true` to
     * allow fork syncing. Set to `false` to prevent fork syncing. Default: `false`.
     * @return Returns the Boolean
     */
    @JsonGetter("allow_fork_syncing")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAllowForkSyncing() {
        return allowForkSyncing;
    }

    /**
     * Setter for AllowForkSyncing.
     * Whether users can pull changes from upstream when the branch is locked. Set to `true` to
     * allow fork syncing. Set to `false` to prevent fork syncing. Default: `false`.
     * @param allowForkSyncing Value for Boolean
     */
    @JsonSetter("allow_fork_syncing")
    public void setAllowForkSyncing(Boolean allowForkSyncing) {
        this.allowForkSyncing = allowForkSyncing;
    }

    /**
     * Converts this ReposBranchesBranchProtectionRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposBranchesBranchProtectionRequest [" + "requiredStatusChecks="
                + requiredStatusChecks + ", enforceAdmins=" + enforceAdmins
                + ", requiredPullRequestReviews=" + requiredPullRequestReviews + ", restrictions="
                + restrictions + ", requiredLinearHistory=" + requiredLinearHistory
                + ", allowForcePushes=" + allowForcePushes + ", allowDeletions=" + allowDeletions
                + ", blockCreations=" + blockCreations + ", requiredConversationResolution="
                + requiredConversationResolution + ", lockBranch=" + lockBranch
                + ", allowForkSyncing=" + allowForkSyncing + "]";
    }

    /**
     * Builds a new {@link ReposBranchesBranchProtectionRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposBranchesBranchProtectionRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(requiredStatusChecks, enforceAdmins,
                requiredPullRequestReviews, restrictions)
                .requiredLinearHistory(getRequiredLinearHistory())
                .allowDeletions(getAllowDeletions())
                .blockCreations(getBlockCreations())
                .requiredConversationResolution(getRequiredConversationResolution())
                .lockBranch(getLockBranch())
                .allowForkSyncing(getAllowForkSyncing());
        builder.allowForcePushes = internalGetAllowForcePushes();
        return builder;
    }

    /**
     * Class to build instances of {@link ReposBranchesBranchProtectionRequest}.
     */
    public static class Builder {
        private Object requiredStatusChecks;
        private Boolean enforceAdmins;
        private Object requiredPullRequestReviews;
        private Object restrictions;
        private Boolean requiredLinearHistory;
        private OptionalNullable<Boolean> allowForcePushes;
        private Boolean allowDeletions;
        private Boolean blockCreations;
        private Boolean requiredConversationResolution;
        private Boolean lockBranch = false;
        private Boolean allowForkSyncing = false;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  requiredStatusChecks  Object value for requiredStatusChecks.
         * @param  enforceAdmins  Boolean value for enforceAdmins.
         * @param  requiredPullRequestReviews  Object value for requiredPullRequestReviews.
         * @param  restrictions  Object value for restrictions.
         */
        public Builder(Object requiredStatusChecks, Boolean enforceAdmins,
                Object requiredPullRequestReviews, Object restrictions) {
            this.requiredStatusChecks = requiredStatusChecks;
            this.enforceAdmins = enforceAdmins;
            this.requiredPullRequestReviews = requiredPullRequestReviews;
            this.restrictions = restrictions;
        }

        /**
         * Setter for requiredStatusChecks.
         * @param  requiredStatusChecks  Object value for requiredStatusChecks.
         * @return Builder
         */
        public Builder requiredStatusChecks(Object requiredStatusChecks) {
            this.requiredStatusChecks = requiredStatusChecks;
            return this;
        }

        /**
         * Setter for enforceAdmins.
         * @param  enforceAdmins  Boolean value for enforceAdmins.
         * @return Builder
         */
        public Builder enforceAdmins(Boolean enforceAdmins) {
            this.enforceAdmins = enforceAdmins;
            return this;
        }

        /**
         * Setter for requiredPullRequestReviews.
         * @param  requiredPullRequestReviews  Object value for requiredPullRequestReviews.
         * @return Builder
         */
        public Builder requiredPullRequestReviews(Object requiredPullRequestReviews) {
            this.requiredPullRequestReviews = requiredPullRequestReviews;
            return this;
        }

        /**
         * Setter for restrictions.
         * @param  restrictions  Object value for restrictions.
         * @return Builder
         */
        public Builder restrictions(Object restrictions) {
            this.restrictions = restrictions;
            return this;
        }

        /**
         * Setter for requiredLinearHistory.
         * @param  requiredLinearHistory  Boolean value for requiredLinearHistory.
         * @return Builder
         */
        public Builder requiredLinearHistory(Boolean requiredLinearHistory) {
            this.requiredLinearHistory = requiredLinearHistory;
            return this;
        }

        /**
         * Setter for allowForcePushes.
         * @param  allowForcePushes  Boolean value for allowForcePushes.
         * @return Builder
         */
        public Builder allowForcePushes(Boolean allowForcePushes) {
            this.allowForcePushes = OptionalNullable.of(allowForcePushes);
            return this;
        }

        /**
         * UnSetter for allowForcePushes.
         * @return Builder
         */
        public Builder unsetAllowForcePushes() {
            allowForcePushes = null;
            return this;
        }

        /**
         * Setter for allowDeletions.
         * @param  allowDeletions  Boolean value for allowDeletions.
         * @return Builder
         */
        public Builder allowDeletions(Boolean allowDeletions) {
            this.allowDeletions = allowDeletions;
            return this;
        }

        /**
         * Setter for blockCreations.
         * @param  blockCreations  Boolean value for blockCreations.
         * @return Builder
         */
        public Builder blockCreations(Boolean blockCreations) {
            this.blockCreations = blockCreations;
            return this;
        }

        /**
         * Setter for requiredConversationResolution.
         * @param  requiredConversationResolution  Boolean value for requiredConversationResolution.
         * @return Builder
         */
        public Builder requiredConversationResolution(Boolean requiredConversationResolution) {
            this.requiredConversationResolution = requiredConversationResolution;
            return this;
        }

        /**
         * Setter for lockBranch.
         * @param  lockBranch  Boolean value for lockBranch.
         * @return Builder
         */
        public Builder lockBranch(Boolean lockBranch) {
            this.lockBranch = lockBranch;
            return this;
        }

        /**
         * Setter for allowForkSyncing.
         * @param  allowForkSyncing  Boolean value for allowForkSyncing.
         * @return Builder
         */
        public Builder allowForkSyncing(Boolean allowForkSyncing) {
            this.allowForkSyncing = allowForkSyncing;
            return this;
        }

        /**
         * Builds a new {@link ReposBranchesBranchProtectionRequest} object using the set fields.
         * @return {@link ReposBranchesBranchProtectionRequest}
         */
        public ReposBranchesBranchProtectionRequest build() {
            return new ReposBranchesBranchProtectionRequest(requiredStatusChecks, enforceAdmins,
                    requiredPullRequestReviews, restrictions, requiredLinearHistory,
                    allowForcePushes, allowDeletions, blockCreations,
                    requiredConversationResolution, lockBranch, allowForkSyncing);
        }
    }
}
