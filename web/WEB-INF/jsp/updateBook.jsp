<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改数据</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <%--前端传递隐藏域--%>
        <input type="hidden" name="bookId" value="${Qbook.bookId}"/>
        <div class="form-group">
            <label>书籍名称</label>
            <input type="text" class="form-control" name="bookName" value="${Qbook.bookName}" placeholder="输入书籍名称" required>
        </div>
        <div class="form-group">
            <label>书籍数量</label>
            <input type="text" class="form-control" name="bookCounts" value="${Qbook.bookCounts}" placeholder="输入书籍数量" required>
        </div>
        <div class="form-group">
            <label>书籍详情</label>
            <input type="text" class="form-control" name="detail" value="${Qbook.detail}" placeholder="输入书籍详情" required>
        </div>
        <button type="submit" class="btn btn-primary">修改</button>
    </form>

</div>
</body>
</html>
