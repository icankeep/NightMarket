## 用户表字段
id,用户昵称,真实姓名,用户密码,手机号码,是否管理员,地址,头像路径
```sql
create table user
(
	user_id int auto_increment comment '用户id',
	nickname varchar(50) null comment '用户昵称',
	real_name varchar(30) null comment '真实姓名',
	password varchar(50) null comment '用户密码',
	phone_number varchar(11) null comment '手机号',
	is_admin boolean null comment '是否为管理员',
	address varchar(200) null comment '地址',
	icon_path varchar(100) null comment '头像路径',
	constraint user_pk
		primary key (user_id)
);

```
## 用户收入支出表
id,用户id,变化额,变化时间,来源或者去向备注
```sql
create table user_pay
(
	pay_id int auto_increment,
	user_id int null comment '用户id',
	pay_money decimal null comment '变化金额',
	pay_time datetime null comment '支付时间',
	pay_comment varchar(50) null comment '来源或者去向备注',
	constraint user_pay_pk
		primary key (pay_id)
)
comment '用户收入支出表';
```

## 摊位表字段
id,摊位号,摊位地址,摊位具体信息,摊位租金,是否已被出租,出租时间
```sql
create table stall
(
	stall_id int auto_increment,
	stall_name varchar(30) null comment '摊位号，摊位名，用于用户辨识',
	stall_address varchar(200) null comment '摊位地址',
	stall_info varchar(500) null comment '摊位描述信息',
	stall_rent decimal null comment '租金',
	isRented boolean null comment '是否已被出租',
	rented_time datetime null comment '若出租，出租的时间，未被出租为空',
	constraint stall_pk
		primary key (stall_id)
)
comment '摊位表';
```

## 摊位和管理员表字段(和摊位租户表共用)
id,管理员id,摊位id

## 摊位和租户字段
id,摊位id,租户id
```sql
create table user_stall
(
	user_stall_id int auto_increment,
	user_id int null comment '用户id',
	stall_id int null comment '摊位id',
	constraint user_stall_pk
		primary key (user_stall_id)
)
comment '摊位用户表';
```

## 摊位申请表字段
id,摊位id,用户id,摊位状态(待管理员通过申请,待租户付款,待管理员确认已付款)
```sql
create table stall_apply
(
	apply_id int auto_increment,
	user_id int null comment '用户id',
	stall_id int null comment '摊位id',
	stall_status tinyint null comment '摊位状态(0待管理员通过申请,1待租户付款,2待管理员确认已付款)',
	constraint stall_apply_pk
		primary key (apply_id)
);

```

## 公告表字段
id,公告标题,公告内容,发布人,发布时间
```sql
create table notice
(
	notice_id int auto_increment,
	notice_title varchar(50) null comment '公告标题',
	notice_content varchar(500) null comment '公告内容',
	release_user_id int null comment '发布人id',
	release_time datetime null comment '发布时间',
	constraint notice_pk
		primary key (notice_id)
);

```

## 待操作事项字段(去除此功能)
id,待操作事项内容，发布时间，发布人

## 日志表字段
id,操作人id,操作时间,操作事件类型(登录，发布公告，通过申请，确认付款，申请摊位，修改密码，修改个人信息),登录ip
```sql
create table log
(
	log_id int auto_increment,
	operate_user_id int null comment '操作人id',
	operate_time datetime null comment '操作时间',
	operate_type tinyint null comment '操作事件类型(0登录，1发布公告，2提交申请，3通过申请，4确认付款发送付款订单号，5确认收款，6修改密码，7修改个人信息)',
	login_ip varchar(30) null comment '登录ip',
	constraint log_pk
		primary key (log_id)
)
comment '操作日志和登录日志表';
```




