AmaterasUML官网 http://sourceforge.jp/projects/amateras/

http://www.cnblogs.com/Amandaliu/archive/2012/08/13/2636349.html

【Eclipse】推荐UML插件Green UML、AmaterasUML
    项目上要求release时需要同时给出详细的类关系图，可惜本人之前只是使用XMind手工画过很简单的类关系图（只是类的继承关系），可苦了我呀。

    这两天一直在网上查找能够在Eclipse 已有的代码基础上中导出UML，发现Green UML很多人都在使用，所以想试试看。

一、Green UML插件
1、查看Eclipse版本

查看当前电脑上安装的Eclipse版本（Help-About Eclipse Platform），是3.3.2版本的。

image

2、查看相应插件版本

然后去网站http://green.sourceforge.net/builds.html上查看相对应的Green以及GEF版本：

image

好像是Green3.0.0以及GEF3.3

3、安装Green 3.0.0

    只要在上述网站中直接点击3.0.0的链接即可。将下载到的green-3.0.0.zip解压，将文件green-3.0.0.zip\green-3.0.0\plugins 下的所有文件夹放在目录：D:\eclipse3.3.2\eclipse\plugins（你的目录可能与我的不一样）下。

4、安装GEF3.3

    支持在线安装以及离线安装。

    （1）在线安装：Help – Software Updates – Find and Install – Search for new features to install ,选择Graphical Editing Framework（GEF）Update Site, finish,接着选择GEF 3.3安装即可。我是采用了该方法。

    （2）离线安装：到下载目录http://archive.eclipse.org/tools/gef/downloads/drops/选择合适的版本下载安装

5、重启Eclipse

    3、4步骤完成后，重启Eclipse，即可使用Green UML了。至于使用方法，可参见http://wenku.baidu.com/view/7ec0b519ff00bed5b9f31d1b.html

6、问题

    安装好后，发现对于小项目，该插件还是非常好使的。但是对于大项目，该插件完全不靠谱（点击后根本不甩我），难道是安装中出现了问题？！

 

二、AmaterasUML 插件
    基于Green UML在使用过程中的问题（对于大工程，点击生成类图后不响应），自己只能再次寻找其他的插件。在无意中，发现AmaterasUML。

    官方网站：http://amateras.sourceforge.jp/cgi-bin/fswiki_en/wiki.cgi?page=AmaterasUML

    适用范围：Eclipse 3.3版本以上

    其他要求：JDT 、 GEF

    安装方法：

1、安装AmaterasUML插件

    直接进去官方网站，下载最新版本AmaterasUML_1.3.4.tar。然后解压，将其解压后的三个文件复制粘贴至目录D:\eclipse3.3.2\eclipse\plugins（你的目录可能与我的不一样）下。

image

2、安装JDT、GEF

    安装上述的在线安装GEF的方法安装JDT以及GEF。这里不再重复。

3、重启Eclipse

    1、2步骤完成后，重启Eclipse，即可使用AmaterasUML了。至于使用方法，可参见官网。这里就只是贴个图吧：

image  

    至于该插件是不是有啥个问题，目前还在使用中，后续再说吧。

----------------------------------------------------------------------------------------------
AmaterasUML的使用 http://www.cnblogs.com/maomishen/p/3579229.html

Eclipse AmaterasUML 安装及使用

AmaterasUML 对于我来说，是一个非常好用的UML插件。

用它来将我写过的一些Android程序进行逆工程非常好用，只不过，不能体现出包，这是一个小小的遗憾。

这个是它的主页地址：http://amateras.sourceforge.jp/cgi-bin/fswiki_en/wiki.cgi?page=AmaterasUML

#01，安装
安装方法还是比较简单的，在网上查一下就会有很多。我这里贴出一个我安装时，操作成功并且正在用的链接。

http://www.cnblogs.com/lost-in-code/archive/2012/12/11/2812357.html

#02，逆向工程生成ClassDiagram
在你要生成ClassDiagram的项目上点击鼠标右键，New-->Other-->AmaterasUML-->Class Diagram。选择你的项目，然后点击Finish。

之后，就是拖拽了，将你的项目中所有的类，全部拖拽到界面中，好了，完成！

#03，ClassDiagram正向工程生成java文件
在画好类图之后，右键点击操作区域（随便一个类或者空白位置均可）。java-->Export-->选择你要导出的类-->Finish。

导出成功。不过，较为可惜的是没有包生成。还需要你自己手动创建，不过，这个已经是轻松很多的事情了。