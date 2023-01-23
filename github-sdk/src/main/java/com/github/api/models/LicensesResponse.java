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
 * This is a model class for LicensesResponse type.
 */
public class LicensesResponse {
    private String key;
    private String name;
    private String spdxId;
    private String url;
    private String nodeId;
    private String htmlUrl;
    private String description;
    private String implementation;
    private List<String> permissions;
    private List<String> conditions;
    private List<String> limitations;
    private String body;
    private boolean featured;

    /**
     * Default constructor.
     */
    public LicensesResponse() {
    }

    /**
     * Initialization constructor.
     * @param  key  String value for key.
     * @param  name  String value for name.
     * @param  spdxId  String value for spdxId.
     * @param  url  String value for url.
     * @param  nodeId  String value for nodeId.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  description  String value for description.
     * @param  implementation  String value for implementation.
     * @param  permissions  List of String value for permissions.
     * @param  conditions  List of String value for conditions.
     * @param  limitations  List of String value for limitations.
     * @param  body  String value for body.
     * @param  featured  boolean value for featured.
     */
    public LicensesResponse(
            String key,
            String name,
            String spdxId,
            String url,
            String nodeId,
            String htmlUrl,
            String description,
            String implementation,
            List<String> permissions,
            List<String> conditions,
            List<String> limitations,
            String body,
            boolean featured) {
        this.key = key;
        this.name = name;
        this.spdxId = spdxId;
        this.url = url;
        this.nodeId = nodeId;
        this.htmlUrl = htmlUrl;
        this.description = description;
        this.implementation = implementation;
        this.permissions = permissions;
        this.conditions = conditions;
        this.limitations = limitations;
        this.body = body;
        this.featured = featured;
    }

    /**
     * Getter for Key.
     * @return Returns the String
     */
    @JsonGetter("key")
    public String getKey() {
        return key;
    }

    /**
     * Setter for Key.
     * @param key Value for String
     */
    @JsonSetter("key")
    public void setKey(String key) {
        this.key = key;
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
     * Getter for SpdxId.
     * @return Returns the String
     */
    @JsonGetter("spdx_id")
    public String getSpdxId() {
        return spdxId;
    }

    /**
     * Setter for SpdxId.
     * @param spdxId Value for String
     */
    @JsonSetter("spdx_id")
    public void setSpdxId(String spdxId) {
        this.spdxId = spdxId;
    }

    /**
     * Getter for Url.
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for NodeId.
     * @return Returns the String
     */
    @JsonGetter("node_id")
    public String getNodeId() {
        return nodeId;
    }

    /**
     * Setter for NodeId.
     * @param nodeId Value for String
     */
    @JsonSetter("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * Getter for HtmlUrl.
     * @return Returns the String
     */
    @JsonGetter("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    /**
     * Setter for HtmlUrl.
     * @param htmlUrl Value for String
     */
    @JsonSetter("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
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
     * Getter for Implementation.
     * @return Returns the String
     */
    @JsonGetter("implementation")
    public String getImplementation() {
        return implementation;
    }

    /**
     * Setter for Implementation.
     * @param implementation Value for String
     */
    @JsonSetter("implementation")
    public void setImplementation(String implementation) {
        this.implementation = implementation;
    }

    /**
     * Getter for Permissions.
     * @return Returns the List of String
     */
    @JsonGetter("permissions")
    public List<String> getPermissions() {
        return permissions;
    }

    /**
     * Setter for Permissions.
     * @param permissions Value for List of String
     */
    @JsonSetter("permissions")
    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    /**
     * Getter for Conditions.
     * @return Returns the List of String
     */
    @JsonGetter("conditions")
    public List<String> getConditions() {
        return conditions;
    }

    /**
     * Setter for Conditions.
     * @param conditions Value for List of String
     */
    @JsonSetter("conditions")
    public void setConditions(List<String> conditions) {
        this.conditions = conditions;
    }

    /**
     * Getter for Limitations.
     * @return Returns the List of String
     */
    @JsonGetter("limitations")
    public List<String> getLimitations() {
        return limitations;
    }

    /**
     * Setter for Limitations.
     * @param limitations Value for List of String
     */
    @JsonSetter("limitations")
    public void setLimitations(List<String> limitations) {
        this.limitations = limitations;
    }

    /**
     * Getter for Body.
     * @return Returns the String
     */
    @JsonGetter("body")
    public String getBody() {
        return body;
    }

    /**
     * Setter for Body.
     * @param body Value for String
     */
    @JsonSetter("body")
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Getter for Featured.
     * @return Returns the boolean
     */
    @JsonGetter("featured")
    public boolean getFeatured() {
        return featured;
    }

    /**
     * Setter for Featured.
     * @param featured Value for boolean
     */
    @JsonSetter("featured")
    public void setFeatured(boolean featured) {
        this.featured = featured;
    }

    /**
     * Converts this LicensesResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "LicensesResponse [" + "key=" + key + ", name=" + name + ", spdxId=" + spdxId
                + ", url=" + url + ", nodeId=" + nodeId + ", htmlUrl=" + htmlUrl + ", description="
                + description + ", implementation=" + implementation + ", permissions="
                + permissions + ", conditions=" + conditions + ", limitations=" + limitations
                + ", body=" + body + ", featured=" + featured + "]";
    }

    /**
     * Builds a new {@link LicensesResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link LicensesResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(key, name, spdxId, url, nodeId, htmlUrl, description,
                implementation, permissions, conditions, limitations, body, featured);
        return builder;
    }

    /**
     * Class to build instances of {@link LicensesResponse}.
     */
    public static class Builder {
        private String key;
        private String name;
        private String spdxId;
        private String url;
        private String nodeId;
        private String htmlUrl;
        private String description;
        private String implementation;
        private List<String> permissions;
        private List<String> conditions;
        private List<String> limitations;
        private String body;
        private boolean featured;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  key  String value for key.
         * @param  name  String value for name.
         * @param  spdxId  String value for spdxId.
         * @param  url  String value for url.
         * @param  nodeId  String value for nodeId.
         * @param  htmlUrl  String value for htmlUrl.
         * @param  description  String value for description.
         * @param  implementation  String value for implementation.
         * @param  permissions  List of String value for permissions.
         * @param  conditions  List of String value for conditions.
         * @param  limitations  List of String value for limitations.
         * @param  body  String value for body.
         * @param  featured  boolean value for featured.
         */
        public Builder(String key, String name, String spdxId, String url, String nodeId,
                String htmlUrl, String description, String implementation, List<String> permissions,
                List<String> conditions, List<String> limitations, String body, boolean featured) {
            this.key = key;
            this.name = name;
            this.spdxId = spdxId;
            this.url = url;
            this.nodeId = nodeId;
            this.htmlUrl = htmlUrl;
            this.description = description;
            this.implementation = implementation;
            this.permissions = permissions;
            this.conditions = conditions;
            this.limitations = limitations;
            this.body = body;
            this.featured = featured;
        }

        /**
         * Setter for key.
         * @param  key  String value for key.
         * @return Builder
         */
        public Builder key(String key) {
            this.key = key;
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
         * Setter for spdxId.
         * @param  spdxId  String value for spdxId.
         * @return Builder
         */
        public Builder spdxId(String spdxId) {
            this.spdxId = spdxId;
            return this;
        }

        /**
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Setter for nodeId.
         * @param  nodeId  String value for nodeId.
         * @return Builder
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Setter for htmlUrl.
         * @param  htmlUrl  String value for htmlUrl.
         * @return Builder
         */
        public Builder htmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
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
         * Setter for implementation.
         * @param  implementation  String value for implementation.
         * @return Builder
         */
        public Builder implementation(String implementation) {
            this.implementation = implementation;
            return this;
        }

        /**
         * Setter for permissions.
         * @param  permissions  List of String value for permissions.
         * @return Builder
         */
        public Builder permissions(List<String> permissions) {
            this.permissions = permissions;
            return this;
        }

        /**
         * Setter for conditions.
         * @param  conditions  List of String value for conditions.
         * @return Builder
         */
        public Builder conditions(List<String> conditions) {
            this.conditions = conditions;
            return this;
        }

        /**
         * Setter for limitations.
         * @param  limitations  List of String value for limitations.
         * @return Builder
         */
        public Builder limitations(List<String> limitations) {
            this.limitations = limitations;
            return this;
        }

        /**
         * Setter for body.
         * @param  body  String value for body.
         * @return Builder
         */
        public Builder body(String body) {
            this.body = body;
            return this;
        }

        /**
         * Setter for featured.
         * @param  featured  boolean value for featured.
         * @return Builder
         */
        public Builder featured(boolean featured) {
            this.featured = featured;
            return this;
        }

        /**
         * Builds a new {@link LicensesResponse} object using the set fields.
         * @return {@link LicensesResponse}
         */
        public LicensesResponse build() {
            return new LicensesResponse(key, name, spdxId, url, nodeId, htmlUrl, description,
                    implementation, permissions, conditions, limitations, body, featured);
        }
    }
}
