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
 * This is a model class for Permissions1 type.
 */
public class Permissions1 {
    private boolean admin;
    private boolean pull;
    private Boolean triage;
    private boolean push;
    private Boolean maintain;

    /**
     * Default constructor.
     */
    public Permissions1() {
    }

    /**
     * Initialization constructor.
     * @param  admin  boolean value for admin.
     * @param  pull  boolean value for pull.
     * @param  push  boolean value for push.
     * @param  triage  Boolean value for triage.
     * @param  maintain  Boolean value for maintain.
     */
    public Permissions1(
            boolean admin,
            boolean pull,
            boolean push,
            Boolean triage,
            Boolean maintain) {
        this.admin = admin;
        this.pull = pull;
        this.triage = triage;
        this.push = push;
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
     * @return Returns the Boolean
     */
    @JsonGetter("triage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getTriage() {
        return triage;
    }

    /**
     * Setter for Triage.
     * @param triage Value for Boolean
     */
    @JsonSetter("triage")
    public void setTriage(Boolean triage) {
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
     * @return Returns the Boolean
     */
    @JsonGetter("maintain")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getMaintain() {
        return maintain;
    }

    /**
     * Setter for Maintain.
     * @param maintain Value for Boolean
     */
    @JsonSetter("maintain")
    public void setMaintain(Boolean maintain) {
        this.maintain = maintain;
    }

    /**
     * Converts this Permissions1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Permissions1 [" + "admin=" + admin + ", pull=" + pull + ", push=" + push
                + ", triage=" + triage + ", maintain=" + maintain + "]";
    }

    /**
     * Builds a new {@link Permissions1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Permissions1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(admin, pull, push)
                .triage(getTriage())
                .maintain(getMaintain());
        return builder;
    }

    /**
     * Class to build instances of {@link Permissions1}.
     */
    public static class Builder {
        private boolean admin;
        private boolean pull;
        private boolean push;
        private Boolean triage;
        private Boolean maintain;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  admin  boolean value for admin.
         * @param  pull  boolean value for pull.
         * @param  push  boolean value for push.
         */
        public Builder(boolean admin, boolean pull, boolean push) {
            this.admin = admin;
            this.pull = pull;
            this.push = push;
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
         * Setter for pull.
         * @param  pull  boolean value for pull.
         * @return Builder
         */
        public Builder pull(boolean pull) {
            this.pull = pull;
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
         * Setter for triage.
         * @param  triage  Boolean value for triage.
         * @return Builder
         */
        public Builder triage(Boolean triage) {
            this.triage = triage;
            return this;
        }

        /**
         * Setter for maintain.
         * @param  maintain  Boolean value for maintain.
         * @return Builder
         */
        public Builder maintain(Boolean maintain) {
            this.maintain = maintain;
            return this;
        }

        /**
         * Builds a new {@link Permissions1} object using the set fields.
         * @return {@link Permissions1}
         */
        public Permissions1 build() {
            return new Permissions1(admin, pull, push, triage, maintain);
        }
    }
}
