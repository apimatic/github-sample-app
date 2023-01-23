
# Webhook Installation Target Renamed

## Structure

`WebhookInstallationTargetRenamed`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Account` | [`Account1`](../../doc/models/account-1.md) | Required | - | Account1 getAccount() | setAccount(Account1 account) |
| `Action` | `String` | Required | - | String getAction() | setAction(String action) |
| `Changes` | [`Changes5`](../../doc/models/changes-5.md) | Required | - | Changes5 getChanges() | setChanges(Changes5 changes) |
| `Enterprise` | [`Enterprise1`](../../doc/models/enterprise-1.md) | Optional | - | Enterprise1 getEnterprise() | setEnterprise(Enterprise1 enterprise) |
| `Installation` | [`Installation1`](../../doc/models/installation-1.md) | Required | - | Installation1 getInstallation() | setInstallation(Installation1 installation) |
| `Organization` | [`Organization2`](../../doc/models/organization-2.md) | Optional | - | Organization2 getOrganization() | setOrganization(Organization2 organization) |
| `Repository` | [`Repository3`](../../doc/models/repository-3.md) | Optional | - | Repository3 getRepository() | setRepository(Repository3 repository) |
| `Sender` | [`Sender`](../../doc/models/sender.md) | Optional | - | Sender getSender() | setSender(Sender sender) |
| `TargetType` | `String` | Required | - | String getTargetType() | setTargetType(String targetType) |

## Example (as JSON)

```json
{
  "account": null,
  "action": null,
  "changes": null,
  "installation": {
    "id": 1,
    "node_id": "MDQ6VXNlcjU4MzIzMQ=="
  },
  "target_type": null
}
```

