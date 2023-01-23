/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.github.api.models.containers.PackageVersion1Body;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;

/**
 * This is a model class for PackageVersion1 type.
 */
public class PackageVersion1 {
    private Object author;
    private PackageVersion1Body body;
    private String bodyHtml;
    private Object containerMetadata;
    private String createdAt;
    private String description;
    private List<Object> dockerMetadata;
    private Boolean draft;
    private String htmlUrl;
    private int id;
    private String installationCommand;
    private String manifest;
    private List<Object> metadata;
    private String name;
    private Object npmMetadata;
    private OptionalNullable<List<NugetMetadatum>> nugetMetadata;
    private List<PackageFile> packageFiles;
    private String packageUrl;
    private Boolean prerelease;
    private Release1 release;
    private List<Object> rubygemsMetadata;
    private String sourceUrl;
    private String summary;
    private String tagName;
    private String targetCommitish;
    private String targetOid;
    private String updatedAt;
    private String version;

    /**
     * Default constructor.
     */
    public PackageVersion1() {
    }

    /**
     * Initialization constructor.
     * @param  description  String value for description.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  id  int value for id.
     * @param  installationCommand  String value for installationCommand.
     * @param  metadata  List of Object value for metadata.
     * @param  name  String value for name.
     * @param  packageFiles  List of PackageFile value for packageFiles.
     * @param  summary  String value for summary.
     * @param  version  String value for version.
     * @param  author  Object value for author.
     * @param  body  PackageVersion1Body value for body.
     * @param  bodyHtml  String value for bodyHtml.
     * @param  containerMetadata  Object value for containerMetadata.
     * @param  createdAt  String value for createdAt.
     * @param  dockerMetadata  List of Object value for dockerMetadata.
     * @param  draft  Boolean value for draft.
     * @param  manifest  String value for manifest.
     * @param  npmMetadata  Object value for npmMetadata.
     * @param  nugetMetadata  List of NugetMetadatum value for nugetMetadata.
     * @param  packageUrl  String value for packageUrl.
     * @param  prerelease  Boolean value for prerelease.
     * @param  release  Release1 value for release.
     * @param  rubygemsMetadata  List of Object value for rubygemsMetadata.
     * @param  sourceUrl  String value for sourceUrl.
     * @param  tagName  String value for tagName.
     * @param  targetCommitish  String value for targetCommitish.
     * @param  targetOid  String value for targetOid.
     * @param  updatedAt  String value for updatedAt.
     */
    public PackageVersion1(
            String description,
            String htmlUrl,
            int id,
            String installationCommand,
            List<Object> metadata,
            String name,
            List<PackageFile> packageFiles,
            String summary,
            String version,
            Object author,
            PackageVersion1Body body,
            String bodyHtml,
            Object containerMetadata,
            String createdAt,
            List<Object> dockerMetadata,
            Boolean draft,
            String manifest,
            Object npmMetadata,
            List<NugetMetadatum> nugetMetadata,
            String packageUrl,
            Boolean prerelease,
            Release1 release,
            List<Object> rubygemsMetadata,
            String sourceUrl,
            String tagName,
            String targetCommitish,
            String targetOid,
            String updatedAt) {
        this.author = author;
        this.body = body;
        this.bodyHtml = bodyHtml;
        this.containerMetadata = containerMetadata;
        this.createdAt = createdAt;
        this.description = description;
        this.dockerMetadata = dockerMetadata;
        this.draft = draft;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.installationCommand = installationCommand;
        this.manifest = manifest;
        this.metadata = metadata;
        this.name = name;
        this.npmMetadata = npmMetadata;
        this.nugetMetadata = OptionalNullable.of(nugetMetadata);
        this.packageFiles = packageFiles;
        this.packageUrl = packageUrl;
        this.prerelease = prerelease;
        this.release = release;
        this.rubygemsMetadata = rubygemsMetadata;
        this.sourceUrl = sourceUrl;
        this.summary = summary;
        this.tagName = tagName;
        this.targetCommitish = targetCommitish;
        this.targetOid = targetOid;
        this.updatedAt = updatedAt;
        this.version = version;
    }

    /**
     * Internal initialization constructor.
     */
    protected PackageVersion1(String description, String htmlUrl, int id,
            String installationCommand, List<Object> metadata, String name,
            List<PackageFile> packageFiles, String summary, String version, Object author,
            PackageVersion1Body body, String bodyHtml, Object containerMetadata, String createdAt,
            List<Object> dockerMetadata, Boolean draft, String manifest, Object npmMetadata,
            OptionalNullable<List<NugetMetadatum>> nugetMetadata, String packageUrl,
            Boolean prerelease, Release1 release, List<Object> rubygemsMetadata, String sourceUrl,
            String tagName, String targetCommitish, String targetOid, String updatedAt) {
        this.author = author;
        this.body = body;
        this.bodyHtml = bodyHtml;
        this.containerMetadata = containerMetadata;
        this.createdAt = createdAt;
        this.description = description;
        this.dockerMetadata = dockerMetadata;
        this.draft = draft;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.installationCommand = installationCommand;
        this.manifest = manifest;
        this.metadata = metadata;
        this.name = name;
        this.npmMetadata = npmMetadata;
        this.nugetMetadata = nugetMetadata;
        this.packageFiles = packageFiles;
        this.packageUrl = packageUrl;
        this.prerelease = prerelease;
        this.release = release;
        this.rubygemsMetadata = rubygemsMetadata;
        this.sourceUrl = sourceUrl;
        this.summary = summary;
        this.tagName = tagName;
        this.targetCommitish = targetCommitish;
        this.targetOid = targetOid;
        this.updatedAt = updatedAt;
        this.version = version;
    }

    /**
     * Getter for Author.
     * @return Returns the Object
     */
    @JsonGetter("author")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getAuthor() {
        return author;
    }

    /**
     * Setter for Author.
     * @param author Value for Object
     */
    @JsonSetter("author")
    public void setAuthor(Object author) {
        this.author = author;
    }

    /**
     * Getter for Body.
     * @return Returns the PackageVersion1Body
     */
    @JsonGetter("body")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PackageVersion1Body getBody() {
        return body;
    }

    /**
     * Setter for Body.
     * @param body Value for PackageVersion1Body
     */
    @JsonSetter("body")
    public void setBody(PackageVersion1Body body) {
        this.body = body;
    }

    /**
     * Getter for BodyHtml.
     * @return Returns the String
     */
    @JsonGetter("body_html")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBodyHtml() {
        return bodyHtml;
    }

    /**
     * Setter for BodyHtml.
     * @param bodyHtml Value for String
     */
    @JsonSetter("body_html")
    public void setBodyHtml(String bodyHtml) {
        this.bodyHtml = bodyHtml;
    }

    /**
     * Getter for ContainerMetadata.
     * @return Returns the Object
     */
    @JsonGetter("container_metadata")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getContainerMetadata() {
        return containerMetadata;
    }

    /**
     * Setter for ContainerMetadata.
     * @param containerMetadata Value for Object
     */
    @JsonSetter("container_metadata")
    public void setContainerMetadata(Object containerMetadata) {
        this.containerMetadata = containerMetadata;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the String
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for String
     */
    @JsonSetter("created_at")
    public void setCreatedAt(String createdAt) {
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
     * Getter for DockerMetadata.
     * @return Returns the List of Object
     */
    @JsonGetter("docker_metadata")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Object> getDockerMetadata() {
        return dockerMetadata;
    }

    /**
     * Setter for DockerMetadata.
     * @param dockerMetadata Value for List of Object
     */
    @JsonSetter("docker_metadata")
    public void setDockerMetadata(List<Object> dockerMetadata) {
        this.dockerMetadata = dockerMetadata;
    }

    /**
     * Getter for Draft.
     * @return Returns the Boolean
     */
    @JsonGetter("draft")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDraft() {
        return draft;
    }

    /**
     * Setter for Draft.
     * @param draft Value for Boolean
     */
    @JsonSetter("draft")
    public void setDraft(Boolean draft) {
        this.draft = draft;
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
     * Getter for InstallationCommand.
     * @return Returns the String
     */
    @JsonGetter("installation_command")
    public String getInstallationCommand() {
        return installationCommand;
    }

    /**
     * Setter for InstallationCommand.
     * @param installationCommand Value for String
     */
    @JsonSetter("installation_command")
    public void setInstallationCommand(String installationCommand) {
        this.installationCommand = installationCommand;
    }

    /**
     * Getter for Manifest.
     * @return Returns the String
     */
    @JsonGetter("manifest")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getManifest() {
        return manifest;
    }

    /**
     * Setter for Manifest.
     * @param manifest Value for String
     */
    @JsonSetter("manifest")
    public void setManifest(String manifest) {
        this.manifest = manifest;
    }

    /**
     * Getter for Metadata.
     * @return Returns the List of Object
     */
    @JsonGetter("metadata")
    public List<Object> getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * @param metadata Value for List of Object
     */
    @JsonSetter("metadata")
    public void setMetadata(List<Object> metadata) {
        this.metadata = metadata;
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
     * Getter for NpmMetadata.
     * @return Returns the Object
     */
    @JsonGetter("npm_metadata")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getNpmMetadata() {
        return npmMetadata;
    }

    /**
     * Setter for NpmMetadata.
     * @param npmMetadata Value for Object
     */
    @JsonSetter("npm_metadata")
    public void setNpmMetadata(Object npmMetadata) {
        this.npmMetadata = npmMetadata;
    }

    /**
     * Internal Getter for NugetMetadata.
     * @return Returns the Internal List of NugetMetadatum
     */
    @JsonGetter("nuget_metadata")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<NugetMetadatum>> internalGetNugetMetadata() {
        return this.nugetMetadata;
    }

    /**
     * Getter for NugetMetadata.
     * @return Returns the List of NugetMetadatum
     */
    public List<NugetMetadatum> getNugetMetadata() {
        return OptionalNullable.getFrom(nugetMetadata);
    }

    /**
     * Setter for NugetMetadata.
     * @param nugetMetadata Value for List of NugetMetadatum
     */
    @JsonSetter("nuget_metadata")
    public void setNugetMetadata(List<NugetMetadatum> nugetMetadata) {
        this.nugetMetadata = OptionalNullable.of(nugetMetadata);
    }

    /**
     * UnSetter for NugetMetadata.
     */
    public void unsetNugetMetadata() {
        nugetMetadata = null;
    }

    /**
     * Getter for PackageFiles.
     * @return Returns the List of PackageFile
     */
    @JsonGetter("package_files")
    public List<PackageFile> getPackageFiles() {
        return packageFiles;
    }

    /**
     * Setter for PackageFiles.
     * @param packageFiles Value for List of PackageFile
     */
    @JsonSetter("package_files")
    public void setPackageFiles(List<PackageFile> packageFiles) {
        this.packageFiles = packageFiles;
    }

    /**
     * Getter for PackageUrl.
     * @return Returns the String
     */
    @JsonGetter("package_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPackageUrl() {
        return packageUrl;
    }

    /**
     * Setter for PackageUrl.
     * @param packageUrl Value for String
     */
    @JsonSetter("package_url")
    public void setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
    }

    /**
     * Getter for Prerelease.
     * @return Returns the Boolean
     */
    @JsonGetter("prerelease")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPrerelease() {
        return prerelease;
    }

    /**
     * Setter for Prerelease.
     * @param prerelease Value for Boolean
     */
    @JsonSetter("prerelease")
    public void setPrerelease(Boolean prerelease) {
        this.prerelease = prerelease;
    }

    /**
     * Getter for Release.
     * @return Returns the Release1
     */
    @JsonGetter("release")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Release1 getRelease() {
        return release;
    }

    /**
     * Setter for Release.
     * @param release Value for Release1
     */
    @JsonSetter("release")
    public void setRelease(Release1 release) {
        this.release = release;
    }

    /**
     * Getter for RubygemsMetadata.
     * @return Returns the List of Object
     */
    @JsonGetter("rubygems_metadata")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Object> getRubygemsMetadata() {
        return rubygemsMetadata;
    }

    /**
     * Setter for RubygemsMetadata.
     * @param rubygemsMetadata Value for List of Object
     */
    @JsonSetter("rubygems_metadata")
    public void setRubygemsMetadata(List<Object> rubygemsMetadata) {
        this.rubygemsMetadata = rubygemsMetadata;
    }

    /**
     * Getter for SourceUrl.
     * @return Returns the String
     */
    @JsonGetter("source_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSourceUrl() {
        return sourceUrl;
    }

    /**
     * Setter for SourceUrl.
     * @param sourceUrl Value for String
     */
    @JsonSetter("source_url")
    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    /**
     * Getter for Summary.
     * @return Returns the String
     */
    @JsonGetter("summary")
    public String getSummary() {
        return summary;
    }

    /**
     * Setter for Summary.
     * @param summary Value for String
     */
    @JsonSetter("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * Getter for TagName.
     * @return Returns the String
     */
    @JsonGetter("tag_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTagName() {
        return tagName;
    }

    /**
     * Setter for TagName.
     * @param tagName Value for String
     */
    @JsonSetter("tag_name")
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    /**
     * Getter for TargetCommitish.
     * @return Returns the String
     */
    @JsonGetter("target_commitish")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTargetCommitish() {
        return targetCommitish;
    }

    /**
     * Setter for TargetCommitish.
     * @param targetCommitish Value for String
     */
    @JsonSetter("target_commitish")
    public void setTargetCommitish(String targetCommitish) {
        this.targetCommitish = targetCommitish;
    }

    /**
     * Getter for TargetOid.
     * @return Returns the String
     */
    @JsonGetter("target_oid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTargetOid() {
        return targetOid;
    }

    /**
     * Setter for TargetOid.
     * @param targetOid Value for String
     */
    @JsonSetter("target_oid")
    public void setTargetOid(String targetOid) {
        this.targetOid = targetOid;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the String
     */
    @JsonGetter("updated_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for Version.
     * @return Returns the String
     */
    @JsonGetter("version")
    public String getVersion() {
        return version;
    }

    /**
     * Setter for Version.
     * @param version Value for String
     */
    @JsonSetter("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Converts this PackageVersion1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PackageVersion1 [" + "description=" + description + ", htmlUrl=" + htmlUrl + ", id="
                + id + ", installationCommand=" + installationCommand + ", metadata=" + metadata
                + ", name=" + name + ", packageFiles=" + packageFiles + ", summary=" + summary
                + ", version=" + version + ", author=" + author + ", body=" + body + ", bodyHtml="
                + bodyHtml + ", containerMetadata=" + containerMetadata + ", createdAt=" + createdAt
                + ", dockerMetadata=" + dockerMetadata + ", draft=" + draft + ", manifest="
                + manifest + ", npmMetadata=" + npmMetadata + ", nugetMetadata=" + nugetMetadata
                + ", packageUrl=" + packageUrl + ", prerelease=" + prerelease + ", release="
                + release + ", rubygemsMetadata=" + rubygemsMetadata + ", sourceUrl=" + sourceUrl
                + ", tagName=" + tagName + ", targetCommitish=" + targetCommitish + ", targetOid="
                + targetOid + ", updatedAt=" + updatedAt + "]";
    }

    /**
     * Builds a new {@link PackageVersion1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PackageVersion1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(description, htmlUrl, id, installationCommand, metadata, name,
                packageFiles, summary, version)
                .author(getAuthor())
                .body(getBody())
                .bodyHtml(getBodyHtml())
                .containerMetadata(getContainerMetadata())
                .createdAt(getCreatedAt())
                .dockerMetadata(getDockerMetadata())
                .draft(getDraft())
                .manifest(getManifest())
                .npmMetadata(getNpmMetadata())
                .packageUrl(getPackageUrl())
                .prerelease(getPrerelease())
                .release(getRelease())
                .rubygemsMetadata(getRubygemsMetadata())
                .sourceUrl(getSourceUrl())
                .tagName(getTagName())
                .targetCommitish(getTargetCommitish())
                .targetOid(getTargetOid())
                .updatedAt(getUpdatedAt());
        builder.nugetMetadata = internalGetNugetMetadata();
        return builder;
    }

    /**
     * Class to build instances of {@link PackageVersion1}.
     */
    public static class Builder {
        private String description;
        private String htmlUrl;
        private int id;
        private String installationCommand;
        private List<Object> metadata;
        private String name;
        private List<PackageFile> packageFiles;
        private String summary;
        private String version;
        private Object author;
        private PackageVersion1Body body;
        private String bodyHtml;
        private Object containerMetadata;
        private String createdAt;
        private List<Object> dockerMetadata;
        private Boolean draft;
        private String manifest;
        private Object npmMetadata;
        private OptionalNullable<List<NugetMetadatum>> nugetMetadata;
        private String packageUrl;
        private Boolean prerelease;
        private Release1 release;
        private List<Object> rubygemsMetadata;
        private String sourceUrl;
        private String tagName;
        private String targetCommitish;
        private String targetOid;
        private String updatedAt;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  description  String value for description.
         * @param  htmlUrl  String value for htmlUrl.
         * @param  id  int value for id.
         * @param  installationCommand  String value for installationCommand.
         * @param  metadata  List of Object value for metadata.
         * @param  name  String value for name.
         * @param  packageFiles  List of PackageFile value for packageFiles.
         * @param  summary  String value for summary.
         * @param  version  String value for version.
         */
        public Builder(String description, String htmlUrl, int id, String installationCommand,
                List<Object> metadata, String name, List<PackageFile> packageFiles, String summary,
                String version) {
            this.description = description;
            this.htmlUrl = htmlUrl;
            this.id = id;
            this.installationCommand = installationCommand;
            this.metadata = metadata;
            this.name = name;
            this.packageFiles = packageFiles;
            this.summary = summary;
            this.version = version;
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
         * Setter for htmlUrl.
         * @param  htmlUrl  String value for htmlUrl.
         * @return Builder
         */
        public Builder htmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
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
         * Setter for installationCommand.
         * @param  installationCommand  String value for installationCommand.
         * @return Builder
         */
        public Builder installationCommand(String installationCommand) {
            this.installationCommand = installationCommand;
            return this;
        }

        /**
         * Setter for metadata.
         * @param  metadata  List of Object value for metadata.
         * @return Builder
         */
        public Builder metadata(List<Object> metadata) {
            this.metadata = metadata;
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
         * Setter for packageFiles.
         * @param  packageFiles  List of PackageFile value for packageFiles.
         * @return Builder
         */
        public Builder packageFiles(List<PackageFile> packageFiles) {
            this.packageFiles = packageFiles;
            return this;
        }

        /**
         * Setter for summary.
         * @param  summary  String value for summary.
         * @return Builder
         */
        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }

        /**
         * Setter for version.
         * @param  version  String value for version.
         * @return Builder
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * Setter for author.
         * @param  author  Object value for author.
         * @return Builder
         */
        public Builder author(Object author) {
            this.author = author;
            return this;
        }

        /**
         * Setter for body.
         * @param  body  PackageVersion1Body value for body.
         * @return Builder
         */
        public Builder body(PackageVersion1Body body) {
            this.body = body;
            return this;
        }

        /**
         * Setter for bodyHtml.
         * @param  bodyHtml  String value for bodyHtml.
         * @return Builder
         */
        public Builder bodyHtml(String bodyHtml) {
            this.bodyHtml = bodyHtml;
            return this;
        }

        /**
         * Setter for containerMetadata.
         * @param  containerMetadata  Object value for containerMetadata.
         * @return Builder
         */
        public Builder containerMetadata(Object containerMetadata) {
            this.containerMetadata = containerMetadata;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  String value for createdAt.
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for dockerMetadata.
         * @param  dockerMetadata  List of Object value for dockerMetadata.
         * @return Builder
         */
        public Builder dockerMetadata(List<Object> dockerMetadata) {
            this.dockerMetadata = dockerMetadata;
            return this;
        }

        /**
         * Setter for draft.
         * @param  draft  Boolean value for draft.
         * @return Builder
         */
        public Builder draft(Boolean draft) {
            this.draft = draft;
            return this;
        }

        /**
         * Setter for manifest.
         * @param  manifest  String value for manifest.
         * @return Builder
         */
        public Builder manifest(String manifest) {
            this.manifest = manifest;
            return this;
        }

        /**
         * Setter for npmMetadata.
         * @param  npmMetadata  Object value for npmMetadata.
         * @return Builder
         */
        public Builder npmMetadata(Object npmMetadata) {
            this.npmMetadata = npmMetadata;
            return this;
        }

        /**
         * Setter for nugetMetadata.
         * @param  nugetMetadata  List of NugetMetadatum value for nugetMetadata.
         * @return Builder
         */
        public Builder nugetMetadata(List<NugetMetadatum> nugetMetadata) {
            this.nugetMetadata = OptionalNullable.of(nugetMetadata);
            return this;
        }

        /**
         * UnSetter for nugetMetadata.
         * @return Builder
         */
        public Builder unsetNugetMetadata() {
            nugetMetadata = null;
            return this;
        }

        /**
         * Setter for packageUrl.
         * @param  packageUrl  String value for packageUrl.
         * @return Builder
         */
        public Builder packageUrl(String packageUrl) {
            this.packageUrl = packageUrl;
            return this;
        }

        /**
         * Setter for prerelease.
         * @param  prerelease  Boolean value for prerelease.
         * @return Builder
         */
        public Builder prerelease(Boolean prerelease) {
            this.prerelease = prerelease;
            return this;
        }

        /**
         * Setter for release.
         * @param  release  Release1 value for release.
         * @return Builder
         */
        public Builder release(Release1 release) {
            this.release = release;
            return this;
        }

        /**
         * Setter for rubygemsMetadata.
         * @param  rubygemsMetadata  List of Object value for rubygemsMetadata.
         * @return Builder
         */
        public Builder rubygemsMetadata(List<Object> rubygemsMetadata) {
            this.rubygemsMetadata = rubygemsMetadata;
            return this;
        }

        /**
         * Setter for sourceUrl.
         * @param  sourceUrl  String value for sourceUrl.
         * @return Builder
         */
        public Builder sourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }

        /**
         * Setter for tagName.
         * @param  tagName  String value for tagName.
         * @return Builder
         */
        public Builder tagName(String tagName) {
            this.tagName = tagName;
            return this;
        }

        /**
         * Setter for targetCommitish.
         * @param  targetCommitish  String value for targetCommitish.
         * @return Builder
         */
        public Builder targetCommitish(String targetCommitish) {
            this.targetCommitish = targetCommitish;
            return this;
        }

        /**
         * Setter for targetOid.
         * @param  targetOid  String value for targetOid.
         * @return Builder
         */
        public Builder targetOid(String targetOid) {
            this.targetOid = targetOid;
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
         * Builds a new {@link PackageVersion1} object using the set fields.
         * @return {@link PackageVersion1}
         */
        public PackageVersion1 build() {
            return new PackageVersion1(description, htmlUrl, id, installationCommand, metadata,
                    name, packageFiles, summary, version, author, body, bodyHtml, containerMetadata,
                    createdAt, dockerMetadata, draft, manifest, npmMetadata, nugetMetadata,
                    packageUrl, prerelease, release, rubygemsMetadata, sourceUrl, tagName,
                    targetCommitish, targetOid, updatedAt);
        }
    }
}