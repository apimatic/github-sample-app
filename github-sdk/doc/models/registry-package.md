
# Registry Package

## Structure

`RegistryPackage`

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
| `Owner` | [`Author6`](../../doc/models/author-6.md) | Required | - | Author6 getOwner() | setOwner(Author6 owner) |
| `PackageType` | `String` | Required | - | String getPackageType() | setPackageType(String packageType) |
| `PackageVersion` | `Object` | Required | - | Object getPackageVersion() | setPackageVersion(Object packageVersion) |
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
    "key1": "val1",
    "key2": "val2"
  },
  "registry": {
    "key1": "val1",
    "key2": "val2"
  },
  "updated_at": "updated_at4"
}
```

