/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.github.api.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDate;
import java.util.List;

/**
 * This is a model class for PagesHttpsCertificate type.
 */
public class PagesHttpsCertificate {
    private State12Enum state;
    private String description;
    private List<String> domains;
    private LocalDate expiresAt;

    /**
     * Default constructor.
     */
    public PagesHttpsCertificate() {
    }

    /**
     * Initialization constructor.
     * @param  state  State12Enum value for state.
     * @param  description  String value for description.
     * @param  domains  List of String value for domains.
     * @param  expiresAt  LocalDate value for expiresAt.
     */
    public PagesHttpsCertificate(
            State12Enum state,
            String description,
            List<String> domains,
            LocalDate expiresAt) {
        this.state = state;
        this.description = description;
        this.domains = domains;
        this.expiresAt = expiresAt;
    }

    /**
     * Getter for State.
     * @return Returns the State12Enum
     */
    @JsonGetter("state")
    public State12Enum getState() {
        return state;
    }

    /**
     * Setter for State.
     * @param state Value for State12Enum
     */
    @JsonSetter("state")
    public void setState(State12Enum state) {
        this.state = state;
    }

    /**
     * Getter for Description.
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Domains.
     * Array of the domain set and its alternate name (if it is configured)
     * @return Returns the List of String
     */
    @JsonGetter("domains")
    public List<String> getDomains() {
        return domains;
    }

    /**
     * Setter for Domains.
     * Array of the domain set and its alternate name (if it is configured)
     * @param domains Value for List of String
     */
    @JsonSetter("domains")
    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    /**
     * Getter for ExpiresAt.
     * @return Returns the LocalDate
     */
    @JsonGetter("expires_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getExpiresAt() {
        return expiresAt;
    }

    /**
     * Setter for ExpiresAt.
     * @param expiresAt Value for LocalDate
     */
    @JsonSetter("expires_at")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setExpiresAt(LocalDate expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * Converts this PagesHttpsCertificate into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PagesHttpsCertificate [" + "state=" + state + ", description=" + description
                + ", domains=" + domains + ", expiresAt=" + expiresAt + "]";
    }

    /**
     * Builds a new {@link PagesHttpsCertificate.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PagesHttpsCertificate.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(state, description, domains)
                .expiresAt(getExpiresAt());
        return builder;
    }

    /**
     * Class to build instances of {@link PagesHttpsCertificate}.
     */
    public static class Builder {
        private State12Enum state;
        private String description;
        private List<String> domains;
        private LocalDate expiresAt;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  state  State12Enum value for state.
         * @param  description  String value for description.
         * @param  domains  List of String value for domains.
         */
        public Builder(State12Enum state, String description, List<String> domains) {
            this.state = state;
            this.description = description;
            this.domains = domains;
        }

        /**
         * Setter for state.
         * @param  state  State12Enum value for state.
         * @return Builder
         */
        public Builder state(State12Enum state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for domains.
         * @param  domains  List of String value for domains.
         * @return Builder
         */
        public Builder domains(List<String> domains) {
            this.domains = domains;
            return this;
        }

        /**
         * Setter for expiresAt.
         * @param  expiresAt  LocalDate value for expiresAt.
         * @return Builder
         */
        public Builder expiresAt(LocalDate expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * Builds a new {@link PagesHttpsCertificate} object using the set fields.
         * @return {@link PagesHttpsCertificate}
         */
        public PagesHttpsCertificate build() {
            return new PagesHttpsCertificate(state, description, domains, expiresAt);
        }
    }
}
