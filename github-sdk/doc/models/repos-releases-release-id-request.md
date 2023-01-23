
# Repos Releases Release Id Request

## Structure

`ReposReleasesReleaseIdRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TagName` | `String` | Optional | The name of the tag. | String getTagName() | setTagName(String tagName) |
| `TargetCommitish` | `String` | Optional | Specifies the commitish value that determines where the Git tag is created from. Can be any branch or commit SHA. Unused if the Git tag already exists. Default: the repository's default branch (usually `master`). | String getTargetCommitish() | setTargetCommitish(String targetCommitish) |
| `Name` | `String` | Optional | The name of the release. | String getName() | setName(String name) |
| `Body` | `String` | Optional | Text describing the contents of the tag. | String getBody() | setBody(String body) |
| `Draft` | `Boolean` | Optional | `true` makes the release a draft, and `false` publishes the release. | Boolean getDraft() | setDraft(Boolean draft) |
| `Prerelease` | `Boolean` | Optional | `true` to identify the release as a prerelease, `false` to identify the release as a full release. | Boolean getPrerelease() | setPrerelease(Boolean prerelease) |
| `MakeLatest` | [`MakeLatestEnum`](../../doc/models/make-latest-enum.md) | Optional | - | MakeLatestEnum getMakeLatest() | setMakeLatest(MakeLatestEnum makeLatest) |
| `DiscussionCategoryName` | `String` | Optional | If specified, a discussion of the specified category is created and linked to the release. The value must be a category that already exists in the repository. If there is already a discussion linked to the release, this parameter is ignored. For more information, see "[Managing categories for discussions in your repository](https://docs.github.com/discussions/managing-discussions-for-your-community/managing-categories-for-discussions-in-your-repository)." | String getDiscussionCategoryName() | setDiscussionCategoryName(String discussionCategoryName) |

## Example (as JSON)

```json
{
  "tag_name": null,
  "target_commitish": null,
  "name": null,
  "body": null,
  "draft": null,
  "prerelease": null,
  "make_latest": null,
  "discussion_category_name": null
}
```

