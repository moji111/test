<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/situ_test1/js/jquery-3.3.1.min.js"></script>
</head>
<body>
<button>点我</button>
<form action="/situ_test1/user/AAA" method="post">

账号:<input type="text"/ name="code"><br>
密码:<input type="password"/ name="pass"><br>
<button  type="submit">提交</button>
<button type="reset">重置</button>
</form>
<button onclick="aa()">点点</button>
<button onclick="bb()">点点点点电</button>

<script type="text/javascript">
	function aa(){
		$.ajax({
			type : "get",
			url : "/situ_test1/user/retry",
			dataType : "text",//json:返回JSON数据 。text:返回纯文本字符串
			data : {
				code : $("[name='code']").val(),
				pass : $("[name='pass']").val()
			}, //data发送到服务器的数据。
			success : function(data) {
				alert(data)
				console.log(typeof data);
				console.log(data);
			}
		})
	}
	function bb(){
		$.ajax({
			type : "get",
			url : "/situ_test1/user/aretry",
			data : {
				code :$("[name='code']").val(),
				pass :$("[name='pass']").val()
			},
			dataType : "json",
			success : function(data){
				alert(data);
				console.log(typeof data);
				console.log(data);
			}
		})
	}
</script>
</body>
</html>