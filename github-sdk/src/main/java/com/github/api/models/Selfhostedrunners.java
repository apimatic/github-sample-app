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
 * This is a model class for Selfhostedrunners type.
 */
public class Selfhostedrunners {
    private int id;
    private String name;
    private String os;
    private String status;
    private boolean busy;
    private List<Selfhostedrunnerlabel> labels;

    /**
     * Default constructor.
     */
    public Selfhostedrunners() {
    }

    /**
     * Initialization constructor.
     * @param  id  int value for id.
     * @param  name  String value for name.
     * @param  os  String value for os.
     * @param  status  String value for status.
     * @param  busy  boolean value for busy.
     * @param  labels  List of Selfhostedrunnerlabel value for labels.
     */
    public Selfhostedrunners(
            int id,
            String name,
            String os,
            String status,
            boolean busy,
            List<Selfhostedrunnerlabel> labels) {
        this.id = id;
        this.name = name;
        this.os = os;
        this.status = status;
        this.busy = busy;
        this.labels = labels;
    }

    /**
     * Getter for Id.
     * The id of the runner.
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The id of the runner.
     * @param id Value for int
     */
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for Name.
     * The name of the runner.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the runner.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Os.
     * The Operating System of the runner.
     * @return Returns the String
     */
    @JsonGetter("os")
    public String getOs() {
        return os;
    }

    /**
     * Setter for Os.
     * The Operating System of the runner.
     * @param os Value for String
     */
    @JsonSetter("os")
    public void setOs(String os) {
        this.os = os;
    }

    /**
     * Getter for Status.
     * The status of the runner.
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * The status of the runner.
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for Busy.
     * @return Returns the boolean
     */
    @JsonGetter("busy")
    public boolean getBusy() {
        return busy;
    }

    /**
     * Setter for Busy.
     * @param busy Value for boolean
     */
    @JsonSetter("busy")
    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    /**
     * Getter for Labels.
     * @return Returns the List of Selfhostedrunnerlabel
     */
    @JsonGetter("labels")
    public List<Selfhostedrunnerlabel> getLabels() {
        return labels;
    }

    /**
     * Setter for Labels.
     * @param labels Value for List of Selfhostedrunnerlabel
     */
    @JsonSetter("labels")
    public void setLabels(List<Selfhostedrunnerlabel> labels) {
        this.labels = labels;
    }

    /**
     * Converts this Selfhostedrunners into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Selfhostedrunners [" + "id=" + id + ", name=" + name + ", os=" + os + ", status="
                + status + ", busy=" + busy + ", labels=" + labels + "]";
    }

    /**
     * Builds a new {@link Selfhostedrunners.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Selfhostedrunners.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, name, os, status, busy, labels);
        return builder;
    }

    /**
     * Class to build instances of {@link Selfhostedrunners}.
     */
    public static class Builder {
        private int id;
        private String name;
        private String os;
        private String status;
        private boolean busy;
        private List<Selfhostedrunnerlabel> labels;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  int value for id.
         * @param  name  String value for name.
         * @param  os  String value for os.
         * @param  status  String value for status.
         * @param  busy  boolean value for busy.
         * @param  labels  List of Selfhostedrunnerlabel value for labels.
         */
        public Builder(int id, String name, String os, String status, boolean busy,
                List<Selfhostedrunnerlabel> labels) {
            this.id = id;
            this.name = name;
            this.os = os;
            this.status = status;
            this.busy = busy;
            this.labels = labels;
        }

        /**
         * Setter for id.
         * @param  id  int value for id.
         * @return Builder
         */
        public Builder id(int id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for os.
         * @param  os  String value for os.
         * @return Builder
         */
        public Builder os(String os) {
            this.os = os;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for busy.
         * @param  busy  boolean value for busy.
         * @return Builder
         */
        public Builder busy(boolean busy) {
            this.busy = busy;
            return this;
        }

        /**
         * Setter for labels.
         * @param  labels  List of Selfhostedrunnerlabel value for labels.
         * @return Builder
         */
        public Builder labels(List<Selfhostedrunnerlabel> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Builds a new {@link Selfhostedrunners} object using the set fields.
         * @return {@link Selfhostedrunners}
         */
        public Selfhostedrunners build() {
            return new Selfhostedrunners(id, name, os, status, busy, labels);
        }
    }
}