<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="/resources/wangEditor.min.js"></script>
</head>
<body>
    测试页面
    <div id="divEditor" style="width: 800px; height: 600px">

    </div>
    <script>
        var E = window.wangEditor;
        var editor = new E("#divEditor");
        editor.create();
    </script>
</body>
</html>