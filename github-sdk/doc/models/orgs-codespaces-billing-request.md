
# Orgs Codespaces Billing Request

## Structure

`OrgsCodespacesBillingRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Visibility` | [`Visibility84Enum`](../../doc/models/visibility-84-enum.md) | Required | - | Visibility84Enum getVisibility() | setVisibility(Visibility84Enum visibility) |
| `SelectedUsernames` | `List<String>` | Optional | The usernames of the organization members who should have access to codespaces in the organization. Required when `visibility` is `selected_members`. The provided list of usernames will replace any existing value. | List<String> getSelectedUsernames() | setSelectedUsernames(List<String> selectedUsernames) |

## Example (as JSON)

```json
{
  "visibility": "all_members",
  "selected_usernames": null
}
```

