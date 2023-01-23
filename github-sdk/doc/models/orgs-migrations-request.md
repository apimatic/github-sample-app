
# Orgs Migrations Request

## Structure

`OrgsMigrationsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Repositories` | `List<String>` | Required | A list of arrays indicating which repositories should be migrated. | List<String> getRepositories() | setRepositories(List<String> repositories) |
| `LockRepositories` | `Boolean` | Optional | Indicates whether repositories should be locked (to prevent manipulation) while migrating data.<br>**Default**: `false` | Boolean getLockRepositories() | setLockRepositories(Boolean lockRepositories) |
| `ExcludeMetadata` | `Boolean` | Optional | Indicates whether metadata should be excluded and only git source should be included for the migration.<br>**Default**: `false` | Boolean getExcludeMetadata() | setExcludeMetadata(Boolean excludeMetadata) |
| `ExcludeGitData` | `Boolean` | Optional | Indicates whether the repository git data should be excluded from the migration.<br>**Default**: `false` | Boolean getExcludeGitData() | setExcludeGitData(Boolean excludeGitData) |
| `ExcludeAttachments` | `Boolean` | Optional | Indicates whether attachments should be excluded from the migration (to reduce migration archive file size).<br>**Default**: `false` | Boolean getExcludeAttachments() | setExcludeAttachments(Boolean excludeAttachments) |
| `ExcludeReleases` | `Boolean` | Optional | Indicates whether releases should be excluded from the migration (to reduce migration archive file size).<br>**Default**: `false` | Boolean getExcludeReleases() | setExcludeReleases(Boolean excludeReleases) |
| `ExcludeOwnerProjects` | `Boolean` | Optional | Indicates whether projects owned by the organization or users should be excluded. from the migration.<br>**Default**: `false` | Boolean getExcludeOwnerProjects() | setExcludeOwnerProjects(Boolean excludeOwnerProjects) |
| `OrgMetadataOnly` | `Boolean` | Optional | Indicates whether this should only include organization metadata (repositories array should be empty and will ignore other flags).<br>**Default**: `false` | Boolean getOrgMetadataOnly() | setOrgMetadataOnly(Boolean orgMetadataOnly) |
| `Exclude` | [`List<Exclude1Enum>`](../../doc/models/exclude-1-enum.md) | Optional | Exclude related items from being returned in the response in order to improve performance of the request. The array can include any of: `"repositories"`. | List<Exclude1Enum> getExclude() | setExclude(List<Exclude1Enum> exclude) |

## Example (as JSON)

```json
{
  "repositories": [
    "repositories8",
    "repositories9",
    "repositories0"
  ],
  "lock_repositories": null,
  "exclude_metadata": null,
  "exclude_git_data": null,
  "exclude_attachments": null,
  "exclude_releases": null,
  "exclude_owner_projects": null,
  "org_metadata_only": null,
  "exclude": null
}
```

