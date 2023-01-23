
# Repos Generate Request

## Structure

`ReposGenerateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Owner` | `String` | Optional | The organization or person who will own the new repository. To create a new repository in an organization, the authenticated user must be a member of the specified organization. | String getOwner() | setOwner(String owner) |
| `Name` | `String` | Required | The name of the new repository. | String getName() | setName(String name) |
| `Description` | `String` | Optional | A short description of the new repository. | String getDescription() | setDescription(String description) |
| `IncludeAllBranches` | `Boolean` | Optional | Set to `true` to include the directory structure and files from all branches in the template repository, and not just the default branch. Default: `false`.<br>**Default**: `false` | Boolean getIncludeAllBranches() | setIncludeAllBranches(Boolean includeAllBranches) |
| `Private` | `Boolean` | Optional | Either `true` to create a new private repository or `false` to create a new public one.<br>**Default**: `false` | Boolean getPrivate() | setPrivate(Boolean mPrivate) |

## Example (as JSON)

```json
{
  "owner": null,
  "name": "name0",
  "description": null,
  "include_all_branches": null,
  "private": null
}
```

