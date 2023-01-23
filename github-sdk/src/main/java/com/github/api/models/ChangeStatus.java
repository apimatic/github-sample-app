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
 * This is a model class for ChangeStatus type.
 */
public class ChangeStatus {
    private Integer total;
    private Integer additions;
    private Integer deletions;

    /**
     * Default constructor.
     */
    public ChangeStatus() {
    }

    /**
     * Initialization constructor.
     * @param  total  Integer value for total.
     * @param  additions  Integer value for additions.
     * @param  deletions  Integer value for deletions.
     */
    public ChangeStatus(
            Integer total,
            Integer additions,
            Integer deletions) {
        this.total = total;
        this.additions = additions;
        this.deletions = deletions;
    }

    /**
     * Getter for Total.
     * @return Returns the Integer
     */
    @JsonGetter("total")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotal() {
        return total;
    }

    /**
     * Setter for Total.
     * @param total Value for Integer
     */
    @JsonSetter("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * Getter for Additions.
     * @return Returns the Integer
     */
    @JsonGetter("additions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAdditions() {
        return additions;
    }

    /**
     * Setter for Additions.
     * @param additions Value for Integer
     */
    @JsonSetter("additions")
    public void setAdditions(Integer additions) {
        this.additions = additions;
    }

    /**
     * Getter for Deletions.
     * @return Returns the Integer
     */
    @JsonGetter("deletions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getDeletions() {
        return deletions;
    }

    /**
     * Setter for Deletions.
     * @param deletions Value for Integer
     */
    @JsonSetter("deletions")
    public void setDeletions(Integer deletions) {
        this.deletions = deletions;
    }

    /**
     * Converts this ChangeStatus into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ChangeStatus [" + "total=" + total + ", additions=" + additions + ", deletions="
                + deletions + "]";
    }

    /**
     * Builds a new {@link ChangeStatus.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ChangeStatus.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .total(getTotal())
                .additions(getAdditions())
                .deletions(getDeletions());
        return builder;
    }

    /**
     * Class to build instances of {@link ChangeStatus}.
     */
    public static class Builder {
        private Integer total;
        private Integer additions;
        private Integer deletions;



        /**
         * Setter for total.
         * @param  total  Integer value for total.
         * @return Builder
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * Setter for additions.
         * @param  additions  Integer value for additions.
         * @return Builder
         */
        public Builder additions(Integer additions) {
            this.additions = additions;
            return this;
        }

        /**
         * Setter for deletions.
         * @param  deletions  Integer value for deletions.
         * @return Builder
         */
        public Builder deletions(Integer deletions) {
            this.deletions = deletions;
            return this;
        }

        /**
         * Builds a new {@link ChangeStatus} object using the set fields.
         * @return {@link ChangeStatus}
         */
        public ChangeStatus build() {
            return new ChangeStatus(total, additions, deletions);
        }
    }
}
