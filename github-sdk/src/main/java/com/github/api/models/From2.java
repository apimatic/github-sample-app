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
import java.time.LocalDateTime;

/**
 * This is a model class for From2 type.
 */
public class From2 {
    private LocalDateTime createdAt;
    private String description;
    private String emoji;
    private int id;
    private boolean isAnswerable;
    private String name;
    private String nodeId;
    private int repositoryId;
    private String slug;
    private String updatedAt;

    /**
     * Default constructor.
     */
    public From2() {
    }

    /**
     * Initialization constructor.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  description  String value for description.
     * @param  emoji  String value for emoji.
     * @param  id  int value for id.
     * @param  isAnswerable  boolean value for isAnswerable.
     * @param  name  String value for name.
     * @param  repositoryId  int value for repositoryId.
     * @param  slug  String value for slug.
     * @param  updatedAt  String value for updatedAt.
     * @param  nodeId  String value for nodeId.
     */
    public From2(
            LocalDateTime createdAt,
            String description,
            String emoji,
            int id,
            boolean isAnswerable,
            String name,
            int repositoryId,
            String slug,
            String updatedAt,
            String nodeId) {
        this.createdAt = createdAt;
        this.description = description;
        this.emoji = emoji;
        this.id = id;
        this.isAnswerable = isAnswerable;
        this.name = name;
        this.nodeId = nodeId;
        this.repositoryId = repositoryId;
        this.slug = slug;
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for LocalDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
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
     * Getter for Emoji.
     * @return Returns the String
     */
    @JsonGetter("emoji")
    public String getEmoji() {
        return emoji;
    }

    /**
     * Setter for Emoji.
     * @param emoji Value for String
     */
    @JsonSetter("emoji")
    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    /**
     * Getter for Id.
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for int
     */
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for IsAnswerable.
     * @return Returns the boolean
     */
    @JsonGetter("is_answerable")
    public boolean getIsAnswerable() {
        return isAnswerable;
    }

    /**
     * Setter for IsAnswerable.
     * @param isAnswerable Value for boolean
     */
    @JsonSetter("is_answerable")
    public void setIsAnswerable(boolean isAnswerable) {
        this.isAnswerable = isAnswerable;
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
     * Getter for NodeId.
     * @return Returns the String
     */
    @JsonGetter("node_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for RepositoryId.
     * @return Returns the int
     */
    @JsonGetter("repository_id")
    public int getRepositoryId() {
        return repositoryId;
    }

    /**
     * Setter for RepositoryId.
     * @param repositoryId Value for int
     */
    @JsonSetter("repository_id")
    public void setRepositoryId(int repositoryId) {
        this.repositoryId = repositoryId;
    }

    /**
     * Getter for Slug.
     * @return Returns the String
     */
    @JsonGetter("slug")
    public String getSlug() {
        return slug;
    }

    /**
     * Setter for Slug.
     * @param slug Value for String
     */
    @JsonSetter("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the String
     */
    @JsonGetter("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for String
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Converts this From2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "From2 [" + "createdAt=" + createdAt + ", description=" + description + ", emoji="
                + emoji + ", id=" + id + ", isAnswerable=" + isAnswerable + ", name=" + name
                + ", repositoryId=" + repositoryId + ", slug=" + slug + ", updatedAt=" + updatedAt
                + ", nodeId=" + nodeId + "]";
    }

    /**
     * Builds a new {@link From2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link From2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(createdAt, description, emoji, id, isAnswerable, name,
                repositoryId, slug, updatedAt)
                .nodeId(getNodeId());
        return builder;
    }

    /**
     * Class to build instances of {@link From2}.
     */
    public static class Builder {
        private LocalDateTime createdAt;
        private String description;
        private String emoji;
        private int id;
        private boolean isAnswerable;
        private String name;
        private int repositoryId;
        private String slug;
        private String updatedAt;
        private String nodeId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  description  String value for description.
         * @param  emoji  String value for emoji.
         * @param  id  int value for id.
         * @param  isAnswerable  boolean value for isAnswerable.
         * @param  name  String value for name.
         * @param  repositoryId  int value for repositoryId.
         * @param  slug  String value for slug.
         * @param  updatedAt  String value for updatedAt.
         */
        public Builder(LocalDateTime createdAt, String description, String emoji, int id,
                boolean isAnswerable, String name, int repositoryId, String slug,
                String updatedAt) {
            this.createdAt = createdAt;
            this.description = description;
            this.emoji = emoji;
            this.id = id;
            this.isAnswerable = isAnswerable;
            this.name = name;
            this.repositoryId = repositoryId;
            this.slug = slug;
            this.updatedAt = updatedAt;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
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
         * Setter for emoji.
         * @param  emoji  String value for emoji.
         * @return Builder
         */
        public Builder emoji(String emoji) {
            this.emoji = emoji;
            return this;
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
         * Setter for isAnswerable.
         * @param  isAnswerable  boolean value for isAnswerable.
         * @return Builder
         */
        public Builder isAnswerable(boolean isAnswerable) {
            this.isAnswerable = isAnswerable;
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
         * Setter for repositoryId.
         * @param  repositoryId  int value for repositoryId.
         * @return Builder
         */
        public Builder repositoryId(int repositoryId) {
            this.repositoryId = repositoryId;
            return this;
        }

        /**
         * Setter for slug.
         * @param  slug  String value for slug.
         * @return Builder
         */
        public Builder slug(String slug) {
            this.slug = slug;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  String value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
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
         * Builds a new {@link From2} object using the set fields.
         * @return {@link From2}
         */
        public From2 build() {
            return new From2(createdAt, description, emoji, id, isAnswerable, name, repositoryId,
                    slug, updatedAt, nodeId);
        }
    }
}
