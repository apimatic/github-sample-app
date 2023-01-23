
# Orgs Teams Request 1

## Structure

`OrgsTeamsRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | The name of the team. | String getName() | setName(String name) |
| `Description` | `String` | Optional | The description of the team. | String getDescription() | setDescription(String description) |
| `Privacy` | [`Privacy147Enum`](../../doc/models/privacy-147-enum.md) | Optional | - | Privacy147Enum getPrivacy() | setPrivacy(Privacy147Enum privacy) |
| `Permission` | [`Permission3Enum`](../../doc/models/permission-3-enum.md) | Optional | - | Permission3Enum getPermission() | setPermission(Permission3Enum permission) |
| `ParentTeamId` | `Integer` | Optional | The ID of a team to set as the parent team. | Integer getParentTeamId() | setParentTeamId(Integer parentTeamId) |

## Example (as JSON)

```json
{
  "name": null,
  "description": null,
  "privacy": null,
  "permission": null,
  "parent_team_id": null
}
```

