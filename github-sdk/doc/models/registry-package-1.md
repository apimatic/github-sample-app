
# Registry Package 1

## Structure

`RegistryPackage1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CreatedAt` | `String` | Required | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `Description` | `Object` | Required | - | Object getDescription() | setDescription(Object description) |
| `Ecosystem` | `String` | Required | - | String getEcosystem() | setEcosystem(String ecosystem) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Namespace` | `String` | Required | - | String getNamespace() | setNamespace(String namespace) |
| `Owner` | [`Author6`](../../doc/models/author-6.md) | Required | - | Author6 getOwner() | setOwner(Author6 owner) |
| `PackageType` | `String` | Required | - | String getPackageType() | setPackageType(String packageType) |
| `PackageVersion` | [`PackageVersion4`](../../doc/models/package-version-4.md) | Required | - | PackageVersion4 getPackageVersion() | setPackageVersion(PackageVersion4 packageVersion) |
| `Registry` | `Object` | Required | - | Object getRegistry() | setRegistry(Object registry) |
| `UpdatedAt` | `String` | Required | - | String getUpdatedAt() | setUpdatedAt(String updatedAt) |

## Example (as JSON)

```json
{
  "created_at": "created_at2",
  "description": {
    "key1": "val1",
    "key2": "val2"
  },
  "ecosystem": "ecosystem4",
  "html_url": "html_url0",
  "id": 112,
  "name": "name0",
  "namespace": "namespace2",
  "owner": {
    "avatar_url": "avatar_url0",
    "events_url": "events_url4",
    "followers_url": "followers_url4",
    "following_url": "following_url6",
    "gists_url": "gists_url6",
    "gravatar_id": "gravatar_id2",
    "html_url": "html_url6",
    "id": 84,
    "login": "login4",
    "node_id": "node_id8",
    "organizations_url": "organizations_url8",
    "received_events_url": "received_events_url6",
    "repos_url": "repos_url4",
    "site_admin": false,
    "starred_url": "starred_url8",
    "subscriptions_url": "subscriptions_url0",
    "type": "type6",
    "url": "url8"
  },
  "package_type": "package_type8",
  "package_version": {
    "author": {
      "avatar_url": "avatar_url4",
      "events_url": "events_url0",
      "followers_url": "followers_url0",
      "following_url": "following_url0",
      "gists_url": "gists_url0",
      "gravatar_id": "gravatar_id6",
      "html_url": "html_url2",
      "id": 224,
      "login": "login8",
      "node_id": "node_id4",
      "organizations_url": "organizations_url2",
      "received_events_url": "received_events_url0",
      "repos_url": "repos_url0",
      "site_admin": false,
      "starred_url": "starred_url4",
      "subscriptions_url": "subscriptions_url4",
      "type": "type2",
      "url": "url2"
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
        "content_type": null,
        "created_at": null,
        "download_url": null,
        "id": null,
        "md5": null,
        "name": null,
        "sha1": null,
        "sha256": null,
        "size": null,
        "state": null,
        "updated_at": null
      }
    ],
    "package_url": "package_url4",
    "prerelease": null,
    "release": null,
    "rubygems_metadata": null,
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

