
# Metadeletedevent

## Structure

`Metadeletedevent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Action` | `String` | Required, Constant | **Default**: `"deleted"` | String getAction() | setAction(String action) |
| `Enterprise` | [`Enterprise1`](../../doc/models/enterprise-1.md) | Optional | - | Enterprise1 getEnterprise() | setEnterprise(Enterprise1 enterprise) |
| `Hook` | [`Hook3`](../../doc/models/hook-3.md) | Required | - | Hook3 getHook() | setHook(Hook3 hook) |
| `HookId` | `int` | Required | The id of the modified webhook. | int getHookId() | setHookId(int hookId) |
| `Installation` | [`Installation1`](../../doc/models/installation-1.md) | Optional | - | Installation1 getInstallation() | setInstallation(Installation1 installation) |
| `Organization` | [`Organization2`](../../doc/models/organization-2.md) | Optional | - | Organization2 getOrganization() | setOrganization(Organization2 organization) |
| `Repository` | `Object` | Optional | - | Object getRepository() | setRepository(Object repository) |
| `Sender` | [`Sender`](../../doc/models/sender.md) | Optional | - | Sender getSender() | setSender(Sender sender) |

## Example (as JSON)

```json
{
  "action": "deleted",
  "hook": null,
  "hook_id": null
}
```

