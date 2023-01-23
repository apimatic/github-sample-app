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
 * This is a model class for Deploymentbranchpolicynamepattern type.
 */
public class Deploymentbranchpolicynamepattern {
    private String name;

    /**
     * Default constructor.
     */
    public Deploymentbranchpolicynamepattern() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     */
    public Deploymentbranchpolicynamepattern(
            String name) {
        this.name = name;
    }

    /**
     * Getter for Name.
     * The name pattern that branches must match in order to deploy to the environment. Wildcard
     * characters will not match `/`. For example, to match branches that begin with `release/` and
     * contain an additional single slash, use `release/*`. For more information about pattern
     * matching syntax, see the [Ruby File.fnmatch
     * documentation](https://ruby-doc.org/core-2.5.1/File.html#method-c-fnmatch).
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name pattern that branches must match in order to deploy to the environment. Wildcard
     * characters will not match `/`. For example, to match branches that begin with `release/` and
     * contain an additional single slash, use `release/*`. For more information about pattern
     * matching syntax, see the [Ruby File.fnmatch
     * documentation](https://ruby-doc.org/core-2.5.1/File.html#method-c-fnmatch).
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Converts this Deploymentbranchpolicynamepattern into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Deploymentbranchpolicynamepattern [" + "name=" + name + "]";
    }

    /**
     * Builds a new {@link Deploymentbranchpolicynamepattern.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Deploymentbranchpolicynamepattern.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name);
        return builder;
    }

    /**
     * Class to build instances of {@link Deploymentbranchpolicynamepattern}.
     */
    public static class Builder {
        private String name;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         */
        public Builder(String name) {
            this.name = name;
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
         * Builds a new {@link Deploymentbranchpolicynamepattern} object using the set fields.
         * @return {@link Deploymentbranchpolicynamepattern}
         */
        public Deploymentbranchpolicynamepattern build() {
            return new Deploymentbranchpolicynamepattern(name);
        }
    }
}
