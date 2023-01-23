
# Project Columneditedevent

## Structure

`ProjectColumneditedevent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Action` | `String` | Required, Constant | **Default**: `"edited"` | String getAction() | setAction(String action) |
| `Changes` | [`Changes18`](../../doc/models/changes-18.md) | Required | - | Changes18 getChanges() | setChanges(Changes18 changes) |
| `Enterprise` | [`Enterprise1`](../../doc/models/enterprise-1.md) | Optional | - | Enterprise1 getEnterprise() | setEnterprise(Enterprise1 enterprise) |
| `Installation` | [`Installation1`](../../doc/models/installation-1.md) | Optional | - | Installation1 getInstallation() | setInstallation(Installation1 installation) |
| `Organization` | [`Organization2`](../../doc/models/organization-2.md) | Optional | - | Organization2 getOrganization() | setOrganization(Organization2 organization) |
| `ProjectColumn` | [`ProjectColumn1`](../../doc/models/project-column-1.md) | Required | - | ProjectColumn1 getProjectColumn() | setProjectColumn(ProjectColumn1 projectColumn) |
| `Repository` | [`Repository3`](../../doc/models/repository-3.md) | Optional | - | Repository3 getRepository() | setRepository(Repository3 repository) |
| `Sender` | [`Sender`](../../doc/models/sender.md) | Optional | - | Sender getSender() | setSender(Sender sender) |

## Example (as JSON)

```json
{
  "action": "edited",
  "changes": null,
  "project_column": null
}
```

