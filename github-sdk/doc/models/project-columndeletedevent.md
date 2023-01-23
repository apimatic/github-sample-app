
# Project Columndeletedevent

## Structure

`ProjectColumndeletedevent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Action` | `String` | Required, Constant | **Default**: `"deleted"` | String getAction() | setAction(String action) |
| `Enterprise` | [`Enterprise1`](../../doc/models/enterprise-1.md) | Optional | - | Enterprise1 getEnterprise() | setEnterprise(Enterprise1 enterprise) |
| `Installation` | [`Installation1`](../../doc/models/installation-1.md) | Optional | - | Installation1 getInstallation() | setInstallation(Installation1 installation) |
| `Organization` | [`Organization2`](../../doc/models/organization-2.md) | Optional | - | Organization2 getOrganization() | setOrganization(Organization2 organization) |
| `ProjectColumn` | [`ProjectColumn1`](../../doc/models/project-column-1.md) | Required | - | ProjectColumn1 getProjectColumn() | setProjectColumn(ProjectColumn1 projectColumn) |
| `Repository` | `Object` | Optional | - | Object getRepository() | setRepository(Object repository) |
| `Sender` | [`Sender`](../../doc/models/sender.md) | Optional | - | Sender getSender() | setSender(Sender sender) |

## Example (as JSON)

```json
{
  "action": "deleted",
  "project_column": null
}
```

