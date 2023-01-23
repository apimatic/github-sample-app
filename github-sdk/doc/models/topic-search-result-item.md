
# Topic Search Result Item

Topic Search Result Item

## Structure

`TopicSearchResultItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `DisplayName` | `String` | Required | - | String getDisplayName() | setDisplayName(String displayName) |
| `ShortDescription` | `String` | Required | - | String getShortDescription() | setShortDescription(String shortDescription) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `CreatedBy` | `String` | Required | - | String getCreatedBy() | setCreatedBy(String createdBy) |
| `Released` | `String` | Required | - | String getReleased() | setReleased(String released) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Featured` | `boolean` | Required | - | boolean getFeatured() | setFeatured(boolean featured) |
| `Curated` | `boolean` | Required | - | boolean getCurated() | setCurated(boolean curated) |
| `Score` | `double` | Required | - | double getScore() | setScore(double score) |
| `RepositoryCount` | `Integer` | Optional | - | Integer getRepositoryCount() | setRepositoryCount(Integer repositoryCount) |
| `LogoUrl` | `String` | Optional | - | String getLogoUrl() | setLogoUrl(String logoUrl) |
| `TextMatches` | [`List<SearchResultTextMatch>`](../../doc/models/search-result-text-match.md) | Optional | - | List<SearchResultTextMatch> getTextMatches() | setTextMatches(List<SearchResultTextMatch> textMatches) |
| `Related` | [`List<Related>`](../../doc/models/related.md) | Optional | - | List<Related> getRelated() | setRelated(List<Related> related) |
| `Aliases` | [`List<Alias>`](../../doc/models/alias.md) | Optional | - | List<Alias> getAliases() | setAliases(List<Alias> aliases) |

## Example (as JSON)

```json
{
  "name": "name0",
  "display_name": "display_name0",
  "short_description": "short_description6",
  "description": "description0",
  "created_by": "created_by2",
  "released": "released0",
  "created_at": "2016-03-13T12:52:32.123Z",
  "updated_at": "2016-03-13T12:52:32.123Z",
  "featured": false,
  "curated": false,
  "score": 147.4,
  "repository_count": null,
  "logo_url": null,
  "text_matches": null,
  "related": null,
  "aliases": null
}
```

