
# App Manifests Conversions Response

## Structure

`AppManifestsConversionsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | Unique identifier of the GitHub app | int getId() | setId(int id) |
| `Slug` | `String` | Optional | The slug name of the GitHub app | String getSlug() | setSlug(String slug) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Owner` | `Object` | Required | - | Object getOwner() | setOwner(Object owner) |
| `Name` | `String` | Required | The name of the GitHub app | String getName() | setName(String name) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `ExternalUrl` | `String` | Required | - | String getExternalUrl() | setExternalUrl(String externalUrl) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Permissions` | [`Permissions30`](../../doc/models/permissions-30.md) | Required | - | Permissions30 getPermissions() | setPermissions(Permissions30 permissions) |
| `Events` | `List<String>` | Required | The list of events for the GitHub app | List<String> getEvents() | setEvents(List<String> events) |
| `InstallationsCount` | `Integer` | Optional | The number of installations associated with the GitHub app | Integer getInstallationsCount() | setInstallationsCount(Integer installationsCount) |
| `ClientId` | `String` | Required | - | String getClientId() | setClientId(String clientId) |
| `ClientSecret` | `String` | Required | - | String getClientSecret() | setClientSecret(String clientSecret) |
| `WebhookSecret` | `String` | Required | - | String getWebhookSecret() | setWebhookSecret(String webhookSecret) |
| `Pem` | `String` | Required | - | String getPem() | setPem(String pem) |

## Example (as JSON)

```json
{
  "id": 37,
  "node_id": "MDExOkludGVncmF0aW9uMQ==",
  "owner": null,
  "name": "Probot Owners",
  "description": "The description of the app.",
  "external_url": "https://example.com",
  "html_url": "https://github.com/apps/super-ci",
  "created_at": "07/09/2017 01:18:44",
  "updated_at": "07/09/2017 01:18:44",
  "permissions": null,
  "events": [
    "label",
    "deployment"
  ],
  "client_id": "\"Iv1.25b5d1e65ffc4022\"",
  "client_secret": "\"1d4b2097ac622ba702d19de498f005747a8b21d3\"",
  "webhook_secret": "\"6fba8f2fc8a7e8f2cca5577eddd82ca7586b3b6b\"",
  "pem": "\"-----BEGIN RSA PRIVATE KEY-----\\nMIIEogIBAAKCAQEArYxrNYD/iT5CZVpRJu4rBKmmze3PVmT/gCo2ATUvDvZTPTey\\nxcGJ3vvrJXazKk06pN05TN29o98jrYz4cengG3YGsXPNEpKsIrEl8NhbnxapEnM9\\nJCMRe0P5JcPsfZlX6hmiT7136GRWiGOUba2X9+HKh8QJVLG5rM007TBER9/z9mWm\\nrJuNh+m5l320oBQY/Qq3A7wzdEfZw8qm/mIN0FCeoXH1L6B8xXWaAYBwhTEh6SSn\\nZHlO1Xu1JWDmAvBCi0RO5aRSKM8q9QEkvvHP4yweAtK3N8+aAbZ7ovaDhyGz8r6r\\nzhU1b8Uo0Z2ysf503WqzQgIajr7Fry7/kUwpgQIDAQABAoIBADwJp80Ko1xHPZDy\\nfcCKBDfIuPvkmSW6KumbsLMaQv1aGdHDwwTGv3t0ixSay8CGlxMRtRDyZPib6SvQ\\n6OH/lpfpbMdW2ErkksgtoIKBVrDilfrcAvrNZu7NxRNbhCSvN8q0s4ICecjbbVQh\\nnueSdlA6vGXbW58BHMq68uRbHkP+k+mM9U0mDJ1HMch67wlg5GbayVRt63H7R2+r\\nVxcna7B80J/lCEjIYZznawgiTvp3MSanTglqAYi+m1EcSsP14bJIB9vgaxS79kTu\\noiSo93leJbBvuGo8QEiUqTwMw4tDksmkLsoqNKQ1q9P7LZ9DGcujtPy4EZsamSJT\\ny8OJt0ECgYEA2lxOxJsQk2kI325JgKFjo92mQeUObIvPfSNWUIZQDTjniOI6Gv63\\nGLWVFrZcvQBWjMEQraJA9xjPbblV8PtfO87MiJGLWCHFxmPz2dzoedN+2Coxom8m\\nV95CLz8QUShuao6u/RYcvUaZEoYs5bHcTmy5sBK80JyEmafJPtCQVxMCgYEAy3ar\\nZr3yv4xRPEPMat4rseswmuMooSaK3SKub19WFI5IAtB/e7qR1Rj9JhOGcZz+OQrl\\nT78O2OFYlgOIkJPvRMrPpK5V9lslc7tz1FSh3BZMRGq5jSyD7ETSOQ0c8T2O/s7v\\nbeEPbVbDe4mwvM24XByH0GnWveVxaDl51ABD65sCgYB3ZAspUkOA5egVCh8kNpnd\\nSd6SnuQBE3ySRlT2WEnCwP9Ph6oPgn+oAfiPX4xbRqkL8q/k0BdHQ4h+zNwhk7+h\\nWtPYRAP1Xxnc/F+jGjb+DVaIaKGU18MWPg7f+FI6nampl3Q0KvfxwX0GdNhtio8T\\nTj1E+SnFwh56SRQuxSh2gwKBgHKjlIO5NtNSflsUYFM+hyQiPiqnHzddfhSG+/3o\\nm5nNaSmczJesUYreH5San7/YEy2UxAugvP7aSY2MxB+iGsiJ9WD2kZzTUlDZJ7RV\\nUzWsoqBR+eZfVJ2FUWWvy8TpSG6trh4dFxImNtKejCR1TREpSiTV3Zb1dmahK9GV\\nrK9NAoGAbBxRLoC01xfxCTgt5BDiBcFVh4fp5yYKwavJPLzHSpuDOrrI9jDn1oKN\\nonq5sDU1i391zfQvdrbX4Ova48BN+B7p63FocP/MK5tyyBoT8zQEk2+vWDOw7H/Z\\nu5dTCPxTIsoIwUw1I+7yIxqJzLPFgR2gVBwY1ra/8iAqCj+zeBw=\\n-----END RSA PRIVATE KEY-----\\n\""
}
```

