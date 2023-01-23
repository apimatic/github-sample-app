
# Actions Organization Permissions

## Structure

`ActionsOrganizationPermissions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EnabledRepositories` | [`EnabledRepositoriesEnum`](../../doc/models/enabled-repositories-enum.md) | Required | - | EnabledRepositoriesEnum getEnabledRepositories() | setEnabledRepositories(EnabledRepositoriesEnum enabledRepositories) |
| `SelectedRepositoriesUrl` | `String` | Optional | The API URL to use to get or set the selected repositories that are allowed to run GitHub Actions, when `enabled_repositories` is set to `selected`. | String getSelectedRepositoriesUrl() | setSelectedRepositoriesUrl(String selectedRepositoriesUrl) |
| `AllowedActions` | [`AllowedActionsEnum`](../../doc/models/allowed-actions-enum.md) | Optional | - | AllowedActionsEnum getAllowedActions() | setAllowedActions(AllowedActionsEnum allowedActions) |
| `SelectedActionsUrl` | `String` | Optional | The API URL to use to get or set the actions and reusable workflows that are allowed to run, when `allowed_actions` is set to `selected`. | String getSelectedActionsUrl() | setSelectedActionsUrl(String selectedActionsUrl) |

## Example (as JSON)

```json
{
  "enabled_repositories": "none",
  "selected_repositories_url": null,
  "allowed_actions": null,
  "selected_actions_url": null
}
```

