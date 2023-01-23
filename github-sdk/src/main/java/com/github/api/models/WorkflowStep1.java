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
 * This is a model class for WorkflowStep1 type.
 */
public class WorkflowStep1 {
    private String completedAt;
    private Object conclusion;
    private String name;
    private int number;
    private String startedAt;
    private Status24Enum status;

    /**
     * Default constructor.
     */
    public WorkflowStep1() {
    }

    /**
     * Initialization constructor.
     * @param  completedAt  String value for completedAt.
     * @param  conclusion  Object value for conclusion.
     * @param  name  String value for name.
     * @param  number  int value for number.
     * @param  startedAt  String value for startedAt.
     * @param  status  Status24Enum value for status.
     */
    public WorkflowStep1(
            String completedAt,
            Object conclusion,
            String name,
            int number,
            String startedAt,
            Status24Enum status) {
        this.completedAt = completedAt;
        this.conclusion = conclusion;
        this.name = name;
        this.number = number;
        this.startedAt = startedAt;
        this.status = status;
    }

    /**
     * Getter for CompletedAt.
     * @return Returns the String
     */
    @JsonGetter("completed_at")
    public String getCompletedAt() {
        return completedAt;
    }

    /**
     * Setter for CompletedAt.
     * @param completedAt Value for String
     */
    @JsonSetter("completed_at")
    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }

    /**
     * Getter for Conclusion.
     * @return Returns the Object
     */
    @JsonGetter("conclusion")
    public Object getConclusion() {
        return conclusion;
    }

    /**
     * Setter for Conclusion.
     * @param conclusion Value for Object
     */
    @JsonSetter("conclusion")
    public void setConclusion(Object conclusion) {
        this.conclusion = conclusion;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Number.
     * @return Returns the int
     */
    @JsonGetter("number")
    public int getNumber() {
        return number;
    }

    /**
     * Setter for Number.
     * @param number Value for int
     */
    @JsonSetter("number")
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Getter for StartedAt.
     * @return Returns the String
     */
    @JsonGetter("started_at")
    public String getStartedAt() {
        return startedAt;
    }

    /**
     * Setter for StartedAt.
     * @param startedAt Value for String
     */
    @JsonSetter("started_at")
    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * Getter for Status.
     * @return Returns the Status24Enum
     */
    @JsonGetter("status")
    public Status24Enum getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for Status24Enum
     */
    @JsonSetter("status")
    public void setStatus(Status24Enum status) {
        this.status = status;
    }

    /**
     * Converts this WorkflowStep1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WorkflowStep1 [" + "completedAt=" + completedAt + ", conclusion=" + conclusion
                + ", name=" + name + ", number=" + number + ", startedAt=" + startedAt + ", status="
                + status + "]";
    }

    /**
     * Builds a new {@link WorkflowStep1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WorkflowStep1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(completedAt, conclusion, name, number, startedAt, status);
        return builder;
    }

    /**
     * Class to build instances of {@link WorkflowStep1}.
     */
    public static class Builder {
        private String completedAt;
        private Object conclusion;
        private String name;
        private int number;
        private String startedAt;
        private Status24Enum status;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  completedAt  String value for completedAt.
         * @param  conclusion  Object value for conclusion.
         * @param  name  String value for name.
         * @param  number  int value for number.
         * @param  startedAt  String value for startedAt.
         * @param  status  Status24Enum value for status.
         */
        public Builder(String completedAt, Object conclusion, String name, int number,
                String startedAt, Status24Enum status) {
            this.completedAt = completedAt;
            this.conclusion = conclusion;
            this.name = name;
            this.number = number;
            this.startedAt = startedAt;
            this.status = status;
        }

        /**
         * Setter for completedAt.
         * @param  completedAt  String value for completedAt.
         * @return Builder
         */
        public Builder completedAt(String completedAt) {
            this.completedAt = completedAt;
            return this;
        }

        /**
         * Setter for conclusion.
         * @param  conclusion  Object value for conclusion.
         * @return Builder
         */
        public Builder conclusion(Object conclusion) {
            this.conclusion = conclusion;
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
         * Setter for number.
         * @param  number  int value for number.
         * @return Builder
         */
        public Builder number(int number) {
            this.number = number;
            return this;
        }

        /**
         * Setter for startedAt.
         * @param  startedAt  String value for startedAt.
         * @return Builder
         */
        public Builder startedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  Status24Enum value for status.
         * @return Builder
         */
        public Builder status(Status24Enum status) {
            this.status = status;
            return this;
        }

        /**
         * Builds a new {@link WorkflowStep1} object using the set fields.
         * @return {@link WorkflowStep1}
         */
        public WorkflowStep1 build() {
            return new WorkflowStep1(completedAt, conclusion, name, number, startedAt, status);
        }
    }
}