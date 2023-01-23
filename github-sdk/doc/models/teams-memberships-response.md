
# Teams Memberships Response

## Structure

`TeamsMembershipsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Role` | [`Role1Enum`](../../doc/models/role-1-enum.md) | Required | - | Role1Enum getRole() | setRole(Role1Enum role) |
| `State` | [`State5Enum`](../../doc/models/state-5-enum.md) | Required | - | State5Enum getState() | setState(State5Enum state) |

## Example (as JSON)

```json
{
  "url": "url4",
  "role": "member",
  "state": "active"
}
```

