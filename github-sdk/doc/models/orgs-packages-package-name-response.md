
# Orgs Packages Package Name Response

## Structure

`OrgsPackagesPackageNameResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | Unique identifier of the package. | int getId() | setId(int id) |
| `Name` | `String` | Required | The name of the package. | String getName() | setName(String name) |
| `PackageType` | [`PackageType2Enum`](../../doc/models/package-type-2-enum.md) | Required | - | PackageType2Enum getPackageType() | setPackageType(PackageType2Enum packageType) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `VersionCount` | `int` | Required | The number of versions of the package. | int getVersionCount() | setVersionCount(int versionCount) |
| `Visibility` | [`Visibility4Enum`](../../doc/models/visibility-4-enum.md) | Required | - | Visibility4Enum getVisibility() | setVisibility(Visibility4Enum visibility) |
| `Owner` | `Object` | Optional | - | Object getOwner() | setOwner(Object owner) |
| `Repository` | `Object` | Optional | - | Object getRepository() | setRepository(Object repository) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |

## Example (as JSON)

```json
{
  "id": 1,
  "name": "super-linter",
  "package_type": null,
  "url": "https://api.github.com/orgs/github/packages/container/super-linter",
  "html_url": "https://github.com/orgs/github/packages/container/package/super-linter",
  "version_count": 1,
  "visibility": null,
  "created_at": null,
  "updated_at": null
}
```

