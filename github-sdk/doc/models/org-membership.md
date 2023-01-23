
# Org Membership

Org Membership

## Structure

`OrgMembership`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `State` | [`State4Enum`](../../doc/models/state-4-enum.md) | Required | - | State4Enum getState() | setState(State4Enum state) |
| `Role` | [`RoleEnum`](../../doc/models/role-enum.md) | Required | - | RoleEnum getRole() | setRole(RoleEnum role) |
| `OrganizationUrl` | `String` | Required | - | String getOrganizationUrl() | setOrganizationUrl(String organizationUrl) |
| `Organization` | [`Organization2`](../../doc/models/organization-2.md) | Required | - | Organization2 getOrganization() | setOrganization(Organization2 organization) |
| `User` | `Object` | Required | - | Object getUser() | setUser(Object user) |
| `Permissions` | [`Permissions6`](../../doc/models/permissions-6.md) | Optional | - | Permissions6 getPermissions() | setPermissions(Permissions6 permissions) |

## Example (as JSON)

```json
{
  "url": "https://api.github.com/orgs/octocat/memberships/defunkt",
  "state": null,
  "role": null,
  "organization_url": "https://api.github.com/orgs/octocat",
  "organization": {
    "login": "github",
    "id": 1,
    "node_id": "MDEyOk9yZ2FuaXphdGlvbjE=",
    "url": "https://api.github.com/orgs/github",
    "repos_url": "https://api.github.com/orgs/github/repos",
    "events_url": "https://api.github.com/orgs/github/events",
    "hooks_url": "https://api.github.com/orgs/github/hooks",
    "issues_url": "https://api.github.com/orgs/github/issues",
    "members_url": "https://api.github.com/orgs/github/members{/member}",
    "public_members_url": "https://api.github.com/orgs/github/public_members{/member}",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "description": "A great organization"
  },
  "user": null
}
```

