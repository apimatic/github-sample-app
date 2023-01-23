
# Orgs Actions Permissions Request

## Structure

`OrgsActionsPermissionsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EnabledRepositories` | [`EnabledRepositoriesEnum`](../../doc/models/enabled-repositories-enum.md) | Required | - | EnabledRepositoriesEnum getEnabledRepositories() | setEnabledRepositories(EnabledRepositoriesEnum enabledRepositories) |
| `AllowedActions` | [`AllowedActionsEnum`](../../doc/models/allowed-actions-enum.md) | Optional | - | AllowedActionsEnum getAllowedActions() | setAllowedActions(AllowedActionsEnum allowedActions) |

## Example (as JSON)

```json
{
  "enabled_repositories": "none",
  "allowed_actions": null
}
```

