
<jsp:include page="header.jsp"/>

<!--  TODO Show an error message
    if(mb_strlen($name)>20){
        $errors[]='User ID or password is incorrect.';
    }

    if(count($errors) > 0 ){
         for($i=0; $i<=count($errors); $i++){
            echo $errors[$i];
         }
    }
-->

        <form action='#' method='post'>

            <div align='center'>
                <div align='center' style='border:0px solid #777; width:300px; padding:10px'>

                    <table border='0' cellpadding='3' cellspading='0'>

                        <tr>
                            <td align='right'>USER ID: </td>
                            <td><input type='text' name='id'/></td>
                        </tr>

                        <tr>
                            <td align='right'>PASSWORD: </td>
                            <td><input type='password' name='pw'/></td>
                        </tr>

                        <tr>
                            <td colspan='2' align='center'>
                                <input type='submit' value='LOGIN'/>
                            </td>
                        </tr>

                    </table>

                </div>
            </div>

        </form>		

<jsp:include page="footer.jsp"/>


</body>
</html>