
# Repos Transfer Request

## Structure

`ReposTransferRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `NewOwner` | `String` | Required | The username or organization name the repository will be transferred to. | String getNewOwner() | setNewOwner(String newOwner) |
| `NewName` | `String` | Optional | The new name to be given to the repository. | String getNewName() | setNewName(String newName) |
| `TeamIds` | `List<Integer>` | Optional | ID of the team or teams to add to the repository. Teams can only be added to organization-owned repositories. | List<Integer> getTeamIds() | setTeamIds(List<Integer> teamIds) |

## Example (as JSON)

```json
{
  "new_owner": "new_owner0",
  "new_name": null,
  "team_ids": null
}
```

