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
 * This is a model class for Permissions5 type.
 */
public class Permissions5 {
    private boolean pull;
    private boolean triage;
    private boolean push;
    private boolean maintain;
    private boolean admin;

    /**
     * Default constructor.
     */
    public Permissions5() {
    }

    /**
     * Initialization constructor.
     * @param  pull  boolean value for pull.
     * @param  triage  boolean value for triage.
     * @param  push  boolean value for push.
     * @param  maintain  boolean value for maintain.
     * @param  admin  boolean value for admin.
     */
    public Permissions5(
            boolean pull,
            boolean triage,
            boolean push,
            boolean maintain,
            boolean admin) {
        this.pull = pull;
        this.triage = triage;
        this.push = push;
        this.maintain = maintain;
        this.admin = admin;
    }

    /**
     * Getter for Pull.
     * @return Returns the boolean
     */
    @JsonGetter("pull")
    public boolean getPull() {
        return pull;
    }

    /**
     * Setter for Pull.
     * @param pull Value for boolean
     */
    @JsonSetter("pull")
    public void setPull(boolean pull) {
        this.pull = pull;
    }

    /**
     * Getter for Triage.
     * @return Returns the boolean
     */
    @JsonGetter("triage")
    public boolean getTriage() {
        return triage;
    }

    /**
     * Setter for Triage.
     * @param triage Value for boolean
     */
    @JsonSetter("triage")
    public void setTriage(boolean triage) {
        this.triage = triage;
    }

    /**
     * Getter for Push.
     * @return Returns the boolean
     */
    @JsonGetter("push")
    public boolean getPush() {
        return push;
    }

    /**
     * Setter for Push.
     * @param push Value for boolean
     */
    @JsonSetter("push")
    public void setPush(boolean push) {
        this.push = push;
    }

    /**
     * Getter for Maintain.
     * @return Returns the boolean
     */
    @JsonGetter("maintain")
    public boolean getMaintain() {
        return maintain;
    }

    /**
     * Setter for Maintain.
     * @param maintain Value for boolean
     */
    @JsonSetter("maintain")
    public void setMaintain(boolean maintain) {
        this.maintain = maintain;
    }

    /**
     * Getter for Admin.
     * @return Returns the boolean
     */
    @JsonGetter("admin")
    public boolean getAdmin() {
        return admin;
    }

    /**
     * Setter for Admin.
     * @param admin Value for boolean
     */
    @JsonSetter("admin")
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    /**
     * Converts this Permissions5 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Permissions5 [" + "pull=" + pull + ", triage=" + triage + ", push=" + push
                + ", maintain=" + maintain + ", admin=" + admin + "]";
    }

    /**
     * Builds a new {@link Permissions5.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Permissions5.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(pull, triage, push, maintain, admin);
        return builder;
    }

    /**
     * Class to build instances of {@link Permissions5}.
     */
    public static class Builder {
        private boolean pull;
        private boolean triage;
        private boolean push;
        private boolean maintain;
        private boolean admin;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  pull  boolean value for pull.
         * @param  triage  boolean value for triage.
         * @param  push  boolean value for push.
         * @param  maintain  boolean value for maintain.
         * @param  admin  boolean value for admin.
         */
        public Builder(boolean pull, boolean triage, boolean push, boolean maintain,
                boolean admin) {
            this.pull = pull;
            this.triage = triage;
            this.push = push;
            this.maintain = maintain;
            this.admin = admin;
        }

        /**
         * Setter for pull.
         * @param  pull  boolean value for pull.
         * @return Builder
         */
        public Builder pull(boolean pull) {
            this.pull = pull;
            return this;
        }

        /**
         * Setter for triage.
         * @param  triage  boolean value for triage.
         * @return Builder
         */
        public Builder triage(boolean triage) {
            this.triage = triage;
            return this;
        }

        /**
         * Setter for push.
         * @param  push  boolean value for push.
         * @return Builder
         */
        public Builder push(boolean push) {
            this.push = push;
            return this;
        }

        /**
         * Setter for maintain.
         * @param  maintain  boolean value for maintain.
         * @return Builder
         */
        public Builder maintain(boolean maintain) {
            this.maintain = maintain;
            return this;
        }

        /**
         * Setter for admin.
         * @param  admin  boolean value for admin.
         * @return Builder
         */
        public Builder admin(boolean admin) {
            this.admin = admin;
            return this;
        }

        /**
         * Builds a new {@link Permissions5} object using the set fields.
         * @return {@link Permissions5}
         */
        public Permissions5 build() {
            return new Permissions5(pull, triage, push, maintain, admin);
        }
    }
}
