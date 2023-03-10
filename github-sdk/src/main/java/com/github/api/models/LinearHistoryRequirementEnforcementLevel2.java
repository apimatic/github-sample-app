/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for LinearHistoryRequirementEnforcementLevel2 type.
 */
public class LinearHistoryRequirementEnforcementLevel2 {
    private AllowDeletionsEnforcementLevelEnum from;

    /**
     * Default constructor.
     */
    public LinearHistoryRequirementEnforcementLevel2() {
    }

    /**
     * Initialization constructor.
     * @param  from  AllowDeletionsEnforcementLevelEnum value for from.
     */
    public LinearHistoryRequirementEnforcementLevel2(
            AllowDeletionsEnforcementLevelEnum from) {
        this.from = from;
    }

    /**
     * Getter for From.
     * @return Returns the AllowDeletionsEnforcementLevelEnum
     */
    @JsonGetter("from")
    public AllowDeletionsEnforcementLevelEnum getFrom() {
        return from;
    }

    /**
     * Setter for From.
     * @param from Value for AllowDeletionsEnforcementLevelEnum
     */
    @JsonSetter("from")
    public void setFrom(AllowDeletionsEnforcementLevelEnum from) {
        this.from = from;
    }

    /**
     * Converts this LinearHistoryRequirementEnforcementLevel2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "LinearHistoryRequirementEnforcementLevel2 [" + "from=" + from + "]";
    }

    /**
     * Builds a new {@link LinearHistoryRequirementEnforcementLevel2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link LinearHistoryRequirementEnforcementLevel2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(from);
        return builder;
    }

    /**
     * Class to build instances of {@link LinearHistoryRequirementEnforcementLevel2}.
     */
    public static class Builder {
        private AllowDeletionsEnforcementLevelEnum from;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  from  AllowDeletionsEnforcementLevelEnum value for from.
         */
        public Builder(AllowDeletionsEnforcementLevelEnum from) {
            this.from = from;
        }

        /**
         * Setter for from.
         * @param  from  AllowDeletionsEnforcementLevelEnum value for from.
         * @return Builder
         */
        public Builder from(AllowDeletionsEnforcementLevelEnum from) {
            this.from = from;
            return this;
        }

        /**
         * Builds a new {@link LinearHistoryRequirementEnforcementLevel2} object using the set
         * fields.
         * @return {@link LinearHistoryRequirementEnforcementLevel2}
         */
        public LinearHistoryRequirementEnforcementLevel2 build() {
            return new LinearHistoryRequirementEnforcementLevel2(from);
        }
    }
}
