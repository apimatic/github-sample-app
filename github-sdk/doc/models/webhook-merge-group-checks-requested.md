
# Webhook Merge Group Checks Requested

## Structure

`WebhookMergeGroupChecksRequested`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Action` | `String` | Required | - | String getAction() | setAction(String action) |
| `Installation` | [`Installation1`](../../doc/models/installation-1.md) | Optional | - | Installation1 getInstallation() | setInstallation(Installation1 installation) |
| `MergeGroup` | [`MergeGroup`](../../doc/models/merge-group.md) | Required | - | MergeGroup getMergeGroup() | setMergeGroup(MergeGroup mergeGroup) |
| `Organization` | [`Organization2`](../../doc/models/organization-2.md) | Optional | - | Organization2 getOrganization() | setOrganization(Organization2 organization) |
| `Repository` | [`Repository3`](../../doc/models/repository-3.md) | Optional | - | Repository3 getRepository() | setRepository(Repository3 repository) |
| `Sender` | [`Sender`](../../doc/models/sender.md) | Optional | - | Sender getSender() | setSender(Sender sender) |

## Example (as JSON)

```json
{
  "action": "action2",
  "installation": null,
  "merge_group": {
    "head_sha": "head_sha2",
    "head_ref": "head_ref6",
    "base_sha": "base_sha6",
    "base_ref": "base_ref0",
    "head_commit": {
      "author": {
        "date": null,
        "email": "email2",
        "name": "name4",
        "username": null
      },
      "committer": {
        "date": null,
        "email": "email2",
        "name": "name8",
        "username": null
      },
      "id": "id4",
      "message": "message4",
      "timestamp": "timestamp2",
      "tree_id": "tree_id6"
    }
  },
  "organization": null,
  "repository": null,
  "sender": null
}
```

