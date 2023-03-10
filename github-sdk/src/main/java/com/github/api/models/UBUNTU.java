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
 * This is a model class for UBUNTU type.
 */
public class UBUNTU {
    private Integer totalMs;

    /**
     * Default constructor.
     */
    public UBUNTU() {
    }

    /**
     * Initialization constructor.
     * @param  totalMs  Integer value for totalMs.
     */
    public UBUNTU(
            Integer totalMs) {
        this.totalMs = totalMs;
    }

    /**
     * Getter for TotalMs.
     * @return Returns the Integer
     */
    @JsonGetter("total_ms")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotalMs() {
        return totalMs;
    }

    /**
     * Setter for TotalMs.
     * @param totalMs Value for Integer
     */
    @JsonSetter("total_ms")
    public void setTotalMs(Integer totalMs) {
        this.totalMs = totalMs;
    }

    /**
     * Converts this UBUNTU into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UBUNTU [" + "totalMs=" + totalMs + "]";
    }

    /**
     * Builds a new {@link UBUNTU.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UBUNTU.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .totalMs(getTotalMs());
        return builder;
    }

    /**
     * Class to build instances of {@link UBUNTU}.
     */
    public static class Builder {
        private Integer totalMs;



        /**
         * Setter for totalMs.
         * @param  totalMs  Integer value for totalMs.
         * @return Builder
         */
        public Builder totalMs(Integer totalMs) {
            this.totalMs = totalMs;
            return this;
        }

        /**
         * Builds a new {@link UBUNTU} object using the set fields.
         * @return {@link UBUNTU}
         */
        public UBUNTU build() {
            return new UBUNTU(totalMs);
        }
    }
}
