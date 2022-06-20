# AnimationManager
A simple and fast animation manager 这是一款简单、快捷的动画管理器
【使用】
一、快捷版（待开发）：

二、进阶版：

1、链式调用

三、全自定义：

AnimationManage animationManage = new AnimationManage（）;
//view：view控件
//translationX[]：x轴方向移动路径，0为初始位置
//translationY[]：Y轴方向移动路径，0为初始位置
//scaleX[]：X轴的大小比例，1为原始比例
//scaleY[]：Y轴的大小比例，1为原始比例
//alpha[]：透明度，取值范围为0~1
//rotation[]：旋转角度
//during：动画执行时长，单位毫秒
//loop：循环次数，-1为无限次
animationManage.setCustomAnimator（View view， float[] translationX， float[] translationY，
float[]，
浮动 [] 旋转， 长期间， 整数循环）;
