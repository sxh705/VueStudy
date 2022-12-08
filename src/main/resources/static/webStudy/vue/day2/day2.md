# 2.vue入门
下载Vue.js
开发版本:
<script src="http://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
生产版本:
<script src="http://cdn.jsdelivr.net/npm/vue"></script>
<script src="http://cdn.jsdelivr.net/npm/vue@2.7.14"></script>
<script src="http://cdn.jsdelivr.net/npm/vue"></script>

el: vue作用范围: 类选择器: .app
id选择器: #app
{{ 插值表达式 }} 可以书写表达式和运算符 

v-text 获取data数据 innertext
区别: 
    双大括号: 插值表达式: 把值插入标签内部
    v-text: 使用v-text会将标签数据修改
    {{}}不会修改原有数据
    v-text不会闪烁

v-html:解析标签, 类似innerText
