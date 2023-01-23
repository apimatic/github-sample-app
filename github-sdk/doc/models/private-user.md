
# Private User

Private User

## Structure

`PrivateUser`

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
| `PrivateGists` | `int` | Required | - | int getPrivateGists() | setPrivateGists(int privateGists) |
| `TotalPrivateRepos` | `int` | Required | - | int getTotalPrivateRepos() | setTotalPrivateRepos(int totalPrivateRepos) |
| `OwnedPrivateRepos` | `int` | Required | - | int getOwnedPrivateRepos() | setOwnedPrivateRepos(int ownedPrivateRepos) |
| `DiskUsage` | `int` | Required | - | int getDiskUsage() | setDiskUsage(int diskUsage) |
| `Collaborators` | `int` | Required | - | int getCollaborators() | setCollaborators(int collaborators) |
| `TwoFactorAuthentication` | `boolean` | Required | - | boolean getTwoFactorAuthentication() | setTwoFactorAuthentication(boolean twoFactorAuthentication) |
| `Plan` | [`Plan`](../../doc/models/plan.md) | Optional | - | Plan getPlan() | setPlan(Plan plan) |
| `SuspendedAt` | `LocalDateTime` | Optional | - | LocalDateTime getSuspendedAt() | setSuspendedAt(LocalDateTime suspendedAt) |
| `BusinessPlus` | `Boolean` | Optional | - | Boolean getBusinessPlus() | setBusinessPlus(Boolean businessPlus) |
| `LdapDn` | `String` | Optional | - | String getLdapDn() | setLdapDn(String ldapDn) |

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
  "site_admin": null,
  "name": "monalisa octocat",
  "company": "GitHub",
  "blog": "https://github.com/blog",
  "location": "San Francisco",
  "email": "octocat@github.com",
  "hireable": null,
  "bio": "There once was...",
  "public_repos": 2,
  "public_gists": 1,
  "followers": 20,
  "following": 0,
  "created_at": "01/14/2008 04:33:35",
  "updated_at": "01/14/2008 04:33:35",
  "private_gists": 81,
  "total_private_repos": 100,
  "owned_private_repos": 100,
  "disk_usage": 10000,
  "collaborators": 8,
  "two_factor_authentication": true
}
```

