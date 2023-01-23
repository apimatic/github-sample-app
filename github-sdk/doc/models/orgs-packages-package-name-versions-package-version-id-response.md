
# Orgs Packages Package Name Versions Package Version Id Response

## Structure

`OrgsPackagesPackageNameVersionsPackageVersionIdResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | Unique identifier of the package version. | int getId() | setId(int id) |
| `Name` | `String` | Required | The name of the package version. | String getName() | setName(String name) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `PackageHtmlUrl` | `String` | Required | - | String getPackageHtmlUrl() | setPackageHtmlUrl(String packageHtmlUrl) |
| `HtmlUrl` | `String` | Optional | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `License` | `String` | Optional | - | String getLicense() | setLicense(String license) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `DeletedAt` | `LocalDateTime` | Optional | - | LocalDateTime getDeletedAt() | setDeletedAt(LocalDateTime deletedAt) |
| `Metadata` | [`PackageVersionMetadata`](../../doc/models/package-version-metadata.md) | Optional | - | PackageVersionMetadata getMetadata() | setMetadata(PackageVersionMetadata metadata) |

## Example (as JSON)

```json
{
  "id": 1,
  "name": "latest",
  "url": "https://api.github.com/orgs/github/packages/container/super-linter/versions/786068",
  "package_html_url": "https://github.com/orgs/github/packages/container/package/super-linter",
  "created_at": "04/10/2011 20:09:31",
  "updated_at": "03/03/2014 18:58:10"
}
```

