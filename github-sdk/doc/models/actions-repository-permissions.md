
# Actions Repository Permissions

## Structure

`ActionsRepositoryPermissions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `boolean` | Required | Whether GitHub Actions is enabled on the repository. | boolean getEnabled() | setEnabled(boolean enabled) |
| `AllowedActions` | [`AllowedActionsEnum`](../../doc/models/allowed-actions-enum.md) | Optional | - | AllowedActionsEnum getAllowedActions() | setAllowedActions(AllowedActionsEnum allowedActions) |
| `SelectedActionsUrl` | `String` | Optional | The API URL to use to get or set the actions and reusable workflows that are allowed to run, when `allowed_actions` is set to `selected`. | String getSelectedActionsUrl() | setSelectedActionsUrl(String selectedActionsUrl) |

## Example (as JSON)

```json
{
  "enabled": false,
  "allowed_actions": null,
  "selected_actions_url": null
}
```

