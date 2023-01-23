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
 * This is a model class for GitStatus1 type.
 */
public class GitStatus1 {
    private Integer ahead;
    private Integer behind;
    private Boolean hasUnpushedChanges;
    private Boolean hasUncommittedChanges;
    private String ref;

    /**
     * Default constructor.
     */
    public GitStatus1() {
    }

    /**
     * Initialization constructor.
     * @param  ahead  Integer value for ahead.
     * @param  behind  Integer value for behind.
     * @param  hasUnpushedChanges  Boolean value for hasUnpushedChanges.
     * @param  hasUncommittedChanges  Boolean value for hasUncommittedChanges.
     * @param  ref  String value for ref.
     */
    public GitStatus1(
            Integer ahead,
            Integer behind,
            Boolean hasUnpushedChanges,
            Boolean hasUncommittedChanges,
            String ref) {
        this.ahead = ahead;
        this.behind = behind;
        this.hasUnpushedChanges = hasUnpushedChanges;
        this.hasUncommittedChanges = hasUncommittedChanges;
        this.ref = ref;
    }

    /**
     * Getter for Ahead.
     * The number of commits the local repository is ahead of the remote.
     * @return Returns the Integer
     */
    @JsonGetter("ahead")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAhead() {
        return ahead;
    }

    /**
     * Setter for Ahead.
     * The number of commits the local repository is ahead of the remote.
     * @param ahead Value for Integer
     */
    @JsonSetter("ahead")
    public void setAhead(Integer ahead) {
        this.ahead = ahead;
    }

    /**
     * Getter for Behind.
     * The number of commits the local repository is behind the remote.
     * @return Returns the Integer
     */
    @JsonGetter("behind")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getBehind() {
        return behind;
    }

    /**
     * Setter for Behind.
     * The number of commits the local repository is behind the remote.
     * @param behind Value for Integer
     */
    @JsonSetter("behind")
    public void setBehind(Integer behind) {
        this.behind = behind;
    }

    /**
     * Getter for HasUnpushedChanges.
     * Whether the local repository has unpushed changes.
     * @return Returns the Boolean
     */
    @JsonGetter("has_unpushed_changes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getHasUnpushedChanges() {
        return hasUnpushedChanges;
    }

    /**
     * Setter for HasUnpushedChanges.
     * Whether the local repository has unpushed changes.
     * @param hasUnpushedChanges Value for Boolean
     */
    @JsonSetter("has_unpushed_changes")
    public void setHasUnpushedChanges(Boolean hasUnpushedChanges) {
        this.hasUnpushedChanges = hasUnpushedChanges;
    }

    /**
     * Getter for HasUncommittedChanges.
     * Whether the local repository has uncommitted changes.
     * @return Returns the Boolean
     */
    @JsonGetter("has_uncommitted_changes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getHasUncommittedChanges() {
        return hasUncommittedChanges;
    }

    /**
     * Setter for HasUncommittedChanges.
     * Whether the local repository has uncommitted changes.
     * @param hasUncommittedChanges Value for Boolean
     */
    @JsonSetter("has_uncommitted_changes")
    public void setHasUncommittedChanges(Boolean hasUncommittedChanges) {
        this.hasUncommittedChanges = hasUncommittedChanges;
    }

    /**
     * Getter for Ref.
     * The current branch (or SHA if in detached HEAD state) of the local repository.
     * @return Returns the String
     */
    @JsonGetter("ref")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRef() {
        return ref;
    }

    /**
     * Setter for Ref.
     * The current branch (or SHA if in detached HEAD state) of the local repository.
     * @param ref Value for String
     */
    @JsonSetter("ref")
    public void setRef(String ref) {
        this.ref = ref;
    }

    /**
     * Converts this GitStatus1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GitStatus1 [" + "ahead=" + ahead + ", behind=" + behind + ", hasUnpushedChanges="
                + hasUnpushedChanges + ", hasUncommittedChanges=" + hasUncommittedChanges + ", ref="
                + ref + "]";
    }

    /**
     * Builds a new {@link GitStatus1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GitStatus1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .ahead(getAhead())
                .behind(getBehind())
                .hasUnpushedChanges(getHasUnpushedChanges())
                .hasUncommittedChanges(getHasUncommittedChanges())
                .ref(getRef());
        return builder;
    }

    /**
     * Class to build instances of {@link GitStatus1}.
     */
    public static class Builder {
        private Integer ahead;
        private Integer behind;
        private Boolean hasUnpushedChanges;
        private Boolean hasUncommittedChanges;
        private String ref;



        /**
         * Setter for ahead.
         * @param  ahead  Integer value for ahead.
         * @return Builder
         */
        public Builder ahead(Integer ahead) {
            this.ahead = ahead;
            return this;
        }

        /**
         * Setter for behind.
         * @param  behind  Integer value for behind.
         * @return Builder
         */
        public Builder behind(Integer behind) {
            this.behind = behind;
            return this;
        }

        /**
         * Setter for hasUnpushedChanges.
         * @param  hasUnpushedChanges  Boolean value for hasUnpushedChanges.
         * @return Builder
         */
        public Builder hasUnpushedChanges(Boolean hasUnpushedChanges) {
            this.hasUnpushedChanges = hasUnpushedChanges;
            return this;
        }

        /**
         * Setter for hasUncommittedChanges.
         * @param  hasUncommittedChanges  Boolean value for hasUncommittedChanges.
         * @return Builder
         */
        public Builder hasUncommittedChanges(Boolean hasUncommittedChanges) {
            this.hasUncommittedChanges = hasUncommittedChanges;
            return this;
        }

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
         * Builds a new {@link GitStatus1} object using the set fields.
         * @return {@link GitStatus1}
         */
        public GitStatus1 build() {
            return new GitStatus1(ahead, behind, hasUnpushedChanges, hasUncommittedChanges, ref);
        }
    }
}