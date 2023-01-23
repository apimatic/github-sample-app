
# User Search Result Item

User Search Result Item

## Structure

`UserSearchResultItem`

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
| `SubscriptionsUrl` | `String` | Required | - | String getSubscriptionsUrl() | setSubscriptionsUrl(String subscriptionsUrl) |
| `OrganizationsUrl` | `String` | Required | - | String getOrganizationsUrl() | setOrganizationsUrl(String organizationsUrl) |
| `ReposUrl` | `String` | Required | - | String getReposUrl() | setReposUrl(String reposUrl) |
| `ReceivedEventsUrl` | `String` | Required | - | String getReceivedEventsUrl() | setReceivedEventsUrl(String receivedEventsUrl) |
| `Type` | `String` | Required | - | String getType() | setType(String type) |
| `Score` | `double` | Required | - | double getScore() | setScore(double score) |
| `FollowingUrl` | `String` | Required | - | String getFollowingUrl() | setFollowingUrl(String followingUrl) |
| `GistsUrl` | `String` | Required | - | String getGistsUrl() | setGistsUrl(String gistsUrl) |
| `StarredUrl` | `String` | Required | - | String getStarredUrl() | setStarredUrl(String starredUrl) |
| `EventsUrl` | `String` | Required | - | String getEventsUrl() | setEventsUrl(String eventsUrl) |
| `PublicRepos` | `Integer` | Optional | - | Integer getPublicRepos() | setPublicRepos(Integer publicRepos) |
| `PublicGists` | `Integer` | Optional | - | Integer getPublicGists() | setPublicGists(Integer publicGists) |
| `Followers` | `Integer` | Optional | - | Integer getFollowers() | setFollowers(Integer followers) |
| `Following` | `Integer` | Optional | - | Integer getFollowing() | setFollowing(Integer following) |
| `CreatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Bio` | `String` | Optional | - | String getBio() | setBio(String bio) |
| `Email` | `String` | Optional | - | String getEmail() | setEmail(String email) |
| `Location` | `String` | Optional | - | String getLocation() | setLocation(String location) |
| `SiteAdmin` | `boolean` | Required | - | boolean getSiteAdmin() | setSiteAdmin(boolean siteAdmin) |
| `Hireable` | `Boolean` | Optional | - | Boolean getHireable() | setHireable(Boolean hireable) |
| `TextMatches` | [`List<SearchResultTextMatch>`](../../doc/models/search-result-text-match.md) | Optional | - | List<SearchResultTextMatch> getTextMatches() | setTextMatches(List<SearchResultTextMatch> textMatches) |
| `Blog` | `String` | Optional | - | String getBlog() | setBlog(String blog) |
| `Company` | `String` | Optional | - | String getCompany() | setCompany(String company) |
| `SuspendedAt` | `LocalDateTime` | Optional | - | LocalDateTime getSuspendedAt() | setSuspendedAt(LocalDateTime suspendedAt) |

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
  "subscriptions_url": "subscriptions_url6",
  "organizations_url": "organizations_url4",
  "repos_url": "repos_url8",
  "received_events_url": "received_events_url2",
  "type": "type0",
  "score": 147.4,
  "following_url": "following_url2",
  "gists_url": "gists_url2",
  "starred_url": "starred_url2",
  "events_url": "events_url8",
  "public_repos": null,
  "public_gists": null,
  "followers": null,
  "following": null,
  "created_at": null,
  "updated_at": null,
  "name": null,
  "bio": null,
  "email": null,
  "location": null,
  "site_admin": false,
  "hireable": null,
  "text_matches": null,
  "blog": null,
  "company": null,
  "suspended_at": null
}
```

