
# Package Version 1

## Structure

`PackageVersion1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Author` | `Object` | Optional | - | Object getAuthor() | setAuthor(Object author) |
| `Body` | [`PackageVersion1Body`]($m/PackageVersion1Body) | Optional | - | PackageVersion1Body getBody() | setBody(PackageVersion1Body body) |
| `BodyHtml` | `String` | Optional | - | String getBodyHtml() | setBodyHtml(String bodyHtml) |
| `ContainerMetadata` | `Object` | Optional | - | Object getContainerMetadata() | setContainerMetadata(Object containerMetadata) |
| `CreatedAt` | `String` | Optional | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `DockerMetadata` | `List<Object>` | Optional | - | List<Object> getDockerMetadata() | setDockerMetadata(List<Object> dockerMetadata) |
| `Draft` | `Boolean` | Optional | - | Boolean getDraft() | setDraft(Boolean draft) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `InstallationCommand` | `String` | Required | - | String getInstallationCommand() | setInstallationCommand(String installationCommand) |
| `Manifest` | `String` | Optional | - | String getManifest() | setManifest(String manifest) |
| `Metadata` | `List<Object>` | Required | - | List<Object> getMetadata() | setMetadata(List<Object> metadata) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `NpmMetadata` | `Object` | Optional | - | Object getNpmMetadata() | setNpmMetadata(Object npmMetadata) |
| `NugetMetadata` | [`List<NugetMetadatum>`](../../doc/models/nuget-metadatum.md) | Optional | - | List<NugetMetadatum> getNugetMetadata() | setNugetMetadata(List<NugetMetadatum> nugetMetadata) |
| `PackageFiles` | [`List<PackageFile>`](../../doc/models/package-file.md) | Required | - | List<PackageFile> getPackageFiles() | setPackageFiles(List<PackageFile> packageFiles) |
| `PackageUrl` | `String` | Optional | - | String getPackageUrl() | setPackageUrl(String packageUrl) |
| `Prerelease` | `Boolean` | Optional | - | Boolean getPrerelease() | setPrerelease(Boolean prerelease) |
| `Release` | [`Release1`](../../doc/models/release-1.md) | Optional | - | Release1 getRelease() | setRelease(Release1 release) |
| `RubygemsMetadata` | `List<Object>` | Optional | - | List<Object> getRubygemsMetadata() | setRubygemsMetadata(List<Object> rubygemsMetadata) |
| `SourceUrl` | `String` | Optional | - | String getSourceUrl() | setSourceUrl(String sourceUrl) |
| `Summary` | `String` | Required | - | String getSummary() | setSummary(String summary) |
| `TagName` | `String` | Optional | - | String getTagName() | setTagName(String tagName) |
| `TargetCommitish` | `String` | Optional | - | String getTargetCommitish() | setTargetCommitish(String targetCommitish) |
| `TargetOid` | `String` | Optional | - | String getTargetOid() | setTargetOid(String targetOid) |
| `UpdatedAt` | `String` | Optional | - | String getUpdatedAt() | setUpdatedAt(String updatedAt) |
| `Version` | `String` | Required | - | String getVersion() | setVersion(String version) |

## Example (as JSON)

```json
{
  "author": null,
  "body": null,
  "body_html": null,
  "container_metadata": null,
  "created_at": null,
  "description": "description0",
  "docker_metadata": null,
  "draft": null,
  "html_url": "html_url0",
  "id": 112,
  "installation_command": "installation_command0",
  "manifest": null,
  "metadata": [
    {
      "key1": "val1",
      "key2": "val2"
    },
    {
      "key1": "val1",
      "key2": "val2"
    },
    {
      "key1": "val1",
      "key2": "val2"
    }
  ],
  "name": "name0",
  "npm_metadata": null,
  "nuget_metadata": null,
  "package_files": [
    {
      "content_type": "content_type0",
      "created_at": "created_at4",
      "download_url": "download_url4",
      "id": 62,
      "md5": "md54",
      "name": "name6",
      "sha1": "sha18",
      "sha256": "sha2568",
      "size": 68,
      "state": "state2",
      "updated_at": "updated_at2"
    }
  ],
  "package_url": null,
  "prerelease": null,
  "release": null,
  "rubygems_metadata": null,
  "source_url": null,
  "summary": "summary2",
  "tag_name": null,
  "target_commitish": null,
  "target_oid": null,
  "updated_at": null,
  "version": "version4"
}
```

