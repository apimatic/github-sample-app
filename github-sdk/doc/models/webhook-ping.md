
# Webhook Ping

## Structure

`WebhookPing`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Hook` | [`Hook1`](../../doc/models/hook-1.md) | Optional | - | Hook1 getHook() | setHook(Hook1 hook) |
| `HookId` | `Integer` | Optional | The ID of the webhook that triggered the ping. | Integer getHookId() | setHookId(Integer hookId) |
| `Organization` | [`Organization2`](../../doc/models/organization-2.md) | Optional | - | Organization2 getOrganization() | setOrganization(Organization2 organization) |
| `Repository` | [`Repository3`](../../doc/models/repository-3.md) | Optional | - | Repository3 getRepository() | setRepository(Repository3 repository) |
| `Sender` | [`Sender`](../../doc/models/sender.md) | Optional | - | Sender getSender() | setSender(Sender sender) |
| `Zen` | `String` | Optional | Random string of GitHub zen. | String getZen() | setZen(String zen) |

## Example (as JSON)

```json
{
  "hook": null,
  "hook_id": null,
  "organization": null,
  "repository": null,
  "sender": null,
  "zen": null
}
```

