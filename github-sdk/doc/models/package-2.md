
# Package 2

Information about the package.

## Structure

`Package2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CreatedAt` | `String` | Required | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `Ecosystem` | `String` | Required | - | String getEcosystem() | setEcosystem(String ecosystem) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Namespace` | `String` | Required | - | String getNamespace() | setNamespace(String namespace) |
| `Owner` | `Object` | Required | - | Object getOwner() | setOwner(Object owner) |
| `PackageType` | `String` | Required | - | String getPackageType() | setPackageType(String packageType) |
| `PackageVersion` | [`PackageVersion2`](../../doc/models/package-version-2.md) | Required | - | PackageVersion2 getPackageVersion() | setPackageVersion(PackageVersion2 packageVersion) |
| `Registry` | `Object` | Required | - | Object getRegistry() | setRegistry(Object registry) |
| `UpdatedAt` | `String` | Required | - | String getUpdatedAt() | setUpdatedAt(String updatedAt) |

## Example (as JSON)

```json
{
  "created_at": "created_at2",
  "description": "description0",
  "ecosystem": "ecosystem4",
  "html_url": "html_url0",
  "id": 112,
  "name": "name0",
  "namespace": "namespace2",
  "owner": {
    "key1": "val1",
    "key2": "val2"
  },
  "package_type": "package_type8",
  "package_version": {
    "author": {
      "key1": "val1",
      "key2": "val2"
    },
    "body": "body8",
    "body_html": "body_html0",
    "created_at": "created_at0",
    "description": "description2",
    "docker_metadata": null,
    "draft": null,
    "html_url": "html_url8",
    "id": 252,
    "installation_command": "installation_command2",
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
    "name": "name2",
    "package_files": [
      {
        "content_type": "content_type2",
        "created_at": "created_at8",
        "download_url": "download_url6",
        "id": 178,
        "md5": "md56",
        "name": "name4",
        "sha1": "sha10",
        "sha256": "sha2564",
        "size": 208,
        "state": "state0",
        "updated_at": "updated_at0"
      }
    ],
    "package_url": null,
    "prerelease": null,
    "release": null,
    "rubygems_metadata": null,
    "source_url": null,
    "summary": "summary4",
    "tag_name": null,
    "target_commitish": "target_commitish0",
    "target_oid": "target_oid4",
    "updated_at": "updated_at8",
    "version": "version8"
  },
  "registry": {
    "key1": "val1",
    "key2": "val2"
  },
  "updated_at": "updated_at4"
}
```

