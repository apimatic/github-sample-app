
# User Migrations Request

## Structure

`UserMigrationsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LockRepositories` | `Boolean` | Optional | Lock the repositories being migrated at the start of the migration | Boolean getLockRepositories() | setLockRepositories(Boolean lockRepositories) |
| `ExcludeMetadata` | `Boolean` | Optional | Indicates whether metadata should be excluded and only git source should be included for the migration. | Boolean getExcludeMetadata() | setExcludeMetadata(Boolean excludeMetadata) |
| `ExcludeGitData` | `Boolean` | Optional | Indicates whether the repository git data should be excluded from the migration. | Boolean getExcludeGitData() | setExcludeGitData(Boolean excludeGitData) |
| `ExcludeAttachments` | `Boolean` | Optional | Do not include attachments in the migration | Boolean getExcludeAttachments() | setExcludeAttachments(Boolean excludeAttachments) |
| `ExcludeReleases` | `Boolean` | Optional | Do not include releases in the migration | Boolean getExcludeReleases() | setExcludeReleases(Boolean excludeReleases) |
| `ExcludeOwnerProjects` | `Boolean` | Optional | Indicates whether projects owned by the organization or users should be excluded. | Boolean getExcludeOwnerProjects() | setExcludeOwnerProjects(Boolean excludeOwnerProjects) |
| `OrgMetadataOnly` | `Boolean` | Optional | Indicates whether this should only include organization metadata (repositories array should be empty and will ignore other flags).<br>**Default**: `false` | Boolean getOrgMetadataOnly() | setOrgMetadataOnly(Boolean orgMetadataOnly) |
| `Exclude` | [`List<ExcludeEnum>`](../../doc/models/exclude-enum.md) | Optional | Exclude attributes from the API response to improve performance | List<ExcludeEnum> getExclude() | setExclude(List<ExcludeEnum> exclude) |
| `Repositories` | `List<String>` | Required | - | List<String> getRepositories() | setRepositories(List<String> repositories) |

## Example (as JSON)

```json
{
  "lock_repositories": null,
  "exclude_metadata": null,
  "exclude_git_data": null,
  "exclude_attachments": null,
  "exclude_releases": null,
  "exclude_owner_projects": null,
  "org_metadata_only": null,
  "exclude": null,
  "repositories": [
    "repositories8",
    "repositories9",
    "repositories0"
  ]
}
```

