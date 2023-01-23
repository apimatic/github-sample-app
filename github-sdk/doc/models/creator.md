
# Creator

## Structure

`Creator`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Email` | `String` | Optional | - | String getEmail() | setEmail(String email) |
| `Login` | `String` | Required | - | String getLogin() | setLogin(String login) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `AvatarUrl` | `String` | Required | - | String getAvatarUrl() | setAvatarUrl(String avatarUrl) |
| `GravatarId` | `String` | Required | - | String getGravatarId() | setGravatarId(String gravatarId) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `FollowersUrl` | `String` | Required | - | String getFollowersUrl() | setFollowersUrl(String followersUrl) |
| `FollowingUrl` | `String` | Required | - | String getFollowingUrl() | setFollowingUrl(String followingUrl) |
| `GistsUrl` | `String` | Required | - | String getGistsUrl() | setGistsUrl(String gistsUrl) |
| `StarredUrl` | `String` | Required | - | String getStarredUrl() | setStarredUrl(String starredUrl) |
| `SubscriptionsUrl` | `String` | Required | - | String getSubscriptionsUrl() | setSubscriptionsUrl(String subscriptionsUrl) |
| `OrganizationsUrl` | `String` | Required | - | String getOrganizationsUrl() | setOrganizationsUrl(String organizationsUrl) |
| `ReposUrl` | `String` | Required | - | String getReposUrl() | setReposUrl(String reposUrl) |
| `EventsUrl` | `String` | Required | - | String getEventsUrl() | setEventsUrl(String eventsUrl) |
| `ReceivedEventsUrl` | `String` | Required | - | String getReceivedEventsUrl() | setReceivedEventsUrl(String receivedEventsUrl) |
| `Type` | `String` | Required | - | String getType() | setType(String type) |
| `SiteAdmin` | `boolean` | Required | - | boolean getSiteAdmin() | setSiteAdmin(boolean siteAdmin) |
| `StarredAt` | `String` | Optional | - | String getStarredAt() | setStarredAt(String starredAt) |

## Example (as JSON)

```json
{
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
}
```

