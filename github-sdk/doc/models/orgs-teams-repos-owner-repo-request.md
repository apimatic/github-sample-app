
# Orgs Teams Repos Owner Repo Request

## Structure

`OrgsTeamsReposOwnerRepoRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Permission` | `String` | Optional | The permission to grant the team on this repository. We accept the following permissions to be set: `pull`, `triage`, `push`, `maintain`, `admin` and you can also specify a custom repository role name, if the owning organization has defined any. If no permission is specified, the team's `permission` attribute will be used to determine what permission to grant the team on this repository.<br>**Default**: `"push"` | String getPermission() | setPermission(String permission) |

## Example (as JSON)

```json
{
  "permission": null
}
```

