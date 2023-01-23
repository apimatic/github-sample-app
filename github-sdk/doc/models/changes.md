
# Changes

If the action was `edited`, the changes to the rule.

## Structure

`Changes`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AdminEnforced` | [`AdminEnforced`](../../doc/models/admin-enforced.md) | Optional | - | AdminEnforced getAdminEnforced() | setAdminEnforced(AdminEnforced adminEnforced) |
| `AuthorizedActorNames` | [`AuthorizedActorNames`](../../doc/models/authorized-actor-names.md) | Optional | - | AuthorizedActorNames getAuthorizedActorNames() | setAuthorizedActorNames(AuthorizedActorNames authorizedActorNames) |
| `AuthorizedActorsOnly` | [`AdminEnforced`](../../doc/models/admin-enforced.md) | Optional | - | AdminEnforced getAuthorizedActorsOnly() | setAuthorizedActorsOnly(AdminEnforced authorizedActorsOnly) |
| `AuthorizedDismissalActorsOnly` | [`AdminEnforced`](../../doc/models/admin-enforced.md) | Optional | - | AdminEnforced getAuthorizedDismissalActorsOnly() | setAuthorizedDismissalActorsOnly(AdminEnforced authorizedDismissalActorsOnly) |
| `LinearHistoryRequirementEnforcementLevel` | [`LinearHistoryRequirementEnforcementLevel2`](../../doc/models/linear-history-requirement-enforcement-level-2.md) | Optional | - | LinearHistoryRequirementEnforcementLevel2 getLinearHistoryRequirementEnforcementLevel() | setLinearHistoryRequirementEnforcementLevel(LinearHistoryRequirementEnforcementLevel2 linearHistoryRequirementEnforcementLevel) |
| `RequiredStatusChecks` | [`AuthorizedActorNames`](../../doc/models/authorized-actor-names.md) | Optional | - | AuthorizedActorNames getRequiredStatusChecks() | setRequiredStatusChecks(AuthorizedActorNames requiredStatusChecks) |
| `RequiredStatusChecksEnforcementLevel` | [`LinearHistoryRequirementEnforcementLevel2`](../../doc/models/linear-history-requirement-enforcement-level-2.md) | Optional | - | LinearHistoryRequirementEnforcementLevel2 getRequiredStatusChecksEnforcementLevel() | setRequiredStatusChecksEnforcementLevel(LinearHistoryRequirementEnforcementLevel2 requiredStatusChecksEnforcementLevel) |

## Example (as JSON)

```json
{
  "admin_enforced": null,
  "authorized_actor_names": null,
  "authorized_actors_only": null,
  "authorized_dismissal_actors_only": null,
  "linear_history_requirement_enforcement_level": null,
  "required_status_checks": null,
  "required_status_checks_enforcement_level": null
}
```

