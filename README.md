## UI Test  

[<https://www.w3cschool.cn/uawnhh/?>]()

---

```
gravity       : 属性是用来设置控件中的内容的位置，
layout_gravity: 属性是用来设置当前子控件在父控件中的位置。
```

---

在安卓中，只有垂直的linearlayout属性里面的内部组件靠左靠右才有效，同理，水平的linearlayout属性里面的内部组件靠上靠下才有效

---

android去掉EditView的默认焦点问题
解决之道：在EditText的父级控件中找一个，设置成
```
android:focusable="true" 
android:focusableInTouchMode="true"
```
---

