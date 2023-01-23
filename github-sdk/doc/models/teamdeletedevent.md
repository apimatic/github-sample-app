
# Teamdeletedevent

## Structure

`Teamdeletedevent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Action` | `String` | Required, Constant | **Default**: `"deleted"` | String getAction() | setAction(String action) |
| `Enterprise` | [`Enterprise1`](../../doc/models/enterprise-1.md) | Optional | - | Enterprise1 getEnterprise() | setEnterprise(Enterprise1 enterprise) |
| `Installation` | [`Installation1`](../../doc/models/installation-1.md) | Optional | - | Installation1 getInstallation() | setInstallation(Installation1 installation) |
| `Organization` | [`Organization2`](../../doc/models/organization-2.md) | Required | - | Organization2 getOrganization() | setOrganization(Organization2 organization) |
| `Repository` | [`Repository206`](../../doc/models/repository-206.md) | Optional | - | Repository206 getRepository() | setRepository(Repository206 repository) |
| `Sender` | [`Sender`](../../doc/models/sender.md) | Optional | - | Sender getSender() | setSender(Sender sender) |
| `Team` | [`Team2`](../../doc/models/team-2.md) | Required | - | Team2 getTeam() | setTeam(Team2 team) |

## Example (as JSON)

```json
{
  "action": "deleted",
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
  "team": null
}
```

