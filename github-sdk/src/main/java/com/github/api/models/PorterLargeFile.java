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
 * This is a model class for PorterLargeFile type.
 */
public class PorterLargeFile {
    private String refName;
    private String path;
    private String oid;
    private int size;

    /**
     * Default constructor.
     */
    public PorterLargeFile() {
    }

    /**
     * Initialization constructor.
     * @param  refName  String value for refName.
     * @param  path  String value for path.
     * @param  oid  String value for oid.
     * @param  size  int value for size.
     */
    public PorterLargeFile(
            String refName,
            String path,
            String oid,
            int size) {
        this.refName = refName;
        this.path = path;
        this.oid = oid;
        this.size = size;
    }

    /**
     * Getter for RefName.
     * @return Returns the String
     */
    @JsonGetter("ref_name")
    public String getRefName() {
        return refName;
    }

    /**
     * Setter for RefName.
     * @param refName Value for String
     */
    @JsonSetter("ref_name")
    public void setRefName(String refName) {
        this.refName = refName;
    }

    /**
     * Getter for Path.
     * @return Returns the String
     */
    @JsonGetter("path")
    public String getPath() {
        return path;
    }

    /**
     * Setter for Path.
     * @param path Value for String
     */
    @JsonSetter("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Getter for Oid.
     * @return Returns the String
     */
    @JsonGetter("oid")
    public String getOid() {
        return oid;
    }

    /**
     * Setter for Oid.
     * @param oid Value for String
     */
    @JsonSetter("oid")
    public void setOid(String oid) {
        this.oid = oid;
    }

    /**
     * Getter for Size.
     * @return Returns the int
     */
    @JsonGetter("size")
    public int getSize() {
        return size;
    }

    /**
     * Setter for Size.
     * @param size Value for int
     */
    @JsonSetter("size")
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Converts this PorterLargeFile into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PorterLargeFile [" + "refName=" + refName + ", path=" + path + ", oid=" + oid
                + ", size=" + size + "]";
    }

    /**
     * Builds a new {@link PorterLargeFile.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PorterLargeFile.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(refName, path, oid, size);
        return builder;
    }

    /**
     * Class to build instances of {@link PorterLargeFile}.
     */
    public static class Builder {
        private String refName;
        private String path;
        private String oid;
        private int size;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  refName  String value for refName.
         * @param  path  String value for path.
         * @param  oid  String value for oid.
         * @param  size  int value for size.
         */
        public Builder(String refName, String path, String oid, int size) {
            this.refName = refName;
            this.path = path;
            this.oid = oid;
            this.size = size;
        }

        /**
         * Setter for refName.
         * @param  refName  String value for refName.
         * @return Builder
         */
        public Builder refName(String refName) {
            this.refName = refName;
            return this;
        }

        /**
         * Setter for path.
         * @param  path  String value for path.
         * @return Builder
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * Setter for oid.
         * @param  oid  String value for oid.
         * @return Builder
         */
        public Builder oid(String oid) {
            this.oid = oid;
            return this;
        }

        /**
         * Setter for size.
         * @param  size  int value for size.
         * @return Builder
         */
        public Builder size(int size) {
            this.size = size;
            return this;
        }

        /**
         * Builds a new {@link PorterLargeFile} object using the set fields.
         * @return {@link PorterLargeFile}
         */
        public PorterLargeFile build() {
            return new PorterLargeFile(refName, path, oid, size);
        }
    }
}
