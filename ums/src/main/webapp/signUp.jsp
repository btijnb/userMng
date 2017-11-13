<jsp:include page="header.jsp"/>


        <form action='#' method='post'>

            <div align='center'>
                <div align='center' style='border:0px solid #777; width:300px; padding:10px'>

                    <table border='0' cellpadding='3' cellspading='0'>

                        <tr>
                            <td align='right'>USER ID: </td>
                            <td><input type='text' name='id'/></td>
                        </tr>

                        <tr>
                            <td align='right'>NAME: </td>
                            <td><input type='text' name='name'/></td>
                        </tr>
                        
                        <tr>
                            <td align='right'>Birthday: </td>
                            <td><input type='text' name='birthday'/></td>
                        </tr>
                        
                        <tr>
                            <td align='right'>USER ID: </td>
                            <td><input type='text' name='id'/></td>
                        </tr>
                        
                        <tr>
                            <td align='right'>Address: </td>
                            <td><input type='text' name='address'/></td>
                        </tr>
                        
                        <tr>
                            <td align='right'>Phone number: </td>
                            <td><input type='text' name='phonenumber'/></td>
                        </tr>

						<!-- TODO checkbox: authorith; admin user -->                                                                                                                        
						
                        <tr>
                            <td align='right'>PASSWORD: </td>
                            <td><input type='password' name='pw'/></td>
                        </tr>

                        <tr>
                            <td align='right'>Check PASSWORD: </td>
                            <td><input type='password' name='pwck'/></td>
                        </tr>
                        
                        <tr>
                            <td colspan='2' align='center'>
                                <input type='submit' value='SIGN UP'/>
                            </td>
                        </tr>

                    </table>

                </div>
            </div>

        </form>		


<jsp:include page="footer.jsp"/>