
# Repos Collaborators Username Request

## Structure

`ReposCollaboratorsUsernameRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Permission` | `String` | Optional | The permission to grant the collaborator. **Only valid on organization-owned repositories.** We accept the following permissions to be set: `pull`, `triage`, `push`, `maintain`, `admin` and you can also specify a custom repository role name, if the owning organization has defined any.<br>**Default**: `"push"` | String getPermission() | setPermission(String permission) |

## Example (as JSON)

```json
{
  "permission": null
}
```

