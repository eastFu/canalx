# canalx

- canal 1.1.4 定制化， 加入了自定义参数，推送消息到kafka/mq 中去
- 重新编译修改后的源码，将lib目录下的三个文件替换到官方提供的1.14版本中去
- 这次新增了两个参数，一个参数用于吸入Message，推入kafka/mq，另一个参数用于过滤剔除Message中的部分字段

```
<property name="dist" value="${canal.mq.gy.dist}" />
<property name="keys" value="${canal.mq.gy.keys}" />
```
