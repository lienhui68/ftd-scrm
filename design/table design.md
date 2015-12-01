# Table Design

## 绑定回复消息(没有单独的表， 是menu，keyword，qrcode，massSend实体内的属性)
Message
    String msgType;  // 消息类型
    String content; // 文本内容
    String url; // 多媒体URL
    String mediaId; // 微信端资源ID
    String hqMediaUrl; // 高清多媒体URL
    String title; // 部分多媒体消息标题
    String description; // 部分多媒体消息
    List<Article> articles; // 图文消息内容

## 图文消息 文章
Article (没有单独的表， 是Message的一个属性)
    String title; // 标题
    String description; // 描述
    String url; // 图片URL
    String mediaId; // 微信端图片ID
    
    String author; // 图文消息的作者
    String content; // 图文消息页面的内容，支持HTML标签
    String contentSourceUrl; // 在图文消息页面点击“阅读原文”后的页面
    boolean showCoverPic; // 是否显示封面


## 渠道账号
Account
    String id

    String appId;	
    String appSecret;
    String channelAccount;
    String token;
    String encodingAESKey;
    
    String name;
    String channel; // 渠道类型
    String accountType; // 账号类型 (服务号，认证号...)
	
    Date createTime;
    Date deleteTime;

## 关注用户
User
    String id
    /* 微信用户属性 */
    String accountId; 
    boolean subscribed;
    String originId;
    String nickname;
    String gender;
    String language;
    String city;
    String province;
    String country;
    String headerImgUrl;
    Date subscribeTime;
    String unionId;

    /* 系统新加的属性 */
    Integer massSendUsageCount; // 当月群发次数
    List<String> tags; // 标签
    String subscribeSource; // 关注来源
    String firstSubscribeSource; // 首次关注来源
    String firstSubscribeTime; // 首次关注时间
    Date communicationTime; // 最后发送消息时间 (事件消息不算)
    Date interactionTime; // 最后交互时间

    Date createTime;
    Date deleteTime;

DefaultReply
	String id;
	String accountId;
	Sting type;
	Message replyMessage;
	Integer hitCount;	//命中次数
	String status;		//ENABLE,DISABLE
	Date createTime;
	Date deleteTime;

## 关键字
Keyword
    String id
    String accountId;
    Message replyMessage;

    String name;
    String keycode; // 关键字
    boolean fuzzy; // 是否模糊匹配
    Integer hitCount; // 命中次数
    Date createTime;
    Date deleteTime;

## 菜单
Menu
    String id
    String accountId;
    Message replyMessage;
    String name; 
    String keycode; // 关键字
    String type; // 菜单类型（click/view）
    Integer index; // 排序
    Date createTime;
    Date deleteTime;
	List<Menu> subMenus; // 子菜单

## 二维码
Qrcode
    String id
    String accountId;
    Message replyMessage;

    Integer sceneId; // 二维码ID
    String name; // 
    String type; // 渠道/事件
    String description; // 描述
    String ticket; // 二维码的ticket，可用来换取二维码图片
    Integer scanCount; // 扫描次数
    Integer subscribeCount; // 扫描关注次数
    Date createTime;
    Date deleteTime;

    
## 群发消息
MassSend
    String id
    String accountId;
    Message massMessage;

    Date scheduleTime; // 群发时间
    String status; // 群发状态

    List<Integer> messageIds; // 群发的消息ID   
    Integer resultNotificationCount; // 群发结果通知次数
    Integer totalCount; // 总粉丝数
    Integer filterCount; // 准备发送的粉丝数(过滤后的人数)
    Integer sentCount; // 发送成功的粉丝数
    Integer errorCount; // 发送失败的粉丝数
    
    Date createTime;
    Date deleteTime;

## 群发消息用户列表
MassSendUsers
    String id
    String massSendId;
    List<String> userIds; // 填写图文消息的接收者，最多10000个

    Date createTime;
    Date deleteTime;

## 消息交互历史
InteractMessageHistory
    String id
    String userId;
    String interactDirect; // 发送/接受
    String interactType; // customerService/keyword/menu/qrcode

    String fromUser; // 发送用户原始ID
    String toUser; // 接受用户原始ID

    String msgType;  // 消息类型
    String content; // 文本内容
    String url; // 多媒体URL
    String mediaId; // 微信端资源ID
    String hqMediaUrl; // 高清多媒体URL
    String title; // 部分多媒体消息标题
    String description; // 部分多媒体消息
    List<Article> articles; // 图文消息内容

    Double locationX; // 地理位置维度
    Double locationY; // 地理位置经度
    String scale; // 地图缩放大小
    String label; // 地理位置信息
    
    Date createTime; // 发送时间

## 事件消息历史
InteractEventHistory
    String id
    String userId;

    String toUserName;
    String fromUserName;
    String createTime; // 发送时间
    String msgType; // 消息类型
    String event; // 事件类型
    String eventKey; // 事件码 
    String ticket; // 二维码的ticket
    
    Double latitude; // 地理位置纬度
    Double longitude; // 地理位置经度
    Double precision; // 地理位置精度

## 用户增长分析
UserGrowthStatistics
    String id
    String accountId;

    reportTime // 分析日期
    Integer subscribe // 关注人数
    Integer unsubscribe // 取关人数
    Integer netIncrease // 净增人数
    Integer total // 总关注人数
    Double subscribeDay // 关注人数天增长比例
    Double subscribeWeek // 关注人数周增长比例
    Double subscribeMonth // 关注人数月增长比例
    Double unsubscribeDay // 取注人数天增长比例
    Double unsubscribeWeek // 取注人数周增长比例
    Double unsubscribeMonth // 取注人数月增长比例
    Double netDay // 净增人数天增长比例
    Double netWeek // 净增人数周增长比例
    Double netMonth // 净增人数月增长比例
    Double totalDay // 总关注人数天增长比例
    Double totalWeek // 总关注人数周增长比例
    Double totalMonth // 总关注人数月增长比例
    Date createTime
    Date updateTime

## 用户属性分析
UserPropertiesStatistics
    String id
    String accountId
    Date reportTime // 分析日期
    String property // 用户属性（性别，语言...）
    String propertyValue // 用户属性的值
    Integer count // 人数
    Date createTime
    Date updateTime

## 交互消息分析
InteractMessageStatistics
    String id
    String accountId
    Date reportTime // 分析事件
    Integer user // 交互人数 
    Integer message // 交互次数
    Double ratio // 人均交互次数
    Integer userTimes1to5 // 交互1-5次的人数
    Integer userTimes6to10 // 交互6-10次的人数
    Integer userTimesGt10 // 交互大于10次的人数
    Double userDay // 交互人数天增长比例
    Double userWeek // 交互人数周增长比例
    Double userMonth // 交互人数月增长比例
    Double messageDay // 交互次数日增长比例
    Double messageWeek // 交互次数周增长比例
    Double messageMonth // 交互次数月增长比例
    Double ratioDay // 人均交互次数日增长比例
    Double ratioWeek // 人均交互次数周增长比例
    Double ratioMonth // 人均交互次数月增长比例
    Date createTime
    Date updateTime

## 二维码分析
QrcodeStatistics
    String id
    String accountId
    Date reportTime // 分析时间
    Integer scan // 扫描人次   
    Integer subscribe // 关注人次
    Integer unsubscribe // 取关人次
    Integer cumulativeScan // 扫描人数
    Integer cumulativeSubscribe // 关注人数
    Integer cumulativeUnsubscribe // 取关人数

    Integer totalScan // 总扫描人次
    Integer totalSubscribe // 总关注人次
    Integer totalUnsubscribe // 总取关人次
    Integer totalCumulativeScan // 总扫描人数   
    Integer totalCumulativeSubscribe // 总关注人数 
    Integer totalCumulativeUnsubscribe // 总取关人数
    Date createTime
    Date updateTime