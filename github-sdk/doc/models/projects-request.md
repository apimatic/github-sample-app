
# Projects Request

## Structure

`ProjectsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Name of the project | String getName() | setName(String name) |
| `Body` | `String` | Optional | Body of the project | String getBody() | setBody(String body) |
| `State` | `String` | Optional | State of the project; either 'open' or 'closed' | String getState() | setState(String state) |
| `OrganizationPermission` | [`OrganizationPermission1Enum`](../../doc/models/organization-permission-1-enum.md) | Optional | - | OrganizationPermission1Enum getOrganizationPermission() | setOrganizationPermission(OrganizationPermission1Enum organizationPermission) |
| `Private` | `Boolean` | Optional | Whether or not this project can be seen by everyone. | Boolean getPrivate() | setPrivate(Boolean mPrivate) |

## Example (as JSON)

```json
{
  "name": null,
  "body": null,
  "state": null,
  "organization_permission": null,
  "private": null
}
```

