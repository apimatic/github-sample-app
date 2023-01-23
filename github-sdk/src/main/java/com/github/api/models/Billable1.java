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
 * This is a model class for Billable1 type.
 */
public class Billable1 {
    private MACOS1 uBUNTU;
    private MACOS1 mACOS;
    private MACOS1 wINDOWS;

    /**
     * Default constructor.
     */
    public Billable1() {
    }

    /**
     * Initialization constructor.
     * @param  uBUNTU  MACOS1 value for uBUNTU.
     * @param  mACOS  MACOS1 value for mACOS.
     * @param  wINDOWS  MACOS1 value for wINDOWS.
     */
    public Billable1(
            MACOS1 uBUNTU,
            MACOS1 mACOS,
            MACOS1 wINDOWS) {
        this.uBUNTU = uBUNTU;
        this.mACOS = mACOS;
        this.wINDOWS = wINDOWS;
    }

    /**
     * Getter for UBUNTU.
     * @return Returns the MACOS1
     */
    @JsonGetter("UBUNTU")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MACOS1 getUBUNTU() {
        return uBUNTU;
    }

    /**
     * Setter for UBUNTU.
     * @param uBUNTU Value for MACOS1
     */
    @JsonSetter("UBUNTU")
    public void setUBUNTU(MACOS1 uBUNTU) {
        this.uBUNTU = uBUNTU;
    }

    /**
     * Getter for MACOS.
     * @return Returns the MACOS1
     */
    @JsonGetter("MACOS")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MACOS1 getMACOS() {
        return mACOS;
    }

    /**
     * Setter for MACOS.
     * @param mACOS Value for MACOS1
     */
    @JsonSetter("MACOS")
    public void setMACOS(MACOS1 mACOS) {
        this.mACOS = mACOS;
    }

    /**
     * Getter for WINDOWS.
     * @return Returns the MACOS1
     */
    @JsonGetter("WINDOWS")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MACOS1 getWINDOWS() {
        return wINDOWS;
    }

    /**
     * Setter for WINDOWS.
     * @param wINDOWS Value for MACOS1
     */
    @JsonSetter("WINDOWS")
    public void setWINDOWS(MACOS1 wINDOWS) {
        this.wINDOWS = wINDOWS;
    }

    /**
     * Converts this Billable1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Billable1 [" + "uBUNTU=" + uBUNTU + ", mACOS=" + mACOS + ", wINDOWS=" + wINDOWS
                + "]";
    }

    /**
     * Builds a new {@link Billable1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Billable1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .uBUNTU(getUBUNTU())
                .mACOS(getMACOS())
                .wINDOWS(getWINDOWS());
        return builder;
    }

    /**
     * Class to build instances of {@link Billable1}.
     */
    public static class Builder {
        private MACOS1 uBUNTU;
        private MACOS1 mACOS;
        private MACOS1 wINDOWS;



        /**
         * Setter for uBUNTU.
         * @param  uBUNTU  MACOS1 value for uBUNTU.
         * @return Builder
         */
        public Builder uBUNTU(MACOS1 uBUNTU) {
            this.uBUNTU = uBUNTU;
            return this;
        }

        /**
         * Setter for mACOS.
         * @param  mACOS  MACOS1 value for mACOS.
         * @return Builder
         */
        public Builder mACOS(MACOS1 mACOS) {
            this.mACOS = mACOS;
            return this;
        }

        /**
         * Setter for wINDOWS.
         * @param  wINDOWS  MACOS1 value for wINDOWS.
         * @return Builder
         */
        public Builder wINDOWS(MACOS1 wINDOWS) {
            this.wINDOWS = wINDOWS;
            return this;
        }

        /**
         * Builds a new {@link Billable1} object using the set fields.
         * @return {@link Billable1}
         */
        public Billable1 build() {
            return new Billable1(uBUNTU, mACOS, wINDOWS);
        }
    }
}
