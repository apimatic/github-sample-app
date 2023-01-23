
# User 15

## Structure

`User15`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
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
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Company` | `String` | Required | - | String getCompany() | setCompany(String company) |
| `Blog` | `String` | Required | - | String getBlog() | setBlog(String blog) |
| `Location` | `String` | Required | - | String getLocation() | setLocation(String location) |
| `Email` | `String` | Required | - | String getEmail() | setEmail(String email) |
| `Hireable` | `Boolean` | Required | - | Boolean getHireable() | setHireable(Boolean hireable) |
| `Bio` | `String` | Required | - | String getBio() | setBio(String bio) |
| `TwitterUsername` | `String` | Optional | - | String getTwitterUsername() | setTwitterUsername(String twitterUsername) |
| `PublicRepos` | `int` | Required | - | int getPublicRepos() | setPublicRepos(int publicRepos) |
| `PublicGists` | `int` | Required | - | int getPublicGists() | setPublicGists(int publicGists) |
| `Followers` | `int` | Required | - | int getFollowers() | setFollowers(int followers) |
| `Following` | `int` | Required | - | int getFollowing() | setFollowing(int following) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Plan` | [`Plan`](../../doc/models/plan.md) | Optional | - | Plan getPlan() | setPlan(Plan plan) |
| `SuspendedAt` | `LocalDateTime` | Optional | - | LocalDateTime getSuspendedAt() | setSuspendedAt(LocalDateTime suspendedAt) |
| `PrivateGists` | `Integer` | Optional | - | Integer getPrivateGists() | setPrivateGists(Integer privateGists) |
| `TotalPrivateRepos` | `Integer` | Optional | - | Integer getTotalPrivateRepos() | setTotalPrivateRepos(Integer totalPrivateRepos) |
| `OwnedPrivateRepos` | `Integer` | Optional | - | Integer getOwnedPrivateRepos() | setOwnedPrivateRepos(Integer ownedPrivateRepos) |
| `DiskUsage` | `Integer` | Optional | - | Integer getDiskUsage() | setDiskUsage(Integer diskUsage) |
| `Collaborators` | `Integer` | Optional | - | Integer getCollaborators() | setCollaborators(Integer collaborators) |

## Example (as JSON)

```json
{
  "login": "login0",
  "id": 112,
  "node_id": "node_id2",
  "avatar_url": "avatar_url6",
  "gravatar_id": "gravatar_id8",
  "url": "url4",
  "html_url": "html_url0",
  "followers_url": "followers_url8",
  "following_url": "following_url2",
  "gists_url": "gists_url2",
  "starred_url": "starred_url2",
  "subscriptions_url": "subscriptions_url6",
  "organizations_url": "organizations_url4",
  "repos_url": "repos_url8",
  "events_url": "events_url8",
  "received_events_url": "received_events_url2",
  "type": "type0",
  "site_admin": false,
  "name": "name0",
  "company": "company0",
  "blog": "blog8",
  "location": "location4",
  "email": "email6",
  "hireable": false,
  "bio": "bio2",
  "twitter_username": null,
  "public_repos": 204,
  "public_gists": 126,
  "followers": 184,
  "following": 74,
  "created_at": "2016-03-13T12:52:32.123Z",
  "updated_at": "2016-03-13T12:52:32.123Z",
  "plan": null,
  "suspended_at": null,
  "private_gists": null,
  "total_private_repos": null,
  "owned_private_repos": null,
  "disk_usage": null,
  "collaborators": null
}
```

