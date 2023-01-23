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
 * This is a model class for ReferrerTraffic type.
 */
public class ReferrerTraffic {
    private String referrer;
    private int count;
    private int uniques;

    /**
     * Default constructor.
     */
    public ReferrerTraffic() {
    }

    /**
     * Initialization constructor.
     * @param  referrer  String value for referrer.
     * @param  count  int value for count.
     * @param  uniques  int value for uniques.
     */
    public ReferrerTraffic(
            String referrer,
            int count,
            int uniques) {
        this.referrer = referrer;
        this.count = count;
        this.uniques = uniques;
    }

    /**
     * Getter for Referrer.
     * @return Returns the String
     */
    @JsonGetter("referrer")
    public String getReferrer() {
        return referrer;
    }

    /**
     * Setter for Referrer.
     * @param referrer Value for String
     */
    @JsonSetter("referrer")
    public void setReferrer(String referrer) {
        this.referrer = referrer;
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
     * Converts this ReferrerTraffic into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReferrerTraffic [" + "referrer=" + referrer + ", count=" + count + ", uniques="
                + uniques + "]";
    }

    /**
     * Builds a new {@link ReferrerTraffic.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReferrerTraffic.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(referrer, count, uniques);
        return builder;
    }

    /**
     * Class to build instances of {@link ReferrerTraffic}.
     */
    public static class Builder {
        private String referrer;
        private int count;
        private int uniques;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  referrer  String value for referrer.
         * @param  count  int value for count.
         * @param  uniques  int value for uniques.
         */
        public Builder(String referrer, int count, int uniques) {
            this.referrer = referrer;
            this.count = count;
            this.uniques = uniques;
        }

        /**
         * Setter for referrer.
         * @param  referrer  String value for referrer.
         * @return Builder
         */
        public Builder referrer(String referrer) {
            this.referrer = referrer;
            return this;
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
         * Builds a new {@link ReferrerTraffic} object using the set fields.
         * @return {@link ReferrerTraffic}
         */
        public ReferrerTraffic build() {
            return new ReferrerTraffic(referrer, count, uniques);
        }
    }
}
