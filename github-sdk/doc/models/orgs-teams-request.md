
# Orgs Teams Request

## Structure

`OrgsTeamsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The name of the team. | String getName() | setName(String name) |
| `Description` | `String` | Optional | The description of the team. | String getDescription() | setDescription(String description) |
| `Maintainers` | `List<String>` | Optional | List GitHub IDs for organization members who will become team maintainers. | List<String> getMaintainers() | setMaintainers(List<String> maintainers) |
| `RepoNames` | `List<String>` | Optional | The full name (e.g., "organization-name/repository-name") of repositories to add the team to. | List<String> getRepoNames() | setRepoNames(List<String> repoNames) |
| `Privacy` | [`Privacy146Enum`](../../doc/models/privacy-146-enum.md) | Optional | - | Privacy146Enum getPrivacy() | setPrivacy(Privacy146Enum privacy) |
| `Permission` | [`Permission2Enum`](../../doc/models/permission-2-enum.md) | Optional | - | Permission2Enum getPermission() | setPermission(Permission2Enum permission) |
| `ParentTeamId` | `Integer` | Optional | The ID of a team to set as the parent team. | Integer getParentTeamId() | setParentTeamId(Integer parentTeamId) |

## Example (as JSON)

```json
{
  "name": "name0",
  "description": null,
  "maintainers": null,
  "repo_names": null,
  "privacy": null,
  "permission": null,
  "parent_team_id": null
}
```

