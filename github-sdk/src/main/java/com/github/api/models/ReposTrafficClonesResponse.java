/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for ReposTrafficClonesResponse type.
 */
public class ReposTrafficClonesResponse {
    private int count;
    private int uniques;
    private List<Traffic> clones;

    /**
     * Default constructor.
     */
    public ReposTrafficClonesResponse() {
    }

    /**
     * Initialization constructor.
     * @param  count  int value for count.
     * @param  uniques  int value for uniques.
     * @param  clones  List of Traffic value for clones.
     */
    public ReposTrafficClonesResponse(
            int count,
            int uniques,
            List<Traffic> clones) {
        this.count = count;
        this.uniques = uniques;
        this.clones = clones;
    }

    /**
     * Getter for Count.
     * @return Returns the int
     */
    @JsonGetter("count")
    public int getCount() {
        return count;
    }

    /**
     * Setter for Count.
     * @param count Value for int
     */
    @JsonSetter("count")
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * Getter for Uniques.
     * @return Returns the int
     */
    @JsonGetter("uniques")
    public int getUniques() {
        return uniques;
    }

    /**
     * Setter for Uniques.
     * @param uniques Value for int
     */
    @JsonSetter("uniques")
    public void setUniques(int uniques) {
        this.uniques = uniques;
    }

    /**
     * Getter for Clones.
     * @return Returns the List of Traffic
     */
    @JsonGetter("clones")
    public List<Traffic> getClones() {
        return clones;
    }

    /**
     * Setter for Clones.
     * @param clones Value for List of Traffic
     */
    @JsonSetter("clones")
    public void setClones(List<Traffic> clones) {
        this.clones = clones;
    }

    /**
     * Converts this ReposTrafficClonesResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposTrafficClonesResponse [" + "count=" + count + ", uniques=" + uniques
                + ", clones=" + clones + "]";
    }

    /**
     * Builds a new {@link ReposTrafficClonesResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposTrafficClonesResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(count, uniques, clones);
        return builder;
    }

    /**
     * Class to build instances of {@link ReposTrafficClonesResponse}.
     */
    public static class Builder {
        private int count;
        private int uniques;
        private List<Traffic> clones;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  count  int value for count.
         * @param  uniques  int value for uniques.
         * @param  clones  List of Traffic value for clones.
         */
        public Builder(int count, int uniques, List<Traffic> clones) {
            this.count = count;
            this.uniques = uniques;
            this.clones = clones;
        }

        /**
         * Setter for count.
         * @param  count  int value for count.
         * @return Builder
         */
        public Builder count(int count) {
            this.count = count;
            return this;
        }

        /**
         * Setter for uniques.
         * @param  uniques  int value for uniques.
         * @return Builder
         */
        public Builder uniques(int uniques) {
            this.uniques = uniques;
            return this;
        }

        /**
         * Setter for clones.
         * @param  clones  List of Traffic value for clones.
         * @return Builder
         */
        public Builder clones(List<Traffic> clones) {
            this.clones = clones;
            return this;
        }

        /**
         * Builds a new {@link ReposTrafficClonesResponse} object using the set fields.
         * @return {@link ReposTrafficClonesResponse}
         */
        public ReposTrafficClonesResponse build() {
            return new ReposTrafficClonesResponse(count, uniques, clones);
        }
    }
}
