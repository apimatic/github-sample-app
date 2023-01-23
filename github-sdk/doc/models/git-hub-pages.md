
# Git Hub Pages

The configuration for GitHub Pages for a repository.

## Structure

`GitHubPages`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | The API address for accessing this Page resource. | String getUrl() | setUrl(String url) |
| `Status` | `Object` | Required | - | Object getStatus() | setStatus(Object status) |
| `Cname` | `String` | Required | The Pages site's custom domain | String getCname() | setCname(String cname) |
| `ProtectedDomainState` | `Object` | Optional | - | Object getProtectedDomainState() | setProtectedDomainState(Object protectedDomainState) |
| `PendingDomainUnverifiedAt` | `LocalDateTime` | Optional | The timestamp when a pending domain becomes unverified. | LocalDateTime getPendingDomainUnverifiedAt() | setPendingDomainUnverifiedAt(LocalDateTime pendingDomainUnverifiedAt) |
| `Custom404` | `boolean` | Required | Whether the Page has a custom 404 page. | boolean getCustom404() | setCustom404(boolean custom404) |
| `HtmlUrl` | `String` | Optional | The web address the Page can be accessed from. | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `BuildType` | `Object` | Optional | - | Object getBuildType() | setBuildType(Object buildType) |
| `Source` | [`PagesSourceHash`](../../doc/models/pages-source-hash.md) | Optional | - | PagesSourceHash getSource() | setSource(PagesSourceHash source) |
| `Public` | `boolean` | Required | Whether the GitHub Pages site is publicly visible. If set to `true`, the site is accessible to anyone on the internet. If set to `false`, the site will only be accessible to users who have at least `read` access to the repository that published the site. | boolean getPublic() | setPublic(boolean mPublic) |
| `HttpsCertificate` | [`PagesHttpsCertificate`](../../doc/models/pages-https-certificate.md) | Optional | - | PagesHttpsCertificate getHttpsCertificate() | setHttpsCertificate(PagesHttpsCertificate httpsCertificate) |
| `HttpsEnforced` | `Boolean` | Optional | Whether https is enabled on the domain | Boolean getHttpsEnforced() | setHttpsEnforced(Boolean httpsEnforced) |

## Example (as JSON)

```json
{
  "url": "https://api.github.com/repos/github/hello-world/pages",
  "status": null,
  "cname": "example.com",
  "custom_404": false,
  "public": true
}
```

