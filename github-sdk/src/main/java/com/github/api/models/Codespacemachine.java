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
 * This is a model class for Codespacemachine type.
 */
public class Codespacemachine {
    private String name;
    private String displayName;
    private String operatingSystem;
    private long storageInBytes;
    private long memoryInBytes;
    private int cpus;
    private Object prebuildAvailability;

    /**
     * Default constructor.
     */
    public Codespacemachine() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  displayName  String value for displayName.
     * @param  operatingSystem  String value for operatingSystem.
     * @param  storageInBytes  long value for storageInBytes.
     * @param  memoryInBytes  long value for memoryInBytes.
     * @param  cpus  int value for cpus.
     * @param  prebuildAvailability  Object value for prebuildAvailability.
     */
    public Codespacemachine(
            String name,
            String displayName,
            String operatingSystem,
            long storageInBytes,
            long memoryInBytes,
            int cpus,
            Object prebuildAvailability) {
        this.name = name;
        this.displayName = displayName;
        this.operatingSystem = operatingSystem;
        this.storageInBytes = storageInBytes;
        this.memoryInBytes = memoryInBytes;
        this.cpus = cpus;
        this.prebuildAvailability = prebuildAvailability;
    }

    /**
     * Getter for Name.
     * The name of the machine.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the machine.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for DisplayName.
     * The display name of the machine includes cores, memory, and storage.
     * @return Returns the String
     */
    @JsonGetter("display_name")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Setter for DisplayName.
     * The display name of the machine includes cores, memory, and storage.
     * @param displayName Value for String
     */
    @JsonSetter("display_name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Getter for OperatingSystem.
     * The operating system of the machine.
     * @return Returns the String
     */
    @JsonGetter("operating_system")
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * Setter for OperatingSystem.
     * The operating system of the machine.
     * @param operatingSystem Value for String
     */
    @JsonSetter("operating_system")
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * Getter for StorageInBytes.
     * How much storage is available to the codespace.
     * @return Returns the long
     */
    @JsonGetter("storage_in_bytes")
    public long getStorageInBytes() {
        return storageInBytes;
    }

    /**
     * Setter for StorageInBytes.
     * How much storage is available to the codespace.
     * @param storageInBytes Value for long
     */
    @JsonSetter("storage_in_bytes")
    public void setStorageInBytes(long storageInBytes) {
        this.storageInBytes = storageInBytes;
    }

    /**
     * Getter for MemoryInBytes.
     * How much memory is available to the codespace.
     * @return Returns the long
     */
    @JsonGetter("memory_in_bytes")
    public long getMemoryInBytes() {
        return memoryInBytes;
    }

    /**
     * Setter for MemoryInBytes.
     * How much memory is available to the codespace.
     * @param memoryInBytes Value for long
     */
    @JsonSetter("memory_in_bytes")
    public void setMemoryInBytes(long memoryInBytes) {
        this.memoryInBytes = memoryInBytes;
    }

    /**
     * Getter for Cpus.
     * How many cores are available to the codespace.
     * @return Returns the int
     */
    @JsonGetter("cpus")
    public int getCpus() {
        return cpus;
    }

    /**
     * Setter for Cpus.
     * How many cores are available to the codespace.
     * @param cpus Value for int
     */
    @JsonSetter("cpus")
    public void setCpus(int cpus) {
        this.cpus = cpus;
    }

    /**
     * Getter for PrebuildAvailability.
     * @return Returns the Object
     */
    @JsonGetter("prebuild_availability")
    public Object getPrebuildAvailability() {
        return prebuildAvailability;
    }

    /**
     * Setter for PrebuildAvailability.
     * @param prebuildAvailability Value for Object
     */
    @JsonSetter("prebuild_availability")
    public void setPrebuildAvailability(Object prebuildAvailability) {
        this.prebuildAvailability = prebuildAvailability;
    }

    /**
     * Converts this Codespacemachine into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Codespacemachine [" + "name=" + name + ", displayName=" + displayName
                + ", operatingSystem=" + operatingSystem + ", storageInBytes=" + storageInBytes
                + ", memoryInBytes=" + memoryInBytes + ", cpus=" + cpus + ", prebuildAvailability="
                + prebuildAvailability + "]";
    }

    /**
     * Builds a new {@link Codespacemachine.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Codespacemachine.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, displayName, operatingSystem, storageInBytes,
                memoryInBytes, cpus, prebuildAvailability);
        return builder;
    }

    /**
     * Class to build instances of {@link Codespacemachine}.
     */
    public static class Builder {
        private String name;
        private String displayName;
        private String operatingSystem;
        private long storageInBytes;
        private long memoryInBytes;
        private int cpus;
        private Object prebuildAvailability;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  displayName  String value for displayName.
         * @param  operatingSystem  String value for operatingSystem.
         * @param  storageInBytes  long value for storageInBytes.
         * @param  memoryInBytes  long value for memoryInBytes.
         * @param  cpus  int value for cpus.
         * @param  prebuildAvailability  Object value for prebuildAvailability.
         */
        public Builder(String name, String displayName, String operatingSystem, long storageInBytes,
                long memoryInBytes, int cpus, Object prebuildAvailability) {
            this.name = name;
            this.displayName = displayName;
            this.operatingSystem = operatingSystem;
            this.storageInBytes = storageInBytes;
            this.memoryInBytes = memoryInBytes;
            this.cpus = cpus;
            this.prebuildAvailability = prebuildAvailability;
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
         * Setter for displayName.
         * @param  displayName  String value for displayName.
         * @return Builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Setter for operatingSystem.
         * @param  operatingSystem  String value for operatingSystem.
         * @return Builder
         */
        public Builder operatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        /**
         * Setter for storageInBytes.
         * @param  storageInBytes  long value for storageInBytes.
         * @return Builder
         */
        public Builder storageInBytes(long storageInBytes) {
            this.storageInBytes = storageInBytes;
            return this;
        }

        /**
         * Setter for memoryInBytes.
         * @param  memoryInBytes  long value for memoryInBytes.
         * @return Builder
         */
        public Builder memoryInBytes(long memoryInBytes) {
            this.memoryInBytes = memoryInBytes;
            return this;
        }

        /**
         * Setter for cpus.
         * @param  cpus  int value for cpus.
         * @return Builder
         */
        public Builder cpus(int cpus) {
            this.cpus = cpus;
            return this;
        }

        /**
         * Setter for prebuildAvailability.
         * @param  prebuildAvailability  Object value for prebuildAvailability.
         * @return Builder
         */
        public Builder prebuildAvailability(Object prebuildAvailability) {
            this.prebuildAvailability = prebuildAvailability;
            return this;
        }

        /**
         * Builds a new {@link Codespacemachine} object using the set fields.
         * @return {@link Codespacemachine}
         */
        public Codespacemachine build() {
            return new Codespacemachine(name, displayName, operatingSystem, storageInBytes,
                    memoryInBytes, cpus, prebuildAvailability);
        }
    }
}