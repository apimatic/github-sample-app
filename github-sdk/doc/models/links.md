
# Links

## Structure

`Links`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Timeline` | [`Timeline`](../../doc/models/timeline.md) | Required | - | Timeline getTimeline() | setTimeline(Timeline timeline) |
| `User` | [`User14`](../../doc/models/user-14.md) | Required | - | User14 getUser() | setUser(User14 user) |
| `SecurityAdvisories` | [`SecurityAdvisories`](../../doc/models/security-advisories.md) | Optional | - | SecurityAdvisories getSecurityAdvisories() | setSecurityAdvisories(SecurityAdvisories securityAdvisories) |
| `CurrentUser` | [`CurrentUser`](../../doc/models/current-user.md) | Optional | - | CurrentUser getCurrentUser() | setCurrentUser(CurrentUser currentUser) |
| `CurrentUserPublic` | [`CurrentUserPublic`](../../doc/models/current-user-public.md) | Optional | - | CurrentUserPublic getCurrentUserPublic() | setCurrentUserPublic(CurrentUserPublic currentUserPublic) |
| `CurrentUserActor` | [`CurrentUserActor`](../../doc/models/current-user-actor.md) | Optional | - | CurrentUserActor getCurrentUserActor() | setCurrentUserActor(CurrentUserActor currentUserActor) |
| `CurrentUserOrganization` | [`CurrentUserOrganization`](../../doc/models/current-user-organization.md) | Optional | - | CurrentUserOrganization getCurrentUserOrganization() | setCurrentUserOrganization(CurrentUserOrganization currentUserOrganization) |
| `CurrentUserOrganizations` | [`List<LinkWithType>`](../../doc/models/link-with-type.md) | Optional | - | List<LinkWithType> getCurrentUserOrganizations() | setCurrentUserOrganizations(List<LinkWithType> currentUserOrganizations) |
| `RepositoryDiscussions` | [`RepositoryDiscussions`](../../doc/models/repository-discussions.md) | Optional | - | RepositoryDiscussions getRepositoryDiscussions() | setRepositoryDiscussions(RepositoryDiscussions repositoryDiscussions) |
| `RepositoryDiscussionsCategory` | [`RepositoryDiscussionsCategory`](../../doc/models/repository-discussions-category.md) | Optional | - | RepositoryDiscussionsCategory getRepositoryDiscussionsCategory() | setRepositoryDiscussionsCategory(RepositoryDiscussionsCategory repositoryDiscussionsCategory) |

## Example (as JSON)

```json
{
  "timeline": {
    "href": "href8",
    "type": "type4"
  },
  "user": {
    "href": "href2",
    "type": "type0"
  },
  "security_advisories": null,
  "current_user": null,
  "current_user_public": null,
  "current_user_actor": null,
  "current_user_organization": null,
  "current_user_organizations": null,
  "repository_discussions": null,
  "repository_discussions_category": null
}
```

