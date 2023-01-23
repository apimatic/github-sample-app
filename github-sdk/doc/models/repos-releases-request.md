
# Repos Releases Request

## Structure

`ReposReleasesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TagName` | `String` | Required | The name of the tag. | String getTagName() | setTagName(String tagName) |
| `TargetCommitish` | `String` | Optional | Specifies the commitish value that determines where the Git tag is created from. Can be any branch or commit SHA. Unused if the Git tag already exists. Default: the repository's default branch (usually `master`). | String getTargetCommitish() | setTargetCommitish(String targetCommitish) |
| `Name` | `String` | Optional | The name of the release. | String getName() | setName(String name) |
| `Body` | `String` | Optional | Text describing the contents of the tag. | String getBody() | setBody(String body) |
| `Draft` | `Boolean` | Optional | `true` to create a draft (unpublished) release, `false` to create a published one.<br>**Default**: `false` | Boolean getDraft() | setDraft(Boolean draft) |
| `Prerelease` | `Boolean` | Optional | `true` to identify the release as a prerelease. `false` to identify the release as a full release.<br>**Default**: `false` | Boolean getPrerelease() | setPrerelease(Boolean prerelease) |
| `DiscussionCategoryName` | `String` | Optional | If specified, a discussion of the specified category is created and linked to the release. The value must be a category that already exists in the repository. For more information, see "[Managing categories for discussions in your repository](https://docs.github.com/discussions/managing-discussions-for-your-community/managing-categories-for-discussions-in-your-repository)." | String getDiscussionCategoryName() | setDiscussionCategoryName(String discussionCategoryName) |
| `GenerateReleaseNotes` | `Boolean` | Optional | Whether to automatically generate the name and body for this release. If `name` is specified, the specified name will be used; otherwise, a name will be automatically generated. If `body` is specified, the body will be pre-pended to the automatically generated notes.<br>**Default**: `false` | Boolean getGenerateReleaseNotes() | setGenerateReleaseNotes(Boolean generateReleaseNotes) |
| `MakeLatest` | [`MakeLatestEnum`](../../doc/models/make-latest-enum.md) | Optional | - | MakeLatestEnum getMakeLatest() | setMakeLatest(MakeLatestEnum makeLatest) |

## Example (as JSON)

```json
{
  "tag_name": "tag_name0",
  "target_commitish": null,
  "name": null,
  "body": null,
  "draft": null,
  "prerelease": null,
  "discussion_category_name": null,
  "generate_release_notes": null,
  "make_latest": null
}
```

