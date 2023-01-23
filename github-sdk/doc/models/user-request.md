
# User Request

## Structure

`UserRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | The new name of the user. | String getName() | setName(String name) |
| `Email` | `String` | Optional | The publicly visible email address of the user. | String getEmail() | setEmail(String email) |
| `Blog` | `String` | Optional | The new blog URL of the user. | String getBlog() | setBlog(String blog) |
| `TwitterUsername` | `String` | Optional | The new Twitter username of the user. | String getTwitterUsername() | setTwitterUsername(String twitterUsername) |
| `Company` | `String` | Optional | The new company of the user. | String getCompany() | setCompany(String company) |
| `Location` | `String` | Optional | The new location of the user. | String getLocation() | setLocation(String location) |
| `Hireable` | `Boolean` | Optional | The new hiring availability of the user. | Boolean getHireable() | setHireable(Boolean hireable) |
| `Bio` | `String` | Optional | The new short biography of the user. | String getBio() | setBio(String bio) |

## Example (as JSON)

```json
{
  "name": null,
  "email": null,
  "blog": null,
  "twitter_username": null,
  "company": null,
  "location": null,
  "hireable": null,
  "bio": null
}
```

