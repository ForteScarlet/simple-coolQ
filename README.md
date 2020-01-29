# 基于网络接口的酷Q机器人java开发框架核心

> 项目对应GITHUB地址: https://github.com/ForteScarlet/simple-robot-core

**文档请见文档地址：**
https://www.kancloud.cn/forte-scarlet/simple-coolq-doc/1049734
<br>

**在线javadoc文档(由码云平台生成)：**
https://apidoc.gitee.com/ForteScarlet/simple-coolQ

由于目前核心部分与组件部分相互分离，所以核心与组件的github地址也相互分离了。
所有组件均依赖于核心框架，支持maven坐标，具体坐标请见**文档**或**入群咨询**

qq群号：**782930037**

LEMOC支持组件框架GITHUB地址：https://github.com/ForteScarlet/simple-robot-component-lemoc

HTTP API支持组件框架GITHUB地址：https://github.com/ForteScarlet/simple-robot-component-httpapi 

CoolQ HTTP API支持组件框架GITHUB地址：https://github.com/ForteScarlet/simple-robot-component-coolHttpApi

<br>
<br>
<br>

## 这是什么？
这是一个基于网络通讯接口的QQ机器人开发框架，可以对接例如酷Q机器人等一系列QQ机器人应用。
此框架分有两个部分：核心框架与组件框架，当前仓库为核心框架。

### 核心框架？
 核心框架提供主要的功能与接口，用于为组件框架提供实现接口，并借此可以实现不同平台、不同插件的简易切换。

### 组件框架？
 组件框架依赖于核心框架，其存在的主要目的就是为了针对某一个特定的插件（例如酷Q的CQ HTTP API插件）进行对接。

### 为何要分离？
 举个例子。假如你想要使用此框架对接 **A应用** ，那么你就要使用 **组件框架A** 来开发，然后过了两个月，你发现**B应用**也挺好的，想要切换到**B应用**，这时候分离的作用就出现了，你只需要将依赖的**组件框架A**切换为**组件框架B**，然后简单修改一下启动类和配置信息，而不需要修改任何功能性的代码（例如消息监听器、定时任务等等）。因为绝大部分功能性的东西都是核心框架所提供的，而你切换组件是不会变更核心的，这样就可以做到能够很好的去支持更多的应用，且切换起来也不会太繁琐。

> 简单来讲，核心框架就是一块儿主板，组件框架就是一块儿显卡，而最终开机后，电脑里的各种各样的应用程序，就是你最终所书写的功能性代码。
<br>
只要这块儿主板不变，每次更换显卡只需要重新安装一下显卡驱动，而不需要删除所有的应用。

也得益于核心组件分离，使其能够有更大的拓展空间，而不是仅局限于酷Q应用，甚至不一定局限于腾讯QQ的业务范围。毕竟有着“私信、群聊”等等一系列信息内容的应用可不仅限于腾讯QQ啊~

<br>

## 有何优劣？
### 优点
- 有着极高的扩展性。任何人都可以根据核心框架，并针对某一个应用或者接口来开发组件框架，并投入使用。
- 核心提供了极其丰富的功能，例如
    - 注解开发风格
    - 丰富的过滤规则
    - 集成quartz定时任务框架
    - 依赖注入(IOC)
    - 拦截器(AOP)
    - 理论上支持与Spring(boot(+MyBatis))、Dubbo其他框架的整合
- 持续更新的代码
- 好说话的作者（欢迎入群与群主交流催更😏
- 高度接口化，可扩展性强
- 有虽然没完全写完但是已经很全面了的中文文档
- 已上传Maven中央仓库，支持Maven、gradle等        
    
    
### 缺点
- 目前来讲，我个人没有接触过酷Q以外的机器人应用，所以没有我所开发的酷Q以外的组件（当然，组件依旧支持第三方开发，只是说我所开发的没有而已）    
- 核心框架中依赖库较多，此问题会尝试逐步改善
- 暂时没有视频教程，仅文字文档有时候阅读起来还是有些困难。（目前可以考虑入群咨询）
- 组件开发文档缺失。因为当前此套框架的所有使用者均来自酷Q用户，而酷Q的大部分可用组件(开头所述的三个)已经由我开发完毕，所以没有遇到有意向自主开发第三方组件框架的人，所以对于**基于核心框架的组件框架开发文档**暂时还是个空缺。假如你有此意向开发其他平台的组件框架（例如QQLight、MyPCQQ等）可以跟我提，我会提供文档与支持。
- 接口与实际功能的偏差。什么意思呢，就是假如我核心中定义了三个功能：“发送群聊、发送私信、发红包”，但是某一个组件只支持“发送群聊、发送私信”而不支持“发红包”，这便出现了“功能偏差”。既然想要能够广泛的兼容各大平台各种各样的消息通讯应用，这个问题便是无法避免的。唯一能够做的，就是需要组件开发作者对于这类“存在却不能用”的功能做出说明，以使使用者能够去规避。
- 作者才疏学浅



## 现在已经存在的应用？
- 酷Q应用下的LEMOC插件(插件作者失踪)
- 酷Q应用下的HTTP API插件(插件作者停更)
- 酷Q应用下的CQ HTTP API插件(处于活跃状态)

> 如果你根据核心开发了组件框架，可以告知我，我会更新在此处与下文处。

> 如果你只是想开发一个QQ机器人，而不在乎使用什么平台，可以去试试酷Q应用下的CQ HTTP API插件，并结合对应的组件框架使用。
> 酷Q应用社区：https://cqp.cc/forum.php
> CQ HTTP API插件GITHUB：https://github.com/richardchien/coolq-http-api
> CQ HTTP API组件(即文档地址)：https://www.kancloud.cn/forte-scarlet/simple-coolq-doc


## 看的有点蒙，但是想试试
可以考虑：
- 加入QQ群：782930037, 如果对水群没有兴趣，可以直接去找群主。
- 邮箱：ForteScarlet@163.com (邮箱信息查看周期较长)
- GITEE或者GITHUB留言

首先建议进群交流，毕竟其他两个我并不经常看(●ˇ∀ˇ●)

## 大家的成果
<table>
    <thead>
        <tr>
            <th>项目名称</th>
            <th>作者</th>
            <th>项目简介</th>
            <th>项目链接</th>
		</tr>
    </thead>
    <tbody>
        <tr>
        	<td>LEMOC支持组件框架</td>
            <th rowspan='3'>
            	<a href="https://github.com/ForteScarlet" target="_blank">
                	ForteScarlet
                </a>
            </th>
            <td>基于simple-robot, 针对于酷Q插件 LEMOC 的对接组件</td>
            <td>https://github.com/ForteScarlet/simple-robot-component-lemoc</td>
        </tr>
        <tr>
            <td>HTTP API支持组件框架</td>
            <td>HTTP API支持组件框架ForteScarlet基于simple-robot, 针对于酷Q插件 HTTP API的对接组件</td>
            <td>https://github.com/ForteScarlet/simple-robot-component-httpapi</td>
        </tr>
        <tr>
            <td>CQ HTTP API支持组件框架</td>
            <td>CoolQ HTTP API支持组件框架ForteScarlet基于simple-robot, 针对于酷Q插件 CQ HTTP API的对接组件</td>
            <td>https://github.com/ForteScarlet/simple-robot-component-coolHttpApi</td>
        </tr>
        <tr>
            <td>崩坏学园2小助手 - 萌萌新</td>
            <th>瑶光天枢</th>
            <td>崩坏学园2的在线群聊，查询装备，模拟扭蛋，查询up记录，来份色图的机器人</td>
            <td>https://github.com/LiChen233/simple-robot</td>
        </tr>
        <tr>
            <td>群管机器人</td>
            <th rowspan='3'>会跑的仓鼠</th>
            <td>基于simple开发的群机器人</td>
            <td>https://gitee.com/yaozhenyong/cqrobotjar2</td>
        </tr>
        <tr>
            <td>游戏查询机器人</td>
            <td>基于simple开发的娱乐性机器人</td>
            <td>https://gitee.com/yaozhenyong/cqrobotIndependent</td>
        </tr>
        <tr>
            <td>云端控制面板</td>
            <td>主要做上面两个版本机器人的控制面板（web端）	</td>
            <td>https://gitee.com/yaozhenyong/Qqrobotwar</td>
        </tr>
        <tr>
            <td>Robot-Spring</td>
            <th>千年老妖(1571650839)</th>
            <td>
                <p>描述:</p> 
                <p>基于酷Q的，使用Java语言开发的，面向COC的骰子机器人组件, 
                使用架构为SpringBoot-Mybatis-CoolHttpApI。主要功能：COC跑团基础功能+斗图,聊天,群管等乱七八糟的功能</p>
                <p>缺点: 单人开发(用来讨好对象的+顺带写一下工作之外的业务逻辑,防止大脑僵化)
                  	单群使用,没有辣么多受众,开发初衷就是单群使用,高并发可能不会太好
                </p>
                <p>优点: 按照公司开发规范写的,想找工作的童鞋可以参考一下
                标准的Controller+service+dao层模式,通俗易懂,易上手,易扩展
                </p>
            </td>
            <td>https://github.com/17336324331/Robot-Spring.git</td>
        </tr>
</tbody>
</table>  



