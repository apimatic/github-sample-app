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
import java.util.List;

/**
 * This is a model class for OrgsActionsVariablesRequest1 type.
 */
public class OrgsActionsVariablesRequest1 {
    private String name;
    private String value;
    private Visibility82Enum visibility;
    private List<Integer> selectedRepositoryIds;

    /**
     * Default constructor.
     */
    public OrgsActionsVariablesRequest1() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  value  String value for value.
     * @param  visibility  Visibility82Enum value for visibility.
     * @param  selectedRepositoryIds  List of Integer value for selectedRepositoryIds.
     */
    public OrgsActionsVariablesRequest1(
            String name,
            String value,
            Visibility82Enum visibility,
            List<Integer> selectedRepositoryIds) {
        this.name = name;
        this.value = value;
        this.visibility = visibility;
        this.selectedRepositoryIds = selectedRepositoryIds;
    }

    /**
     * Getter for Name.
     * The name of the variable.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the variable.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Value.
     * The value of the variable.
     * @return Returns the String
     */
    @JsonGetter("value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * The value of the variable.
     * @param value Value for String
     */
    @JsonSetter("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Getter for Visibility.
     * @return Returns the Visibility82Enum
     */
    @JsonGetter("visibility")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Visibility82Enum getVisibility() {
        return visibility;
    }

    /**
     * Setter for Visibility.
     * @param visibility Value for Visibility82Enum
     */
    @JsonSetter("visibility")
    public void setVisibility(Visibility82Enum visibility) {
        this.visibility = visibility;
    }

    /**
     * Getter for SelectedRepositoryIds.
     * An array of repository ids that can access the organization variable. You can only provide a
     * list of repository ids when the `visibility` is set to `selected`.
     * @return Returns the List of Integer
     */
    @JsonGetter("selected_repository_ids")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Integer> getSelectedRepositoryIds() {
        return selectedRepositoryIds;
    }

    /**
     * Setter for SelectedRepositoryIds.
     * An array of repository ids that can access the organization variable. You can only provide a
     * list of repository ids when the `visibility` is set to `selected`.
     * @param selectedRepositoryIds Value for List of Integer
     */
    @JsonSetter("selected_repository_ids")
    public void setSelectedRepositoryIds(List<Integer> selectedRepositoryIds) {
        this.selectedRepositoryIds = selectedRepositoryIds;
    }

    /**
     * Converts this OrgsActionsVariablesRequest1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrgsActionsVariablesRequest1 [" + "name=" + name + ", value=" + value
                + ", visibility=" + visibility + ", selectedRepositoryIds=" + selectedRepositoryIds
                + "]";
    }

    /**
     * Builds a new {@link OrgsActionsVariablesRequest1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrgsActionsVariablesRequest1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .value(getValue())
                .visibility(getVisibility())
                .selectedRepositoryIds(getSelectedRepositoryIds());
        return builder;
    }

    /**
     * Class to build instances of {@link OrgsActionsVariablesRequest1}.
     */
    public static class Builder {
        private String name;
        private String value;
        private Visibility82Enum visibility;
        private List<Integer> selectedRepositoryIds;



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
         * Setter for value.
         * @param  value  String value for value.
         * @return Builder
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Setter for visibility.
         * @param  visibility  Visibility82Enum value for visibility.
         * @return Builder
         */
        public Builder visibility(Visibility82Enum visibility) {
            this.visibility = visibility;
            return this;
        }

        /**
         * Setter for selectedRepositoryIds.
         * @param  selectedRepositoryIds  List of Integer value for selectedRepositoryIds.
         * @return Builder
         */
        public Builder selectedRepositoryIds(List<Integer> selectedRepositoryIds) {
            this.selectedRepositoryIds = selectedRepositoryIds;
            return this;
        }

        /**
         * Builds a new {@link OrgsActionsVariablesRequest1} object using the set fields.
         * @return {@link OrgsActionsVariablesRequest1}
         */
        public OrgsActionsVariablesRequest1 build() {
            return new OrgsActionsVariablesRequest1(name, value, visibility, selectedRepositoryIds);
        }
    }
}
