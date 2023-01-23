
# Package Version 2

## Structure

`PackageVersion2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Author` | `Object` | Required | - | Object getAuthor() | setAuthor(Object author) |
| `Body` | `String` | Required | - | String getBody() | setBody(String body) |
| `BodyHtml` | `String` | Required | - | String getBodyHtml() | setBodyHtml(String bodyHtml) |
| `CreatedAt` | `String` | Required | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `DockerMetadata` | `List<Object>` | Optional | - | List<Object> getDockerMetadata() | setDockerMetadata(List<Object> dockerMetadata) |
| `Draft` | `Boolean` | Optional | - | Boolean getDraft() | setDraft(Boolean draft) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `InstallationCommand` | `String` | Required | - | String getInstallationCommand() | setInstallationCommand(String installationCommand) |
| `Manifest` | `String` | Optional | - | String getManifest() | setManifest(String manifest) |
| `Metadata` | `List<Object>` | Required | - | List<Object> getMetadata() | setMetadata(List<Object> metadata) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `PackageFiles` | [`List<PackageFile1>`](../../doc/models/package-file-1.md) | Required | - | List<PackageFile1> getPackageFiles() | setPackageFiles(List<PackageFile1> packageFiles) |
| `PackageUrl` | `String` | Optional | - | String getPackageUrl() | setPackageUrl(String packageUrl) |
| `Prerelease` | `Boolean` | Optional | - | Boolean getPrerelease() | setPrerelease(Boolean prerelease) |
| `Release` | [`Release2`](../../doc/models/release-2.md) | Optional | - | Release2 getRelease() | setRelease(Release2 release) |
| `RubygemsMetadata` | `List<Object>` | Optional | - | List<Object> getRubygemsMetadata() | setRubygemsMetadata(List<Object> rubygemsMetadata) |
| `SourceUrl` | `String` | Optional | - | String getSourceUrl() | setSourceUrl(String sourceUrl) |
| `Summary` | `String` | Required | - | String getSummary() | setSummary(String summary) |
| `TagName` | `String` | Optional | - | String getTagName() | setTagName(String tagName) |
| `TargetCommitish` | `String` | Required | - | String getTargetCommitish() | setTargetCommitish(String targetCommitish) |
| `TargetOid` | `String` | Required | - | String getTargetOid() | setTargetOid(String targetOid) |
| `UpdatedAt` | `String` | Required | - | String getUpdatedAt() | setUpdatedAt(String updatedAt) |
| `Version` | `String` | Required | - | String getVersion() | setVersion(String version) |

## Example (as JSON)

```json
{
  "author": {
    "key1": "val1",
    "key2": "val2"
  },
  "body": "body6",
  "body_html": "body_html2",
  "created_at": "created_at2",
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
  "target_commitish": "target_commitish8",
  "target_oid": "target_oid6",
  "updated_at": "updated_at4",
  "version": "version4"
}
```

