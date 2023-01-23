
# Repos Actions Permissions Request

## Structure

`ReposActionsPermissionsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `boolean` | Required | Whether GitHub Actions is enabled on the repository. | boolean getEnabled() | setEnabled(boolean enabled) |
| `AllowedActions` | [`AllowedActionsEnum`](../../doc/models/allowed-actions-enum.md) | Optional | - | AllowedActionsEnum getAllowedActions() | setAllowedActions(AllowedActionsEnum allowedActions) |

## Example (as JSON)

```json
{
  "enabled": false,
  "allowed_actions": null
}
```

