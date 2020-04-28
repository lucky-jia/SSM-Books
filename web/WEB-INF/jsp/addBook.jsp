<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加书籍</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>添加数据</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/addBook" method="post">
        <div class="form-group">
            <label>书籍名称</label>
            <input type="text" class="form-control" name="bookName" placeholder="输入书籍名称" required>
        </div>
        <div class="form-group">
            <label>书籍数量</label>
            <input type="text" class="form-control" name="bookCounts"  placeholder="输入书籍数量" required>
        </div>
        <div class="form-group">
            <label>书籍详情</label>
            <input type="text" class="form-control" name="detail" placeholder="输入书籍详情" required>
        </div>
        <button type="submit" class="btn btn-primary">添加</button>
    </form>

</div>
</body>
</html>

