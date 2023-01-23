
# Membership

The membership between the user and the organization. Not present when the action is `member_invited`.

## Structure

`Membership`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `OrganizationUrl` | `String` | Required | - | String getOrganizationUrl() | setOrganizationUrl(String organizationUrl) |
| `Role` | `String` | Required | - | String getRole() | setRole(String role) |
| `State` | `String` | Required | - | String getState() | setState(String state) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `User` | `Object` | Required | - | Object getUser() | setUser(Object user) |

## Example (as JSON)

```json
{
  "organization_url": "organization_url4",
  "role": "role6",
  "state": "state4",
  "url": "url4",
  "user": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

