
# Environment Approval

An entry in the reviews log for environment deployments

## Structure

`EnvironmentApproval`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Environments` | [`List<Environments1>`](../../doc/models/environments-1.md) | Required | The list of environments that were approved or rejected | List<Environments1> getEnvironments() | setEnvironments(List<Environments1> environments) |
| `State` | [`State7Enum`](../../doc/models/state-7-enum.md) | Required | - | State7Enum getState() | setState(State7Enum state) |
| `User` | [`User2`](../../doc/models/user-2.md) | Required | - | User2 getUser() | setUser(User2 user) |
| `Comment` | `String` | Required | The comment submitted with the deployment review | String getComment() | setComment(String comment) |

## Example (as JSON)

```json
{
  "environments": null,
  "state": null,
  "user": {
    "login": "octocat",
    "id": 1,
    "node_id": "MDQ6VXNlcjE=",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "gravatar_id": "41d064eb2195891e12d0413f63227ea7",
    "url": "https://api.github.com/users/octocat",
    "html_url": "https://github.com/octocat",
    "followers_url": "https://api.github.com/users/octocat/followers",
    "following_url": "https://api.github.com/users/octocat/following{/other_user}",
    "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
    "organizations_url": "https://api.github.com/users/octocat/orgs",
    "repos_url": "https://api.github.com/users/octocat/repos",
    "events_url": "https://api.github.com/users/octocat/events{/privacy}",
    "received_events_url": "https://api.github.com/users/octocat/received_events",
    "type": "User",
    "site_admin": null
  },
  "comment": "Ship it!"
}
```

