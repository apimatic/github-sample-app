# Licenses

View various OSS licenses.

```java
LicensesController licensesController = client.getLicensesController();
```

## Class Name

`LicensesController`

## Methods

* [Licenses Get-All-Commonly-Used](../../doc/controllers/licenses.md#licenses-get-all-commonly-used)
* [Licenses Get](../../doc/controllers/licenses.md#licenses-get)
* [Licenses Get-for-Repo](../../doc/controllers/licenses.md#licenses-get-for-repo)


# Licenses Get-All-Commonly-Used

Get all commonly used licenses

API method documentation: [https://docs.github.com/rest/reference/licenses#get-all-commonly-used-licenses](https://docs.github.com/rest/reference/licenses#get-all-commonly-used-licenses)

```java
CompletableFuture<List<LicenseSimple>> licensesGetAllCommonlyUsedAsync(
    final Boolean featured,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `featured` | `Boolean` | Query, Optional | - |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<LicenseSimple>`](../../doc/models/license-simple.md)

## Example Usage

```java
Integer perPage = 30;
Integer page = 1;

licensesController.licensesGetAllCommonlyUsedAsync(null, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "key": "mit",
    "name": "MIT License",
    "spdx_id": "MIT",
    "url": "https://api.github.com/licenses/mit",
    "node_id": "MDc6TGljZW5zZW1pdA=="
  },
  {
    "key": "lgpl-3.0",
    "name": "GNU Lesser General Public License v3.0",
    "spdx_id": "LGPL-3.0",
    "url": "https://api.github.com/licenses/lgpl-3.0",
    "node_id": "MDc6TGljZW5zZW1pdA=="
  },
  {
    "key": "mpl-2.0",
    "name": "Mozilla Public License 2.0",
    "spdx_id": "MPL-2.0",
    "url": "https://api.github.com/licenses/mpl-2.0",
    "node_id": "MDc6TGljZW5zZW1pdA=="
  },
  {
    "key": "agpl-3.0",
    "name": "GNU Affero General Public License v3.0",
    "spdx_id": "AGPL-3.0",
    "url": "https://api.github.com/licenses/agpl-3.0",
    "node_id": "MDc6TGljZW5zZW1pdA=="
  },
  {
    "key": "unlicense",
    "name": "The Unlicense",
    "spdx_id": "Unlicense",
    "url": "https://api.github.com/licenses/unlicense",
    "node_id": "MDc6TGljZW5zZW1pdA=="
  },
  {
    "key": "apache-2.0",
    "name": "Apache License 2.0",
    "spdx_id": "Apache-2.0",
    "url": "https://api.github.com/licenses/apache-2.0",
    "node_id": "MDc6TGljZW5zZW1pdA=="
  },
  {
    "key": "gpl-3.0",
    "name": "GNU General Public License v3.0",
    "spdx_id": "GPL-3.0",
    "url": "https://api.github.com/licenses/gpl-3.0",
    "node_id": "MDc6TGljZW5zZW1pdA=="
  }
]
```


# Licenses Get

Get a license

API method documentation: [https://docs.github.com/rest/reference/licenses#get-a-license](https://docs.github.com/rest/reference/licenses#get-a-license)

```java
CompletableFuture<LicensesResponse> licensesGetAsync(
    final String license)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `license` | `String` | Template, Required | - |

## Response Type

[`LicensesResponse`](../../doc/models/licenses-response.md)

## Example Usage

```java
String license = "license6";

licensesController.licensesGetAsync(license).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "key": "mit",
  "name": "MIT License",
  "spdx_id": "MIT",
  "url": "https://api.github.com/licenses/mit",
  "node_id": "MDc6TGljZW5zZW1pdA==",
  "html_url": "http://choosealicense.com/licenses/mit/",
  "description": "A permissive license that is short and to the point. It lets people do anything with your code with proper attribution and without warranty.",
  "implementation": "Create a text file (typically named LICENSE or LICENSE.txt) in the root of your source code and copy the text of the license into the file. Replace [year] with the current year and [fullname] with the name (or names) of the copyright holders.",
  "permissions": [
    "commercial-use",
    "modifications",
    "distribution",
    "sublicense",
    "private-use"
  ],
  "conditions": [
    "include-copyright"
  ],
  "limitations": [
    "no-liability"
  ],
  "body": "\n\nThe MIT License (MIT)\n\nCopyright (c) [year] [fullname]\n\nPermission is hereby granted, free of charge, to any person obtaining a copy\nof this software and associated documentation files (the \"Software\"), to deal\nin the Software without restriction, including without limitation the rights\nto use, copy, modify, merge, publish, distribute, sublicense, and/or sell\ncopies of the Software, and to permit persons to whom the Software is\nfurnished to do so, subject to the following conditions:\n\nThe above copyright notice and this permission notice shall be included in all\ncopies or substantial portions of the Software.\n\nTHE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\nIMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\nFITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\nAUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\nLIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,\nOUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE\nSOFTWARE.\n",
  "featured": true
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`Licenses403ErrorException`](../../doc/models/licenses-403-error-exception.md) |
| 404 | Resource not found | [`Licenses404ErrorException`](../../doc/models/licenses-404-error-exception.md) |


# Licenses Get-for-Repo

This method returns the contents of the repository's license file, if one is detected.

Similar to [Get repository content](https://docs.github.com/rest/reference/repos#get-repository-content), this method also supports [custom media types](https://docs.github.com/rest/overview/media-types) for retrieving the raw license content or rendered license HTML.

API method documentation: [https://docs.github.com/rest/reference/licenses/#get-the-license-for-a-repository](https://docs.github.com/rest/reference/licenses/#get-the-license-for-a-repository)

```java
CompletableFuture<ReposLicenseResponse> licensesGetForRepoAsync(
    final String owner,
    final String repo)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |

## Response Type

[`ReposLicenseResponse`](../../doc/models/repos-license-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";

licensesController.licensesGetForRepoAsync(owner, repo).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "name": "LICENSE",
  "path": "LICENSE",
  "sha": "401c59dcc4570b954dd6d345e76199e1f4e76266",
  "size": 1077,
  "url": "https://api.github.com/repos/benbalter/gman/contents/LICENSE?ref=master",
  "html_url": "https://github.com/benbalter/gman/blob/master/LICENSE",
  "git_url": "https://api.github.com/repos/benbalter/gman/git/blobs/401c59dcc4570b954dd6d345e76199e1f4e76266",
  "download_url": "https://raw.githubusercontent.com/benbalter/gman/master/LICENSE?lab=true",
  "type": "file",
  "content": "VGhlIE1JVCBMaWNlbnNlIChNSVQpCgpDb3B5cmlnaHQgKGMpIDIwMTMgQmVu\nIEJhbHRlcgoKUGVybWlzc2lvbiBpcyBoZXJlYnkgZ3JhbnRlZCwgZnJlZSBv\nZiBjaGFyZ2UsIHRvIGFueSBwZXJzb24gb2J0YWluaW5nIGEgY29weSBvZgp0\naGlzIHNvZnR3YXJlIGFuZCBhc3NvY2lhdGVkIGRvY3VtZW50YXRpb24gZmls\nZXMgKHRoZSAiU29mdHdhcmUiKSwgdG8gZGVhbCBpbgp0aGUgU29mdHdhcmUg\nd2l0aG91dCByZXN0cmljdGlvbiwgaW5jbHVkaW5nIHdpdGhvdXQgbGltaXRh\ndGlvbiB0aGUgcmlnaHRzIHRvCnVzZSwgY29weSwgbW9kaWZ5LCBtZXJnZSwg\ncHVibGlzaCwgZGlzdHJpYnV0ZSwgc3VibGljZW5zZSwgYW5kL29yIHNlbGwg\nY29waWVzIG9mCnRoZSBTb2Z0d2FyZSwgYW5kIHRvIHBlcm1pdCBwZXJzb25z\nIHRvIHdob20gdGhlIFNvZnR3YXJlIGlzIGZ1cm5pc2hlZCB0byBkbyBzbywK\nc3ViamVjdCB0byB0aGUgZm9sbG93aW5nIGNvbmRpdGlvbnM6CgpUaGUgYWJv\ndmUgY29weXJpZ2h0IG5vdGljZSBhbmQgdGhpcyBwZXJtaXNzaW9uIG5vdGlj\nZSBzaGFsbCBiZSBpbmNsdWRlZCBpbiBhbGwKY29waWVzIG9yIHN1YnN0YW50\naWFsIHBvcnRpb25zIG9mIHRoZSBTb2Z0d2FyZS4KClRIRSBTT0ZUV0FSRSBJ\nUyBQUk9WSURFRCAiQVMgSVMiLCBXSVRIT1VUIFdBUlJBTlRZIE9GIEFOWSBL\nSU5ELCBFWFBSRVNTIE9SCklNUExJRUQsIElOQ0xVRElORyBCVVQgTk9UIExJ\nTUlURUQgVE8gVEhFIFdBUlJBTlRJRVMgT0YgTUVSQ0hBTlRBQklMSVRZLCBG\nSVRORVNTCkZPUiBBIFBBUlRJQ1VMQVIgUFVSUE9TRSBBTkQgTk9OSU5GUklO\nR0VNRU5ULiBJTiBOTyBFVkVOVCBTSEFMTCBUSEUgQVVUSE9SUyBPUgpDT1BZ\nUklHSFQgSE9MREVSUyBCRSBMSUFCTEUgRk9SIEFOWSBDTEFJTSwgREFNQUdF\nUyBPUiBPVEhFUiBMSUFCSUxJVFksIFdIRVRIRVIKSU4gQU4gQUNUSU9OIE9G\nIENPTlRSQUNULCBUT1JUIE9SIE9USEVSV0lTRSwgQVJJU0lORyBGUk9NLCBP\nVVQgT0YgT1IgSU4KQ09OTkVDVElPTiBXSVRIIFRIRSBTT0ZUV0FSRSBPUiBU\nSEUgVVNFIE9SIE9USEVSIERFQUxJTkdTIElOIFRIRSBTT0ZUV0FSRS4K\n",
  "encoding": "base64",
  "_links": {
    "self": "https://api.github.com/repos/benbalter/gman/contents/LICENSE?ref=master",
    "git": "https://api.github.com/repos/benbalter/gman/git/blobs/401c59dcc4570b954dd6d345e76199e1f4e76266",
    "html": "https://github.com/benbalter/gman/blob/master/LICENSE"
  },
  "license": {
    "key": "mit",
    "name": "MIT License",
    "spdx_id": "MIT",
    "url": "https://api.github.com/licenses/mit",
    "node_id": "MDc6TGljZW5zZW1pdA=="
  }
}
```

