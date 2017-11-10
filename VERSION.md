# 版本迭代：

## v0.0.1
* 1、ProperUtil读取配置信息<防止信息暴露，可将信息写到配置文件并放置到assets文件夹下，同时添加到忽略文件中>

## v0.0.2
* 1、TextChange封装TextWatcher进行封装，前面不用的两个方法干脆不用，省几行代码，只针对简单用法

## v0.0.3
* 1、ActivityController对Activity做finish()操作，主要是一次性finish()

## v0.0.4
* 1、ImageLoader通过对Glide得的封装，进行图片加载，使用之前要设置当前Application为XyUtilsApplication，  
或者在自定义Application中初始化：  

```
XyUtils.initialize(getApplicationContext());

```


