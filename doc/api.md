# Common rules
## Reply Message & Mass Send Message format

- Parameters

    | name | type | description | required |
    |------|-----|-------|---------|
    | msgType | String | TEXT, IMAGE, VIDEO, MUSIC, VOICE, NEWS | Yes |
    | content | String | text message content | No |
    | url | String | media url | No |
    | hqMediaUrl | String | high quality media url | No |
    | title | String | media title | No |
    | description | String | media description | No |
    | article.title | String | article title | No |
    | article.description | String | article description | No |
    | article.picUrl | String | article picture url | No |
    | article.url | String | article source url link | No |

- Text message

    ```json
    {
        "msgType":"TEXT",
        "content":"hello,world"
    } 
    ```

- Image message

    ```json
    {
        "msgType":"IMAGE",
        "url": "http://www.baidu.com"
    } 
    ```
- Voice message

    ```json
    {
        "msgType":"VOICE",
        "url": "http://www.baidu.com"
    } 
    ```

- Video message

    ```json
    {
        "msgType":"VIDEO",
        "url": "http://www.baidu.com",
        "title":"title",
        "description":"description"
    } 
    ```

- Music message

    ```json
    {
        "msgType":"MUSIC",
        "url": "http://www.baidu.com",
        "hqMediaUrl": "http://www.baidu.com",
        "title":"eh_sky",
        "description":"description"
    } 
    ```

- News message

    ```json
    {
        "msgType":"NEWS",
        "articles": [{
            "title": "part1",
            "description": "description2",
            "picUrl": "http://www.baidu.com",
            "url": "http://www.baidu.com"
        },
        {
            "title": "part2",
            "description": "description2",
            "picUrl": "http://www.baidu.com",
            "url": "http://www.baidu.com"
        }]
    } 
    ```

# Accounts

## Create One Account

- Endpoint

    **POST** /accounts

- Parameters

    | name | type | description | required |
    |------|-----|-------|---------|
    | appId | String | app id | Yes |
    | appSecret | String | app secret | Yes |
    | channelAccountId | String | channel account id | Yes |
    | name | String | name | Yes |
    | channel | String | WEIXIN, WEIBO | Yes |
    | accountType | String | SUBSCRIPTION_ACCOUNT, SUBSCRIPTION_AUTH_ACCOUNT, SERVICE_ACCOUNT, SERVICE_AUTH_ACCOUNT | Yes |

- Request body

    ```json
	{
	    "appId": "wxf5696b744f8581a4",
	    "appSecret": "ab1b7d2b3d5624b099c4c653dfa2aa4d",
	    "channelAccount": "gh_fdba39256c8e",
	    "name": "ftd_cp",
	    "channel": "WEIXIN",
	    "accountType": "SUBSCRIPTION_ACCOUNT"
	}
    ```

- Response body

    ```json
	{
	    "code": 200,
	    "desc": "OK",
	    "data": {
	        "id": "565d4afc53f5401734a90f3a",
	        "createdOn": 1448954620172,
	        "updatedOn": null,
	        "channelAccount": "gh_fdba39256c8e",
	        "appId": "wxf5696b744f8581a4",
	        "appSecret": "ab1b7d2b3d5624b099c4c653dfa2aa4d",
	        "token": null,
	        "encodingAESKey": null,
	        "name": "ftd_cp",
	        "channel": "WEIXIN",
	        "accountType": "SUBSCRIPTION_ACCOUNT",
	        "url": null
	    }
	}
    ```

## Delete One Account

- Endpoint

    **DELETE** /accounts/{accountId}    

- Response body

    ```json
    {
        "code": 200,
        "message": "OK",
        "data": null
    }
    ```

## Update One Account

- Endpoint

    **PUT** /accounts/{accountId}

- Parameters

    | name | type | description | required |
    |------|-----|-------|---------|
    | appId | String | app id | Yes |
    | appSecret | String | app secret | Yes |
    | name | String | name | Yes |
    | channel | String | WEIXIN, WEIBO | Yes |
    | accountType | String | SUBSCRIPTION_ACCOUNT, SUBSCRIPTION_AUTH_ACCOUNT, SERVICE_ACCOUNT, SERVICE_AUTH_ACCOUNT | Yes |

- Request Body

    ```json
    {
        "appId": "wxf5696b744f8581a4",
        "appSecret": "ab1b7d2b3d5624b099c4c653dfa2aa4d",
        "name": "ftd_new",
        "channel": "WEIXIN",
        "accountType": "SUBSCRIPTION_ACCOUNT"
    }
    ```

- Response body

    ```json
	{
	    "code": 200,
	    "desc": "OK",
	    "data": null
	}
    ```

## Get One Account By Id

- Endpoint

    **GET** /accounts/{accountId}    

- Response body

    ```json
	{
	    "code": 200,
	    "desc": "OK",
	    "data": {
	        "id": "5473ffe7db7c7c2f0bee5c71",
	        "createdOn": 1448954820100,
	        "updatedOn": 1448954820983,
	        "channelAccount": null,
	        "appId": "wxf5696b744f8581a4",
	        "appSecret": "ab1b7d2b3d5624b099c4c653dfa2aa4d",
	        "token": null,
	        "encodingAESKey": null,
	        "name": "ftd_cp",
	        "channel": "WEIXIN",
	        "accountType": "SUBSCRIPTION_ACCOUNT",
	        "url": null
	    }
	}
   ```
