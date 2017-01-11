<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
      <h1 align="center"><font color="#97FFFF">Login</font></h1>
       <form action="test/dologin.do" method="post">
       
            <table border="1" align="center">
               <tr>
                  <td> 用户名<input name="username" value="" /></td>
               </tr>
               <tr>
                  <td> 密&nbsp; 码 &nbsp;<input name="password" value="" /></td>
               </tr>
                 <tr><td colspan="2" align="center"> 
               <button type="submit" >提交</button>
               <button type="reset">重置</button>
                
              </td>
              
                </tr>
            </table>
       
       
       </form>
</body>
</html>