
# Repos Community Profile Response

## Structure

`ReposCommunityProfileResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `HealthPercentage` | `int` | Required | - | int getHealthPercentage() | setHealthPercentage(int healthPercentage) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `Documentation` | `String` | Required | - | String getDocumentation() | setDocumentation(String documentation) |
| `Files` | [`Files3`](../../doc/models/files-3.md) | Required | - | Files3 getFiles() | setFiles(Files3 files) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `ContentReportsEnabled` | `Boolean` | Optional | - | Boolean getContentReportsEnabled() | setContentReportsEnabled(Boolean contentReportsEnabled) |

## Example (as JSON)

```json
{
  "health_percentage": 100,
  "description": "My first repository on GitHub!",
  "documentation": "example.com",
  "files": null,
  "updated_at": "02/28/2017 19:09:29"
}
```

