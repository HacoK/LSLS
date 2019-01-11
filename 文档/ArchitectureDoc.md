**灯具公司进销存系统******

 LSLS(Lightingcompany Longevity system)

体系结构描述文档

V1.0 正式版

 

南京大学SIF4工作组

 

2017-10-19

 

 

 

 

 目录

 [更新历史... 2](#_Toc496468776) 

[1.引言... 2](#_Toc496468777) 

[1.1编制目的... 2](#_Toc496468778)

 [1.2词汇表... 2](#_Toc496468779) 

[1.3参考资料... 2](#_Toc496468780)

 [2.产品概述... 2](#_Toc496468781) 

[3.逻辑视角... 2](#_Toc496468782)

 [4.组合视角... 4](#_Toc496468783)

 [4.1开发包图... 4](#_Toc496468784)

 [4.2运行时进程... 7](#_Toc496468785)

 [4.3物理部署... 7](#_Toc496468786) 

[5.接口视角... 8](#_Toc496468787)

 [5.1模块的职责... 8](#_Toc496468788)

 [5.2用户界面层的分解... 11](#_Toc496468789) 

[5.2.1 用户界面层模块的职责... 13](#_Toc496468790)

 [5.2.2 用户界面层模块的接口规范... 13](#_Toc496468791) 

[5.2.3 用户界面模块设计原理... 13](#_Toc496468792) 

[5.3业务逻辑层的分解... 13](#_Toc496468793) 

[5.3.1 业务逻辑层模块的职责... 14](#_Toc496468794)

 [5.3.2 业务逻辑层模块的接口规范... 14](#_Toc496468795)

 [5.4数据层的分解... 16](#_Toc496468796)

 [5.4.1 数据层模块的职责... 16](#_Toc496468797) 

[5.4.2 数据层模块的接口规范... 17](#_Toc496468798) 

[6.接口视角... 17](#_Toc496468799) 

[6.1数据持久化对象... 17](#_Toc496468800)

 [6.2 Txt持久化格式... 18](#_Toc496468801) [6.3 数据库表... 18](#_Toc496468802)  

# [更新历史]()

| **修改人员** | **日期**     | **变更原因** | **版本号**  |
| -------- | ---------- | -------- | -------- |
| SIF4     | 2017-10-19 | 最初设计     | V1.0 正式版 |
|          |            |          |          |
|          |            |          |          |

# [1.]()引言

### [1.1]()编制目的

本报告详细完成对灯具公司进销存系统的概要设计，达到指导详细设计和开发的目的，同时实现测试人员及用户的沟通。

本报告面向开发人员、测试人员及最终用户编写，是了解系统的导航。

### [1.2]()词汇表

| 词汇名称 | 词汇含义      | 备注   |
| ---- | --------- | ---- |
| LSLS | 灯具公司进销存系统 | ……   |
| ……   | ……        | ……   |

 

### [1.3]()参考资料

# [2.]()产品概述

参考灯具公司进销存系统用例文档和灯具公司进销存系统软件需求规格说明中对产品的概括描述。

# [3.]()逻辑视角

灯具公司进销存系统中，选择了分层体系结构风格，将系统分为3层（展示层、业务逻辑层、数据层）能够很好地示意整个高层抽象。展示层包含GUI界面的实现，业务逻辑层包含业务逻辑处理的实现，数据层负责数据的持久化和访问。分层体系结构的逻辑视角和逻辑设计方案如图1和图2所示。

![img](http://101.37.19.32:10080/161250098/LSLS/blob/master/ArchitectureDoc/1.png)

图1 参照体系结构风格的包图表达逻辑视角

![img](http://101.37.19.32:10080/161250098/LSLS/blob/master/ArchitectureDoc/2.png)

图2 软件体系结构逻辑设计方案

# [4.]()组合视角

### [4.1]()开发包图

LSLS的最终开发包设计如表1所示。

表1 LSLS的最终开发包设计

| 开发（物理）包              | 依赖的其他开发包                                 |
| -------------------- | ---------------------------------------- |
| mainui               | userui,  salesui, commodityui, bookui, accountui, docui, promotionui,vo |
| salesui              | salesblservice,界面类库包,vo                  |
| salesblservice       |                                          |
| salesbl              | salesblservice,salesdataservice,po,promotionbl,userbl |
| salesdataservice     | Java  RMI,po                             |
| salesdata            | databaseutility,po,salesdataservice      |
| commodityui          | commodityblservice,界面类库包                 |
| commodityblservice   |                                          |
| commoditybl          | commodityblservice,  commoditydataservice,po,salesbl |
| commoditydataservice | Java  RMI,po                             |
| commoditydata        | Java  RMI,po,databaseutility             |
| promotionui          | promotionblservice,界面类库包                 |
| promotionblservice   |                                          |
| promotionbl          | promotionblservice,promotiondataservice,vo |
| promotiondataservice | Java  RMI,po                             |
| promotiondata        | Java  RMI,po,databaseutility             |
| userui               | userblservice,界面类库包                      |
| userblservice        |                                          |
| userbl               | UserInterface,UserDataClient,UserPO      |
| userdataservice      | Java  RMI,po                             |
| userdata             | RMI,po,databaseutility                   |
| bookui               | bookblservice,界面类库包                      |
| bookblservice        |                                          |
| bookbl               | bookblservice,bookdataservice,vo         |
| bookdataservice      | Java  RMI,po                             |
| bookdata             | Java  RMI,po,databaseutility             |
| accountui            | accountblservice,界面类库包                   |
| accountblservice     |                                          |
| accountbl            | accountblservice,  accountdataservice,vo |
| accountdataservice   | Java  RMI,po                             |
| accountdata          | Java  RMI,po,databaseutility             |
| docui                | docblservice,界面类库包                       |
| docblservice         |                                          |
| docbl                | docblservice,  docdataservice,vo         |
| docdataservice       | Java  RMI,po                             |
| docdata              | Java  RMI,po,databaseutility             |
| vo                   |                                          |
| po                   |                                          |
| utilitybl            |                                          |
| 界面类库包                |                                          |
| Java  RMI            |                                          |
| databaseutility      | JDBC                                     |

LSLS客户端开发包图如图3所示，服务器端开发包图如图4所示。

![img](http://101.37.19.32:10080/161250098/LSLS/blob/master/ArchitectureDoc/3.png)

图3 LSLS客户端开发包图

![img](http://101.37.19.32:10080/161250098/LSLS/blob/master/ArchitectureDoc/4.png)

图4 LSLS服务器端开发包图

### [4.2]()运行时进程

​    在LSLS中，会有多个客户端进程和一个服务器端进程，其进程图如图5所示。结合部署图，客户端进程是在客户端机器上运行服务器端进程是在服务器端机器上运行。

![img](http://101.37.19.32:10080/161250098/LSLS/blob/master/ArchitectureDoc/5.png)

图5 进程图

### [4.3]()物理部署

LSLS中客户端构件是放在客户端机器上，服务器端构件是放在服务器端机器上。在客户端节点上，还要部署RMIStub构件。由于Java RMI构件属于JDK 6.0的一部分。所以，在系统JDK环境已经设置好的情况下，不需要再独立部署。部署图如图6所示。

![img](http://101.37.19.32:10080/161250098/LSLS/blob/master/ArchitectureDoc/6.png)

图6 部署图

# [5.]()接口视角

### [5.1]()模块的职责

   客户端模块和服务器端模块分别如图7和图8所示。客户端各层和服务器端各层的职责分别如表2和表3所示。

![img](http://101.37.19.32:10080/161250098/LSLS/blob/master/ArchitectureDoc/7.png)

图7 客户端模块视图

![img](http://101.37.19.32:10080/161250098/LSLS/blob/master/ArchitectureDoc/8.png)

图8 服务器端模块视图

 

**表2 客户端各层的职责**

| **层**   | **职责**                 |
| ------- | ---------------------- |
| 启动模块    | 负责初始化网络通信机制，启动用户界面     |
| 用户界面层   | 基于创刊的LSLS用户界面          |
| 业务逻辑层   | 对于用户界面的输入进行响应并进行业务逻辑处理 |
| 客户端网络模块 | 利用Java RMI机制查找RMI服务    |

** **

** **

** **

**表3 服务器端各层的职责**

| **层**    | **职责**                      |
| -------- | --------------------------- |
| 启动模块     | 负责初始化网络通信机制，启动用户界面          |
| 数据层      | 负责数据的持久化及数据访问接口             |
| 服务器端网络模块 | 利用Java RMI机制开启RMI服务，注册RMI服务 |

每一层只是使用下方直接接触的层。层与层之间仅仅是通过接口的调用来完成的。层直接调用的接口如表4所示。

**表4 层之间调用的接口**

| **接口**                                   | **服务调用方** | **服务提供方** |
| ---------------------------------------- | --------- | --------- |
| CommodityBLService  LoginBLService  SalesBLService  PromotionBLService  BookBLService  AccountBLService  DocBLService  UserBLService | 客户端展示层    | 客户端业务逻辑层  |
| CommodityDataService  LoginDataService  SalesDataService  PromotionDataService  BookDataService  AccountDataService  DocDataService  UserDataService | 客户端业务逻辑层  | 服务器端数据层   |

  借用Sales用例来说明层之间的调用，如图9所示。每一层之间都是由上层依赖了一个接口（需接口），而下层实现了这个接口（供接口）。SalesBLService提了Sales界面所需要的所有业务逻辑功能。SalesDataService提供了对数据库的增、删、改、查等操作。这样的实现就大大降低了层与层之间的耦合。

![img](http://101.37.19.32:10080/161250098/LSLS/blob/master/ArchitectureDoc/9.png)

图9 Sales用例层之间调用的接口

### [5.2]()用户界面层的分解

根据需求，系统存在18个用户界面：登录界面、库存管理人员主界面、进货销售人员主界面、财务人员主界面、总经理主界面、管理员主界面、商品及其分类管理界面、库存管理界面、库存分析界面、客户管理界面、销售界面、退货界面、建账界面、账表查看界面、账户管理界面、审批单据界面、制定销售单据界面、调整用户界面。界面跳转如图10所示。

![img](http://101.37.19.32:10080/161250098/LSLS/blob/master/ArchitectureDoc/10.png)

图10 用户界面跳转

​    服务器端和客户端的用户界面设计接口是一致的，只是具体的页面不一样。用户界面类如图11所示。

![img](http://101.37.19.32:10080/161250098/LSLS/blob/master/ArchitectureDoc/11.png)

图11 用户界面类

### [5.2.1 ]()用户界面层模块的职责

如表5所示为用户界面层模块的职责。

**表5 用户界面层模块的职责**

| **模块**    | **职责**             |
| --------- | ------------------ |
| MainFrame | 界面Frame,负责界面的显示和跳转 |

### [5.2.2 ]()用户界面层模块的接口规范

用户界面层模块的接口规范如表6所示。

**表6 用户界面层模块的接口规范**

| MainFrame | 语法                  | Int(args:String[]) |
| --------- | ------------------- | ------------------ |
| 前置条件      | 无                   |                    |
| 后置条件      | 显示Frame以及LoginPanel |                    |

用户界面层需要的服务接口如表7所示。

**表7 用户界面层模块需要的服务接口**

| **服务名**                             | **服务**            |
| ----------------------------------- | ----------------- |
| businesslogicservice.LoginBLService | 登录界面的逻辑接口         |
| businesslogicservice.*BLService     | 每个界面都有一个相应的业务逻辑接口 |

### [5.2.3 ]()用户界面模块设计原理

用户界面利用Java的Swing和AWT库来实习。

### [5.3]()业务逻辑层的分解

业务逻辑层包括多个针对界面的业务逻辑处理对象。例如，User对象负责处理登录界面的业务逻辑；Sales对象负责销售界面的业务逻辑。业务逻辑层的设计如图12所示。

![img](http://101.37.19.32:10080/161250098/LSLS/blob/master/ArchitectureDoc/12.png)**图12 ****业务逻辑层的设计**

### [5.3.1 ]()业务逻辑层模块的职责

业务逻辑层模块的职责如表8所示。

**表8 业务逻辑层模块的职责**

| **模块**    | **职责**            |
| --------- | ----------------- |
| userbl    | 负责实现对应与登陆界面所需要的服务 |
| salesbl   | 负责实现销售界面所需要的服务    |
| commodity | 负责实现库存界面所需要的服务    |
| book      | 负责实现账簿界面所需要的服务    |
| account   | 负责实现账户界面所需要的服务    |
| doc       | 负责实现单据界面所需要的服务    |
| promotion | 负责实现销售策略界面所需要的服务  |

### [5.3.2 ]()业务逻辑层模块的接口规范

userbl和accountbl模块的接口规范分别如表9和表10所示。

**表9 userbl****模块的接口规范       **

| 提供的服务（供接口）                        |                                      |                                          |      |
| --------------------------------- | ------------------------------------ | ---------------------------------------- | ---- |
| User.login                        | 语法                                   | public  boolean login(String id,String password); |      |
| 前置条件                              | password符合输入规则                       |                                          |      |
| 后置条件                              | 查找是否存在相应的User，根据输入的password返回登陆验证的结果 |                                          |      |
| 需要的服务                             |                                      |                                          |      |
| 服务名                               | 服务                                   |                                          |      |
| DatabaseFactory.getUserDatabase   | 得到User数据库的服务的引用                      |                                          |      |
| UserDataService.check(UserPO  po) | 在数据库中查找UserPO对象                      |                                          |      |
|                                   |                                      |                                          |      |

**表10 accountbl****模块的接口规范      **

| 提供的服务（供接口）                |                                          |                                          |
| ------------------------- | ---------------------------------------- | ---------------------------------------- |
| Zhanghuguanli.NameChange  | 语法                                       | public void NameChange(String a) ;       |
| 前置条件                      | 财务人员进行更改账户名称操作                           |                                          |
| 后置条件                      | 根据账户名称确定是否存在账户，并根据反馈进行更改操作               |                                          |
| Zhanghuguanli.NameDelete  | 语法                                       | public void  NameDelete(String a) ;      |
| 前置条件                      | 财务人员进行删除账户操作                             |                                          |
| 后置条件                      | 根据账户名称确定是否存在账户，若存在则删除该用户相关内容             |                                          |
| Zhanghuguanli. NameAdd    | 语法                                       | public void  NameAdd(String a) ;         |
| 前置条件                      | 财务人员进行增加账户操作                             |                                          |
| 后置条件                      | 根据账户名称确定是否存在账户，若不存在则增加用户                 |                                          |
| Zhanghuguanli.NameCheck   | 语法                                       | public void  NameCheck(String a) ;       |
| 前置条件                      | 财务人员进行查看账户操作                             |                                          |
| 后置条件                      | 根据账户名称确定账户，并显示账户名称，余额等内容                 |                                          |
| Zhanghuguanli. JinEchange | 语法                                       | public void  JinEchange(float a) ;       |
| 前置条件                      | 财务人员进行更改金额操作                             |                                          |
| 后置条件                      | 根据账户名称确定金额数目，并根据更改数据进行更改金额               |                                          |
| Zhanghuguanli. YuEchange  | 语法                                       | public void  YuEchange(float a) ;        |
| 前置条件                      | 付款单和收款单导入分析成功                            |                                          |
| 后置条件                      | 根据账户名称确定账户，系统计算并显示该账户余额                  |                                          |
| Zhidingshoukuandan. GetS  | 语法                                       | Public void GetS(String Num,String keHu,String Oprater,String  zhuanZhangLieBiao,float jinE); |
| 前置条件                      | 财务人员必须已经被识别和授权,并进行制定操作                   |                                          |
| 后置条件                      | 收款单通过审批后更改客户的应付数据，同时财务人员会收到一条消息，根据该信息财务人员完成现实银行账户操作。 |                                          |
| ZhiDingFuKuanDan. GetF    | 语法                                       | public void GetF(String Num,String zhangHu,String Oprater,String  tiaoMuQingDan,float jinE); |
| 前置条件                      | 财务人员必须已经被识别和授权,并进行制定操作                   |                                          |
| 后置条件                      | 付款单通过审批后更改客户的应收数据，同时财务人员会收到一条消息，根据该信息财务人员完成现实银行账户操作。 |                                          |

 

### [5.4]()数据层的分解

​    数据层主要给业务逻辑层提供数据访问服务包括对于持久化的数据的增、删、改、查。Sales业务逻辑需要的服务由SalesDataService接口提供。由于持久化数据的保存可能存在多种形式：Txt文件、序列化文件、数据库等，所示抽象了数据服务。数据层模块的描述具体如图13所示。

![img](http://101.37.19.32:10080/161250098/LSLS/blob/master/ArchitectureDoc/13.png)

图13 数据层模块的描述

### [5.4.1 ]()数据层模块的职责

数据层模块的职责如表11所示。

**表11 ****数据层模块的职责**

| **模块**                               | **职责**                                  |
| ------------------------------------ | --------------------------------------- |
| SalesDataService                     | 持久化数据库的接口，提供集体载入、集体保存、增删改查服务            |
| SalesDataServiceTxtFileImpl          | 基于Txt文件的持久化数据库的接口，提供集体载入、集体保存、增删改查服务    |
| SalesDataServiceSerializableFileImpl | 基于序列化文件的持久化数据库的接口，提供集体载入、集体保存、增删改查服务    |
| SalesDataServiceMySqlImpl            | 基于MySql数据库的持久化数据库的接口，提供集体载入、集体保存、增删改查服务 |

 

### [5.4.2 ]()数据层模块的接口规范

数据层的接口规范如表12所示。

**表12 ****数据层模块的接口规范**

| **提供的服务（供接口）**          |                       |                                          |
| ----------------------- | --------------------- | ---------------------------------------- |
| SalesDataService.find   | 语法                    | public  SalesPO find(long id) throws RemoteException; |
| 前置条件                    | 无                     |                                          |
| 后置条件                    | 按ID进行查找返回相应的SalesPO结果 |                                          |
| SalesDataService.insert | 语法                    | public  void insert(SalesPO po) throws RemoteException; |
| 前置条件                    | 同样ID的po在Mapper中不存在    |                                          |
| 后置条件                    | 在数据库中增加一个po记录         |                                          |
| SalesDataService.delete | 语法                    | public  void delete(SalesPO po) throws RemoteException; |
| 前置条件                    | 在数据库中存在同样ID的po        |                                          |
| 后置条件                    | 删除一个po                |                                          |
| SalesDataService.updata | 语法                    | public  void update(SalesPO po) throws RemoteException; |
| 前置条件                    | 在数据库中存在同样ID的po        |                                          |
| 后置条件                    | 更新一个po                |                                          |
| SalesDataService.init   | 语法                    | public  void init() throws RemoteException; |
| 前置条件                    | 无                     |                                          |
| 后置条件                    | 初始化持久化数据库             |                                          |
| SalesDataService.finish | 语法                    | public  void finish() throws RemoteException; |
| 前置条件                    | 无                     |                                          |
| 后置条件                    | 结束持久化数据库的使用           |                                          |

** **

# [6.]()接口视角

### [6.1]()数据持久化对象

系统的PO类就是对应的相关的实体类，在此只做简单的介绍。

UserPO类包含用户的用户名、密码属性

CommodityPO类包含商品的编号、价格、数量和名字属性。

MemberPO类包含客户的类（进货商、销售商）、级别（五级，一级普通用户，五级VIP客户）、姓名、电话、地址、邮编、电子邮箱、应收额度、应收、应付、默认业务员

SalesPO类保存销售时数据，包括编号、客户编号、商品列表、仓库、总额合计

PromotionPO类保存商品特价包、总额或客户级别促销策略

DocPO类包括的单据的类型及审批状态

BookPO类记录账簿的相关信息，包括销售明细、经营历程、经营情况

AccountPO类保存账户数据，包括账户账号以及密码属性

持久化用户对象UserPO的定义如图14所示。

![img](http://101.37.19.32:10080/161250098/LSLS/blob/master/ArchitectureDoc/14.png)

图14 持久化用户对象UserPO的定义

### [6.2 Txt]()持久化格式

Txt数据保持格式以Commodity.txt为例。每行分别对应货号、商品名称、价格、数量。中间用“：”隔开。如下所示：

123：LED灯：10：32

### [6.3 ]()数据库表

数据库中包含User表、Commodity表、Member表、Sales表、Promotion表、Doc表、Book表、Account表。