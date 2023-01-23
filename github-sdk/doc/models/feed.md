
# Feed

Feed

## Structure

`Feed`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TimelineUrl` | `String` | Required | - | String getTimelineUrl() | setTimelineUrl(String timelineUrl) |
| `UserUrl` | `String` | Required | - | String getUserUrl() | setUserUrl(String userUrl) |
| `CurrentUserPublicUrl` | `String` | Optional | - | String getCurrentUserPublicUrl() | setCurrentUserPublicUrl(String currentUserPublicUrl) |
| `CurrentUserUrl` | `String` | Optional | - | String getCurrentUserUrl() | setCurrentUserUrl(String currentUserUrl) |
| `CurrentUserActorUrl` | `String` | Optional | - | String getCurrentUserActorUrl() | setCurrentUserActorUrl(String currentUserActorUrl) |
| `CurrentUserOrganizationUrl` | `String` | Optional | - | String getCurrentUserOrganizationUrl() | setCurrentUserOrganizationUrl(String currentUserOrganizationUrl) |
| `CurrentUserOrganizationUrls` | `List<String>` | Optional | - | List<String> getCurrentUserOrganizationUrls() | setCurrentUserOrganizationUrls(List<String> currentUserOrganizationUrls) |
| `SecurityAdvisoriesUrl` | `String` | Optional | - | String getSecurityAdvisoriesUrl() | setSecurityAdvisoriesUrl(String securityAdvisoriesUrl) |
| `RepositoryDiscussionsUrl` | `String` | Optional | A feed of discussions for a given repository. | String getRepositoryDiscussionsUrl() | setRepositoryDiscussionsUrl(String repositoryDiscussionsUrl) |
| `RepositoryDiscussionsCategoryUrl` | `String` | Optional | A feed of discussions for a given repository and category. | String getRepositoryDiscussionsCategoryUrl() | setRepositoryDiscussionsCategoryUrl(String repositoryDiscussionsCategoryUrl) |
| `Links` | [`Links`](../../doc/models/links.md) | Required | - | Links getLinks() | setLinks(Links links) |

## Example (as JSON)

```json
{
  "timeline_url": "https://github.com/timeline",
  "user_url": "https://github.com/{user}",
  "_links": null
}
```

